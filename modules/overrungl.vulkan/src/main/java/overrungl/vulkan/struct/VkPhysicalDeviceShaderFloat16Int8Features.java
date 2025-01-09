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
/// ### shaderFloat16
/// [VarHandle][#VH_shaderFloat16] - [Getter][#shaderFloat16()] - [Setter][#shaderFloat16(int)]
/// ### shaderInt8
/// [VarHandle][#VH_shaderInt8] - [Getter][#shaderInt8()] - [Setter][#shaderInt8(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderFloat16Int8Features {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderFloat16;
///     VkBool32 shaderInt8;
/// } VkPhysicalDeviceShaderFloat16Int8Features;
/// ```
public final class VkPhysicalDeviceShaderFloat16Int8Features extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderFloat16Int8Features`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloat16"),
        ValueLayout.JAVA_INT.withName("shaderInt8")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderFloat16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat16"));
    /// The [VarHandle] of `shaderInt8` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderInt8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInt8"));

    /// Creates `VkPhysicalDeviceShaderFloat16Int8Features` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderFloat16Int8Features(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderFloat16Int8Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderFloat16Int8Features of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat16Int8Features(segment); }

    /// Creates `VkPhysicalDeviceShaderFloat16Int8Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderFloat16Int8Features ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat16Int8Features(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderFloat16Int8Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderFloat16Int8Features ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat16Int8Features(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceShaderFloat16Int8Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderFloat16Int8Features`
    public static VkPhysicalDeviceShaderFloat16Int8Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderFloat16Int8Features(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderFloat16Int8Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderFloat16Int8Features`
    public static VkPhysicalDeviceShaderFloat16Int8Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderFloat16Int8Features(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderFloat16Int8Features.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderFloat16Int8Features.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderFloat16Int8Features.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderFloat16Int8Features.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8Features sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderFloat16Int8Features.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8Features sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderFloat16Int8Features.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderFloat16Int8Features.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderFloat16Int8Features.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderFloat16Int8Features.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderFloat16Int8Features.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8Features pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderFloat16Int8Features.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8Features pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderFloat16Int8Features.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderFloat16(MemorySegment segment, long index) { return (int) VH_shaderFloat16.get(segment, 0L, index); }
    /// {@return `shaderFloat16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderFloat16(MemorySegment segment) { return VkPhysicalDeviceShaderFloat16Int8Features.get_shaderFloat16(segment, 0L); }
    /// {@return `shaderFloat16` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderFloat16At(long index) { return VkPhysicalDeviceShaderFloat16Int8Features.get_shaderFloat16(this.segment(), index); }
    /// {@return `shaderFloat16`}
    public @CType("VkBool32") int shaderFloat16() { return VkPhysicalDeviceShaderFloat16Int8Features.get_shaderFloat16(this.segment()); }
    /// Sets `shaderFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderFloat16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderFloat16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderFloat16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderFloat16Int8Features.set_shaderFloat16(segment, 0L, value); }
    /// Sets `shaderFloat16` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8Features shaderFloat16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderFloat16Int8Features.set_shaderFloat16(this.segment(), index, value); return this; }
    /// Sets `shaderFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8Features shaderFloat16(@CType("VkBool32") int value) { VkPhysicalDeviceShaderFloat16Int8Features.set_shaderFloat16(this.segment(), value); return this; }

    /// {@return `shaderInt8` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderInt8(MemorySegment segment, long index) { return (int) VH_shaderInt8.get(segment, 0L, index); }
    /// {@return `shaderInt8`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderInt8(MemorySegment segment) { return VkPhysicalDeviceShaderFloat16Int8Features.get_shaderInt8(segment, 0L); }
    /// {@return `shaderInt8` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderInt8At(long index) { return VkPhysicalDeviceShaderFloat16Int8Features.get_shaderInt8(this.segment(), index); }
    /// {@return `shaderInt8`}
    public @CType("VkBool32") int shaderInt8() { return VkPhysicalDeviceShaderFloat16Int8Features.get_shaderInt8(this.segment()); }
    /// Sets `shaderInt8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderInt8(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderInt8.set(segment, 0L, index, value); }
    /// Sets `shaderInt8` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderInt8(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderFloat16Int8Features.set_shaderInt8(segment, 0L, value); }
    /// Sets `shaderInt8` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8Features shaderInt8At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderFloat16Int8Features.set_shaderInt8(this.segment(), index, value); return this; }
    /// Sets `shaderInt8` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8Features shaderInt8(@CType("VkBool32") int value) { VkPhysicalDeviceShaderFloat16Int8Features.set_shaderInt8(this.segment(), value); return this; }

}

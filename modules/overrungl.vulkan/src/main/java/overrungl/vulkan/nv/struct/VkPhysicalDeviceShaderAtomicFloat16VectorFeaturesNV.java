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
package overrungl.vulkan.nv.struct;

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
/// ### shaderFloat16VectorAtomics
/// [VarHandle][#VH_shaderFloat16VectorAtomics] - [Getter][#shaderFloat16VectorAtomics()] - [Setter][#shaderFloat16VectorAtomics(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderFloat16VectorAtomics;
/// } VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV;
/// ```
public final class VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloat16VectorAtomics")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderFloat16VectorAtomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderFloat16VectorAtomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat16VectorAtomics"));

    /// Creates `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(segment); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV asSlice(long index) { return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderFloat16VectorAtomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderFloat16VectorAtomics(MemorySegment segment, long index) { return (int) VH_shaderFloat16VectorAtomics.get(segment, 0L, index); }
    /// {@return `shaderFloat16VectorAtomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderFloat16VectorAtomics(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.get_shaderFloat16VectorAtomics(segment, 0L); }
    /// {@return `shaderFloat16VectorAtomics` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderFloat16VectorAtomicsAt(long index) { return VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.get_shaderFloat16VectorAtomics(this.segment(), index); }
    /// {@return `shaderFloat16VectorAtomics`}
    public @CType("VkBool32") int shaderFloat16VectorAtomics() { return VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.get_shaderFloat16VectorAtomics(this.segment()); }
    /// Sets `shaderFloat16VectorAtomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderFloat16VectorAtomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderFloat16VectorAtomics.set(segment, 0L, index, value); }
    /// Sets `shaderFloat16VectorAtomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderFloat16VectorAtomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.set_shaderFloat16VectorAtomics(segment, 0L, value); }
    /// Sets `shaderFloat16VectorAtomics` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV shaderFloat16VectorAtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.set_shaderFloat16VectorAtomics(this.segment(), index, value); return this; }
    /// Sets `shaderFloat16VectorAtomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV shaderFloat16VectorAtomics(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.set_shaderFloat16VectorAtomics(this.segment(), value); return this; }

}

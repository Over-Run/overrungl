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
/// ### shaderImageInt64Atomics
/// [VarHandle][#VH_shaderImageInt64Atomics] - [Getter][#shaderImageInt64Atomics()] - [Setter][#shaderImageInt64Atomics(int)]
/// ### sparseImageInt64Atomics
/// [VarHandle][#VH_sparseImageInt64Atomics] - [Getter][#sparseImageInt64Atomics()] - [Setter][#sparseImageInt64Atomics(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderImageInt64Atomics;
///     VkBool32 sparseImageInt64Atomics;
/// } VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT;
/// ```
public final class VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderImageInt64Atomics"),
        ValueLayout.JAVA_INT.withName("sparseImageInt64Atomics")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderImageInt64Atomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderImageInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageInt64Atomics"));
    /// The [VarHandle] of `sparseImageInt64Atomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sparseImageInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseImageInt64Atomics"));

    /// Creates `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderImageInt64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderImageInt64Atomics(MemorySegment segment, long index) { return (int) VH_shaderImageInt64Atomics.get(segment, 0L, index); }
    /// {@return `shaderImageInt64Atomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderImageInt64Atomics(MemorySegment segment) { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.get_shaderImageInt64Atomics(segment, 0L); }
    /// {@return `shaderImageInt64Atomics` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderImageInt64AtomicsAt(long index) { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.get_shaderImageInt64Atomics(this.segment(), index); }
    /// {@return `shaderImageInt64Atomics`}
    public @CType("VkBool32") int shaderImageInt64Atomics() { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.get_shaderImageInt64Atomics(this.segment()); }
    /// Sets `shaderImageInt64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderImageInt64Atomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderImageInt64Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderImageInt64Atomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderImageInt64Atomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.set_shaderImageInt64Atomics(segment, 0L, value); }
    /// Sets `shaderImageInt64Atomics` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT shaderImageInt64AtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.set_shaderImageInt64Atomics(this.segment(), index, value); return this; }
    /// Sets `shaderImageInt64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT shaderImageInt64Atomics(@CType("VkBool32") int value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.set_shaderImageInt64Atomics(this.segment(), value); return this; }

    /// {@return `sparseImageInt64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sparseImageInt64Atomics(MemorySegment segment, long index) { return (int) VH_sparseImageInt64Atomics.get(segment, 0L, index); }
    /// {@return `sparseImageInt64Atomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sparseImageInt64Atomics(MemorySegment segment) { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.get_sparseImageInt64Atomics(segment, 0L); }
    /// {@return `sparseImageInt64Atomics` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sparseImageInt64AtomicsAt(long index) { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.get_sparseImageInt64Atomics(this.segment(), index); }
    /// {@return `sparseImageInt64Atomics`}
    public @CType("VkBool32") int sparseImageInt64Atomics() { return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.get_sparseImageInt64Atomics(this.segment()); }
    /// Sets `sparseImageInt64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseImageInt64Atomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sparseImageInt64Atomics.set(segment, 0L, index, value); }
    /// Sets `sparseImageInt64Atomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseImageInt64Atomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.set_sparseImageInt64Atomics(segment, 0L, value); }
    /// Sets `sparseImageInt64Atomics` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sparseImageInt64AtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.set_sparseImageInt64Atomics(this.segment(), index, value); return this; }
    /// Sets `sparseImageInt64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sparseImageInt64Atomics(@CType("VkBool32") int value) { VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.set_sparseImageInt64Atomics(this.segment(), value); return this; }

}

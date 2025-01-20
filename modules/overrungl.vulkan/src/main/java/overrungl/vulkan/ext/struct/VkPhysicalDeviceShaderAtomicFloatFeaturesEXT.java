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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### shaderBufferFloat32Atomics
/// [VarHandle][#VH_shaderBufferFloat32Atomics] - [Getter][#shaderBufferFloat32Atomics()] - [Setter][#shaderBufferFloat32Atomics(int)]
/// ### shaderBufferFloat32AtomicAdd
/// [VarHandle][#VH_shaderBufferFloat32AtomicAdd] - [Getter][#shaderBufferFloat32AtomicAdd()] - [Setter][#shaderBufferFloat32AtomicAdd(int)]
/// ### shaderBufferFloat64Atomics
/// [VarHandle][#VH_shaderBufferFloat64Atomics] - [Getter][#shaderBufferFloat64Atomics()] - [Setter][#shaderBufferFloat64Atomics(int)]
/// ### shaderBufferFloat64AtomicAdd
/// [VarHandle][#VH_shaderBufferFloat64AtomicAdd] - [Getter][#shaderBufferFloat64AtomicAdd()] - [Setter][#shaderBufferFloat64AtomicAdd(int)]
/// ### shaderSharedFloat32Atomics
/// [VarHandle][#VH_shaderSharedFloat32Atomics] - [Getter][#shaderSharedFloat32Atomics()] - [Setter][#shaderSharedFloat32Atomics(int)]
/// ### shaderSharedFloat32AtomicAdd
/// [VarHandle][#VH_shaderSharedFloat32AtomicAdd] - [Getter][#shaderSharedFloat32AtomicAdd()] - [Setter][#shaderSharedFloat32AtomicAdd(int)]
/// ### shaderSharedFloat64Atomics
/// [VarHandle][#VH_shaderSharedFloat64Atomics] - [Getter][#shaderSharedFloat64Atomics()] - [Setter][#shaderSharedFloat64Atomics(int)]
/// ### shaderSharedFloat64AtomicAdd
/// [VarHandle][#VH_shaderSharedFloat64AtomicAdd] - [Getter][#shaderSharedFloat64AtomicAdd()] - [Setter][#shaderSharedFloat64AtomicAdd(int)]
/// ### shaderImageFloat32Atomics
/// [VarHandle][#VH_shaderImageFloat32Atomics] - [Getter][#shaderImageFloat32Atomics()] - [Setter][#shaderImageFloat32Atomics(int)]
/// ### shaderImageFloat32AtomicAdd
/// [VarHandle][#VH_shaderImageFloat32AtomicAdd] - [Getter][#shaderImageFloat32AtomicAdd()] - [Setter][#shaderImageFloat32AtomicAdd(int)]
/// ### sparseImageFloat32Atomics
/// [VarHandle][#VH_sparseImageFloat32Atomics] - [Getter][#sparseImageFloat32Atomics()] - [Setter][#sparseImageFloat32Atomics(int)]
/// ### sparseImageFloat32AtomicAdd
/// [VarHandle][#VH_sparseImageFloat32AtomicAdd] - [Getter][#sparseImageFloat32AtomicAdd()] - [Setter][#sparseImageFloat32AtomicAdd(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderAtomicFloatFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderBufferFloat32Atomics;
///     VkBool32 shaderBufferFloat32AtomicAdd;
///     VkBool32 shaderBufferFloat64Atomics;
///     VkBool32 shaderBufferFloat64AtomicAdd;
///     VkBool32 shaderSharedFloat32Atomics;
///     VkBool32 shaderSharedFloat32AtomicAdd;
///     VkBool32 shaderSharedFloat64Atomics;
///     VkBool32 shaderSharedFloat64AtomicAdd;
///     VkBool32 shaderImageFloat32Atomics;
///     VkBool32 shaderImageFloat32AtomicAdd;
///     VkBool32 sparseImageFloat32Atomics;
///     VkBool32 sparseImageFloat32AtomicAdd;
/// } VkPhysicalDeviceShaderAtomicFloatFeaturesEXT;
/// ```
public sealed class VkPhysicalDeviceShaderAtomicFloatFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat64AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat64AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderImageFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("shaderImageFloat32AtomicAdd"),
        ValueLayout.JAVA_INT.withName("sparseImageFloat32Atomics"),
        ValueLayout.JAVA_INT.withName("sparseImageFloat32AtomicAdd")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderBufferFloat32Atomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderBufferFloat32Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat32Atomics"));
    /// The [VarHandle] of `shaderBufferFloat32AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderBufferFloat32AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat32AtomicAdd"));
    /// The [VarHandle] of `shaderBufferFloat64Atomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderBufferFloat64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat64Atomics"));
    /// The [VarHandle] of `shaderBufferFloat64AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderBufferFloat64AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat64AtomicAdd"));
    /// The [VarHandle] of `shaderSharedFloat32Atomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSharedFloat32Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat32Atomics"));
    /// The [VarHandle] of `shaderSharedFloat32AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSharedFloat32AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat32AtomicAdd"));
    /// The [VarHandle] of `shaderSharedFloat64Atomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSharedFloat64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat64Atomics"));
    /// The [VarHandle] of `shaderSharedFloat64AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSharedFloat64AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat64AtomicAdd"));
    /// The [VarHandle] of `shaderImageFloat32Atomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderImageFloat32Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageFloat32Atomics"));
    /// The [VarHandle] of `shaderImageFloat32AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderImageFloat32AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageFloat32AtomicAdd"));
    /// The [VarHandle] of `sparseImageFloat32Atomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sparseImageFloat32Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseImageFloat32Atomics"));
    /// The [VarHandle] of `sparseImageFloat32AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sparseImageFloat32AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseImageFloat32AtomicAdd"));

    /// Creates `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`
    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int shaderBufferFloat32Atomics, @CType("VkBool32") int shaderBufferFloat32AtomicAdd, @CType("VkBool32") int shaderBufferFloat64Atomics, @CType("VkBool32") int shaderBufferFloat64AtomicAdd, @CType("VkBool32") int shaderSharedFloat32Atomics, @CType("VkBool32") int shaderSharedFloat32AtomicAdd, @CType("VkBool32") int shaderSharedFloat64Atomics, @CType("VkBool32") int shaderSharedFloat64AtomicAdd, @CType("VkBool32") int shaderImageFloat32Atomics, @CType("VkBool32") int shaderImageFloat32AtomicAdd, @CType("VkBool32") int sparseImageFloat32Atomics, @CType("VkBool32") int sparseImageFloat32AtomicAdd) { return alloc(allocator).sType(sType).pNext(pNext).shaderBufferFloat32Atomics(shaderBufferFloat32Atomics).shaderBufferFloat32AtomicAdd(shaderBufferFloat32AtomicAdd).shaderBufferFloat64Atomics(shaderBufferFloat64Atomics).shaderBufferFloat64AtomicAdd(shaderBufferFloat64AtomicAdd).shaderSharedFloat32Atomics(shaderSharedFloat32Atomics).shaderSharedFloat32AtomicAdd(shaderSharedFloat32AtomicAdd).shaderSharedFloat64Atomics(shaderSharedFloat64Atomics).shaderSharedFloat64AtomicAdd(shaderSharedFloat64AtomicAdd).shaderImageFloat32Atomics(shaderImageFloat32Atomics).shaderImageFloat32AtomicAdd(shaderImageFloat32AtomicAdd).sparseImageFloat32Atomics(sparseImageFloat32Atomics).sparseImageFloat32AtomicAdd(sparseImageFloat32AtomicAdd); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT copyFrom(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderBufferFloat32Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderBufferFloat32Atomics(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat32Atomics.get(segment, 0L, index); }
    /// {@return `shaderBufferFloat32Atomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderBufferFloat32Atomics(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderBufferFloat32Atomics(segment, 0L); }
    /// {@return `shaderBufferFloat32Atomics`}
    public @CType("VkBool32") int shaderBufferFloat32Atomics() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderBufferFloat32Atomics(this.segment()); }
    /// Sets `shaderBufferFloat32Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderBufferFloat32Atomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderBufferFloat32Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat32Atomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderBufferFloat32Atomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderBufferFloat32Atomics(segment, 0L, value); }
    /// Sets `shaderBufferFloat32Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat32Atomics(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderBufferFloat32Atomics(this.segment(), value); return this; }

    /// {@return `shaderBufferFloat32AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderBufferFloat32AtomicAdd(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat32AtomicAdd.get(segment, 0L, index); }
    /// {@return `shaderBufferFloat32AtomicAdd`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderBufferFloat32AtomicAdd(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderBufferFloat32AtomicAdd(segment, 0L); }
    /// {@return `shaderBufferFloat32AtomicAdd`}
    public @CType("VkBool32") int shaderBufferFloat32AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderBufferFloat32AtomicAdd(this.segment()); }
    /// Sets `shaderBufferFloat32AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderBufferFloat32AtomicAdd(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderBufferFloat32AtomicAdd.set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat32AtomicAdd` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderBufferFloat32AtomicAdd(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderBufferFloat32AtomicAdd(segment, 0L, value); }
    /// Sets `shaderBufferFloat32AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat32AtomicAdd(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderBufferFloat32AtomicAdd(this.segment(), value); return this; }

    /// {@return `shaderBufferFloat64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderBufferFloat64Atomics(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat64Atomics.get(segment, 0L, index); }
    /// {@return `shaderBufferFloat64Atomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderBufferFloat64Atomics(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderBufferFloat64Atomics(segment, 0L); }
    /// {@return `shaderBufferFloat64Atomics`}
    public @CType("VkBool32") int shaderBufferFloat64Atomics() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderBufferFloat64Atomics(this.segment()); }
    /// Sets `shaderBufferFloat64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderBufferFloat64Atomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderBufferFloat64Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat64Atomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderBufferFloat64Atomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderBufferFloat64Atomics(segment, 0L, value); }
    /// Sets `shaderBufferFloat64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat64Atomics(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderBufferFloat64Atomics(this.segment(), value); return this; }

    /// {@return `shaderBufferFloat64AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderBufferFloat64AtomicAdd(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat64AtomicAdd.get(segment, 0L, index); }
    /// {@return `shaderBufferFloat64AtomicAdd`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderBufferFloat64AtomicAdd(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderBufferFloat64AtomicAdd(segment, 0L); }
    /// {@return `shaderBufferFloat64AtomicAdd`}
    public @CType("VkBool32") int shaderBufferFloat64AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderBufferFloat64AtomicAdd(this.segment()); }
    /// Sets `shaderBufferFloat64AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderBufferFloat64AtomicAdd(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderBufferFloat64AtomicAdd.set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat64AtomicAdd` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderBufferFloat64AtomicAdd(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderBufferFloat64AtomicAdd(segment, 0L, value); }
    /// Sets `shaderBufferFloat64AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat64AtomicAdd(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderBufferFloat64AtomicAdd(this.segment(), value); return this; }

    /// {@return `shaderSharedFloat32Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSharedFloat32Atomics(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat32Atomics.get(segment, 0L, index); }
    /// {@return `shaderSharedFloat32Atomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSharedFloat32Atomics(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderSharedFloat32Atomics(segment, 0L); }
    /// {@return `shaderSharedFloat32Atomics`}
    public @CType("VkBool32") int shaderSharedFloat32Atomics() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderSharedFloat32Atomics(this.segment()); }
    /// Sets `shaderSharedFloat32Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSharedFloat32Atomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSharedFloat32Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat32Atomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSharedFloat32Atomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderSharedFloat32Atomics(segment, 0L, value); }
    /// Sets `shaderSharedFloat32Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat32Atomics(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderSharedFloat32Atomics(this.segment(), value); return this; }

    /// {@return `shaderSharedFloat32AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSharedFloat32AtomicAdd(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat32AtomicAdd.get(segment, 0L, index); }
    /// {@return `shaderSharedFloat32AtomicAdd`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSharedFloat32AtomicAdd(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderSharedFloat32AtomicAdd(segment, 0L); }
    /// {@return `shaderSharedFloat32AtomicAdd`}
    public @CType("VkBool32") int shaderSharedFloat32AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderSharedFloat32AtomicAdd(this.segment()); }
    /// Sets `shaderSharedFloat32AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSharedFloat32AtomicAdd(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSharedFloat32AtomicAdd.set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat32AtomicAdd` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSharedFloat32AtomicAdd(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderSharedFloat32AtomicAdd(segment, 0L, value); }
    /// Sets `shaderSharedFloat32AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat32AtomicAdd(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderSharedFloat32AtomicAdd(this.segment(), value); return this; }

    /// {@return `shaderSharedFloat64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSharedFloat64Atomics(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat64Atomics.get(segment, 0L, index); }
    /// {@return `shaderSharedFloat64Atomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSharedFloat64Atomics(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderSharedFloat64Atomics(segment, 0L); }
    /// {@return `shaderSharedFloat64Atomics`}
    public @CType("VkBool32") int shaderSharedFloat64Atomics() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderSharedFloat64Atomics(this.segment()); }
    /// Sets `shaderSharedFloat64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSharedFloat64Atomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSharedFloat64Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat64Atomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSharedFloat64Atomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderSharedFloat64Atomics(segment, 0L, value); }
    /// Sets `shaderSharedFloat64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat64Atomics(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderSharedFloat64Atomics(this.segment(), value); return this; }

    /// {@return `shaderSharedFloat64AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSharedFloat64AtomicAdd(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat64AtomicAdd.get(segment, 0L, index); }
    /// {@return `shaderSharedFloat64AtomicAdd`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSharedFloat64AtomicAdd(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderSharedFloat64AtomicAdd(segment, 0L); }
    /// {@return `shaderSharedFloat64AtomicAdd`}
    public @CType("VkBool32") int shaderSharedFloat64AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderSharedFloat64AtomicAdd(this.segment()); }
    /// Sets `shaderSharedFloat64AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSharedFloat64AtomicAdd(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSharedFloat64AtomicAdd.set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat64AtomicAdd` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSharedFloat64AtomicAdd(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderSharedFloat64AtomicAdd(segment, 0L, value); }
    /// Sets `shaderSharedFloat64AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat64AtomicAdd(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderSharedFloat64AtomicAdd(this.segment(), value); return this; }

    /// {@return `shaderImageFloat32Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderImageFloat32Atomics(MemorySegment segment, long index) { return (int) VH_shaderImageFloat32Atomics.get(segment, 0L, index); }
    /// {@return `shaderImageFloat32Atomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderImageFloat32Atomics(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderImageFloat32Atomics(segment, 0L); }
    /// {@return `shaderImageFloat32Atomics`}
    public @CType("VkBool32") int shaderImageFloat32Atomics() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderImageFloat32Atomics(this.segment()); }
    /// Sets `shaderImageFloat32Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderImageFloat32Atomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderImageFloat32Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderImageFloat32Atomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderImageFloat32Atomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderImageFloat32Atomics(segment, 0L, value); }
    /// Sets `shaderImageFloat32Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderImageFloat32Atomics(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderImageFloat32Atomics(this.segment(), value); return this; }

    /// {@return `shaderImageFloat32AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderImageFloat32AtomicAdd(MemorySegment segment, long index) { return (int) VH_shaderImageFloat32AtomicAdd.get(segment, 0L, index); }
    /// {@return `shaderImageFloat32AtomicAdd`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderImageFloat32AtomicAdd(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderImageFloat32AtomicAdd(segment, 0L); }
    /// {@return `shaderImageFloat32AtomicAdd`}
    public @CType("VkBool32") int shaderImageFloat32AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderImageFloat32AtomicAdd(this.segment()); }
    /// Sets `shaderImageFloat32AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderImageFloat32AtomicAdd(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderImageFloat32AtomicAdd.set(segment, 0L, index, value); }
    /// Sets `shaderImageFloat32AtomicAdd` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderImageFloat32AtomicAdd(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderImageFloat32AtomicAdd(segment, 0L, value); }
    /// Sets `shaderImageFloat32AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderImageFloat32AtomicAdd(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderImageFloat32AtomicAdd(this.segment(), value); return this; }

    /// {@return `sparseImageFloat32Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sparseImageFloat32Atomics(MemorySegment segment, long index) { return (int) VH_sparseImageFloat32Atomics.get(segment, 0L, index); }
    /// {@return `sparseImageFloat32Atomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sparseImageFloat32Atomics(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_sparseImageFloat32Atomics(segment, 0L); }
    /// {@return `sparseImageFloat32Atomics`}
    public @CType("VkBool32") int sparseImageFloat32Atomics() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_sparseImageFloat32Atomics(this.segment()); }
    /// Sets `sparseImageFloat32Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseImageFloat32Atomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sparseImageFloat32Atomics.set(segment, 0L, index, value); }
    /// Sets `sparseImageFloat32Atomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseImageFloat32Atomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_sparseImageFloat32Atomics(segment, 0L, value); }
    /// Sets `sparseImageFloat32Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sparseImageFloat32Atomics(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_sparseImageFloat32Atomics(this.segment(), value); return this; }

    /// {@return `sparseImageFloat32AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sparseImageFloat32AtomicAdd(MemorySegment segment, long index) { return (int) VH_sparseImageFloat32AtomicAdd.get(segment, 0L, index); }
    /// {@return `sparseImageFloat32AtomicAdd`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sparseImageFloat32AtomicAdd(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_sparseImageFloat32AtomicAdd(segment, 0L); }
    /// {@return `sparseImageFloat32AtomicAdd`}
    public @CType("VkBool32") int sparseImageFloat32AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_sparseImageFloat32AtomicAdd(this.segment()); }
    /// Sets `sparseImageFloat32AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseImageFloat32AtomicAdd(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sparseImageFloat32AtomicAdd.set(segment, 0L, index, value); }
    /// Sets `sparseImageFloat32AtomicAdd` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseImageFloat32AtomicAdd(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_sparseImageFloat32AtomicAdd(segment, 0L, value); }
    /// Sets `sparseImageFloat32AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sparseImageFloat32AtomicAdd(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_sparseImageFloat32AtomicAdd(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderAtomicFloatFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceShaderAtomicFloatFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderAtomicFloatFeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shaderBufferFloat32Atomics` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderBufferFloat32AtomicsAt(long index) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderBufferFloat32Atomics(this.segment(), index); }
        /// Sets `shaderBufferFloat32Atomics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderBufferFloat32AtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderBufferFloat32Atomics(this.segment(), index, value); return this; }

        /// {@return `shaderBufferFloat32AtomicAdd` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderBufferFloat32AtomicAddAt(long index) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderBufferFloat32AtomicAdd(this.segment(), index); }
        /// Sets `shaderBufferFloat32AtomicAdd` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderBufferFloat32AtomicAddAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderBufferFloat32AtomicAdd(this.segment(), index, value); return this; }

        /// {@return `shaderBufferFloat64Atomics` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderBufferFloat64AtomicsAt(long index) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderBufferFloat64Atomics(this.segment(), index); }
        /// Sets `shaderBufferFloat64Atomics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderBufferFloat64AtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderBufferFloat64Atomics(this.segment(), index, value); return this; }

        /// {@return `shaderBufferFloat64AtomicAdd` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderBufferFloat64AtomicAddAt(long index) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderBufferFloat64AtomicAdd(this.segment(), index); }
        /// Sets `shaderBufferFloat64AtomicAdd` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderBufferFloat64AtomicAddAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderBufferFloat64AtomicAdd(this.segment(), index, value); return this; }

        /// {@return `shaderSharedFloat32Atomics` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSharedFloat32AtomicsAt(long index) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderSharedFloat32Atomics(this.segment(), index); }
        /// Sets `shaderSharedFloat32Atomics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSharedFloat32AtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderSharedFloat32Atomics(this.segment(), index, value); return this; }

        /// {@return `shaderSharedFloat32AtomicAdd` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSharedFloat32AtomicAddAt(long index) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderSharedFloat32AtomicAdd(this.segment(), index); }
        /// Sets `shaderSharedFloat32AtomicAdd` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSharedFloat32AtomicAddAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderSharedFloat32AtomicAdd(this.segment(), index, value); return this; }

        /// {@return `shaderSharedFloat64Atomics` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSharedFloat64AtomicsAt(long index) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderSharedFloat64Atomics(this.segment(), index); }
        /// Sets `shaderSharedFloat64Atomics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSharedFloat64AtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderSharedFloat64Atomics(this.segment(), index, value); return this; }

        /// {@return `shaderSharedFloat64AtomicAdd` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSharedFloat64AtomicAddAt(long index) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderSharedFloat64AtomicAdd(this.segment(), index); }
        /// Sets `shaderSharedFloat64AtomicAdd` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSharedFloat64AtomicAddAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderSharedFloat64AtomicAdd(this.segment(), index, value); return this; }

        /// {@return `shaderImageFloat32Atomics` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderImageFloat32AtomicsAt(long index) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderImageFloat32Atomics(this.segment(), index); }
        /// Sets `shaderImageFloat32Atomics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderImageFloat32AtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderImageFloat32Atomics(this.segment(), index, value); return this; }

        /// {@return `shaderImageFloat32AtomicAdd` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderImageFloat32AtomicAddAt(long index) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_shaderImageFloat32AtomicAdd(this.segment(), index); }
        /// Sets `shaderImageFloat32AtomicAdd` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderImageFloat32AtomicAddAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_shaderImageFloat32AtomicAdd(this.segment(), index, value); return this; }

        /// {@return `sparseImageFloat32Atomics` at the given index}
        /// @param index the index
        public @CType("VkBool32") int sparseImageFloat32AtomicsAt(long index) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_sparseImageFloat32Atomics(this.segment(), index); }
        /// Sets `sparseImageFloat32Atomics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sparseImageFloat32AtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_sparseImageFloat32Atomics(this.segment(), index, value); return this; }

        /// {@return `sparseImageFloat32AtomicAdd` at the given index}
        /// @param index the index
        public @CType("VkBool32") int sparseImageFloat32AtomicAddAt(long index) { return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.get_sparseImageFloat32AtomicAdd(this.segment(), index); }
        /// Sets `sparseImageFloat32AtomicAdd` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sparseImageFloat32AtomicAddAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.set_sparseImageFloat32AtomicAdd(this.segment(), index, value); return this; }

    }
}

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
/// ### shaderBufferFloat16Atomics
/// [VarHandle][#VH_shaderBufferFloat16Atomics] - [Getter][#shaderBufferFloat16Atomics()] - [Setter][#shaderBufferFloat16Atomics(int)]
/// ### shaderBufferFloat16AtomicAdd
/// [VarHandle][#VH_shaderBufferFloat16AtomicAdd] - [Getter][#shaderBufferFloat16AtomicAdd()] - [Setter][#shaderBufferFloat16AtomicAdd(int)]
/// ### shaderBufferFloat16AtomicMinMax
/// [VarHandle][#VH_shaderBufferFloat16AtomicMinMax] - [Getter][#shaderBufferFloat16AtomicMinMax()] - [Setter][#shaderBufferFloat16AtomicMinMax(int)]
/// ### shaderBufferFloat32AtomicMinMax
/// [VarHandle][#VH_shaderBufferFloat32AtomicMinMax] - [Getter][#shaderBufferFloat32AtomicMinMax()] - [Setter][#shaderBufferFloat32AtomicMinMax(int)]
/// ### shaderBufferFloat64AtomicMinMax
/// [VarHandle][#VH_shaderBufferFloat64AtomicMinMax] - [Getter][#shaderBufferFloat64AtomicMinMax()] - [Setter][#shaderBufferFloat64AtomicMinMax(int)]
/// ### shaderSharedFloat16Atomics
/// [VarHandle][#VH_shaderSharedFloat16Atomics] - [Getter][#shaderSharedFloat16Atomics()] - [Setter][#shaderSharedFloat16Atomics(int)]
/// ### shaderSharedFloat16AtomicAdd
/// [VarHandle][#VH_shaderSharedFloat16AtomicAdd] - [Getter][#shaderSharedFloat16AtomicAdd()] - [Setter][#shaderSharedFloat16AtomicAdd(int)]
/// ### shaderSharedFloat16AtomicMinMax
/// [VarHandle][#VH_shaderSharedFloat16AtomicMinMax] - [Getter][#shaderSharedFloat16AtomicMinMax()] - [Setter][#shaderSharedFloat16AtomicMinMax(int)]
/// ### shaderSharedFloat32AtomicMinMax
/// [VarHandle][#VH_shaderSharedFloat32AtomicMinMax] - [Getter][#shaderSharedFloat32AtomicMinMax()] - [Setter][#shaderSharedFloat32AtomicMinMax(int)]
/// ### shaderSharedFloat64AtomicMinMax
/// [VarHandle][#VH_shaderSharedFloat64AtomicMinMax] - [Getter][#shaderSharedFloat64AtomicMinMax()] - [Setter][#shaderSharedFloat64AtomicMinMax(int)]
/// ### shaderImageFloat32AtomicMinMax
/// [VarHandle][#VH_shaderImageFloat32AtomicMinMax] - [Getter][#shaderImageFloat32AtomicMinMax()] - [Setter][#shaderImageFloat32AtomicMinMax(int)]
/// ### sparseImageFloat32AtomicMinMax
/// [VarHandle][#VH_sparseImageFloat32AtomicMinMax] - [Getter][#sparseImageFloat32AtomicMinMax()] - [Setter][#sparseImageFloat32AtomicMinMax(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderBufferFloat16Atomics;
///     VkBool32 shaderBufferFloat16AtomicAdd;
///     VkBool32 shaderBufferFloat16AtomicMinMax;
///     VkBool32 shaderBufferFloat32AtomicMinMax;
///     VkBool32 shaderBufferFloat64AtomicMinMax;
///     VkBool32 shaderSharedFloat16Atomics;
///     VkBool32 shaderSharedFloat16AtomicAdd;
///     VkBool32 shaderSharedFloat16AtomicMinMax;
///     VkBool32 shaderSharedFloat32AtomicMinMax;
///     VkBool32 shaderSharedFloat64AtomicMinMax;
///     VkBool32 shaderImageFloat32AtomicMinMax;
///     VkBool32 sparseImageFloat32AtomicMinMax;
/// } VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT;
/// ```
public final class VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat16Atomics"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat16AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat16AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat32AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat64AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat16Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat16AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat16AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat32AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat64AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderImageFloat32AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("sparseImageFloat32AtomicMinMax")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderBufferFloat16Atomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderBufferFloat16Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat16Atomics"));
    /// The [VarHandle] of `shaderBufferFloat16AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderBufferFloat16AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat16AtomicAdd"));
    /// The [VarHandle] of `shaderBufferFloat16AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderBufferFloat16AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat16AtomicMinMax"));
    /// The [VarHandle] of `shaderBufferFloat32AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderBufferFloat32AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat32AtomicMinMax"));
    /// The [VarHandle] of `shaderBufferFloat64AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderBufferFloat64AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat64AtomicMinMax"));
    /// The [VarHandle] of `shaderSharedFloat16Atomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSharedFloat16Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat16Atomics"));
    /// The [VarHandle] of `shaderSharedFloat16AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSharedFloat16AtomicAdd = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat16AtomicAdd"));
    /// The [VarHandle] of `shaderSharedFloat16AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSharedFloat16AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat16AtomicMinMax"));
    /// The [VarHandle] of `shaderSharedFloat32AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSharedFloat32AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat32AtomicMinMax"));
    /// The [VarHandle] of `shaderSharedFloat64AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSharedFloat64AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat64AtomicMinMax"));
    /// The [VarHandle] of `shaderImageFloat32AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderImageFloat32AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageFloat32AtomicMinMax"));
    /// The [VarHandle] of `sparseImageFloat32AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sparseImageFloat32AtomicMinMax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseImageFloat32AtomicMinMax"));

    /// Creates `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderBufferFloat16Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderBufferFloat16Atomics(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat16Atomics.get(segment, 0L, index); }
    /// {@return `shaderBufferFloat16Atomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderBufferFloat16Atomics(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat16Atomics(segment, 0L); }
    /// {@return `shaderBufferFloat16Atomics` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderBufferFloat16AtomicsAt(long index) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat16Atomics(this.segment(), index); }
    /// {@return `shaderBufferFloat16Atomics`}
    public @CType("VkBool32") int shaderBufferFloat16Atomics() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat16Atomics(this.segment()); }
    /// Sets `shaderBufferFloat16Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderBufferFloat16Atomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderBufferFloat16Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat16Atomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderBufferFloat16Atomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat16Atomics(segment, 0L, value); }
    /// Sets `shaderBufferFloat16Atomics` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat16Atomics(this.segment(), index, value); return this; }
    /// Sets `shaderBufferFloat16Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16Atomics(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat16Atomics(this.segment(), value); return this; }

    /// {@return `shaderBufferFloat16AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderBufferFloat16AtomicAdd(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat16AtomicAdd.get(segment, 0L, index); }
    /// {@return `shaderBufferFloat16AtomicAdd`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderBufferFloat16AtomicAdd(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat16AtomicAdd(segment, 0L); }
    /// {@return `shaderBufferFloat16AtomicAdd` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderBufferFloat16AtomicAddAt(long index) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat16AtomicAdd(this.segment(), index); }
    /// {@return `shaderBufferFloat16AtomicAdd`}
    public @CType("VkBool32") int shaderBufferFloat16AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat16AtomicAdd(this.segment()); }
    /// Sets `shaderBufferFloat16AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderBufferFloat16AtomicAdd(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderBufferFloat16AtomicAdd.set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat16AtomicAdd` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderBufferFloat16AtomicAdd(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat16AtomicAdd(segment, 0L, value); }
    /// Sets `shaderBufferFloat16AtomicAdd` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicAddAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat16AtomicAdd(this.segment(), index, value); return this; }
    /// Sets `shaderBufferFloat16AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicAdd(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat16AtomicAdd(this.segment(), value); return this; }

    /// {@return `shaderBufferFloat16AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderBufferFloat16AtomicMinMax(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat16AtomicMinMax.get(segment, 0L, index); }
    /// {@return `shaderBufferFloat16AtomicMinMax`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderBufferFloat16AtomicMinMax(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat16AtomicMinMax(segment, 0L); }
    /// {@return `shaderBufferFloat16AtomicMinMax` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderBufferFloat16AtomicMinMaxAt(long index) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat16AtomicMinMax(this.segment(), index); }
    /// {@return `shaderBufferFloat16AtomicMinMax`}
    public @CType("VkBool32") int shaderBufferFloat16AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat16AtomicMinMax(this.segment()); }
    /// Sets `shaderBufferFloat16AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderBufferFloat16AtomicMinMax(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderBufferFloat16AtomicMinMax.set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat16AtomicMinMax` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderBufferFloat16AtomicMinMax(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat16AtomicMinMax(segment, 0L, value); }
    /// Sets `shaderBufferFloat16AtomicMinMax` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicMinMaxAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat16AtomicMinMax(this.segment(), index, value); return this; }
    /// Sets `shaderBufferFloat16AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicMinMax(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat16AtomicMinMax(this.segment(), value); return this; }

    /// {@return `shaderBufferFloat32AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderBufferFloat32AtomicMinMax(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat32AtomicMinMax.get(segment, 0L, index); }
    /// {@return `shaderBufferFloat32AtomicMinMax`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderBufferFloat32AtomicMinMax(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat32AtomicMinMax(segment, 0L); }
    /// {@return `shaderBufferFloat32AtomicMinMax` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderBufferFloat32AtomicMinMaxAt(long index) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat32AtomicMinMax(this.segment(), index); }
    /// {@return `shaderBufferFloat32AtomicMinMax`}
    public @CType("VkBool32") int shaderBufferFloat32AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat32AtomicMinMax(this.segment()); }
    /// Sets `shaderBufferFloat32AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderBufferFloat32AtomicMinMax(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderBufferFloat32AtomicMinMax.set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat32AtomicMinMax` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderBufferFloat32AtomicMinMax(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat32AtomicMinMax(segment, 0L, value); }
    /// Sets `shaderBufferFloat32AtomicMinMax` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat32AtomicMinMaxAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat32AtomicMinMax(this.segment(), index, value); return this; }
    /// Sets `shaderBufferFloat32AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat32AtomicMinMax(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat32AtomicMinMax(this.segment(), value); return this; }

    /// {@return `shaderBufferFloat64AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderBufferFloat64AtomicMinMax(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat64AtomicMinMax.get(segment, 0L, index); }
    /// {@return `shaderBufferFloat64AtomicMinMax`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderBufferFloat64AtomicMinMax(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat64AtomicMinMax(segment, 0L); }
    /// {@return `shaderBufferFloat64AtomicMinMax` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderBufferFloat64AtomicMinMaxAt(long index) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat64AtomicMinMax(this.segment(), index); }
    /// {@return `shaderBufferFloat64AtomicMinMax`}
    public @CType("VkBool32") int shaderBufferFloat64AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderBufferFloat64AtomicMinMax(this.segment()); }
    /// Sets `shaderBufferFloat64AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderBufferFloat64AtomicMinMax(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderBufferFloat64AtomicMinMax.set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat64AtomicMinMax` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderBufferFloat64AtomicMinMax(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat64AtomicMinMax(segment, 0L, value); }
    /// Sets `shaderBufferFloat64AtomicMinMax` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat64AtomicMinMaxAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat64AtomicMinMax(this.segment(), index, value); return this; }
    /// Sets `shaderBufferFloat64AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat64AtomicMinMax(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderBufferFloat64AtomicMinMax(this.segment(), value); return this; }

    /// {@return `shaderSharedFloat16Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSharedFloat16Atomics(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat16Atomics.get(segment, 0L, index); }
    /// {@return `shaderSharedFloat16Atomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSharedFloat16Atomics(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat16Atomics(segment, 0L); }
    /// {@return `shaderSharedFloat16Atomics` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderSharedFloat16AtomicsAt(long index) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat16Atomics(this.segment(), index); }
    /// {@return `shaderSharedFloat16Atomics`}
    public @CType("VkBool32") int shaderSharedFloat16Atomics() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat16Atomics(this.segment()); }
    /// Sets `shaderSharedFloat16Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSharedFloat16Atomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSharedFloat16Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat16Atomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSharedFloat16Atomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat16Atomics(segment, 0L, value); }
    /// Sets `shaderSharedFloat16Atomics` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat16Atomics(this.segment(), index, value); return this; }
    /// Sets `shaderSharedFloat16Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16Atomics(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat16Atomics(this.segment(), value); return this; }

    /// {@return `shaderSharedFloat16AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSharedFloat16AtomicAdd(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat16AtomicAdd.get(segment, 0L, index); }
    /// {@return `shaderSharedFloat16AtomicAdd`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSharedFloat16AtomicAdd(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat16AtomicAdd(segment, 0L); }
    /// {@return `shaderSharedFloat16AtomicAdd` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderSharedFloat16AtomicAddAt(long index) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat16AtomicAdd(this.segment(), index); }
    /// {@return `shaderSharedFloat16AtomicAdd`}
    public @CType("VkBool32") int shaderSharedFloat16AtomicAdd() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat16AtomicAdd(this.segment()); }
    /// Sets `shaderSharedFloat16AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSharedFloat16AtomicAdd(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSharedFloat16AtomicAdd.set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat16AtomicAdd` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSharedFloat16AtomicAdd(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat16AtomicAdd(segment, 0L, value); }
    /// Sets `shaderSharedFloat16AtomicAdd` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicAddAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat16AtomicAdd(this.segment(), index, value); return this; }
    /// Sets `shaderSharedFloat16AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicAdd(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat16AtomicAdd(this.segment(), value); return this; }

    /// {@return `shaderSharedFloat16AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSharedFloat16AtomicMinMax(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat16AtomicMinMax.get(segment, 0L, index); }
    /// {@return `shaderSharedFloat16AtomicMinMax`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSharedFloat16AtomicMinMax(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat16AtomicMinMax(segment, 0L); }
    /// {@return `shaderSharedFloat16AtomicMinMax` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderSharedFloat16AtomicMinMaxAt(long index) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat16AtomicMinMax(this.segment(), index); }
    /// {@return `shaderSharedFloat16AtomicMinMax`}
    public @CType("VkBool32") int shaderSharedFloat16AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat16AtomicMinMax(this.segment()); }
    /// Sets `shaderSharedFloat16AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSharedFloat16AtomicMinMax(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSharedFloat16AtomicMinMax.set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat16AtomicMinMax` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSharedFloat16AtomicMinMax(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat16AtomicMinMax(segment, 0L, value); }
    /// Sets `shaderSharedFloat16AtomicMinMax` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicMinMaxAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat16AtomicMinMax(this.segment(), index, value); return this; }
    /// Sets `shaderSharedFloat16AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicMinMax(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat16AtomicMinMax(this.segment(), value); return this; }

    /// {@return `shaderSharedFloat32AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSharedFloat32AtomicMinMax(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat32AtomicMinMax.get(segment, 0L, index); }
    /// {@return `shaderSharedFloat32AtomicMinMax`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSharedFloat32AtomicMinMax(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat32AtomicMinMax(segment, 0L); }
    /// {@return `shaderSharedFloat32AtomicMinMax` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderSharedFloat32AtomicMinMaxAt(long index) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat32AtomicMinMax(this.segment(), index); }
    /// {@return `shaderSharedFloat32AtomicMinMax`}
    public @CType("VkBool32") int shaderSharedFloat32AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat32AtomicMinMax(this.segment()); }
    /// Sets `shaderSharedFloat32AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSharedFloat32AtomicMinMax(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSharedFloat32AtomicMinMax.set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat32AtomicMinMax` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSharedFloat32AtomicMinMax(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat32AtomicMinMax(segment, 0L, value); }
    /// Sets `shaderSharedFloat32AtomicMinMax` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat32AtomicMinMaxAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat32AtomicMinMax(this.segment(), index, value); return this; }
    /// Sets `shaderSharedFloat32AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat32AtomicMinMax(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat32AtomicMinMax(this.segment(), value); return this; }

    /// {@return `shaderSharedFloat64AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSharedFloat64AtomicMinMax(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat64AtomicMinMax.get(segment, 0L, index); }
    /// {@return `shaderSharedFloat64AtomicMinMax`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSharedFloat64AtomicMinMax(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat64AtomicMinMax(segment, 0L); }
    /// {@return `shaderSharedFloat64AtomicMinMax` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderSharedFloat64AtomicMinMaxAt(long index) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat64AtomicMinMax(this.segment(), index); }
    /// {@return `shaderSharedFloat64AtomicMinMax`}
    public @CType("VkBool32") int shaderSharedFloat64AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderSharedFloat64AtomicMinMax(this.segment()); }
    /// Sets `shaderSharedFloat64AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSharedFloat64AtomicMinMax(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSharedFloat64AtomicMinMax.set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat64AtomicMinMax` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSharedFloat64AtomicMinMax(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat64AtomicMinMax(segment, 0L, value); }
    /// Sets `shaderSharedFloat64AtomicMinMax` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat64AtomicMinMaxAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat64AtomicMinMax(this.segment(), index, value); return this; }
    /// Sets `shaderSharedFloat64AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat64AtomicMinMax(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderSharedFloat64AtomicMinMax(this.segment(), value); return this; }

    /// {@return `shaderImageFloat32AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderImageFloat32AtomicMinMax(MemorySegment segment, long index) { return (int) VH_shaderImageFloat32AtomicMinMax.get(segment, 0L, index); }
    /// {@return `shaderImageFloat32AtomicMinMax`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderImageFloat32AtomicMinMax(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderImageFloat32AtomicMinMax(segment, 0L); }
    /// {@return `shaderImageFloat32AtomicMinMax` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderImageFloat32AtomicMinMaxAt(long index) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderImageFloat32AtomicMinMax(this.segment(), index); }
    /// {@return `shaderImageFloat32AtomicMinMax`}
    public @CType("VkBool32") int shaderImageFloat32AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_shaderImageFloat32AtomicMinMax(this.segment()); }
    /// Sets `shaderImageFloat32AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderImageFloat32AtomicMinMax(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderImageFloat32AtomicMinMax.set(segment, 0L, index, value); }
    /// Sets `shaderImageFloat32AtomicMinMax` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderImageFloat32AtomicMinMax(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderImageFloat32AtomicMinMax(segment, 0L, value); }
    /// Sets `shaderImageFloat32AtomicMinMax` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderImageFloat32AtomicMinMaxAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderImageFloat32AtomicMinMax(this.segment(), index, value); return this; }
    /// Sets `shaderImageFloat32AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderImageFloat32AtomicMinMax(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_shaderImageFloat32AtomicMinMax(this.segment(), value); return this; }

    /// {@return `sparseImageFloat32AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sparseImageFloat32AtomicMinMax(MemorySegment segment, long index) { return (int) VH_sparseImageFloat32AtomicMinMax.get(segment, 0L, index); }
    /// {@return `sparseImageFloat32AtomicMinMax`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sparseImageFloat32AtomicMinMax(MemorySegment segment) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_sparseImageFloat32AtomicMinMax(segment, 0L); }
    /// {@return `sparseImageFloat32AtomicMinMax` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sparseImageFloat32AtomicMinMaxAt(long index) { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_sparseImageFloat32AtomicMinMax(this.segment(), index); }
    /// {@return `sparseImageFloat32AtomicMinMax`}
    public @CType("VkBool32") int sparseImageFloat32AtomicMinMax() { return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.get_sparseImageFloat32AtomicMinMax(this.segment()); }
    /// Sets `sparseImageFloat32AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseImageFloat32AtomicMinMax(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sparseImageFloat32AtomicMinMax.set(segment, 0L, index, value); }
    /// Sets `sparseImageFloat32AtomicMinMax` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseImageFloat32AtomicMinMax(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_sparseImageFloat32AtomicMinMax(segment, 0L, value); }
    /// Sets `sparseImageFloat32AtomicMinMax` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sparseImageFloat32AtomicMinMaxAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_sparseImageFloat32AtomicMinMax(this.segment(), index, value); return this; }
    /// Sets `sparseImageFloat32AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sparseImageFloat32AtomicMinMax(@CType("VkBool32") int value) { VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.set_sparseImageFloat32AtomicMinMax(this.segment(), value); return this; }

}

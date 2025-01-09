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
/// ### taskShader
/// [VarHandle][#VH_taskShader] - [Getter][#taskShader()] - [Setter][#taskShader(int)]
/// ### meshShader
/// [VarHandle][#VH_meshShader] - [Getter][#meshShader()] - [Setter][#meshShader(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMeshShaderFeaturesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 taskShader;
///     VkBool32 meshShader;
/// } VkPhysicalDeviceMeshShaderFeaturesNV;
/// ```
public final class VkPhysicalDeviceMeshShaderFeaturesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceMeshShaderFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("taskShader"),
        ValueLayout.JAVA_INT.withName("meshShader")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `taskShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_taskShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("taskShader"));
    /// The [VarHandle] of `meshShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_meshShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshShader"));

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMeshShaderFeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderFeaturesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesNV(segment); }

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderFeaturesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderFeaturesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceMeshShaderFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMeshShaderFeaturesNV`
    public static VkPhysicalDeviceMeshShaderFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMeshShaderFeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMeshShaderFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMeshShaderFeaturesNV`
    public static VkPhysicalDeviceMeshShaderFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMeshShaderFeaturesNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceMeshShaderFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMeshShaderFeaturesNV`
    public VkPhysicalDeviceMeshShaderFeaturesNV asSlice(long index) { return new VkPhysicalDeviceMeshShaderFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceMeshShaderFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMeshShaderFeaturesNV`
    public VkPhysicalDeviceMeshShaderFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceMeshShaderFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMeshShaderFeaturesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMeshShaderFeaturesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMeshShaderFeaturesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderFeaturesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderFeaturesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderFeaturesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMeshShaderFeaturesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceMeshShaderFeaturesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceMeshShaderFeaturesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderFeaturesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderFeaturesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderFeaturesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `taskShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_taskShader(MemorySegment segment, long index) { return (int) VH_taskShader.get(segment, 0L, index); }
    /// {@return `taskShader`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_taskShader(MemorySegment segment) { return VkPhysicalDeviceMeshShaderFeaturesNV.get_taskShader(segment, 0L); }
    /// {@return `taskShader` at the given index}
    /// @param index the index
    public @CType("VkBool32") int taskShaderAt(long index) { return VkPhysicalDeviceMeshShaderFeaturesNV.get_taskShader(this.segment(), index); }
    /// {@return `taskShader`}
    public @CType("VkBool32") int taskShader() { return VkPhysicalDeviceMeshShaderFeaturesNV.get_taskShader(this.segment()); }
    /// Sets `taskShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_taskShader(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_taskShader.set(segment, 0L, index, value); }
    /// Sets `taskShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_taskShader(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesNV.set_taskShader(segment, 0L, value); }
    /// Sets `taskShader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesNV taskShaderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesNV.set_taskShader(this.segment(), index, value); return this; }
    /// Sets `taskShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesNV taskShader(@CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesNV.set_taskShader(this.segment(), value); return this; }

    /// {@return `meshShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_meshShader(MemorySegment segment, long index) { return (int) VH_meshShader.get(segment, 0L, index); }
    /// {@return `meshShader`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_meshShader(MemorySegment segment) { return VkPhysicalDeviceMeshShaderFeaturesNV.get_meshShader(segment, 0L); }
    /// {@return `meshShader` at the given index}
    /// @param index the index
    public @CType("VkBool32") int meshShaderAt(long index) { return VkPhysicalDeviceMeshShaderFeaturesNV.get_meshShader(this.segment(), index); }
    /// {@return `meshShader`}
    public @CType("VkBool32") int meshShader() { return VkPhysicalDeviceMeshShaderFeaturesNV.get_meshShader(this.segment()); }
    /// Sets `meshShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_meshShader(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_meshShader.set(segment, 0L, index, value); }
    /// Sets `meshShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_meshShader(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesNV.set_meshShader(segment, 0L, value); }
    /// Sets `meshShader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesNV meshShaderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesNV.set_meshShader(this.segment(), index, value); return this; }
    /// Sets `meshShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesNV meshShader(@CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesNV.set_meshShader(this.segment(), value); return this; }

}

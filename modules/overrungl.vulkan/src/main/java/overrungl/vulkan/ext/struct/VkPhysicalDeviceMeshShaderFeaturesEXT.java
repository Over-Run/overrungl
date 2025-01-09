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
/// ### taskShader
/// [VarHandle][#VH_taskShader] - [Getter][#taskShader()] - [Setter][#taskShader(int)]
/// ### meshShader
/// [VarHandle][#VH_meshShader] - [Getter][#meshShader()] - [Setter][#meshShader(int)]
/// ### multiviewMeshShader
/// [VarHandle][#VH_multiviewMeshShader] - [Getter][#multiviewMeshShader()] - [Setter][#multiviewMeshShader(int)]
/// ### primitiveFragmentShadingRateMeshShader
/// [VarHandle][#VH_primitiveFragmentShadingRateMeshShader] - [Getter][#primitiveFragmentShadingRateMeshShader()] - [Setter][#primitiveFragmentShadingRateMeshShader(int)]
/// ### meshShaderQueries
/// [VarHandle][#VH_meshShaderQueries] - [Getter][#meshShaderQueries()] - [Setter][#meshShaderQueries(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMeshShaderFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 taskShader;
///     VkBool32 meshShader;
///     VkBool32 multiviewMeshShader;
///     VkBool32 primitiveFragmentShadingRateMeshShader;
///     VkBool32 meshShaderQueries;
/// } VkPhysicalDeviceMeshShaderFeaturesEXT;
/// ```
public final class VkPhysicalDeviceMeshShaderFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceMeshShaderFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("taskShader"),
        ValueLayout.JAVA_INT.withName("meshShader"),
        ValueLayout.JAVA_INT.withName("multiviewMeshShader"),
        ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRateMeshShader"),
        ValueLayout.JAVA_INT.withName("meshShaderQueries")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `taskShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_taskShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("taskShader"));
    /// The [VarHandle] of `meshShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_meshShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshShader"));
    /// The [VarHandle] of `multiviewMeshShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_multiviewMeshShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewMeshShader"));
    /// The [VarHandle] of `primitiveFragmentShadingRateMeshShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primitiveFragmentShadingRateMeshShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveFragmentShadingRateMeshShader"));
    /// The [VarHandle] of `meshShaderQueries` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_meshShaderQueries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshShaderQueries"));

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMeshShaderFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceMeshShaderFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMeshShaderFeaturesEXT`
    public static VkPhysicalDeviceMeshShaderFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMeshShaderFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMeshShaderFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMeshShaderFeaturesEXT`
    public static VkPhysicalDeviceMeshShaderFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMeshShaderFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `taskShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_taskShader(MemorySegment segment, long index) { return (int) VH_taskShader.get(segment, 0L, index); }
    /// {@return `taskShader`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_taskShader(MemorySegment segment) { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_taskShader(segment, 0L); }
    /// {@return `taskShader` at the given index}
    /// @param index the index
    public @CType("VkBool32") int taskShaderAt(long index) { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_taskShader(this.segment(), index); }
    /// {@return `taskShader`}
    public @CType("VkBool32") int taskShader() { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_taskShader(this.segment()); }
    /// Sets `taskShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_taskShader(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_taskShader.set(segment, 0L, index, value); }
    /// Sets `taskShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_taskShader(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_taskShader(segment, 0L, value); }
    /// Sets `taskShader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT taskShaderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_taskShader(this.segment(), index, value); return this; }
    /// Sets `taskShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT taskShader(@CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_taskShader(this.segment(), value); return this; }

    /// {@return `meshShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_meshShader(MemorySegment segment, long index) { return (int) VH_meshShader.get(segment, 0L, index); }
    /// {@return `meshShader`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_meshShader(MemorySegment segment) { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_meshShader(segment, 0L); }
    /// {@return `meshShader` at the given index}
    /// @param index the index
    public @CType("VkBool32") int meshShaderAt(long index) { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_meshShader(this.segment(), index); }
    /// {@return `meshShader`}
    public @CType("VkBool32") int meshShader() { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_meshShader(this.segment()); }
    /// Sets `meshShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_meshShader(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_meshShader.set(segment, 0L, index, value); }
    /// Sets `meshShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_meshShader(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_meshShader(segment, 0L, value); }
    /// Sets `meshShader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShaderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_meshShader(this.segment(), index, value); return this; }
    /// Sets `meshShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShader(@CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_meshShader(this.segment(), value); return this; }

    /// {@return `multiviewMeshShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_multiviewMeshShader(MemorySegment segment, long index) { return (int) VH_multiviewMeshShader.get(segment, 0L, index); }
    /// {@return `multiviewMeshShader`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_multiviewMeshShader(MemorySegment segment) { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_multiviewMeshShader(segment, 0L); }
    /// {@return `multiviewMeshShader` at the given index}
    /// @param index the index
    public @CType("VkBool32") int multiviewMeshShaderAt(long index) { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_multiviewMeshShader(this.segment(), index); }
    /// {@return `multiviewMeshShader`}
    public @CType("VkBool32") int multiviewMeshShader() { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_multiviewMeshShader(this.segment()); }
    /// Sets `multiviewMeshShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_multiviewMeshShader(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_multiviewMeshShader.set(segment, 0L, index, value); }
    /// Sets `multiviewMeshShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_multiviewMeshShader(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_multiviewMeshShader(segment, 0L, value); }
    /// Sets `multiviewMeshShader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT multiviewMeshShaderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_multiviewMeshShader(this.segment(), index, value); return this; }
    /// Sets `multiviewMeshShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT multiviewMeshShader(@CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_multiviewMeshShader(this.segment(), value); return this; }

    /// {@return `primitiveFragmentShadingRateMeshShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_primitiveFragmentShadingRateMeshShader(MemorySegment segment, long index) { return (int) VH_primitiveFragmentShadingRateMeshShader.get(segment, 0L, index); }
    /// {@return `primitiveFragmentShadingRateMeshShader`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_primitiveFragmentShadingRateMeshShader(MemorySegment segment) { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_primitiveFragmentShadingRateMeshShader(segment, 0L); }
    /// {@return `primitiveFragmentShadingRateMeshShader` at the given index}
    /// @param index the index
    public @CType("VkBool32") int primitiveFragmentShadingRateMeshShaderAt(long index) { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_primitiveFragmentShadingRateMeshShader(this.segment(), index); }
    /// {@return `primitiveFragmentShadingRateMeshShader`}
    public @CType("VkBool32") int primitiveFragmentShadingRateMeshShader() { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_primitiveFragmentShadingRateMeshShader(this.segment()); }
    /// Sets `primitiveFragmentShadingRateMeshShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primitiveFragmentShadingRateMeshShader(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_primitiveFragmentShadingRateMeshShader.set(segment, 0L, index, value); }
    /// Sets `primitiveFragmentShadingRateMeshShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primitiveFragmentShadingRateMeshShader(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_primitiveFragmentShadingRateMeshShader(segment, 0L, value); }
    /// Sets `primitiveFragmentShadingRateMeshShader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT primitiveFragmentShadingRateMeshShaderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_primitiveFragmentShadingRateMeshShader(this.segment(), index, value); return this; }
    /// Sets `primitiveFragmentShadingRateMeshShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT primitiveFragmentShadingRateMeshShader(@CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_primitiveFragmentShadingRateMeshShader(this.segment(), value); return this; }

    /// {@return `meshShaderQueries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_meshShaderQueries(MemorySegment segment, long index) { return (int) VH_meshShaderQueries.get(segment, 0L, index); }
    /// {@return `meshShaderQueries`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_meshShaderQueries(MemorySegment segment) { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_meshShaderQueries(segment, 0L); }
    /// {@return `meshShaderQueries` at the given index}
    /// @param index the index
    public @CType("VkBool32") int meshShaderQueriesAt(long index) { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_meshShaderQueries(this.segment(), index); }
    /// {@return `meshShaderQueries`}
    public @CType("VkBool32") int meshShaderQueries() { return VkPhysicalDeviceMeshShaderFeaturesEXT.get_meshShaderQueries(this.segment()); }
    /// Sets `meshShaderQueries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_meshShaderQueries(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_meshShaderQueries.set(segment, 0L, index, value); }
    /// Sets `meshShaderQueries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_meshShaderQueries(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_meshShaderQueries(segment, 0L, value); }
    /// Sets `meshShaderQueries` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShaderQueriesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_meshShaderQueries(this.segment(), index, value); return this; }
    /// Sets `meshShaderQueries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShaderQueries(@CType("VkBool32") int value) { VkPhysicalDeviceMeshShaderFeaturesEXT.set_meshShaderQueries(this.segment(), value); return this; }

}

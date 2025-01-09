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
/// ### perStageDescriptorSet
/// [VarHandle][#VH_perStageDescriptorSet] - [Getter][#perStageDescriptorSet()] - [Setter][#perStageDescriptorSet(int)]
/// ### dynamicPipelineLayout
/// [VarHandle][#VH_dynamicPipelineLayout] - [Getter][#dynamicPipelineLayout()] - [Setter][#dynamicPipelineLayout(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDevicePerStageDescriptorSetFeaturesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 perStageDescriptorSet;
///     VkBool32 dynamicPipelineLayout;
/// } VkPhysicalDevicePerStageDescriptorSetFeaturesNV;
/// ```
public final class VkPhysicalDevicePerStageDescriptorSetFeaturesNV extends Struct {
    /// The struct layout of `VkPhysicalDevicePerStageDescriptorSetFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perStageDescriptorSet"),
        ValueLayout.JAVA_INT.withName("dynamicPipelineLayout")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `perStageDescriptorSet` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_perStageDescriptorSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("perStageDescriptorSet"));
    /// The [VarHandle] of `dynamicPipelineLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dynamicPipelineLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicPipelineLayout"));

    /// Creates `VkPhysicalDevicePerStageDescriptorSetFeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevicePerStageDescriptorSetFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment); }

    /// Creates `VkPhysicalDevicePerStageDescriptorSetFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevicePerStageDescriptorSetFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDevicePerStageDescriptorSetFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePerStageDescriptorSetFeaturesNV`
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevicePerStageDescriptorSetFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePerStageDescriptorSetFeaturesNV`
    public static VkPhysicalDevicePerStageDescriptorSetFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePerStageDescriptorSetFeaturesNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV sType(@CType("VkStructureType") int value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `perStageDescriptorSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_perStageDescriptorSet(MemorySegment segment, long index) { return (int) VH_perStageDescriptorSet.get(segment, 0L, index); }
    /// {@return `perStageDescriptorSet`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_perStageDescriptorSet(MemorySegment segment) { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.get_perStageDescriptorSet(segment, 0L); }
    /// {@return `perStageDescriptorSet` at the given index}
    /// @param index the index
    public @CType("VkBool32") int perStageDescriptorSetAt(long index) { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.get_perStageDescriptorSet(this.segment(), index); }
    /// {@return `perStageDescriptorSet`}
    public @CType("VkBool32") int perStageDescriptorSet() { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.get_perStageDescriptorSet(this.segment()); }
    /// Sets `perStageDescriptorSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_perStageDescriptorSet(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_perStageDescriptorSet.set(segment, 0L, index, value); }
    /// Sets `perStageDescriptorSet` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_perStageDescriptorSet(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.set_perStageDescriptorSet(segment, 0L, value); }
    /// Sets `perStageDescriptorSet` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV perStageDescriptorSetAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.set_perStageDescriptorSet(this.segment(), index, value); return this; }
    /// Sets `perStageDescriptorSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV perStageDescriptorSet(@CType("VkBool32") int value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.set_perStageDescriptorSet(this.segment(), value); return this; }

    /// {@return `dynamicPipelineLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_dynamicPipelineLayout(MemorySegment segment, long index) { return (int) VH_dynamicPipelineLayout.get(segment, 0L, index); }
    /// {@return `dynamicPipelineLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_dynamicPipelineLayout(MemorySegment segment) { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.get_dynamicPipelineLayout(segment, 0L); }
    /// {@return `dynamicPipelineLayout` at the given index}
    /// @param index the index
    public @CType("VkBool32") int dynamicPipelineLayoutAt(long index) { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.get_dynamicPipelineLayout(this.segment(), index); }
    /// {@return `dynamicPipelineLayout`}
    public @CType("VkBool32") int dynamicPipelineLayout() { return VkPhysicalDevicePerStageDescriptorSetFeaturesNV.get_dynamicPipelineLayout(this.segment()); }
    /// Sets `dynamicPipelineLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dynamicPipelineLayout(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_dynamicPipelineLayout.set(segment, 0L, index, value); }
    /// Sets `dynamicPipelineLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dynamicPipelineLayout(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.set_dynamicPipelineLayout(segment, 0L, value); }
    /// Sets `dynamicPipelineLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV dynamicPipelineLayoutAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.set_dynamicPipelineLayout(this.segment(), index, value); return this; }
    /// Sets `dynamicPipelineLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePerStageDescriptorSetFeaturesNV dynamicPipelineLayout(@CType("VkBool32") int value) { VkPhysicalDevicePerStageDescriptorSetFeaturesNV.set_dynamicPipelineLayout(this.segment(), value); return this; }

}

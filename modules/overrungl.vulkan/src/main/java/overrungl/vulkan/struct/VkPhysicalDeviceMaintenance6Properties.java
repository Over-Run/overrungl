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
/// ### blockTexelViewCompatibleMultipleLayers
/// [VarHandle][#VH_blockTexelViewCompatibleMultipleLayers] - [Getter][#blockTexelViewCompatibleMultipleLayers()] - [Setter][#blockTexelViewCompatibleMultipleLayers(int)]
/// ### maxCombinedImageSamplerDescriptorCount
/// [VarHandle][#VH_maxCombinedImageSamplerDescriptorCount] - [Getter][#maxCombinedImageSamplerDescriptorCount()] - [Setter][#maxCombinedImageSamplerDescriptorCount(int)]
/// ### fragmentShadingRateClampCombinerInputs
/// [VarHandle][#VH_fragmentShadingRateClampCombinerInputs] - [Getter][#fragmentShadingRateClampCombinerInputs()] - [Setter][#fragmentShadingRateClampCombinerInputs(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMaintenance6Properties {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 blockTexelViewCompatibleMultipleLayers;
///     uint32_t maxCombinedImageSamplerDescriptorCount;
///     VkBool32 fragmentShadingRateClampCombinerInputs;
/// } VkPhysicalDeviceMaintenance6Properties;
/// ```
public final class VkPhysicalDeviceMaintenance6Properties extends Struct {
    /// The struct layout of `VkPhysicalDeviceMaintenance6Properties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("blockTexelViewCompatibleMultipleLayers"),
        ValueLayout.JAVA_INT.withName("maxCombinedImageSamplerDescriptorCount"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateClampCombinerInputs")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `blockTexelViewCompatibleMultipleLayers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_blockTexelViewCompatibleMultipleLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    /// The [VarHandle] of `maxCombinedImageSamplerDescriptorCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxCombinedImageSamplerDescriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    /// The [VarHandle] of `fragmentShadingRateClampCombinerInputs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentShadingRateClampCombinerInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));

    /// Creates `VkPhysicalDeviceMaintenance6Properties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMaintenance6Properties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMaintenance6Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance6Properties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance6Properties(segment); }

    /// Creates `VkPhysicalDeviceMaintenance6Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance6Properties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance6Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMaintenance6Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance6Properties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance6Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceMaintenance6Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance6Properties`
    public static VkPhysicalDeviceMaintenance6Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance6Properties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMaintenance6Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMaintenance6Properties`
    public static VkPhysicalDeviceMaintenance6Properties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance6Properties(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceMaintenance6Properties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMaintenance6Properties`
    public VkPhysicalDeviceMaintenance6Properties asSlice(long index) { return new VkPhysicalDeviceMaintenance6Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceMaintenance6Properties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMaintenance6Properties`
    public VkPhysicalDeviceMaintenance6Properties asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance6Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMaintenance6Properties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMaintenance6Properties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMaintenance6Properties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMaintenance6Properties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6Properties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMaintenance6Properties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6Properties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMaintenance6Properties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMaintenance6Properties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceMaintenance6Properties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceMaintenance6Properties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMaintenance6Properties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6Properties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMaintenance6Properties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6Properties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMaintenance6Properties.set_pNext(this.segment(), value); return this; }

    /// {@return `blockTexelViewCompatibleMultipleLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_blockTexelViewCompatibleMultipleLayers(MemorySegment segment, long index) { return (int) VH_blockTexelViewCompatibleMultipleLayers.get(segment, 0L, index); }
    /// {@return `blockTexelViewCompatibleMultipleLayers`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_blockTexelViewCompatibleMultipleLayers(MemorySegment segment) { return VkPhysicalDeviceMaintenance6Properties.get_blockTexelViewCompatibleMultipleLayers(segment, 0L); }
    /// {@return `blockTexelViewCompatibleMultipleLayers` at the given index}
    /// @param index the index
    public @CType("VkBool32") int blockTexelViewCompatibleMultipleLayersAt(long index) { return VkPhysicalDeviceMaintenance6Properties.get_blockTexelViewCompatibleMultipleLayers(this.segment(), index); }
    /// {@return `blockTexelViewCompatibleMultipleLayers`}
    public @CType("VkBool32") int blockTexelViewCompatibleMultipleLayers() { return VkPhysicalDeviceMaintenance6Properties.get_blockTexelViewCompatibleMultipleLayers(this.segment()); }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_blockTexelViewCompatibleMultipleLayers(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_blockTexelViewCompatibleMultipleLayers.set(segment, 0L, index, value); }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_blockTexelViewCompatibleMultipleLayers(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance6Properties.set_blockTexelViewCompatibleMultipleLayers(segment, 0L, value); }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6Properties blockTexelViewCompatibleMultipleLayersAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance6Properties.set_blockTexelViewCompatibleMultipleLayers(this.segment(), index, value); return this; }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6Properties blockTexelViewCompatibleMultipleLayers(@CType("VkBool32") int value) { VkPhysicalDeviceMaintenance6Properties.set_blockTexelViewCompatibleMultipleLayers(this.segment(), value); return this; }

    /// {@return `maxCombinedImageSamplerDescriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxCombinedImageSamplerDescriptorCount(MemorySegment segment, long index) { return (int) VH_maxCombinedImageSamplerDescriptorCount.get(segment, 0L, index); }
    /// {@return `maxCombinedImageSamplerDescriptorCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxCombinedImageSamplerDescriptorCount(MemorySegment segment) { return VkPhysicalDeviceMaintenance6Properties.get_maxCombinedImageSamplerDescriptorCount(segment, 0L); }
    /// {@return `maxCombinedImageSamplerDescriptorCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxCombinedImageSamplerDescriptorCountAt(long index) { return VkPhysicalDeviceMaintenance6Properties.get_maxCombinedImageSamplerDescriptorCount(this.segment(), index); }
    /// {@return `maxCombinedImageSamplerDescriptorCount`}
    public @CType("uint32_t") int maxCombinedImageSamplerDescriptorCount() { return VkPhysicalDeviceMaintenance6Properties.get_maxCombinedImageSamplerDescriptorCount(this.segment()); }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxCombinedImageSamplerDescriptorCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxCombinedImageSamplerDescriptorCount.set(segment, 0L, index, value); }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxCombinedImageSamplerDescriptorCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance6Properties.set_maxCombinedImageSamplerDescriptorCount(segment, 0L, value); }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6Properties maxCombinedImageSamplerDescriptorCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance6Properties.set_maxCombinedImageSamplerDescriptorCount(this.segment(), index, value); return this; }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6Properties maxCombinedImageSamplerDescriptorCount(@CType("uint32_t") int value) { VkPhysicalDeviceMaintenance6Properties.set_maxCombinedImageSamplerDescriptorCount(this.segment(), value); return this; }

    /// {@return `fragmentShadingRateClampCombinerInputs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentShadingRateClampCombinerInputs(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateClampCombinerInputs.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateClampCombinerInputs`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentShadingRateClampCombinerInputs(MemorySegment segment) { return VkPhysicalDeviceMaintenance6Properties.get_fragmentShadingRateClampCombinerInputs(segment, 0L); }
    /// {@return `fragmentShadingRateClampCombinerInputs` at the given index}
    /// @param index the index
    public @CType("VkBool32") int fragmentShadingRateClampCombinerInputsAt(long index) { return VkPhysicalDeviceMaintenance6Properties.get_fragmentShadingRateClampCombinerInputs(this.segment(), index); }
    /// {@return `fragmentShadingRateClampCombinerInputs`}
    public @CType("VkBool32") int fragmentShadingRateClampCombinerInputs() { return VkPhysicalDeviceMaintenance6Properties.get_fragmentShadingRateClampCombinerInputs(this.segment()); }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentShadingRateClampCombinerInputs(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentShadingRateClampCombinerInputs.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentShadingRateClampCombinerInputs(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance6Properties.set_fragmentShadingRateClampCombinerInputs(segment, 0L, value); }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6Properties fragmentShadingRateClampCombinerInputsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance6Properties.set_fragmentShadingRateClampCombinerInputs(this.segment(), index, value); return this; }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6Properties fragmentShadingRateClampCombinerInputs(@CType("VkBool32") int value) { VkPhysicalDeviceMaintenance6Properties.set_fragmentShadingRateClampCombinerInputs(this.segment(), value); return this; }

}

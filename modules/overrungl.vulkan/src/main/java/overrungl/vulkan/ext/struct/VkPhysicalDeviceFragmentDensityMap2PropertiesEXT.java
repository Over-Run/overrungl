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
/// ### subsampledLoads
/// [VarHandle][#VH_subsampledLoads] - [Getter][#subsampledLoads()] - [Setter][#subsampledLoads(int)]
/// ### subsampledCoarseReconstructionEarlyAccess
/// [VarHandle][#VH_subsampledCoarseReconstructionEarlyAccess] - [Getter][#subsampledCoarseReconstructionEarlyAccess()] - [Setter][#subsampledCoarseReconstructionEarlyAccess(int)]
/// ### maxSubsampledArrayLayers
/// [VarHandle][#VH_maxSubsampledArrayLayers] - [Getter][#maxSubsampledArrayLayers()] - [Setter][#maxSubsampledArrayLayers(int)]
/// ### maxDescriptorSetSubsampledSamplers
/// [VarHandle][#VH_maxDescriptorSetSubsampledSamplers] - [Getter][#maxDescriptorSetSubsampledSamplers()] - [Setter][#maxDescriptorSetSubsampledSamplers(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFragmentDensityMap2PropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 subsampledLoads;
///     VkBool32 subsampledCoarseReconstructionEarlyAccess;
///     uint32_t maxSubsampledArrayLayers;
///     uint32_t maxDescriptorSetSubsampledSamplers;
/// } VkPhysicalDeviceFragmentDensityMap2PropertiesEXT;
/// ```
public final class VkPhysicalDeviceFragmentDensityMap2PropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subsampledLoads"),
        ValueLayout.JAVA_INT.withName("subsampledCoarseReconstructionEarlyAccess"),
        ValueLayout.JAVA_INT.withName("maxSubsampledArrayLayers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetSubsampledSamplers")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `subsampledLoads` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subsampledLoads = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subsampledLoads"));
    /// The [VarHandle] of `subsampledCoarseReconstructionEarlyAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subsampledCoarseReconstructionEarlyAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subsampledCoarseReconstructionEarlyAccess"));
    /// The [VarHandle] of `maxSubsampledArrayLayers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSubsampledArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubsampledArrayLayers"));
    /// The [VarHandle] of `maxDescriptorSetSubsampledSamplers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetSubsampledSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetSubsampledSamplers"));

    /// Creates `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFragmentDensityMap2PropertiesEXT`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `subsampledLoads` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_subsampledLoads(MemorySegment segment, long index) { return (int) VH_subsampledLoads.get(segment, 0L, index); }
    /// {@return `subsampledLoads`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_subsampledLoads(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_subsampledLoads(segment, 0L); }
    /// {@return `subsampledLoads` at the given index}
    /// @param index the index
    public @CType("VkBool32") int subsampledLoadsAt(long index) { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_subsampledLoads(this.segment(), index); }
    /// {@return `subsampledLoads`}
    public @CType("VkBool32") int subsampledLoads() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_subsampledLoads(this.segment()); }
    /// Sets `subsampledLoads` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subsampledLoads(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_subsampledLoads.set(segment, 0L, index, value); }
    /// Sets `subsampledLoads` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subsampledLoads(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_subsampledLoads(segment, 0L, value); }
    /// Sets `subsampledLoads` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT subsampledLoadsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_subsampledLoads(this.segment(), index, value); return this; }
    /// Sets `subsampledLoads` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT subsampledLoads(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_subsampledLoads(this.segment(), value); return this; }

    /// {@return `subsampledCoarseReconstructionEarlyAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_subsampledCoarseReconstructionEarlyAccess(MemorySegment segment, long index) { return (int) VH_subsampledCoarseReconstructionEarlyAccess.get(segment, 0L, index); }
    /// {@return `subsampledCoarseReconstructionEarlyAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_subsampledCoarseReconstructionEarlyAccess(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_subsampledCoarseReconstructionEarlyAccess(segment, 0L); }
    /// {@return `subsampledCoarseReconstructionEarlyAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int subsampledCoarseReconstructionEarlyAccessAt(long index) { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_subsampledCoarseReconstructionEarlyAccess(this.segment(), index); }
    /// {@return `subsampledCoarseReconstructionEarlyAccess`}
    public @CType("VkBool32") int subsampledCoarseReconstructionEarlyAccess() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_subsampledCoarseReconstructionEarlyAccess(this.segment()); }
    /// Sets `subsampledCoarseReconstructionEarlyAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subsampledCoarseReconstructionEarlyAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_subsampledCoarseReconstructionEarlyAccess.set(segment, 0L, index, value); }
    /// Sets `subsampledCoarseReconstructionEarlyAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subsampledCoarseReconstructionEarlyAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_subsampledCoarseReconstructionEarlyAccess(segment, 0L, value); }
    /// Sets `subsampledCoarseReconstructionEarlyAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT subsampledCoarseReconstructionEarlyAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_subsampledCoarseReconstructionEarlyAccess(this.segment(), index, value); return this; }
    /// Sets `subsampledCoarseReconstructionEarlyAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT subsampledCoarseReconstructionEarlyAccess(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_subsampledCoarseReconstructionEarlyAccess(this.segment(), value); return this; }

    /// {@return `maxSubsampledArrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSubsampledArrayLayers(MemorySegment segment, long index) { return (int) VH_maxSubsampledArrayLayers.get(segment, 0L, index); }
    /// {@return `maxSubsampledArrayLayers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSubsampledArrayLayers(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_maxSubsampledArrayLayers(segment, 0L); }
    /// {@return `maxSubsampledArrayLayers` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxSubsampledArrayLayersAt(long index) { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_maxSubsampledArrayLayers(this.segment(), index); }
    /// {@return `maxSubsampledArrayLayers`}
    public @CType("uint32_t") int maxSubsampledArrayLayers() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_maxSubsampledArrayLayers(this.segment()); }
    /// Sets `maxSubsampledArrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSubsampledArrayLayers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSubsampledArrayLayers.set(segment, 0L, index, value); }
    /// Sets `maxSubsampledArrayLayers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSubsampledArrayLayers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_maxSubsampledArrayLayers(segment, 0L, value); }
    /// Sets `maxSubsampledArrayLayers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT maxSubsampledArrayLayersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_maxSubsampledArrayLayers(this.segment(), index, value); return this; }
    /// Sets `maxSubsampledArrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT maxSubsampledArrayLayers(@CType("uint32_t") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_maxSubsampledArrayLayers(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetSubsampledSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetSubsampledSamplers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetSubsampledSamplers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetSubsampledSamplers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetSubsampledSamplers(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_maxDescriptorSetSubsampledSamplers(segment, 0L); }
    /// {@return `maxDescriptorSetSubsampledSamplers` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDescriptorSetSubsampledSamplersAt(long index) { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_maxDescriptorSetSubsampledSamplers(this.segment(), index); }
    /// {@return `maxDescriptorSetSubsampledSamplers`}
    public @CType("uint32_t") int maxDescriptorSetSubsampledSamplers() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.get_maxDescriptorSetSubsampledSamplers(this.segment()); }
    /// Sets `maxDescriptorSetSubsampledSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetSubsampledSamplers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetSubsampledSamplers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetSubsampledSamplers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetSubsampledSamplers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_maxDescriptorSetSubsampledSamplers(segment, 0L, value); }
    /// Sets `maxDescriptorSetSubsampledSamplers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT maxDescriptorSetSubsampledSamplersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_maxDescriptorSetSubsampledSamplers(this.segment(), index, value); return this; }
    /// Sets `maxDescriptorSetSubsampledSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT maxDescriptorSetSubsampledSamplers(@CType("uint32_t") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.set_maxDescriptorSetSubsampledSamplers(this.segment(), value); return this; }

}

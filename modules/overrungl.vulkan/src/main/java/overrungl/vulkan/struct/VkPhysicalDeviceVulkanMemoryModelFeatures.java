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
/// ### vulkanMemoryModel
/// [VarHandle][#VH_vulkanMemoryModel] - [Getter][#vulkanMemoryModel()] - [Setter][#vulkanMemoryModel(int)]
/// ### vulkanMemoryModelDeviceScope
/// [VarHandle][#VH_vulkanMemoryModelDeviceScope] - [Getter][#vulkanMemoryModelDeviceScope()] - [Setter][#vulkanMemoryModelDeviceScope(int)]
/// ### vulkanMemoryModelAvailabilityVisibilityChains
/// [VarHandle][#VH_vulkanMemoryModelAvailabilityVisibilityChains] - [Getter][#vulkanMemoryModelAvailabilityVisibilityChains()] - [Setter][#vulkanMemoryModelAvailabilityVisibilityChains(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVulkanMemoryModelFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 vulkanMemoryModel;
///     VkBool32 vulkanMemoryModelDeviceScope;
///     VkBool32 vulkanMemoryModelAvailabilityVisibilityChains;
/// } VkPhysicalDeviceVulkanMemoryModelFeatures;
/// ```
public final class VkPhysicalDeviceVulkanMemoryModelFeatures extends Struct {
    /// The struct layout of `VkPhysicalDeviceVulkanMemoryModelFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModel"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelDeviceScope"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelAvailabilityVisibilityChains")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `vulkanMemoryModel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vulkanMemoryModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModel"));
    /// The [VarHandle] of `vulkanMemoryModelDeviceScope` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vulkanMemoryModelDeviceScope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    /// The [VarHandle] of `vulkanMemoryModelAvailabilityVisibilityChains` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkanMemoryModelFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanMemoryModelFeatures(segment); }

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanMemoryModelFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanMemoryModelFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeatures`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkanMemoryModelFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeatures`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkanMemoryModelFeatures(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `vulkanMemoryModel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_vulkanMemoryModel(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModel.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModel`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_vulkanMemoryModel(MemorySegment segment) { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_vulkanMemoryModel(segment, 0L); }
    /// {@return `vulkanMemoryModel` at the given index}
    /// @param index the index
    public @CType("VkBool32") int vulkanMemoryModelAt(long index) { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_vulkanMemoryModel(this.segment(), index); }
    /// {@return `vulkanMemoryModel`}
    public @CType("VkBool32") int vulkanMemoryModel() { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_vulkanMemoryModel(this.segment()); }
    /// Sets `vulkanMemoryModel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vulkanMemoryModel(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_vulkanMemoryModel.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vulkanMemoryModel(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_vulkanMemoryModel(segment, 0L, value); }
    /// Sets `vulkanMemoryModel` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_vulkanMemoryModel(this.segment(), index, value); return this; }
    /// Sets `vulkanMemoryModel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModel(@CType("VkBool32") int value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_vulkanMemoryModel(this.segment(), value); return this; }

    /// {@return `vulkanMemoryModelDeviceScope` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_vulkanMemoryModelDeviceScope(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModelDeviceScope.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModelDeviceScope`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_vulkanMemoryModelDeviceScope(MemorySegment segment) { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_vulkanMemoryModelDeviceScope(segment, 0L); }
    /// {@return `vulkanMemoryModelDeviceScope` at the given index}
    /// @param index the index
    public @CType("VkBool32") int vulkanMemoryModelDeviceScopeAt(long index) { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_vulkanMemoryModelDeviceScope(this.segment(), index); }
    /// {@return `vulkanMemoryModelDeviceScope`}
    public @CType("VkBool32") int vulkanMemoryModelDeviceScope() { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_vulkanMemoryModelDeviceScope(this.segment()); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vulkanMemoryModelDeviceScope(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_vulkanMemoryModelDeviceScope.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vulkanMemoryModelDeviceScope(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_vulkanMemoryModelDeviceScope(segment, 0L, value); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelDeviceScopeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_vulkanMemoryModelDeviceScope(this.segment(), index, value); return this; }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelDeviceScope(@CType("VkBool32") int value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_vulkanMemoryModelDeviceScope(this.segment(), value); return this; }

    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModelAvailabilityVisibilityChains.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment segment) { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_vulkanMemoryModelAvailabilityVisibilityChains(segment, 0L); }
    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains` at the given index}
    /// @param index the index
    public @CType("VkBool32") int vulkanMemoryModelAvailabilityVisibilityChainsAt(long index) { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), index); }
    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains`}
    public @CType("VkBool32") int vulkanMemoryModelAvailabilityVisibilityChains() { return VkPhysicalDeviceVulkanMemoryModelFeatures.get_vulkanMemoryModelAvailabilityVisibilityChains(this.segment()); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_vulkanMemoryModelAvailabilityVisibilityChains.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_vulkanMemoryModelAvailabilityVisibilityChains(segment, 0L, value); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelAvailabilityVisibilityChainsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), index, value); return this; }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelAvailabilityVisibilityChains(@CType("VkBool32") int value) { VkPhysicalDeviceVulkanMemoryModelFeatures.set_vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), value); return this; }

}

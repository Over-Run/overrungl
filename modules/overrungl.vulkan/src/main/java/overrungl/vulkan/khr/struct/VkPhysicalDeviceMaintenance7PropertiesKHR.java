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
package overrungl.vulkan.khr.struct;

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
/// ### robustFragmentShadingRateAttachmentAccess
/// [VarHandle][#VH_robustFragmentShadingRateAttachmentAccess] - [Getter][#robustFragmentShadingRateAttachmentAccess()] - [Setter][#robustFragmentShadingRateAttachmentAccess(int)]
/// ### separateDepthStencilAttachmentAccess
/// [VarHandle][#VH_separateDepthStencilAttachmentAccess] - [Getter][#separateDepthStencilAttachmentAccess()] - [Setter][#separateDepthStencilAttachmentAccess(int)]
/// ### maxDescriptorSetTotalUniformBuffersDynamic
/// [VarHandle][#VH_maxDescriptorSetTotalUniformBuffersDynamic] - [Getter][#maxDescriptorSetTotalUniformBuffersDynamic()] - [Setter][#maxDescriptorSetTotalUniformBuffersDynamic(int)]
/// ### maxDescriptorSetTotalStorageBuffersDynamic
/// [VarHandle][#VH_maxDescriptorSetTotalStorageBuffersDynamic] - [Getter][#maxDescriptorSetTotalStorageBuffersDynamic()] - [Setter][#maxDescriptorSetTotalStorageBuffersDynamic(int)]
/// ### maxDescriptorSetTotalBuffersDynamic
/// [VarHandle][#VH_maxDescriptorSetTotalBuffersDynamic] - [Getter][#maxDescriptorSetTotalBuffersDynamic()] - [Setter][#maxDescriptorSetTotalBuffersDynamic(int)]
/// ### maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic] - [Getter][#maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic()] - [Setter][#maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(int)]
/// ### maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic] - [Getter][#maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic()] - [Setter][#maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(int)]
/// ### maxDescriptorSetUpdateAfterBindTotalBuffersDynamic
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic] - [Getter][#maxDescriptorSetUpdateAfterBindTotalBuffersDynamic()] - [Setter][#maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMaintenance7PropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 robustFragmentShadingRateAttachmentAccess;
///     VkBool32 separateDepthStencilAttachmentAccess;
///     uint32_t maxDescriptorSetTotalUniformBuffersDynamic;
///     uint32_t maxDescriptorSetTotalStorageBuffersDynamic;
///     uint32_t maxDescriptorSetTotalBuffersDynamic;
///     uint32_t maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic;
///     uint32_t maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic;
///     uint32_t maxDescriptorSetUpdateAfterBindTotalBuffersDynamic;
/// } VkPhysicalDeviceMaintenance7PropertiesKHR;
/// ```
public final class VkPhysicalDeviceMaintenance7PropertiesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceMaintenance7PropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustFragmentShadingRateAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("separateDepthStencilAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalUniformBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalStorageBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `robustFragmentShadingRateAttachmentAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_robustFragmentShadingRateAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustFragmentShadingRateAttachmentAccess"));
    /// The [VarHandle] of `separateDepthStencilAttachmentAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_separateDepthStencilAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("separateDepthStencilAttachmentAccess"));
    /// The [VarHandle] of `maxDescriptorSetTotalUniformBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetTotalUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetTotalUniformBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetTotalStorageBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetTotalStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetTotalStorageBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetTotalBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetTotalBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetTotalBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic"));

    /// Creates `VkPhysicalDeviceMaintenance7PropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMaintenance7PropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMaintenance7PropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance7PropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance7PropertiesKHR(segment); }

    /// Creates `VkPhysicalDeviceMaintenance7PropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance7PropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance7PropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMaintenance7PropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance7PropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance7PropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceMaintenance7PropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance7PropertiesKHR`
    public static VkPhysicalDeviceMaintenance7PropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance7PropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMaintenance7PropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMaintenance7PropertiesKHR`
    public static VkPhysicalDeviceMaintenance7PropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance7PropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceMaintenance7PropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMaintenance7PropertiesKHR`
    public VkPhysicalDeviceMaintenance7PropertiesKHR asSlice(long index) { return new VkPhysicalDeviceMaintenance7PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceMaintenance7PropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMaintenance7PropertiesKHR`
    public VkPhysicalDeviceMaintenance7PropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance7PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `robustFragmentShadingRateAttachmentAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_robustFragmentShadingRateAttachmentAccess(MemorySegment segment, long index) { return (int) VH_robustFragmentShadingRateAttachmentAccess.get(segment, 0L, index); }
    /// {@return `robustFragmentShadingRateAttachmentAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_robustFragmentShadingRateAttachmentAccess(MemorySegment segment) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_robustFragmentShadingRateAttachmentAccess(segment, 0L); }
    /// {@return `robustFragmentShadingRateAttachmentAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int robustFragmentShadingRateAttachmentAccessAt(long index) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_robustFragmentShadingRateAttachmentAccess(this.segment(), index); }
    /// {@return `robustFragmentShadingRateAttachmentAccess`}
    public @CType("VkBool32") int robustFragmentShadingRateAttachmentAccess() { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_robustFragmentShadingRateAttachmentAccess(this.segment()); }
    /// Sets `robustFragmentShadingRateAttachmentAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_robustFragmentShadingRateAttachmentAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_robustFragmentShadingRateAttachmentAccess.set(segment, 0L, index, value); }
    /// Sets `robustFragmentShadingRateAttachmentAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_robustFragmentShadingRateAttachmentAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_robustFragmentShadingRateAttachmentAccess(segment, 0L, value); }
    /// Sets `robustFragmentShadingRateAttachmentAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR robustFragmentShadingRateAttachmentAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_robustFragmentShadingRateAttachmentAccess(this.segment(), index, value); return this; }
    /// Sets `robustFragmentShadingRateAttachmentAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR robustFragmentShadingRateAttachmentAccess(@CType("VkBool32") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_robustFragmentShadingRateAttachmentAccess(this.segment(), value); return this; }

    /// {@return `separateDepthStencilAttachmentAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_separateDepthStencilAttachmentAccess(MemorySegment segment, long index) { return (int) VH_separateDepthStencilAttachmentAccess.get(segment, 0L, index); }
    /// {@return `separateDepthStencilAttachmentAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_separateDepthStencilAttachmentAccess(MemorySegment segment) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_separateDepthStencilAttachmentAccess(segment, 0L); }
    /// {@return `separateDepthStencilAttachmentAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int separateDepthStencilAttachmentAccessAt(long index) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_separateDepthStencilAttachmentAccess(this.segment(), index); }
    /// {@return `separateDepthStencilAttachmentAccess`}
    public @CType("VkBool32") int separateDepthStencilAttachmentAccess() { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_separateDepthStencilAttachmentAccess(this.segment()); }
    /// Sets `separateDepthStencilAttachmentAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_separateDepthStencilAttachmentAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_separateDepthStencilAttachmentAccess.set(segment, 0L, index, value); }
    /// Sets `separateDepthStencilAttachmentAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_separateDepthStencilAttachmentAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_separateDepthStencilAttachmentAccess(segment, 0L, value); }
    /// Sets `separateDepthStencilAttachmentAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR separateDepthStencilAttachmentAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_separateDepthStencilAttachmentAccess(this.segment(), index, value); return this; }
    /// Sets `separateDepthStencilAttachmentAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR separateDepthStencilAttachmentAccess(@CType("VkBool32") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_separateDepthStencilAttachmentAccess(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetTotalUniformBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetTotalUniformBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetTotalUniformBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetTotalUniformBuffersDynamic`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetTotalUniformBuffersDynamic(MemorySegment segment) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetTotalUniformBuffersDynamic(segment, 0L); }
    /// {@return `maxDescriptorSetTotalUniformBuffersDynamic` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDescriptorSetTotalUniformBuffersDynamicAt(long index) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetTotalUniformBuffersDynamic(this.segment(), index); }
    /// {@return `maxDescriptorSetTotalUniformBuffersDynamic`}
    public @CType("uint32_t") int maxDescriptorSetTotalUniformBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetTotalUniformBuffersDynamic(this.segment()); }
    /// Sets `maxDescriptorSetTotalUniformBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetTotalUniformBuffersDynamic(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetTotalUniformBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetTotalUniformBuffersDynamic` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetTotalUniformBuffersDynamic(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetTotalUniformBuffersDynamic(segment, 0L, value); }
    /// Sets `maxDescriptorSetTotalUniformBuffersDynamic` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalUniformBuffersDynamicAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetTotalUniformBuffersDynamic(this.segment(), index, value); return this; }
    /// Sets `maxDescriptorSetTotalUniformBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalUniformBuffersDynamic(@CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetTotalUniformBuffersDynamic(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetTotalStorageBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetTotalStorageBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetTotalStorageBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetTotalStorageBuffersDynamic`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetTotalStorageBuffersDynamic(MemorySegment segment) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetTotalStorageBuffersDynamic(segment, 0L); }
    /// {@return `maxDescriptorSetTotalStorageBuffersDynamic` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDescriptorSetTotalStorageBuffersDynamicAt(long index) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetTotalStorageBuffersDynamic(this.segment(), index); }
    /// {@return `maxDescriptorSetTotalStorageBuffersDynamic`}
    public @CType("uint32_t") int maxDescriptorSetTotalStorageBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetTotalStorageBuffersDynamic(this.segment()); }
    /// Sets `maxDescriptorSetTotalStorageBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetTotalStorageBuffersDynamic(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetTotalStorageBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetTotalStorageBuffersDynamic` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetTotalStorageBuffersDynamic(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetTotalStorageBuffersDynamic(segment, 0L, value); }
    /// Sets `maxDescriptorSetTotalStorageBuffersDynamic` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalStorageBuffersDynamicAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetTotalStorageBuffersDynamic(this.segment(), index, value); return this; }
    /// Sets `maxDescriptorSetTotalStorageBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalStorageBuffersDynamic(@CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetTotalStorageBuffersDynamic(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetTotalBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetTotalBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetTotalBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetTotalBuffersDynamic`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetTotalBuffersDynamic(MemorySegment segment) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetTotalBuffersDynamic(segment, 0L); }
    /// {@return `maxDescriptorSetTotalBuffersDynamic` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDescriptorSetTotalBuffersDynamicAt(long index) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetTotalBuffersDynamic(this.segment(), index); }
    /// {@return `maxDescriptorSetTotalBuffersDynamic`}
    public @CType("uint32_t") int maxDescriptorSetTotalBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetTotalBuffersDynamic(this.segment()); }
    /// Sets `maxDescriptorSetTotalBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetTotalBuffersDynamic(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetTotalBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetTotalBuffersDynamic` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetTotalBuffersDynamic(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetTotalBuffersDynamic(segment, 0L, value); }
    /// Sets `maxDescriptorSetTotalBuffersDynamic` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalBuffersDynamicAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetTotalBuffersDynamic(this.segment(), index, value); return this; }
    /// Sets `maxDescriptorSetTotalBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalBuffersDynamic(@CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetTotalBuffersDynamic(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(MemorySegment segment) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamicAt(long index) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(this.segment(), index); }
    /// {@return `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamicAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(this.segment(), index, value); return this; }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(@CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(MemorySegment segment) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamicAt(long index) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(this.segment(), index); }
    /// {@return `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamicAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(this.segment(), index, value); return this; }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(@CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(MemorySegment segment) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindTotalBuffersDynamicAt(long index) { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(this.segment(), index); }
    /// {@return `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindTotalBuffersDynamic() { return VkPhysicalDeviceMaintenance7PropertiesKHR.get_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalBuffersDynamicAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(this.segment(), index, value); return this; }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(@CType("uint32_t") int value) { VkPhysicalDeviceMaintenance7PropertiesKHR.set_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(this.segment(), value); return this; }

}

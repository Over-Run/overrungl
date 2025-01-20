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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### shaderInputAttachmentArrayDynamicIndexing
/// [VarHandle][#VH_shaderInputAttachmentArrayDynamicIndexing] - [Getter][#shaderInputAttachmentArrayDynamicIndexing()] - [Setter][#shaderInputAttachmentArrayDynamicIndexing(int)]
/// ### shaderUniformTexelBufferArrayDynamicIndexing
/// [VarHandle][#VH_shaderUniformTexelBufferArrayDynamicIndexing] - [Getter][#shaderUniformTexelBufferArrayDynamicIndexing()] - [Setter][#shaderUniformTexelBufferArrayDynamicIndexing(int)]
/// ### shaderStorageTexelBufferArrayDynamicIndexing
/// [VarHandle][#VH_shaderStorageTexelBufferArrayDynamicIndexing] - [Getter][#shaderStorageTexelBufferArrayDynamicIndexing()] - [Setter][#shaderStorageTexelBufferArrayDynamicIndexing(int)]
/// ### shaderUniformBufferArrayNonUniformIndexing
/// [VarHandle][#VH_shaderUniformBufferArrayNonUniformIndexing] - [Getter][#shaderUniformBufferArrayNonUniformIndexing()] - [Setter][#shaderUniformBufferArrayNonUniformIndexing(int)]
/// ### shaderSampledImageArrayNonUniformIndexing
/// [VarHandle][#VH_shaderSampledImageArrayNonUniformIndexing] - [Getter][#shaderSampledImageArrayNonUniformIndexing()] - [Setter][#shaderSampledImageArrayNonUniformIndexing(int)]
/// ### shaderStorageBufferArrayNonUniformIndexing
/// [VarHandle][#VH_shaderStorageBufferArrayNonUniformIndexing] - [Getter][#shaderStorageBufferArrayNonUniformIndexing()] - [Setter][#shaderStorageBufferArrayNonUniformIndexing(int)]
/// ### shaderStorageImageArrayNonUniformIndexing
/// [VarHandle][#VH_shaderStorageImageArrayNonUniformIndexing] - [Getter][#shaderStorageImageArrayNonUniformIndexing()] - [Setter][#shaderStorageImageArrayNonUniformIndexing(int)]
/// ### shaderInputAttachmentArrayNonUniformIndexing
/// [VarHandle][#VH_shaderInputAttachmentArrayNonUniformIndexing] - [Getter][#shaderInputAttachmentArrayNonUniformIndexing()] - [Setter][#shaderInputAttachmentArrayNonUniformIndexing(int)]
/// ### shaderUniformTexelBufferArrayNonUniformIndexing
/// [VarHandle][#VH_shaderUniformTexelBufferArrayNonUniformIndexing] - [Getter][#shaderUniformTexelBufferArrayNonUniformIndexing()] - [Setter][#shaderUniformTexelBufferArrayNonUniformIndexing(int)]
/// ### shaderStorageTexelBufferArrayNonUniformIndexing
/// [VarHandle][#VH_shaderStorageTexelBufferArrayNonUniformIndexing] - [Getter][#shaderStorageTexelBufferArrayNonUniformIndexing()] - [Setter][#shaderStorageTexelBufferArrayNonUniformIndexing(int)]
/// ### descriptorBindingUniformBufferUpdateAfterBind
/// [VarHandle][#VH_descriptorBindingUniformBufferUpdateAfterBind] - [Getter][#descriptorBindingUniformBufferUpdateAfterBind()] - [Setter][#descriptorBindingUniformBufferUpdateAfterBind(int)]
/// ### descriptorBindingSampledImageUpdateAfterBind
/// [VarHandle][#VH_descriptorBindingSampledImageUpdateAfterBind] - [Getter][#descriptorBindingSampledImageUpdateAfterBind()] - [Setter][#descriptorBindingSampledImageUpdateAfterBind(int)]
/// ### descriptorBindingStorageImageUpdateAfterBind
/// [VarHandle][#VH_descriptorBindingStorageImageUpdateAfterBind] - [Getter][#descriptorBindingStorageImageUpdateAfterBind()] - [Setter][#descriptorBindingStorageImageUpdateAfterBind(int)]
/// ### descriptorBindingStorageBufferUpdateAfterBind
/// [VarHandle][#VH_descriptorBindingStorageBufferUpdateAfterBind] - [Getter][#descriptorBindingStorageBufferUpdateAfterBind()] - [Setter][#descriptorBindingStorageBufferUpdateAfterBind(int)]
/// ### descriptorBindingUniformTexelBufferUpdateAfterBind
/// [VarHandle][#VH_descriptorBindingUniformTexelBufferUpdateAfterBind] - [Getter][#descriptorBindingUniformTexelBufferUpdateAfterBind()] - [Setter][#descriptorBindingUniformTexelBufferUpdateAfterBind(int)]
/// ### descriptorBindingStorageTexelBufferUpdateAfterBind
/// [VarHandle][#VH_descriptorBindingStorageTexelBufferUpdateAfterBind] - [Getter][#descriptorBindingStorageTexelBufferUpdateAfterBind()] - [Setter][#descriptorBindingStorageTexelBufferUpdateAfterBind(int)]
/// ### descriptorBindingUpdateUnusedWhilePending
/// [VarHandle][#VH_descriptorBindingUpdateUnusedWhilePending] - [Getter][#descriptorBindingUpdateUnusedWhilePending()] - [Setter][#descriptorBindingUpdateUnusedWhilePending(int)]
/// ### descriptorBindingPartiallyBound
/// [VarHandle][#VH_descriptorBindingPartiallyBound] - [Getter][#descriptorBindingPartiallyBound()] - [Setter][#descriptorBindingPartiallyBound(int)]
/// ### descriptorBindingVariableDescriptorCount
/// [VarHandle][#VH_descriptorBindingVariableDescriptorCount] - [Getter][#descriptorBindingVariableDescriptorCount()] - [Setter][#descriptorBindingVariableDescriptorCount(int)]
/// ### runtimeDescriptorArray
/// [VarHandle][#VH_runtimeDescriptorArray] - [Getter][#runtimeDescriptorArray()] - [Setter][#runtimeDescriptorArray(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDescriptorIndexingFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderInputAttachmentArrayDynamicIndexing;
///     VkBool32 shaderUniformTexelBufferArrayDynamicIndexing;
///     VkBool32 shaderStorageTexelBufferArrayDynamicIndexing;
///     VkBool32 shaderUniformBufferArrayNonUniformIndexing;
///     VkBool32 shaderSampledImageArrayNonUniformIndexing;
///     VkBool32 shaderStorageBufferArrayNonUniformIndexing;
///     VkBool32 shaderStorageImageArrayNonUniformIndexing;
///     VkBool32 shaderInputAttachmentArrayNonUniformIndexing;
///     VkBool32 shaderUniformTexelBufferArrayNonUniformIndexing;
///     VkBool32 shaderStorageTexelBufferArrayNonUniformIndexing;
///     VkBool32 descriptorBindingUniformBufferUpdateAfterBind;
///     VkBool32 descriptorBindingSampledImageUpdateAfterBind;
///     VkBool32 descriptorBindingStorageImageUpdateAfterBind;
///     VkBool32 descriptorBindingStorageBufferUpdateAfterBind;
///     VkBool32 descriptorBindingUniformTexelBufferUpdateAfterBind;
///     VkBool32 descriptorBindingStorageTexelBufferUpdateAfterBind;
///     VkBool32 descriptorBindingUpdateUnusedWhilePending;
///     VkBool32 descriptorBindingPartiallyBound;
///     VkBool32 descriptorBindingVariableDescriptorCount;
///     VkBool32 runtimeDescriptorArray;
/// } VkPhysicalDeviceDescriptorIndexingFeatures;
/// ```
public sealed class VkPhysicalDeviceDescriptorIndexingFeatures extends Struct {
    /// The struct layout of `VkPhysicalDeviceDescriptorIndexingFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderInputAttachmentArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderUniformTexelBufferArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageTexelBufferArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderUniformBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderSampledImageArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderInputAttachmentArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderUniformTexelBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageTexelBufferArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("descriptorBindingUniformBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingSampledImageUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingStorageImageUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingStorageBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingUniformTexelBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingStorageTexelBufferUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("descriptorBindingUpdateUnusedWhilePending"),
        ValueLayout.JAVA_INT.withName("descriptorBindingPartiallyBound"),
        ValueLayout.JAVA_INT.withName("descriptorBindingVariableDescriptorCount"),
        ValueLayout.JAVA_INT.withName("runtimeDescriptorArray")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderInputAttachmentArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderInputAttachmentArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderUniformTexelBufferArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderUniformTexelBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderStorageTexelBufferArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStorageTexelBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderUniformBufferArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderUniformBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing"));
    /// The [VarHandle] of `shaderSampledImageArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSampledImageArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing"));
    /// The [VarHandle] of `shaderStorageBufferArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStorageBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing"));
    /// The [VarHandle] of `shaderStorageImageArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStorageImageArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing"));
    /// The [VarHandle] of `shaderInputAttachmentArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderInputAttachmentArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing"));
    /// The [VarHandle] of `shaderUniformTexelBufferArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderUniformTexelBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing"));
    /// The [VarHandle] of `shaderStorageTexelBufferArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStorageTexelBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing"));
    /// The [VarHandle] of `descriptorBindingUniformBufferUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBindingUniformBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingSampledImageUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBindingSampledImageUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingStorageImageUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBindingStorageImageUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingStorageBufferUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBindingStorageBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingUniformTexelBufferUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBindingUniformTexelBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingStorageTexelBufferUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBindingStorageTexelBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingUpdateUnusedWhilePending` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBindingUpdateUnusedWhilePending = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending"));
    /// The [VarHandle] of `descriptorBindingPartiallyBound` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBindingPartiallyBound = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingPartiallyBound"));
    /// The [VarHandle] of `descriptorBindingVariableDescriptorCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBindingVariableDescriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingVariableDescriptorCount"));
    /// The [VarHandle] of `runtimeDescriptorArray` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_runtimeDescriptorArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("runtimeDescriptorArray"));

    /// Creates `VkPhysicalDeviceDescriptorIndexingFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDescriptorIndexingFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDescriptorIndexingFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorIndexingFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorIndexingFeatures(segment); }

    /// Creates `VkPhysicalDeviceDescriptorIndexingFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDescriptorIndexingFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorIndexingFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorIndexingFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDescriptorIndexingFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDescriptorIndexingFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDescriptorIndexingFeatures`
    public static VkPhysicalDeviceDescriptorIndexingFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorIndexingFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDescriptorIndexingFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDescriptorIndexingFeatures`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceDescriptorIndexingFeatures` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDescriptorIndexingFeatures`
    public static VkPhysicalDeviceDescriptorIndexingFeatures allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int shaderInputAttachmentArrayDynamicIndexing, @CType("VkBool32") int shaderUniformTexelBufferArrayDynamicIndexing, @CType("VkBool32") int shaderStorageTexelBufferArrayDynamicIndexing, @CType("VkBool32") int shaderUniformBufferArrayNonUniformIndexing, @CType("VkBool32") int shaderSampledImageArrayNonUniformIndexing, @CType("VkBool32") int shaderStorageBufferArrayNonUniformIndexing, @CType("VkBool32") int shaderStorageImageArrayNonUniformIndexing, @CType("VkBool32") int shaderInputAttachmentArrayNonUniformIndexing, @CType("VkBool32") int shaderUniformTexelBufferArrayNonUniformIndexing, @CType("VkBool32") int shaderStorageTexelBufferArrayNonUniformIndexing, @CType("VkBool32") int descriptorBindingUniformBufferUpdateAfterBind, @CType("VkBool32") int descriptorBindingSampledImageUpdateAfterBind, @CType("VkBool32") int descriptorBindingStorageImageUpdateAfterBind, @CType("VkBool32") int descriptorBindingStorageBufferUpdateAfterBind, @CType("VkBool32") int descriptorBindingUniformTexelBufferUpdateAfterBind, @CType("VkBool32") int descriptorBindingStorageTexelBufferUpdateAfterBind, @CType("VkBool32") int descriptorBindingUpdateUnusedWhilePending, @CType("VkBool32") int descriptorBindingPartiallyBound, @CType("VkBool32") int descriptorBindingVariableDescriptorCount, @CType("VkBool32") int runtimeDescriptorArray) { return alloc(allocator).sType(sType).pNext(pNext).shaderInputAttachmentArrayDynamicIndexing(shaderInputAttachmentArrayDynamicIndexing).shaderUniformTexelBufferArrayDynamicIndexing(shaderUniformTexelBufferArrayDynamicIndexing).shaderStorageTexelBufferArrayDynamicIndexing(shaderStorageTexelBufferArrayDynamicIndexing).shaderUniformBufferArrayNonUniformIndexing(shaderUniformBufferArrayNonUniformIndexing).shaderSampledImageArrayNonUniformIndexing(shaderSampledImageArrayNonUniformIndexing).shaderStorageBufferArrayNonUniformIndexing(shaderStorageBufferArrayNonUniformIndexing).shaderStorageImageArrayNonUniformIndexing(shaderStorageImageArrayNonUniformIndexing).shaderInputAttachmentArrayNonUniformIndexing(shaderInputAttachmentArrayNonUniformIndexing).shaderUniformTexelBufferArrayNonUniformIndexing(shaderUniformTexelBufferArrayNonUniformIndexing).shaderStorageTexelBufferArrayNonUniformIndexing(shaderStorageTexelBufferArrayNonUniformIndexing).descriptorBindingUniformBufferUpdateAfterBind(descriptorBindingUniformBufferUpdateAfterBind).descriptorBindingSampledImageUpdateAfterBind(descriptorBindingSampledImageUpdateAfterBind).descriptorBindingStorageImageUpdateAfterBind(descriptorBindingStorageImageUpdateAfterBind).descriptorBindingStorageBufferUpdateAfterBind(descriptorBindingStorageBufferUpdateAfterBind).descriptorBindingUniformTexelBufferUpdateAfterBind(descriptorBindingUniformTexelBufferUpdateAfterBind).descriptorBindingStorageTexelBufferUpdateAfterBind(descriptorBindingStorageTexelBufferUpdateAfterBind).descriptorBindingUpdateUnusedWhilePending(descriptorBindingUpdateUnusedWhilePending).descriptorBindingPartiallyBound(descriptorBindingPartiallyBound).descriptorBindingVariableDescriptorCount(descriptorBindingVariableDescriptorCount).runtimeDescriptorArray(runtimeDescriptorArray); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures copyFrom(VkPhysicalDeviceDescriptorIndexingFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderInputAttachmentArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderInputAttachmentArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderInputAttachmentArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderInputAttachmentArrayDynamicIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderInputAttachmentArrayDynamicIndexing(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderInputAttachmentArrayDynamicIndexing(segment, 0L); }
    /// {@return `shaderInputAttachmentArrayDynamicIndexing`}
    public @CType("VkBool32") int shaderInputAttachmentArrayDynamicIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderInputAttachmentArrayDynamicIndexing(this.segment()); }
    /// Sets `shaderInputAttachmentArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderInputAttachmentArrayDynamicIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderInputAttachmentArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderInputAttachmentArrayDynamicIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderInputAttachmentArrayDynamicIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderInputAttachmentArrayDynamicIndexing(segment, 0L, value); }
    /// Sets `shaderInputAttachmentArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayDynamicIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderInputAttachmentArrayDynamicIndexing(this.segment(), value); return this; }

    /// {@return `shaderUniformTexelBufferArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderUniformTexelBufferArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderUniformTexelBufferArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderUniformTexelBufferArrayDynamicIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderUniformTexelBufferArrayDynamicIndexing(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderUniformTexelBufferArrayDynamicIndexing(segment, 0L); }
    /// {@return `shaderUniformTexelBufferArrayDynamicIndexing`}
    public @CType("VkBool32") int shaderUniformTexelBufferArrayDynamicIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderUniformTexelBufferArrayDynamicIndexing(this.segment()); }
    /// Sets `shaderUniformTexelBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderUniformTexelBufferArrayDynamicIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderUniformTexelBufferArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderUniformTexelBufferArrayDynamicIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderUniformTexelBufferArrayDynamicIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderUniformTexelBufferArrayDynamicIndexing(segment, 0L, value); }
    /// Sets `shaderUniformTexelBufferArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayDynamicIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderUniformTexelBufferArrayDynamicIndexing(this.segment(), value); return this; }

    /// {@return `shaderStorageTexelBufferArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageTexelBufferArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageTexelBufferArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageTexelBufferArrayDynamicIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageTexelBufferArrayDynamicIndexing(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderStorageTexelBufferArrayDynamicIndexing(segment, 0L); }
    /// {@return `shaderStorageTexelBufferArrayDynamicIndexing`}
    public @CType("VkBool32") int shaderStorageTexelBufferArrayDynamicIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderStorageTexelBufferArrayDynamicIndexing(this.segment()); }
    /// Sets `shaderStorageTexelBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageTexelBufferArrayDynamicIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageTexelBufferArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageTexelBufferArrayDynamicIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageTexelBufferArrayDynamicIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderStorageTexelBufferArrayDynamicIndexing(segment, 0L, value); }
    /// Sets `shaderStorageTexelBufferArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayDynamicIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderStorageTexelBufferArrayDynamicIndexing(this.segment(), value); return this; }

    /// {@return `shaderUniformBufferArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderUniformBufferArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderUniformBufferArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderUniformBufferArrayNonUniformIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderUniformBufferArrayNonUniformIndexing(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderUniformBufferArrayNonUniformIndexing(segment, 0L); }
    /// {@return `shaderUniformBufferArrayNonUniformIndexing`}
    public @CType("VkBool32") int shaderUniformBufferArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderUniformBufferArrayNonUniformIndexing(this.segment()); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderUniformBufferArrayNonUniformIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderUniformBufferArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderUniformBufferArrayNonUniformIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderUniformBufferArrayNonUniformIndexing(segment, 0L, value); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformBufferArrayNonUniformIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderUniformBufferArrayNonUniformIndexing(this.segment(), value); return this; }

    /// {@return `shaderSampledImageArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSampledImageArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderSampledImageArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderSampledImageArrayNonUniformIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSampledImageArrayNonUniformIndexing(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderSampledImageArrayNonUniformIndexing(segment, 0L); }
    /// {@return `shaderSampledImageArrayNonUniformIndexing`}
    public @CType("VkBool32") int shaderSampledImageArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderSampledImageArrayNonUniformIndexing(this.segment()); }
    /// Sets `shaderSampledImageArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSampledImageArrayNonUniformIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSampledImageArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderSampledImageArrayNonUniformIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSampledImageArrayNonUniformIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderSampledImageArrayNonUniformIndexing(segment, 0L, value); }
    /// Sets `shaderSampledImageArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderSampledImageArrayNonUniformIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderSampledImageArrayNonUniformIndexing(this.segment(), value); return this; }

    /// {@return `shaderStorageBufferArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageBufferArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageBufferArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageBufferArrayNonUniformIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageBufferArrayNonUniformIndexing(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderStorageBufferArrayNonUniformIndexing(segment, 0L); }
    /// {@return `shaderStorageBufferArrayNonUniformIndexing`}
    public @CType("VkBool32") int shaderStorageBufferArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderStorageBufferArrayNonUniformIndexing(this.segment()); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageBufferArrayNonUniformIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageBufferArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageBufferArrayNonUniformIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderStorageBufferArrayNonUniformIndexing(segment, 0L, value); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageBufferArrayNonUniformIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderStorageBufferArrayNonUniformIndexing(this.segment(), value); return this; }

    /// {@return `shaderStorageImageArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageImageArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageImageArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageImageArrayNonUniformIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageImageArrayNonUniformIndexing(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderStorageImageArrayNonUniformIndexing(segment, 0L); }
    /// {@return `shaderStorageImageArrayNonUniformIndexing`}
    public @CType("VkBool32") int shaderStorageImageArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderStorageImageArrayNonUniformIndexing(this.segment()); }
    /// Sets `shaderStorageImageArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageImageArrayNonUniformIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageImageArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageArrayNonUniformIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageImageArrayNonUniformIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderStorageImageArrayNonUniformIndexing(segment, 0L, value); }
    /// Sets `shaderStorageImageArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageImageArrayNonUniformIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderStorageImageArrayNonUniformIndexing(this.segment(), value); return this; }

    /// {@return `shaderInputAttachmentArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderInputAttachmentArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderInputAttachmentArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderInputAttachmentArrayNonUniformIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderInputAttachmentArrayNonUniformIndexing(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderInputAttachmentArrayNonUniformIndexing(segment, 0L); }
    /// {@return `shaderInputAttachmentArrayNonUniformIndexing`}
    public @CType("VkBool32") int shaderInputAttachmentArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderInputAttachmentArrayNonUniformIndexing(this.segment()); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderInputAttachmentArrayNonUniformIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderInputAttachmentArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderInputAttachmentArrayNonUniformIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderInputAttachmentArrayNonUniformIndexing(segment, 0L, value); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayNonUniformIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderInputAttachmentArrayNonUniformIndexing(this.segment(), value); return this; }

    /// {@return `shaderUniformTexelBufferArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderUniformTexelBufferArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderUniformTexelBufferArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderUniformTexelBufferArrayNonUniformIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderUniformTexelBufferArrayNonUniformIndexing(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderUniformTexelBufferArrayNonUniformIndexing(segment, 0L); }
    /// {@return `shaderUniformTexelBufferArrayNonUniformIndexing`}
    public @CType("VkBool32") int shaderUniformTexelBufferArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderUniformTexelBufferArrayNonUniformIndexing(this.segment()); }
    /// Sets `shaderUniformTexelBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderUniformTexelBufferArrayNonUniformIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderUniformTexelBufferArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderUniformTexelBufferArrayNonUniformIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderUniformTexelBufferArrayNonUniformIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderUniformTexelBufferArrayNonUniformIndexing(segment, 0L, value); }
    /// Sets `shaderUniformTexelBufferArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayNonUniformIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderUniformTexelBufferArrayNonUniformIndexing(this.segment(), value); return this; }

    /// {@return `shaderStorageTexelBufferArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageTexelBufferArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageTexelBufferArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageTexelBufferArrayNonUniformIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageTexelBufferArrayNonUniformIndexing(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderStorageTexelBufferArrayNonUniformIndexing(segment, 0L); }
    /// {@return `shaderStorageTexelBufferArrayNonUniformIndexing`}
    public @CType("VkBool32") int shaderStorageTexelBufferArrayNonUniformIndexing() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderStorageTexelBufferArrayNonUniformIndexing(this.segment()); }
    /// Sets `shaderStorageTexelBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageTexelBufferArrayNonUniformIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageTexelBufferArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageTexelBufferArrayNonUniformIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageTexelBufferArrayNonUniformIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderStorageTexelBufferArrayNonUniformIndexing(segment, 0L, value); }
    /// Sets `shaderStorageTexelBufferArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayNonUniformIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderStorageTexelBufferArrayNonUniformIndexing(this.segment(), value); return this; }

    /// {@return `descriptorBindingUniformBufferUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingUniformBufferUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingUniformBufferUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingUniformBufferUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingUniformBufferUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingUniformBufferUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingUniformBufferUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingUniformBufferUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingUniformBufferUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingUniformBufferUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingUniformBufferUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingUniformBufferUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingUniformBufferUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingUniformBufferUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingUniformBufferUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingUniformBufferUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformBufferUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingUniformBufferUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `descriptorBindingSampledImageUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingSampledImageUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingSampledImageUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingSampledImageUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingSampledImageUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingSampledImageUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingSampledImageUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingSampledImageUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingSampledImageUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingSampledImageUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingSampledImageUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingSampledImageUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingSampledImageUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingSampledImageUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingSampledImageUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingSampledImageUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingSampledImageUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingSampledImageUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `descriptorBindingStorageImageUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingStorageImageUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingStorageImageUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingStorageImageUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingStorageImageUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingStorageImageUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingStorageImageUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingStorageImageUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingStorageImageUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingStorageImageUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingStorageImageUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingStorageImageUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingStorageImageUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingStorageImageUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingStorageImageUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingStorageImageUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageImageUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingStorageImageUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `descriptorBindingStorageBufferUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingStorageBufferUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingStorageBufferUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingStorageBufferUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingStorageBufferUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingStorageBufferUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingStorageBufferUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingStorageBufferUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingStorageBufferUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingStorageBufferUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingStorageBufferUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingStorageBufferUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingStorageBufferUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingStorageBufferUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingStorageBufferUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingStorageBufferUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageBufferUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingStorageBufferUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `descriptorBindingUniformTexelBufferUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingUniformTexelBufferUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingUniformTexelBufferUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingUniformTexelBufferUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingUniformTexelBufferUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingUniformTexelBufferUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingUniformTexelBufferUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingUniformTexelBufferUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingUniformTexelBufferUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingUniformTexelBufferUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingUniformTexelBufferUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingUniformTexelBufferUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingUniformTexelBufferUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingUniformTexelBufferUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingUniformTexelBufferUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformTexelBufferUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `descriptorBindingStorageTexelBufferUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingStorageTexelBufferUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingStorageTexelBufferUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingStorageTexelBufferUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingStorageTexelBufferUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingStorageTexelBufferUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingStorageTexelBufferUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingStorageTexelBufferUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingStorageTexelBufferUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingStorageTexelBufferUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingStorageTexelBufferUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingStorageTexelBufferUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingStorageTexelBufferUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingStorageTexelBufferUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingStorageTexelBufferUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageTexelBufferUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `descriptorBindingUpdateUnusedWhilePending` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingUpdateUnusedWhilePending(MemorySegment segment, long index) { return (int) VH_descriptorBindingUpdateUnusedWhilePending.get(segment, 0L, index); }
    /// {@return `descriptorBindingUpdateUnusedWhilePending`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingUpdateUnusedWhilePending(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingUpdateUnusedWhilePending(segment, 0L); }
    /// {@return `descriptorBindingUpdateUnusedWhilePending`}
    public @CType("VkBool32") int descriptorBindingUpdateUnusedWhilePending() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingUpdateUnusedWhilePending(this.segment()); }
    /// Sets `descriptorBindingUpdateUnusedWhilePending` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingUpdateUnusedWhilePending(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingUpdateUnusedWhilePending.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingUpdateUnusedWhilePending` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingUpdateUnusedWhilePending(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingUpdateUnusedWhilePending(segment, 0L, value); }
    /// Sets `descriptorBindingUpdateUnusedWhilePending` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUpdateUnusedWhilePending(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingUpdateUnusedWhilePending(this.segment(), value); return this; }

    /// {@return `descriptorBindingPartiallyBound` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingPartiallyBound(MemorySegment segment, long index) { return (int) VH_descriptorBindingPartiallyBound.get(segment, 0L, index); }
    /// {@return `descriptorBindingPartiallyBound`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingPartiallyBound(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingPartiallyBound(segment, 0L); }
    /// {@return `descriptorBindingPartiallyBound`}
    public @CType("VkBool32") int descriptorBindingPartiallyBound() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingPartiallyBound(this.segment()); }
    /// Sets `descriptorBindingPartiallyBound` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingPartiallyBound(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingPartiallyBound.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingPartiallyBound` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingPartiallyBound(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingPartiallyBound(segment, 0L, value); }
    /// Sets `descriptorBindingPartiallyBound` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingPartiallyBound(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingPartiallyBound(this.segment(), value); return this; }

    /// {@return `descriptorBindingVariableDescriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingVariableDescriptorCount(MemorySegment segment, long index) { return (int) VH_descriptorBindingVariableDescriptorCount.get(segment, 0L, index); }
    /// {@return `descriptorBindingVariableDescriptorCount`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingVariableDescriptorCount(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingVariableDescriptorCount(segment, 0L); }
    /// {@return `descriptorBindingVariableDescriptorCount`}
    public @CType("VkBool32") int descriptorBindingVariableDescriptorCount() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingVariableDescriptorCount(this.segment()); }
    /// Sets `descriptorBindingVariableDescriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingVariableDescriptorCount(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingVariableDescriptorCount.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingVariableDescriptorCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingVariableDescriptorCount(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingVariableDescriptorCount(segment, 0L, value); }
    /// Sets `descriptorBindingVariableDescriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingVariableDescriptorCount(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingVariableDescriptorCount(this.segment(), value); return this; }

    /// {@return `runtimeDescriptorArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_runtimeDescriptorArray(MemorySegment segment, long index) { return (int) VH_runtimeDescriptorArray.get(segment, 0L, index); }
    /// {@return `runtimeDescriptorArray`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_runtimeDescriptorArray(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_runtimeDescriptorArray(segment, 0L); }
    /// {@return `runtimeDescriptorArray`}
    public @CType("VkBool32") int runtimeDescriptorArray() { return VkPhysicalDeviceDescriptorIndexingFeatures.get_runtimeDescriptorArray(this.segment()); }
    /// Sets `runtimeDescriptorArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_runtimeDescriptorArray(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_runtimeDescriptorArray.set(segment, 0L, index, value); }
    /// Sets `runtimeDescriptorArray` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_runtimeDescriptorArray(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_runtimeDescriptorArray(segment, 0L, value); }
    /// Sets `runtimeDescriptorArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures runtimeDescriptorArray(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_runtimeDescriptorArray(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceDescriptorIndexingFeatures].
    public static final class Buffer extends VkPhysicalDeviceDescriptorIndexingFeatures {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDescriptorIndexingFeatures.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDescriptorIndexingFeatures`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDescriptorIndexingFeatures`
        public VkPhysicalDeviceDescriptorIndexingFeatures asSlice(long index) { return new VkPhysicalDeviceDescriptorIndexingFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDescriptorIndexingFeatures`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDescriptorIndexingFeatures`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shaderInputAttachmentArrayDynamicIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderInputAttachmentArrayDynamicIndexingAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderInputAttachmentArrayDynamicIndexing(this.segment(), index); }
        /// Sets `shaderInputAttachmentArrayDynamicIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderInputAttachmentArrayDynamicIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderInputAttachmentArrayDynamicIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderUniformTexelBufferArrayDynamicIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderUniformTexelBufferArrayDynamicIndexingAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderUniformTexelBufferArrayDynamicIndexing(this.segment(), index); }
        /// Sets `shaderUniformTexelBufferArrayDynamicIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderUniformTexelBufferArrayDynamicIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderUniformTexelBufferArrayDynamicIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderStorageTexelBufferArrayDynamicIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderStorageTexelBufferArrayDynamicIndexingAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderStorageTexelBufferArrayDynamicIndexing(this.segment(), index); }
        /// Sets `shaderStorageTexelBufferArrayDynamicIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageTexelBufferArrayDynamicIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderStorageTexelBufferArrayDynamicIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderUniformBufferArrayNonUniformIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderUniformBufferArrayNonUniformIndexingAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderUniformBufferArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderUniformBufferArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderUniformBufferArrayNonUniformIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderUniformBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderSampledImageArrayNonUniformIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSampledImageArrayNonUniformIndexingAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderSampledImageArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderSampledImageArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSampledImageArrayNonUniformIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderSampledImageArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderStorageBufferArrayNonUniformIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderStorageBufferArrayNonUniformIndexingAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderStorageBufferArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderStorageBufferArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageBufferArrayNonUniformIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderStorageBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderStorageImageArrayNonUniformIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderStorageImageArrayNonUniformIndexingAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderStorageImageArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderStorageImageArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageImageArrayNonUniformIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderStorageImageArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderInputAttachmentArrayNonUniformIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderInputAttachmentArrayNonUniformIndexingAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderInputAttachmentArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderInputAttachmentArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderInputAttachmentArrayNonUniformIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderInputAttachmentArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderUniformTexelBufferArrayNonUniformIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderUniformTexelBufferArrayNonUniformIndexingAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderUniformTexelBufferArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderUniformTexelBufferArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderUniformTexelBufferArrayNonUniformIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderUniformTexelBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderStorageTexelBufferArrayNonUniformIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderStorageTexelBufferArrayNonUniformIndexingAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_shaderStorageTexelBufferArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderStorageTexelBufferArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageTexelBufferArrayNonUniformIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_shaderStorageTexelBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingUniformBufferUpdateAfterBind` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingUniformBufferUpdateAfterBindAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingUniformBufferUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingUniformBufferUpdateAfterBind` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingUniformBufferUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingUniformBufferUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingSampledImageUpdateAfterBind` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingSampledImageUpdateAfterBindAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingSampledImageUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingSampledImageUpdateAfterBind` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingSampledImageUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingSampledImageUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingStorageImageUpdateAfterBind` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingStorageImageUpdateAfterBindAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingStorageImageUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingStorageImageUpdateAfterBind` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingStorageImageUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingStorageImageUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingStorageBufferUpdateAfterBind` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingStorageBufferUpdateAfterBindAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingStorageBufferUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingStorageBufferUpdateAfterBind` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingStorageBufferUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingStorageBufferUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingUniformTexelBufferUpdateAfterBind` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingUniformTexelBufferUpdateAfterBind` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingStorageTexelBufferUpdateAfterBind` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingStorageTexelBufferUpdateAfterBind` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingUpdateUnusedWhilePending` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingUpdateUnusedWhilePendingAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingUpdateUnusedWhilePending(this.segment(), index); }
        /// Sets `descriptorBindingUpdateUnusedWhilePending` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingUpdateUnusedWhilePendingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingUpdateUnusedWhilePending(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingPartiallyBound` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingPartiallyBoundAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingPartiallyBound(this.segment(), index); }
        /// Sets `descriptorBindingPartiallyBound` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingPartiallyBoundAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingPartiallyBound(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingVariableDescriptorCount` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingVariableDescriptorCountAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_descriptorBindingVariableDescriptorCount(this.segment(), index); }
        /// Sets `descriptorBindingVariableDescriptorCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingVariableDescriptorCountAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_descriptorBindingVariableDescriptorCount(this.segment(), index, value); return this; }

        /// {@return `runtimeDescriptorArray` at the given index}
        /// @param index the index
        public @CType("VkBool32") int runtimeDescriptorArrayAt(long index) { return VkPhysicalDeviceDescriptorIndexingFeatures.get_runtimeDescriptorArray(this.segment(), index); }
        /// Sets `runtimeDescriptorArray` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer runtimeDescriptorArrayAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingFeatures.set_runtimeDescriptorArray(this.segment(), index, value); return this; }

    }
}

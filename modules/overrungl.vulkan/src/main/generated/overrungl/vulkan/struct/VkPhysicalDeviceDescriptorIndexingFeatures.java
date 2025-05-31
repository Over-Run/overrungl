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
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceDescriptorIndexingFeatures {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderInputAttachmentArrayDynamicIndexing;
///     (uint32_t) VkBool32 shaderUniformTexelBufferArrayDynamicIndexing;
///     (uint32_t) VkBool32 shaderStorageTexelBufferArrayDynamicIndexing;
///     (uint32_t) VkBool32 shaderUniformBufferArrayNonUniformIndexing;
///     (uint32_t) VkBool32 shaderSampledImageArrayNonUniformIndexing;
///     (uint32_t) VkBool32 shaderStorageBufferArrayNonUniformIndexing;
///     (uint32_t) VkBool32 shaderStorageImageArrayNonUniformIndexing;
///     (uint32_t) VkBool32 shaderInputAttachmentArrayNonUniformIndexing;
///     (uint32_t) VkBool32 shaderUniformTexelBufferArrayNonUniformIndexing;
///     (uint32_t) VkBool32 shaderStorageTexelBufferArrayNonUniformIndexing;
///     (uint32_t) VkBool32 descriptorBindingUniformBufferUpdateAfterBind;
///     (uint32_t) VkBool32 descriptorBindingSampledImageUpdateAfterBind;
///     (uint32_t) VkBool32 descriptorBindingStorageImageUpdateAfterBind;
///     (uint32_t) VkBool32 descriptorBindingStorageBufferUpdateAfterBind;
///     (uint32_t) VkBool32 descriptorBindingUniformTexelBufferUpdateAfterBind;
///     (uint32_t) VkBool32 descriptorBindingStorageTexelBufferUpdateAfterBind;
///     (uint32_t) VkBool32 descriptorBindingUpdateUnusedWhilePending;
///     (uint32_t) VkBool32 descriptorBindingPartiallyBound;
///     (uint32_t) VkBool32 descriptorBindingVariableDescriptorCount;
///     (uint32_t) VkBool32 runtimeDescriptorArray;
/// };
/// ```
public sealed class VkPhysicalDeviceDescriptorIndexingFeatures extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDescriptorIndexingFeatures`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `shaderInputAttachmentArrayDynamicIndexing`.
    public static final long OFFSET_shaderInputAttachmentArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
    /// The memory layout of `shaderInputAttachmentArrayDynamicIndexing`.
    public static final MemoryLayout LAYOUT_shaderInputAttachmentArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderInputAttachmentArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderInputAttachmentArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
    /// The byte offset of `shaderUniformTexelBufferArrayDynamicIndexing`.
    public static final long OFFSET_shaderUniformTexelBufferArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
    /// The memory layout of `shaderUniformTexelBufferArrayDynamicIndexing`.
    public static final MemoryLayout LAYOUT_shaderUniformTexelBufferArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderUniformTexelBufferArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderUniformTexelBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
    /// The byte offset of `shaderStorageTexelBufferArrayDynamicIndexing`.
    public static final long OFFSET_shaderStorageTexelBufferArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing"));
    /// The memory layout of `shaderStorageTexelBufferArrayDynamicIndexing`.
    public static final MemoryLayout LAYOUT_shaderStorageTexelBufferArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderStorageTexelBufferArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageTexelBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing"));
    /// The byte offset of `shaderUniformBufferArrayNonUniformIndexing`.
    public static final long OFFSET_shaderUniformBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing"));
    /// The memory layout of `shaderUniformBufferArrayNonUniformIndexing`.
    public static final MemoryLayout LAYOUT_shaderUniformBufferArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing"));
    /// The [VarHandle] of `shaderUniformBufferArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderUniformBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing"));
    /// The byte offset of `shaderSampledImageArrayNonUniformIndexing`.
    public static final long OFFSET_shaderSampledImageArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing"));
    /// The memory layout of `shaderSampledImageArrayNonUniformIndexing`.
    public static final MemoryLayout LAYOUT_shaderSampledImageArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing"));
    /// The [VarHandle] of `shaderSampledImageArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSampledImageArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing"));
    /// The byte offset of `shaderStorageBufferArrayNonUniformIndexing`.
    public static final long OFFSET_shaderStorageBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing"));
    /// The memory layout of `shaderStorageBufferArrayNonUniformIndexing`.
    public static final MemoryLayout LAYOUT_shaderStorageBufferArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing"));
    /// The [VarHandle] of `shaderStorageBufferArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing"));
    /// The byte offset of `shaderStorageImageArrayNonUniformIndexing`.
    public static final long OFFSET_shaderStorageImageArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing"));
    /// The memory layout of `shaderStorageImageArrayNonUniformIndexing`.
    public static final MemoryLayout LAYOUT_shaderStorageImageArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing"));
    /// The [VarHandle] of `shaderStorageImageArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageImageArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing"));
    /// The byte offset of `shaderInputAttachmentArrayNonUniformIndexing`.
    public static final long OFFSET_shaderInputAttachmentArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing"));
    /// The memory layout of `shaderInputAttachmentArrayNonUniformIndexing`.
    public static final MemoryLayout LAYOUT_shaderInputAttachmentArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing"));
    /// The [VarHandle] of `shaderInputAttachmentArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderInputAttachmentArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing"));
    /// The byte offset of `shaderUniformTexelBufferArrayNonUniformIndexing`.
    public static final long OFFSET_shaderUniformTexelBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing"));
    /// The memory layout of `shaderUniformTexelBufferArrayNonUniformIndexing`.
    public static final MemoryLayout LAYOUT_shaderUniformTexelBufferArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing"));
    /// The [VarHandle] of `shaderUniformTexelBufferArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderUniformTexelBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing"));
    /// The byte offset of `shaderStorageTexelBufferArrayNonUniformIndexing`.
    public static final long OFFSET_shaderStorageTexelBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing"));
    /// The memory layout of `shaderStorageTexelBufferArrayNonUniformIndexing`.
    public static final MemoryLayout LAYOUT_shaderStorageTexelBufferArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing"));
    /// The [VarHandle] of `shaderStorageTexelBufferArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageTexelBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing"));
    /// The byte offset of `descriptorBindingUniformBufferUpdateAfterBind`.
    public static final long OFFSET_descriptorBindingUniformBufferUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind"));
    /// The memory layout of `descriptorBindingUniformBufferUpdateAfterBind`.
    public static final MemoryLayout LAYOUT_descriptorBindingUniformBufferUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingUniformBufferUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBindingUniformBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind"));
    /// The byte offset of `descriptorBindingSampledImageUpdateAfterBind`.
    public static final long OFFSET_descriptorBindingSampledImageUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind"));
    /// The memory layout of `descriptorBindingSampledImageUpdateAfterBind`.
    public static final MemoryLayout LAYOUT_descriptorBindingSampledImageUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingSampledImageUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBindingSampledImageUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind"));
    /// The byte offset of `descriptorBindingStorageImageUpdateAfterBind`.
    public static final long OFFSET_descriptorBindingStorageImageUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind"));
    /// The memory layout of `descriptorBindingStorageImageUpdateAfterBind`.
    public static final MemoryLayout LAYOUT_descriptorBindingStorageImageUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingStorageImageUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBindingStorageImageUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind"));
    /// The byte offset of `descriptorBindingStorageBufferUpdateAfterBind`.
    public static final long OFFSET_descriptorBindingStorageBufferUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind"));
    /// The memory layout of `descriptorBindingStorageBufferUpdateAfterBind`.
    public static final MemoryLayout LAYOUT_descriptorBindingStorageBufferUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingStorageBufferUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBindingStorageBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind"));
    /// The byte offset of `descriptorBindingUniformTexelBufferUpdateAfterBind`.
    public static final long OFFSET_descriptorBindingUniformTexelBufferUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind"));
    /// The memory layout of `descriptorBindingUniformTexelBufferUpdateAfterBind`.
    public static final MemoryLayout LAYOUT_descriptorBindingUniformTexelBufferUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingUniformTexelBufferUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBindingUniformTexelBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind"));
    /// The byte offset of `descriptorBindingStorageTexelBufferUpdateAfterBind`.
    public static final long OFFSET_descriptorBindingStorageTexelBufferUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind"));
    /// The memory layout of `descriptorBindingStorageTexelBufferUpdateAfterBind`.
    public static final MemoryLayout LAYOUT_descriptorBindingStorageTexelBufferUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingStorageTexelBufferUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBindingStorageTexelBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind"));
    /// The byte offset of `descriptorBindingUpdateUnusedWhilePending`.
    public static final long OFFSET_descriptorBindingUpdateUnusedWhilePending = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending"));
    /// The memory layout of `descriptorBindingUpdateUnusedWhilePending`.
    public static final MemoryLayout LAYOUT_descriptorBindingUpdateUnusedWhilePending = LAYOUT.select(PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending"));
    /// The [VarHandle] of `descriptorBindingUpdateUnusedWhilePending` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBindingUpdateUnusedWhilePending = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending"));
    /// The byte offset of `descriptorBindingPartiallyBound`.
    public static final long OFFSET_descriptorBindingPartiallyBound = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingPartiallyBound"));
    /// The memory layout of `descriptorBindingPartiallyBound`.
    public static final MemoryLayout LAYOUT_descriptorBindingPartiallyBound = LAYOUT.select(PathElement.groupElement("descriptorBindingPartiallyBound"));
    /// The [VarHandle] of `descriptorBindingPartiallyBound` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBindingPartiallyBound = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingPartiallyBound"));
    /// The byte offset of `descriptorBindingVariableDescriptorCount`.
    public static final long OFFSET_descriptorBindingVariableDescriptorCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingVariableDescriptorCount"));
    /// The memory layout of `descriptorBindingVariableDescriptorCount`.
    public static final MemoryLayout LAYOUT_descriptorBindingVariableDescriptorCount = LAYOUT.select(PathElement.groupElement("descriptorBindingVariableDescriptorCount"));
    /// The [VarHandle] of `descriptorBindingVariableDescriptorCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBindingVariableDescriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingVariableDescriptorCount"));
    /// The byte offset of `runtimeDescriptorArray`.
    public static final long OFFSET_runtimeDescriptorArray = LAYOUT.byteOffset(PathElement.groupElement("runtimeDescriptorArray"));
    /// The memory layout of `runtimeDescriptorArray`.
    public static final MemoryLayout LAYOUT_runtimeDescriptorArray = LAYOUT.select(PathElement.groupElement("runtimeDescriptorArray"));
    /// The [VarHandle] of `runtimeDescriptorArray` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_runtimeDescriptorArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("runtimeDescriptorArray"));

    /// Creates `VkPhysicalDeviceDescriptorIndexingFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDescriptorIndexingFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDescriptorIndexingFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDescriptorIndexingFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorIndexingFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorIndexingFeatures(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceDescriptorIndexingFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDescriptorIndexingFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDescriptorIndexingFeatures`
    public static VkPhysicalDeviceDescriptorIndexingFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorIndexingFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDescriptorIndexingFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDescriptorIndexingFeatures`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures copyFrom(VkPhysicalDeviceDescriptorIndexingFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderInputAttachmentArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderInputAttachmentArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderInputAttachmentArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderInputAttachmentArrayDynamicIndexing`}
    public int shaderInputAttachmentArrayDynamicIndexing() { return shaderInputAttachmentArrayDynamicIndexing(this.segment(), 0L); }
    /// Sets `shaderInputAttachmentArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderInputAttachmentArrayDynamicIndexing(MemorySegment segment, long index, int value) { VH_shaderInputAttachmentArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderInputAttachmentArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayDynamicIndexing(int value) { shaderInputAttachmentArrayDynamicIndexing(this.segment(), 0L, value); return this; }

    /// {@return `shaderUniformTexelBufferArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderUniformTexelBufferArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderUniformTexelBufferArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderUniformTexelBufferArrayDynamicIndexing`}
    public int shaderUniformTexelBufferArrayDynamicIndexing() { return shaderUniformTexelBufferArrayDynamicIndexing(this.segment(), 0L); }
    /// Sets `shaderUniformTexelBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderUniformTexelBufferArrayDynamicIndexing(MemorySegment segment, long index, int value) { VH_shaderUniformTexelBufferArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderUniformTexelBufferArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayDynamicIndexing(int value) { shaderUniformTexelBufferArrayDynamicIndexing(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageTexelBufferArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageTexelBufferArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageTexelBufferArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageTexelBufferArrayDynamicIndexing`}
    public int shaderStorageTexelBufferArrayDynamicIndexing() { return shaderStorageTexelBufferArrayDynamicIndexing(this.segment(), 0L); }
    /// Sets `shaderStorageTexelBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageTexelBufferArrayDynamicIndexing(MemorySegment segment, long index, int value) { VH_shaderStorageTexelBufferArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageTexelBufferArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayDynamicIndexing(int value) { shaderStorageTexelBufferArrayDynamicIndexing(this.segment(), 0L, value); return this; }

    /// {@return `shaderUniformBufferArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderUniformBufferArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderUniformBufferArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderUniformBufferArrayNonUniformIndexing`}
    public int shaderUniformBufferArrayNonUniformIndexing() { return shaderUniformBufferArrayNonUniformIndexing(this.segment(), 0L); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderUniformBufferArrayNonUniformIndexing(MemorySegment segment, long index, int value) { VH_shaderUniformBufferArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformBufferArrayNonUniformIndexing(int value) { shaderUniformBufferArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

    /// {@return `shaderSampledImageArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSampledImageArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderSampledImageArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderSampledImageArrayNonUniformIndexing`}
    public int shaderSampledImageArrayNonUniformIndexing() { return shaderSampledImageArrayNonUniformIndexing(this.segment(), 0L); }
    /// Sets `shaderSampledImageArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSampledImageArrayNonUniformIndexing(MemorySegment segment, long index, int value) { VH_shaderSampledImageArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderSampledImageArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderSampledImageArrayNonUniformIndexing(int value) { shaderSampledImageArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageBufferArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageBufferArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageBufferArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageBufferArrayNonUniformIndexing`}
    public int shaderStorageBufferArrayNonUniformIndexing() { return shaderStorageBufferArrayNonUniformIndexing(this.segment(), 0L); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageBufferArrayNonUniformIndexing(MemorySegment segment, long index, int value) { VH_shaderStorageBufferArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageBufferArrayNonUniformIndexing(int value) { shaderStorageBufferArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageImageArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageImageArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageImageArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageImageArrayNonUniformIndexing`}
    public int shaderStorageImageArrayNonUniformIndexing() { return shaderStorageImageArrayNonUniformIndexing(this.segment(), 0L); }
    /// Sets `shaderStorageImageArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageImageArrayNonUniformIndexing(MemorySegment segment, long index, int value) { VH_shaderStorageImageArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageImageArrayNonUniformIndexing(int value) { shaderStorageImageArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

    /// {@return `shaderInputAttachmentArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderInputAttachmentArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderInputAttachmentArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderInputAttachmentArrayNonUniformIndexing`}
    public int shaderInputAttachmentArrayNonUniformIndexing() { return shaderInputAttachmentArrayNonUniformIndexing(this.segment(), 0L); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderInputAttachmentArrayNonUniformIndexing(MemorySegment segment, long index, int value) { VH_shaderInputAttachmentArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayNonUniformIndexing(int value) { shaderInputAttachmentArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

    /// {@return `shaderUniformTexelBufferArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderUniformTexelBufferArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderUniformTexelBufferArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderUniformTexelBufferArrayNonUniformIndexing`}
    public int shaderUniformTexelBufferArrayNonUniformIndexing() { return shaderUniformTexelBufferArrayNonUniformIndexing(this.segment(), 0L); }
    /// Sets `shaderUniformTexelBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderUniformTexelBufferArrayNonUniformIndexing(MemorySegment segment, long index, int value) { VH_shaderUniformTexelBufferArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderUniformTexelBufferArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayNonUniformIndexing(int value) { shaderUniformTexelBufferArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageTexelBufferArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageTexelBufferArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageTexelBufferArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageTexelBufferArrayNonUniformIndexing`}
    public int shaderStorageTexelBufferArrayNonUniformIndexing() { return shaderStorageTexelBufferArrayNonUniformIndexing(this.segment(), 0L); }
    /// Sets `shaderStorageTexelBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageTexelBufferArrayNonUniformIndexing(MemorySegment segment, long index, int value) { VH_shaderStorageTexelBufferArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageTexelBufferArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayNonUniformIndexing(int value) { shaderStorageTexelBufferArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBindingUniformBufferUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBindingUniformBufferUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingUniformBufferUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingUniformBufferUpdateAfterBind`}
    public int descriptorBindingUniformBufferUpdateAfterBind() { return descriptorBindingUniformBufferUpdateAfterBind(this.segment(), 0L); }
    /// Sets `descriptorBindingUniformBufferUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBindingUniformBufferUpdateAfterBind(MemorySegment segment, long index, int value) { VH_descriptorBindingUniformBufferUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingUniformBufferUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformBufferUpdateAfterBind(int value) { descriptorBindingUniformBufferUpdateAfterBind(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBindingSampledImageUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBindingSampledImageUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingSampledImageUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingSampledImageUpdateAfterBind`}
    public int descriptorBindingSampledImageUpdateAfterBind() { return descriptorBindingSampledImageUpdateAfterBind(this.segment(), 0L); }
    /// Sets `descriptorBindingSampledImageUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBindingSampledImageUpdateAfterBind(MemorySegment segment, long index, int value) { VH_descriptorBindingSampledImageUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingSampledImageUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingSampledImageUpdateAfterBind(int value) { descriptorBindingSampledImageUpdateAfterBind(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBindingStorageImageUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBindingStorageImageUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingStorageImageUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingStorageImageUpdateAfterBind`}
    public int descriptorBindingStorageImageUpdateAfterBind() { return descriptorBindingStorageImageUpdateAfterBind(this.segment(), 0L); }
    /// Sets `descriptorBindingStorageImageUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBindingStorageImageUpdateAfterBind(MemorySegment segment, long index, int value) { VH_descriptorBindingStorageImageUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingStorageImageUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageImageUpdateAfterBind(int value) { descriptorBindingStorageImageUpdateAfterBind(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBindingStorageBufferUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBindingStorageBufferUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingStorageBufferUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingStorageBufferUpdateAfterBind`}
    public int descriptorBindingStorageBufferUpdateAfterBind() { return descriptorBindingStorageBufferUpdateAfterBind(this.segment(), 0L); }
    /// Sets `descriptorBindingStorageBufferUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBindingStorageBufferUpdateAfterBind(MemorySegment segment, long index, int value) { VH_descriptorBindingStorageBufferUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingStorageBufferUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageBufferUpdateAfterBind(int value) { descriptorBindingStorageBufferUpdateAfterBind(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBindingUniformTexelBufferUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBindingUniformTexelBufferUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingUniformTexelBufferUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingUniformTexelBufferUpdateAfterBind`}
    public int descriptorBindingUniformTexelBufferUpdateAfterBind() { return descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment(), 0L); }
    /// Sets `descriptorBindingUniformTexelBufferUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBindingUniformTexelBufferUpdateAfterBind(MemorySegment segment, long index, int value) { VH_descriptorBindingUniformTexelBufferUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingUniformTexelBufferUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformTexelBufferUpdateAfterBind(int value) { descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBindingStorageTexelBufferUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBindingStorageTexelBufferUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingStorageTexelBufferUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingStorageTexelBufferUpdateAfterBind`}
    public int descriptorBindingStorageTexelBufferUpdateAfterBind() { return descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment(), 0L); }
    /// Sets `descriptorBindingStorageTexelBufferUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBindingStorageTexelBufferUpdateAfterBind(MemorySegment segment, long index, int value) { VH_descriptorBindingStorageTexelBufferUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingStorageTexelBufferUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageTexelBufferUpdateAfterBind(int value) { descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBindingUpdateUnusedWhilePending` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBindingUpdateUnusedWhilePending(MemorySegment segment, long index) { return (int) VH_descriptorBindingUpdateUnusedWhilePending.get(segment, 0L, index); }
    /// {@return `descriptorBindingUpdateUnusedWhilePending`}
    public int descriptorBindingUpdateUnusedWhilePending() { return descriptorBindingUpdateUnusedWhilePending(this.segment(), 0L); }
    /// Sets `descriptorBindingUpdateUnusedWhilePending` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBindingUpdateUnusedWhilePending(MemorySegment segment, long index, int value) { VH_descriptorBindingUpdateUnusedWhilePending.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingUpdateUnusedWhilePending` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUpdateUnusedWhilePending(int value) { descriptorBindingUpdateUnusedWhilePending(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBindingPartiallyBound` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBindingPartiallyBound(MemorySegment segment, long index) { return (int) VH_descriptorBindingPartiallyBound.get(segment, 0L, index); }
    /// {@return `descriptorBindingPartiallyBound`}
    public int descriptorBindingPartiallyBound() { return descriptorBindingPartiallyBound(this.segment(), 0L); }
    /// Sets `descriptorBindingPartiallyBound` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBindingPartiallyBound(MemorySegment segment, long index, int value) { VH_descriptorBindingPartiallyBound.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingPartiallyBound` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingPartiallyBound(int value) { descriptorBindingPartiallyBound(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBindingVariableDescriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBindingVariableDescriptorCount(MemorySegment segment, long index) { return (int) VH_descriptorBindingVariableDescriptorCount.get(segment, 0L, index); }
    /// {@return `descriptorBindingVariableDescriptorCount`}
    public int descriptorBindingVariableDescriptorCount() { return descriptorBindingVariableDescriptorCount(this.segment(), 0L); }
    /// Sets `descriptorBindingVariableDescriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBindingVariableDescriptorCount(MemorySegment segment, long index, int value) { VH_descriptorBindingVariableDescriptorCount.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingVariableDescriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingVariableDescriptorCount(int value) { descriptorBindingVariableDescriptorCount(this.segment(), 0L, value); return this; }

    /// {@return `runtimeDescriptorArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int runtimeDescriptorArray(MemorySegment segment, long index) { return (int) VH_runtimeDescriptorArray.get(segment, 0L, index); }
    /// {@return `runtimeDescriptorArray`}
    public int runtimeDescriptorArray() { return runtimeDescriptorArray(this.segment(), 0L); }
    /// Sets `runtimeDescriptorArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void runtimeDescriptorArray(MemorySegment segment, long index, int value) { VH_runtimeDescriptorArray.set(segment, 0L, index, value); }
    /// Sets `runtimeDescriptorArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingFeatures runtimeDescriptorArray(int value) { runtimeDescriptorArray(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `shaderInputAttachmentArrayDynamicIndexing` at the given index}
        /// @param index the index of the struct buffer
        public int shaderInputAttachmentArrayDynamicIndexingAt(long index) { return shaderInputAttachmentArrayDynamicIndexing(this.segment(), index); }
        /// Sets `shaderInputAttachmentArrayDynamicIndexing` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderInputAttachmentArrayDynamicIndexingAt(long index, int value) { shaderInputAttachmentArrayDynamicIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderUniformTexelBufferArrayDynamicIndexing` at the given index}
        /// @param index the index of the struct buffer
        public int shaderUniformTexelBufferArrayDynamicIndexingAt(long index) { return shaderUniformTexelBufferArrayDynamicIndexing(this.segment(), index); }
        /// Sets `shaderUniformTexelBufferArrayDynamicIndexing` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderUniformTexelBufferArrayDynamicIndexingAt(long index, int value) { shaderUniformTexelBufferArrayDynamicIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderStorageTexelBufferArrayDynamicIndexing` at the given index}
        /// @param index the index of the struct buffer
        public int shaderStorageTexelBufferArrayDynamicIndexingAt(long index) { return shaderStorageTexelBufferArrayDynamicIndexing(this.segment(), index); }
        /// Sets `shaderStorageTexelBufferArrayDynamicIndexing` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageTexelBufferArrayDynamicIndexingAt(long index, int value) { shaderStorageTexelBufferArrayDynamicIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderUniformBufferArrayNonUniformIndexing` at the given index}
        /// @param index the index of the struct buffer
        public int shaderUniformBufferArrayNonUniformIndexingAt(long index) { return shaderUniformBufferArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderUniformBufferArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderUniformBufferArrayNonUniformIndexingAt(long index, int value) { shaderUniformBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderSampledImageArrayNonUniformIndexing` at the given index}
        /// @param index the index of the struct buffer
        public int shaderSampledImageArrayNonUniformIndexingAt(long index) { return shaderSampledImageArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderSampledImageArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderSampledImageArrayNonUniformIndexingAt(long index, int value) { shaderSampledImageArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderStorageBufferArrayNonUniformIndexing` at the given index}
        /// @param index the index of the struct buffer
        public int shaderStorageBufferArrayNonUniformIndexingAt(long index) { return shaderStorageBufferArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderStorageBufferArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageBufferArrayNonUniformIndexingAt(long index, int value) { shaderStorageBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderStorageImageArrayNonUniformIndexing` at the given index}
        /// @param index the index of the struct buffer
        public int shaderStorageImageArrayNonUniformIndexingAt(long index) { return shaderStorageImageArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderStorageImageArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageImageArrayNonUniformIndexingAt(long index, int value) { shaderStorageImageArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderInputAttachmentArrayNonUniformIndexing` at the given index}
        /// @param index the index of the struct buffer
        public int shaderInputAttachmentArrayNonUniformIndexingAt(long index) { return shaderInputAttachmentArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderInputAttachmentArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderInputAttachmentArrayNonUniformIndexingAt(long index, int value) { shaderInputAttachmentArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderUniformTexelBufferArrayNonUniformIndexing` at the given index}
        /// @param index the index of the struct buffer
        public int shaderUniformTexelBufferArrayNonUniformIndexingAt(long index) { return shaderUniformTexelBufferArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderUniformTexelBufferArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderUniformTexelBufferArrayNonUniformIndexingAt(long index, int value) { shaderUniformTexelBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderStorageTexelBufferArrayNonUniformIndexing` at the given index}
        /// @param index the index of the struct buffer
        public int shaderStorageTexelBufferArrayNonUniformIndexingAt(long index) { return shaderStorageTexelBufferArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderStorageTexelBufferArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageTexelBufferArrayNonUniformIndexingAt(long index, int value) { shaderStorageTexelBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingUniformBufferUpdateAfterBind` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBindingUniformBufferUpdateAfterBindAt(long index) { return descriptorBindingUniformBufferUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingUniformBufferUpdateAfterBind` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingUniformBufferUpdateAfterBindAt(long index, int value) { descriptorBindingUniformBufferUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingSampledImageUpdateAfterBind` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBindingSampledImageUpdateAfterBindAt(long index) { return descriptorBindingSampledImageUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingSampledImageUpdateAfterBind` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingSampledImageUpdateAfterBindAt(long index, int value) { descriptorBindingSampledImageUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingStorageImageUpdateAfterBind` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBindingStorageImageUpdateAfterBindAt(long index) { return descriptorBindingStorageImageUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingStorageImageUpdateAfterBind` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingStorageImageUpdateAfterBindAt(long index, int value) { descriptorBindingStorageImageUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingStorageBufferUpdateAfterBind` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBindingStorageBufferUpdateAfterBindAt(long index) { return descriptorBindingStorageBufferUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingStorageBufferUpdateAfterBind` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingStorageBufferUpdateAfterBindAt(long index, int value) { descriptorBindingStorageBufferUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingUniformTexelBufferUpdateAfterBind` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index) { return descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingUniformTexelBufferUpdateAfterBind` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index, int value) { descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingStorageTexelBufferUpdateAfterBind` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index) { return descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingStorageTexelBufferUpdateAfterBind` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index, int value) { descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingUpdateUnusedWhilePending` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBindingUpdateUnusedWhilePendingAt(long index) { return descriptorBindingUpdateUnusedWhilePending(this.segment(), index); }
        /// Sets `descriptorBindingUpdateUnusedWhilePending` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingUpdateUnusedWhilePendingAt(long index, int value) { descriptorBindingUpdateUnusedWhilePending(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingPartiallyBound` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBindingPartiallyBoundAt(long index) { return descriptorBindingPartiallyBound(this.segment(), index); }
        /// Sets `descriptorBindingPartiallyBound` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingPartiallyBoundAt(long index, int value) { descriptorBindingPartiallyBound(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingVariableDescriptorCount` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBindingVariableDescriptorCountAt(long index) { return descriptorBindingVariableDescriptorCount(this.segment(), index); }
        /// Sets `descriptorBindingVariableDescriptorCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingVariableDescriptorCountAt(long index, int value) { descriptorBindingVariableDescriptorCount(this.segment(), index, value); return this; }

        /// {@return `runtimeDescriptorArray` at the given index}
        /// @param index the index of the struct buffer
        public int runtimeDescriptorArrayAt(long index) { return runtimeDescriptorArray(this.segment(), index); }
        /// Sets `runtimeDescriptorArray` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer runtimeDescriptorArrayAt(long index, int value) { runtimeDescriptorArray(this.segment(), index, value); return this; }

    }
}

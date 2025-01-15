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
/// ### maxUpdateAfterBindDescriptorsInAllPools
/// [VarHandle][#VH_maxUpdateAfterBindDescriptorsInAllPools] - [Getter][#maxUpdateAfterBindDescriptorsInAllPools()] - [Setter][#maxUpdateAfterBindDescriptorsInAllPools(int)]
/// ### shaderUniformBufferArrayNonUniformIndexingNative
/// [VarHandle][#VH_shaderUniformBufferArrayNonUniformIndexingNative] - [Getter][#shaderUniformBufferArrayNonUniformIndexingNative()] - [Setter][#shaderUniformBufferArrayNonUniformIndexingNative(int)]
/// ### shaderSampledImageArrayNonUniformIndexingNative
/// [VarHandle][#VH_shaderSampledImageArrayNonUniformIndexingNative] - [Getter][#shaderSampledImageArrayNonUniformIndexingNative()] - [Setter][#shaderSampledImageArrayNonUniformIndexingNative(int)]
/// ### shaderStorageBufferArrayNonUniformIndexingNative
/// [VarHandle][#VH_shaderStorageBufferArrayNonUniformIndexingNative] - [Getter][#shaderStorageBufferArrayNonUniformIndexingNative()] - [Setter][#shaderStorageBufferArrayNonUniformIndexingNative(int)]
/// ### shaderStorageImageArrayNonUniformIndexingNative
/// [VarHandle][#VH_shaderStorageImageArrayNonUniformIndexingNative] - [Getter][#shaderStorageImageArrayNonUniformIndexingNative()] - [Setter][#shaderStorageImageArrayNonUniformIndexingNative(int)]
/// ### shaderInputAttachmentArrayNonUniformIndexingNative
/// [VarHandle][#VH_shaderInputAttachmentArrayNonUniformIndexingNative] - [Getter][#shaderInputAttachmentArrayNonUniformIndexingNative()] - [Setter][#shaderInputAttachmentArrayNonUniformIndexingNative(int)]
/// ### robustBufferAccessUpdateAfterBind
/// [VarHandle][#VH_robustBufferAccessUpdateAfterBind] - [Getter][#robustBufferAccessUpdateAfterBind()] - [Setter][#robustBufferAccessUpdateAfterBind(int)]
/// ### quadDivergentImplicitLod
/// [VarHandle][#VH_quadDivergentImplicitLod] - [Getter][#quadDivergentImplicitLod()] - [Setter][#quadDivergentImplicitLod(int)]
/// ### maxPerStageDescriptorUpdateAfterBindSamplers
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindSamplers] - [Getter][#maxPerStageDescriptorUpdateAfterBindSamplers()] - [Setter][#maxPerStageDescriptorUpdateAfterBindSamplers(int)]
/// ### maxPerStageDescriptorUpdateAfterBindUniformBuffers
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers] - [Getter][#maxPerStageDescriptorUpdateAfterBindUniformBuffers()] - [Setter][#maxPerStageDescriptorUpdateAfterBindUniformBuffers(int)]
/// ### maxPerStageDescriptorUpdateAfterBindStorageBuffers
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers] - [Getter][#maxPerStageDescriptorUpdateAfterBindStorageBuffers()] - [Setter][#maxPerStageDescriptorUpdateAfterBindStorageBuffers(int)]
/// ### maxPerStageDescriptorUpdateAfterBindSampledImages
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindSampledImages] - [Getter][#maxPerStageDescriptorUpdateAfterBindSampledImages()] - [Setter][#maxPerStageDescriptorUpdateAfterBindSampledImages(int)]
/// ### maxPerStageDescriptorUpdateAfterBindStorageImages
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindStorageImages] - [Getter][#maxPerStageDescriptorUpdateAfterBindStorageImages()] - [Setter][#maxPerStageDescriptorUpdateAfterBindStorageImages(int)]
/// ### maxPerStageDescriptorUpdateAfterBindInputAttachments
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindInputAttachments] - [Getter][#maxPerStageDescriptorUpdateAfterBindInputAttachments()] - [Setter][#maxPerStageDescriptorUpdateAfterBindInputAttachments(int)]
/// ### maxPerStageUpdateAfterBindResources
/// [VarHandle][#VH_maxPerStageUpdateAfterBindResources] - [Getter][#maxPerStageUpdateAfterBindResources()] - [Setter][#maxPerStageUpdateAfterBindResources(int)]
/// ### maxDescriptorSetUpdateAfterBindSamplers
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindSamplers] - [Getter][#maxDescriptorSetUpdateAfterBindSamplers()] - [Setter][#maxDescriptorSetUpdateAfterBindSamplers(int)]
/// ### maxDescriptorSetUpdateAfterBindUniformBuffers
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindUniformBuffers] - [Getter][#maxDescriptorSetUpdateAfterBindUniformBuffers()] - [Setter][#maxDescriptorSetUpdateAfterBindUniformBuffers(int)]
/// ### maxDescriptorSetUpdateAfterBindUniformBuffersDynamic
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic] - [Getter][#maxDescriptorSetUpdateAfterBindUniformBuffersDynamic()] - [Setter][#maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(int)]
/// ### maxDescriptorSetUpdateAfterBindStorageBuffers
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindStorageBuffers] - [Getter][#maxDescriptorSetUpdateAfterBindStorageBuffers()] - [Setter][#maxDescriptorSetUpdateAfterBindStorageBuffers(int)]
/// ### maxDescriptorSetUpdateAfterBindStorageBuffersDynamic
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic] - [Getter][#maxDescriptorSetUpdateAfterBindStorageBuffersDynamic()] - [Setter][#maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(int)]
/// ### maxDescriptorSetUpdateAfterBindSampledImages
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindSampledImages] - [Getter][#maxDescriptorSetUpdateAfterBindSampledImages()] - [Setter][#maxDescriptorSetUpdateAfterBindSampledImages(int)]
/// ### maxDescriptorSetUpdateAfterBindStorageImages
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindStorageImages] - [Getter][#maxDescriptorSetUpdateAfterBindStorageImages()] - [Setter][#maxDescriptorSetUpdateAfterBindStorageImages(int)]
/// ### maxDescriptorSetUpdateAfterBindInputAttachments
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindInputAttachments] - [Getter][#maxDescriptorSetUpdateAfterBindInputAttachments()] - [Setter][#maxDescriptorSetUpdateAfterBindInputAttachments(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDescriptorIndexingProperties {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxUpdateAfterBindDescriptorsInAllPools;
///     VkBool32 shaderUniformBufferArrayNonUniformIndexingNative;
///     VkBool32 shaderSampledImageArrayNonUniformIndexingNative;
///     VkBool32 shaderStorageBufferArrayNonUniformIndexingNative;
///     VkBool32 shaderStorageImageArrayNonUniformIndexingNative;
///     VkBool32 shaderInputAttachmentArrayNonUniformIndexingNative;
///     VkBool32 robustBufferAccessUpdateAfterBind;
///     VkBool32 quadDivergentImplicitLod;
///     uint32_t maxPerStageDescriptorUpdateAfterBindSamplers;
///     uint32_t maxPerStageDescriptorUpdateAfterBindUniformBuffers;
///     uint32_t maxPerStageDescriptorUpdateAfterBindStorageBuffers;
///     uint32_t maxPerStageDescriptorUpdateAfterBindSampledImages;
///     uint32_t maxPerStageDescriptorUpdateAfterBindStorageImages;
///     uint32_t maxPerStageDescriptorUpdateAfterBindInputAttachments;
///     uint32_t maxPerStageUpdateAfterBindResources;
///     uint32_t maxDescriptorSetUpdateAfterBindSamplers;
///     uint32_t maxDescriptorSetUpdateAfterBindUniformBuffers;
///     uint32_t maxDescriptorSetUpdateAfterBindUniformBuffersDynamic;
///     uint32_t maxDescriptorSetUpdateAfterBindStorageBuffers;
///     uint32_t maxDescriptorSetUpdateAfterBindStorageBuffersDynamic;
///     uint32_t maxDescriptorSetUpdateAfterBindSampledImages;
///     uint32_t maxDescriptorSetUpdateAfterBindStorageImages;
///     uint32_t maxDescriptorSetUpdateAfterBindInputAttachments;
/// } VkPhysicalDeviceDescriptorIndexingProperties;
/// ```
public sealed class VkPhysicalDeviceDescriptorIndexingProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceDescriptorIndexingProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxUpdateAfterBindDescriptorsInAllPools"),
        ValueLayout.JAVA_INT.withName("shaderUniformBufferArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("shaderSampledImageArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("shaderStorageBufferArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("shaderStorageImageArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("shaderInputAttachmentArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("robustBufferAccessUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("quadDivergentImplicitLod"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindSamplers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindUniformBuffers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindStorageBuffers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindSampledImages"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindStorageImages"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindInputAttachments"),
        ValueLayout.JAVA_INT.withName("maxPerStageUpdateAfterBindResources"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindSamplers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindUniformBuffers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageBuffers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindSampledImages"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageImages"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindInputAttachments")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxUpdateAfterBindDescriptorsInAllPools` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    /// The [VarHandle] of `shaderUniformBufferArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderSampledImageArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderStorageBufferArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderStorageImageArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderInputAttachmentArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `robustBufferAccessUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_robustBufferAccessUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
    /// The [VarHandle] of `quadDivergentImplicitLod` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_quadDivergentImplicitLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quadDivergentImplicitLod"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindSamplers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindSampledImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindStorageImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindInputAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
    /// The [VarHandle] of `maxPerStageUpdateAfterBindResources` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageUpdateAfterBindResources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindSamplers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindSampledImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindStorageImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindInputAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));

    /// Creates `VkPhysicalDeviceDescriptorIndexingProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDescriptorIndexingProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDescriptorIndexingProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorIndexingProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorIndexingProperties(segment); }

    /// Creates `VkPhysicalDeviceDescriptorIndexingProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDescriptorIndexingProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorIndexingProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorIndexingProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDescriptorIndexingProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDescriptorIndexingProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDescriptorIndexingProperties`
    public static VkPhysicalDeviceDescriptorIndexingProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorIndexingProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDescriptorIndexingProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDescriptorIndexingProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceDescriptorIndexingProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDescriptorIndexingProperties`
    public static VkPhysicalDeviceDescriptorIndexingProperties allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int maxUpdateAfterBindDescriptorsInAllPools, @CType("VkBool32") int shaderUniformBufferArrayNonUniformIndexingNative, @CType("VkBool32") int shaderSampledImageArrayNonUniformIndexingNative, @CType("VkBool32") int shaderStorageBufferArrayNonUniformIndexingNative, @CType("VkBool32") int shaderStorageImageArrayNonUniformIndexingNative, @CType("VkBool32") int shaderInputAttachmentArrayNonUniformIndexingNative, @CType("VkBool32") int robustBufferAccessUpdateAfterBind, @CType("VkBool32") int quadDivergentImplicitLod, @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindSamplers, @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindUniformBuffers, @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindStorageBuffers, @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindSampledImages, @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindStorageImages, @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindInputAttachments, @CType("uint32_t") int maxPerStageUpdateAfterBindResources, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindSamplers, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindUniformBuffers, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageBuffers, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindSampledImages, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageImages, @CType("uint32_t") int maxDescriptorSetUpdateAfterBindInputAttachments) { return alloc(allocator).sType(sType).pNext(pNext).maxUpdateAfterBindDescriptorsInAllPools(maxUpdateAfterBindDescriptorsInAllPools).shaderUniformBufferArrayNonUniformIndexingNative(shaderUniformBufferArrayNonUniformIndexingNative).shaderSampledImageArrayNonUniformIndexingNative(shaderSampledImageArrayNonUniformIndexingNative).shaderStorageBufferArrayNonUniformIndexingNative(shaderStorageBufferArrayNonUniformIndexingNative).shaderStorageImageArrayNonUniformIndexingNative(shaderStorageImageArrayNonUniformIndexingNative).shaderInputAttachmentArrayNonUniformIndexingNative(shaderInputAttachmentArrayNonUniformIndexingNative).robustBufferAccessUpdateAfterBind(robustBufferAccessUpdateAfterBind).quadDivergentImplicitLod(quadDivergentImplicitLod).maxPerStageDescriptorUpdateAfterBindSamplers(maxPerStageDescriptorUpdateAfterBindSamplers).maxPerStageDescriptorUpdateAfterBindUniformBuffers(maxPerStageDescriptorUpdateAfterBindUniformBuffers).maxPerStageDescriptorUpdateAfterBindStorageBuffers(maxPerStageDescriptorUpdateAfterBindStorageBuffers).maxPerStageDescriptorUpdateAfterBindSampledImages(maxPerStageDescriptorUpdateAfterBindSampledImages).maxPerStageDescriptorUpdateAfterBindStorageImages(maxPerStageDescriptorUpdateAfterBindStorageImages).maxPerStageDescriptorUpdateAfterBindInputAttachments(maxPerStageDescriptorUpdateAfterBindInputAttachments).maxPerStageUpdateAfterBindResources(maxPerStageUpdateAfterBindResources).maxDescriptorSetUpdateAfterBindSamplers(maxDescriptorSetUpdateAfterBindSamplers).maxDescriptorSetUpdateAfterBindUniformBuffers(maxDescriptorSetUpdateAfterBindUniformBuffers).maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(maxDescriptorSetUpdateAfterBindUniformBuffersDynamic).maxDescriptorSetUpdateAfterBindStorageBuffers(maxDescriptorSetUpdateAfterBindStorageBuffers).maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(maxDescriptorSetUpdateAfterBindStorageBuffersDynamic).maxDescriptorSetUpdateAfterBindSampledImages(maxDescriptorSetUpdateAfterBindSampledImages).maxDescriptorSetUpdateAfterBindStorageImages(maxDescriptorSetUpdateAfterBindStorageImages).maxDescriptorSetUpdateAfterBindInputAttachments(maxDescriptorSetUpdateAfterBindInputAttachments); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties copyFrom(VkPhysicalDeviceDescriptorIndexingProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDescriptorIndexingProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceDescriptorIndexingProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDescriptorIndexingProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDescriptorIndexingProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `maxUpdateAfterBindDescriptorsInAllPools` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxUpdateAfterBindDescriptorsInAllPools(MemorySegment segment, long index) { return (int) VH_maxUpdateAfterBindDescriptorsInAllPools.get(segment, 0L, index); }
    /// {@return `maxUpdateAfterBindDescriptorsInAllPools`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxUpdateAfterBindDescriptorsInAllPools(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxUpdateAfterBindDescriptorsInAllPools(segment, 0L); }
    /// {@return `maxUpdateAfterBindDescriptorsInAllPools`}
    public @CType("uint32_t") int maxUpdateAfterBindDescriptorsInAllPools() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxUpdateAfterBindDescriptorsInAllPools(this.segment()); }
    /// Sets `maxUpdateAfterBindDescriptorsInAllPools` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxUpdateAfterBindDescriptorsInAllPools(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxUpdateAfterBindDescriptorsInAllPools.set(segment, 0L, index, value); }
    /// Sets `maxUpdateAfterBindDescriptorsInAllPools` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxUpdateAfterBindDescriptorsInAllPools(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxUpdateAfterBindDescriptorsInAllPools(segment, 0L, value); }
    /// Sets `maxUpdateAfterBindDescriptorsInAllPools` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxUpdateAfterBindDescriptorsInAllPools(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxUpdateAfterBindDescriptorsInAllPools(this.segment(), value); return this; }

    /// {@return `shaderUniformBufferArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderUniformBufferArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderUniformBufferArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderUniformBufferArrayNonUniformIndexingNative`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderUniformBufferArrayNonUniformIndexingNative(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderUniformBufferArrayNonUniformIndexingNative(segment, 0L); }
    /// {@return `shaderUniformBufferArrayNonUniformIndexingNative`}
    public @CType("VkBool32") int shaderUniformBufferArrayNonUniformIndexingNative() { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderUniformBufferArrayNonUniformIndexingNative(this.segment()); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderUniformBufferArrayNonUniformIndexingNative(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderUniformBufferArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexingNative` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderUniformBufferArrayNonUniformIndexingNative(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderUniformBufferArrayNonUniformIndexingNative(segment, 0L, value); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties shaderUniformBufferArrayNonUniformIndexingNative(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderUniformBufferArrayNonUniformIndexingNative(this.segment(), value); return this; }

    /// {@return `shaderSampledImageArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSampledImageArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderSampledImageArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderSampledImageArrayNonUniformIndexingNative`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSampledImageArrayNonUniformIndexingNative(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderSampledImageArrayNonUniformIndexingNative(segment, 0L); }
    /// {@return `shaderSampledImageArrayNonUniformIndexingNative`}
    public @CType("VkBool32") int shaderSampledImageArrayNonUniformIndexingNative() { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderSampledImageArrayNonUniformIndexingNative(this.segment()); }
    /// Sets `shaderSampledImageArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSampledImageArrayNonUniformIndexingNative(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSampledImageArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderSampledImageArrayNonUniformIndexingNative` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSampledImageArrayNonUniformIndexingNative(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderSampledImageArrayNonUniformIndexingNative(segment, 0L, value); }
    /// Sets `shaderSampledImageArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties shaderSampledImageArrayNonUniformIndexingNative(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderSampledImageArrayNonUniformIndexingNative(this.segment(), value); return this; }

    /// {@return `shaderStorageBufferArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageBufferArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderStorageBufferArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderStorageBufferArrayNonUniformIndexingNative`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageBufferArrayNonUniformIndexingNative(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderStorageBufferArrayNonUniformIndexingNative(segment, 0L); }
    /// {@return `shaderStorageBufferArrayNonUniformIndexingNative`}
    public @CType("VkBool32") int shaderStorageBufferArrayNonUniformIndexingNative() { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderStorageBufferArrayNonUniformIndexingNative(this.segment()); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageBufferArrayNonUniformIndexingNative(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageBufferArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexingNative` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageBufferArrayNonUniformIndexingNative(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderStorageBufferArrayNonUniformIndexingNative(segment, 0L, value); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties shaderStorageBufferArrayNonUniformIndexingNative(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderStorageBufferArrayNonUniformIndexingNative(this.segment(), value); return this; }

    /// {@return `shaderStorageImageArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageImageArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderStorageImageArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderStorageImageArrayNonUniformIndexingNative`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageImageArrayNonUniformIndexingNative(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderStorageImageArrayNonUniformIndexingNative(segment, 0L); }
    /// {@return `shaderStorageImageArrayNonUniformIndexingNative`}
    public @CType("VkBool32") int shaderStorageImageArrayNonUniformIndexingNative() { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderStorageImageArrayNonUniformIndexingNative(this.segment()); }
    /// Sets `shaderStorageImageArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageImageArrayNonUniformIndexingNative(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageImageArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageArrayNonUniformIndexingNative` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageImageArrayNonUniformIndexingNative(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderStorageImageArrayNonUniformIndexingNative(segment, 0L, value); }
    /// Sets `shaderStorageImageArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties shaderStorageImageArrayNonUniformIndexingNative(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderStorageImageArrayNonUniformIndexingNative(this.segment(), value); return this; }

    /// {@return `shaderInputAttachmentArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderInputAttachmentArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderInputAttachmentArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderInputAttachmentArrayNonUniformIndexingNative`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderInputAttachmentArrayNonUniformIndexingNative(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderInputAttachmentArrayNonUniformIndexingNative(segment, 0L); }
    /// {@return `shaderInputAttachmentArrayNonUniformIndexingNative`}
    public @CType("VkBool32") int shaderInputAttachmentArrayNonUniformIndexingNative() { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderInputAttachmentArrayNonUniformIndexingNative(this.segment()); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderInputAttachmentArrayNonUniformIndexingNative(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderInputAttachmentArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexingNative` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderInputAttachmentArrayNonUniformIndexingNative(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderInputAttachmentArrayNonUniformIndexingNative(segment, 0L, value); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties shaderInputAttachmentArrayNonUniformIndexingNative(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderInputAttachmentArrayNonUniformIndexingNative(this.segment(), value); return this; }

    /// {@return `robustBufferAccessUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_robustBufferAccessUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_robustBufferAccessUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `robustBufferAccessUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_robustBufferAccessUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_robustBufferAccessUpdateAfterBind(segment, 0L); }
    /// {@return `robustBufferAccessUpdateAfterBind`}
    public @CType("VkBool32") int robustBufferAccessUpdateAfterBind() { return VkPhysicalDeviceDescriptorIndexingProperties.get_robustBufferAccessUpdateAfterBind(this.segment()); }
    /// Sets `robustBufferAccessUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_robustBufferAccessUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_robustBufferAccessUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `robustBufferAccessUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_robustBufferAccessUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_robustBufferAccessUpdateAfterBind(segment, 0L, value); }
    /// Sets `robustBufferAccessUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties robustBufferAccessUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_robustBufferAccessUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `quadDivergentImplicitLod` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_quadDivergentImplicitLod(MemorySegment segment, long index) { return (int) VH_quadDivergentImplicitLod.get(segment, 0L, index); }
    /// {@return `quadDivergentImplicitLod`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_quadDivergentImplicitLod(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_quadDivergentImplicitLod(segment, 0L); }
    /// {@return `quadDivergentImplicitLod`}
    public @CType("VkBool32") int quadDivergentImplicitLod() { return VkPhysicalDeviceDescriptorIndexingProperties.get_quadDivergentImplicitLod(this.segment()); }
    /// Sets `quadDivergentImplicitLod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_quadDivergentImplicitLod(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_quadDivergentImplicitLod.set(segment, 0L, index, value); }
    /// Sets `quadDivergentImplicitLod` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_quadDivergentImplicitLod(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_quadDivergentImplicitLod(segment, 0L, value); }
    /// Sets `quadDivergentImplicitLod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties quadDivergentImplicitLod(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_quadDivergentImplicitLod(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindSamplers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindSamplers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindSamplers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindSamplers(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindSamplers(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindSamplers`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindSamplers() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindSamplers(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindSamplers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindSamplers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSamplers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindSamplers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindSamplers(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindSamplers(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindSamplers(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindUniformBuffers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindUniformBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindUniformBuffers(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindUniformBuffers(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindUniformBuffers`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindUniformBuffers() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindUniformBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindUniformBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindUniformBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindUniformBuffers(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindUniformBuffers(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindStorageBuffers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindStorageBuffers(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindStorageBuffers(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageBuffers`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindStorageBuffers() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindStorageBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindStorageBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindStorageBuffers(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindStorageBuffers(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindSampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindSampledImages(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindSampledImages.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindSampledImages`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindSampledImages(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindSampledImages(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindSampledImages`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindSampledImages() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindSampledImages(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindSampledImages.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSampledImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindSampledImages(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindSampledImages(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindSampledImages(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindStorageImages(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageImages.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageImages`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindStorageImages(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindStorageImages(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageImages`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindStorageImages() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindStorageImages(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageImages.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindStorageImages(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindStorageImages(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindStorageImages(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindInputAttachments(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindInputAttachments`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindInputAttachments(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindInputAttachments(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindInputAttachments`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindInputAttachments() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindInputAttachments(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInputAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindInputAttachments(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindInputAttachments(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindInputAttachments(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment(), value); return this; }

    /// {@return `maxPerStageUpdateAfterBindResources` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageUpdateAfterBindResources(MemorySegment segment, long index) { return (int) VH_maxPerStageUpdateAfterBindResources.get(segment, 0L, index); }
    /// {@return `maxPerStageUpdateAfterBindResources`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageUpdateAfterBindResources(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageUpdateAfterBindResources(segment, 0L); }
    /// {@return `maxPerStageUpdateAfterBindResources`}
    public @CType("uint32_t") int maxPerStageUpdateAfterBindResources() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageUpdateAfterBindResources(this.segment()); }
    /// Sets `maxPerStageUpdateAfterBindResources` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageUpdateAfterBindResources(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageUpdateAfterBindResources.set(segment, 0L, index, value); }
    /// Sets `maxPerStageUpdateAfterBindResources` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageUpdateAfterBindResources(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageUpdateAfterBindResources(segment, 0L, value); }
    /// Sets `maxPerStageUpdateAfterBindResources` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageUpdateAfterBindResources(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageUpdateAfterBindResources(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindSamplers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindSamplers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindSamplers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindSamplers(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindSamplers(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindSamplers`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindSamplers() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindSamplers(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindSamplers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindSamplers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindSamplers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindSamplers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindSamplers(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindSamplers(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindSamplers(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindUniformBuffers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindUniformBuffers(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindUniformBuffers(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffers`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindUniformBuffers() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindUniformBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindUniformBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindUniformBuffers(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindUniformBuffers(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindStorageBuffers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindStorageBuffers(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindStorageBuffers(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffers`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageBuffers() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindStorageBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindStorageBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindStorageBuffers(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindStorageBuffers(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindSampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindSampledImages(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindSampledImages.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindSampledImages`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindSampledImages(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindSampledImages(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindSampledImages`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindSampledImages() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindSampledImages(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindSampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindSampledImages(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindSampledImages.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindSampledImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindSampledImages(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindSampledImages(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindSampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindSampledImages(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindSampledImages(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindStorageImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindStorageImages(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageImages.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageImages`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindStorageImages(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindStorageImages(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageImages`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageImages() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindStorageImages(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindStorageImages(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindStorageImages.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindStorageImages(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindStorageImages(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindStorageImages(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindStorageImages(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindInputAttachments(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindInputAttachments.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindInputAttachments`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindInputAttachments(MemorySegment segment) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindInputAttachments(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindInputAttachments`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindInputAttachments() { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindInputAttachments(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindInputAttachments(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindInputAttachments.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindInputAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindInputAttachments(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindInputAttachments(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindInputAttachments(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindInputAttachments(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceDescriptorIndexingProperties].
    public static final class Buffer extends VkPhysicalDeviceDescriptorIndexingProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDescriptorIndexingProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDescriptorIndexingProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDescriptorIndexingProperties`
        public VkPhysicalDeviceDescriptorIndexingProperties asSlice(long index) { return new VkPhysicalDeviceDescriptorIndexingProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDescriptorIndexingProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDescriptorIndexingProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDescriptorIndexingProperties.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxUpdateAfterBindDescriptorsInAllPools` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxUpdateAfterBindDescriptorsInAllPoolsAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxUpdateAfterBindDescriptorsInAllPools(this.segment(), index); }
        /// Sets `maxUpdateAfterBindDescriptorsInAllPools` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxUpdateAfterBindDescriptorsInAllPoolsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxUpdateAfterBindDescriptorsInAllPools(this.segment(), index, value); return this; }

        /// {@return `shaderUniformBufferArrayNonUniformIndexingNative` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderUniformBufferArrayNonUniformIndexingNativeAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderUniformBufferArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderUniformBufferArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderUniformBufferArrayNonUniformIndexingNativeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderUniformBufferArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderSampledImageArrayNonUniformIndexingNative` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSampledImageArrayNonUniformIndexingNativeAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderSampledImageArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderSampledImageArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSampledImageArrayNonUniformIndexingNativeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderSampledImageArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderStorageBufferArrayNonUniformIndexingNative` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderStorageBufferArrayNonUniformIndexingNativeAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderStorageBufferArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderStorageBufferArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageBufferArrayNonUniformIndexingNativeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderStorageBufferArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderStorageImageArrayNonUniformIndexingNative` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderStorageImageArrayNonUniformIndexingNativeAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderStorageImageArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderStorageImageArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageImageArrayNonUniformIndexingNativeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderStorageImageArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderInputAttachmentArrayNonUniformIndexingNative` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_shaderInputAttachmentArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderInputAttachmentArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_shaderInputAttachmentArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `robustBufferAccessUpdateAfterBind` at the given index}
        /// @param index the index
        public @CType("VkBool32") int robustBufferAccessUpdateAfterBindAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_robustBufferAccessUpdateAfterBind(this.segment(), index); }
        /// Sets `robustBufferAccessUpdateAfterBind` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer robustBufferAccessUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_robustBufferAccessUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `quadDivergentImplicitLod` at the given index}
        /// @param index the index
        public @CType("VkBool32") int quadDivergentImplicitLodAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_quadDivergentImplicitLod(this.segment(), index); }
        /// Sets `quadDivergentImplicitLod` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer quadDivergentImplicitLodAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_quadDivergentImplicitLod(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindSamplers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindSamplersAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindSamplers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindSamplers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindSamplersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindSamplers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindUniformBuffers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindUniformBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindStorageBuffers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindStorageBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindSampledImages` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindSampledImages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindStorageImages` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindStorageImages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindInputAttachments` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindInputAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment(), index, value); return this; }

        /// {@return `maxPerStageUpdateAfterBindResources` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageUpdateAfterBindResourcesAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxPerStageUpdateAfterBindResources(this.segment(), index); }
        /// Sets `maxPerStageUpdateAfterBindResources` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageUpdateAfterBindResourcesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxPerStageUpdateAfterBindResources(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindSamplers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindSamplersAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindSamplers(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindSamplers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindSamplersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindSamplers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindSampledImages` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindSampledImagesAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindSampledImages(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindSampledImages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindSampledImagesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindSampledImages(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindStorageImages` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindStorageImagesAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindStorageImages(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindStorageImages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindStorageImagesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindStorageImages(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindInputAttachments` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index) { return VkPhysicalDeviceDescriptorIndexingProperties.get_maxDescriptorSetUpdateAfterBindInputAttachments(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindInputAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorIndexingProperties.set_maxDescriptorSetUpdateAfterBindInputAttachments(this.segment(), index, value); return this; }

    }
}

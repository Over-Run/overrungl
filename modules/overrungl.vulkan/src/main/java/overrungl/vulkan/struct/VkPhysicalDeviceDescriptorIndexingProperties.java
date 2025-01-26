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
/// struct VkPhysicalDeviceDescriptorIndexingProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxUpdateAfterBindDescriptorsInAllPools;
///     (uint32_t) VkBool32 shaderUniformBufferArrayNonUniformIndexingNative;
///     (uint32_t) VkBool32 shaderSampledImageArrayNonUniformIndexingNative;
///     (uint32_t) VkBool32 shaderStorageBufferArrayNonUniformIndexingNative;
///     (uint32_t) VkBool32 shaderStorageImageArrayNonUniformIndexingNative;
///     (uint32_t) VkBool32 shaderInputAttachmentArrayNonUniformIndexingNative;
///     (uint32_t) VkBool32 robustBufferAccessUpdateAfterBind;
///     (uint32_t) VkBool32 quadDivergentImplicitLod;
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
/// };
/// ```
public sealed class VkPhysicalDeviceDescriptorIndexingProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDescriptorIndexingProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `maxUpdateAfterBindDescriptorsInAllPools`.
    public static final long OFFSET_maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.byteOffset(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    /// The memory layout of `maxUpdateAfterBindDescriptorsInAllPools`.
    public static final MemoryLayout LAYOUT_maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.select(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    /// The [VarHandle] of `maxUpdateAfterBindDescriptorsInAllPools` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    /// The byte offset of `shaderUniformBufferArrayNonUniformIndexingNative`.
    public static final long OFFSET_shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    /// The memory layout of `shaderUniformBufferArrayNonUniformIndexingNative`.
    public static final MemoryLayout LAYOUT_shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderUniformBufferArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    /// The byte offset of `shaderSampledImageArrayNonUniformIndexingNative`.
    public static final long OFFSET_shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
    /// The memory layout of `shaderSampledImageArrayNonUniformIndexingNative`.
    public static final MemoryLayout LAYOUT_shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderSampledImageArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
    /// The byte offset of `shaderStorageBufferArrayNonUniformIndexingNative`.
    public static final long OFFSET_shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
    /// The memory layout of `shaderStorageBufferArrayNonUniformIndexingNative`.
    public static final MemoryLayout LAYOUT_shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderStorageBufferArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
    /// The byte offset of `shaderStorageImageArrayNonUniformIndexingNative`.
    public static final long OFFSET_shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
    /// The memory layout of `shaderStorageImageArrayNonUniformIndexingNative`.
    public static final MemoryLayout LAYOUT_shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderStorageImageArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
    /// The byte offset of `shaderInputAttachmentArrayNonUniformIndexingNative`.
    public static final long OFFSET_shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
    /// The memory layout of `shaderInputAttachmentArrayNonUniformIndexingNative`.
    public static final MemoryLayout LAYOUT_shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderInputAttachmentArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
    /// The byte offset of `robustBufferAccessUpdateAfterBind`.
    public static final long OFFSET_robustBufferAccessUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
    /// The memory layout of `robustBufferAccessUpdateAfterBind`.
    public static final MemoryLayout LAYOUT_robustBufferAccessUpdateAfterBind = LAYOUT.select(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
    /// The [VarHandle] of `robustBufferAccessUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_robustBufferAccessUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
    /// The byte offset of `quadDivergentImplicitLod`.
    public static final long OFFSET_quadDivergentImplicitLod = LAYOUT.byteOffset(PathElement.groupElement("quadDivergentImplicitLod"));
    /// The memory layout of `quadDivergentImplicitLod`.
    public static final MemoryLayout LAYOUT_quadDivergentImplicitLod = LAYOUT.select(PathElement.groupElement("quadDivergentImplicitLod"));
    /// The [VarHandle] of `quadDivergentImplicitLod` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_quadDivergentImplicitLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quadDivergentImplicitLod"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindSamplers`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindSamplers`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindSamplers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindUniformBuffers`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindUniformBuffers`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindStorageBuffers`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindStorageBuffers`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindSampledImages`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindSampledImages`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindSampledImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindStorageImages`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindStorageImages`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindStorageImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindInputAttachments`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindInputAttachments`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindInputAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
    /// The byte offset of `maxPerStageUpdateAfterBindResources`.
    public static final long OFFSET_maxPerStageUpdateAfterBindResources = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
    /// The memory layout of `maxPerStageUpdateAfterBindResources`.
    public static final MemoryLayout LAYOUT_maxPerStageUpdateAfterBindResources = LAYOUT.select(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
    /// The [VarHandle] of `maxPerStageUpdateAfterBindResources` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageUpdateAfterBindResources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindSamplers`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindSamplers`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindSamplers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindUniformBuffers`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindUniformBuffers`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindStorageBuffers`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindStorageBuffers`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindSampledImages`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindSampledImages`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindSampledImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindStorageImages`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindStorageImages`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindStorageImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindInputAttachments`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindInputAttachments`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindInputAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));

    /// Creates `VkPhysicalDeviceDescriptorIndexingProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDescriptorIndexingProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDescriptorIndexingProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDescriptorIndexingProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorIndexingProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorIndexingProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDescriptorIndexingProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDescriptorIndexingProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDescriptorIndexingProperties`
    public static VkPhysicalDeviceDescriptorIndexingProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorIndexingProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDescriptorIndexingProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDescriptorIndexingProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties copyFrom(VkPhysicalDeviceDescriptorIndexingProperties src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceDescriptorIndexingProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDescriptorIndexingProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxUpdateAfterBindDescriptorsInAllPools` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxUpdateAfterBindDescriptorsInAllPools(MemorySegment segment, long index) { return (int) VH_maxUpdateAfterBindDescriptorsInAllPools.get(segment, 0L, index); }
    /// {@return `maxUpdateAfterBindDescriptorsInAllPools`}
    public int maxUpdateAfterBindDescriptorsInAllPools() { return maxUpdateAfterBindDescriptorsInAllPools(this.segment(), 0L); }
    /// Sets `maxUpdateAfterBindDescriptorsInAllPools` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxUpdateAfterBindDescriptorsInAllPools(MemorySegment segment, long index, int value) { VH_maxUpdateAfterBindDescriptorsInAllPools.set(segment, 0L, index, value); }
    /// Sets `maxUpdateAfterBindDescriptorsInAllPools` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxUpdateAfterBindDescriptorsInAllPools(int value) { maxUpdateAfterBindDescriptorsInAllPools(this.segment(), 0L, value); return this; }

    /// {@return `shaderUniformBufferArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderUniformBufferArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderUniformBufferArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderUniformBufferArrayNonUniformIndexingNative`}
    public int shaderUniformBufferArrayNonUniformIndexingNative() { return shaderUniformBufferArrayNonUniformIndexingNative(this.segment(), 0L); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderUniformBufferArrayNonUniformIndexingNative(MemorySegment segment, long index, int value) { VH_shaderUniformBufferArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties shaderUniformBufferArrayNonUniformIndexingNative(int value) { shaderUniformBufferArrayNonUniformIndexingNative(this.segment(), 0L, value); return this; }

    /// {@return `shaderSampledImageArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSampledImageArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderSampledImageArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderSampledImageArrayNonUniformIndexingNative`}
    public int shaderSampledImageArrayNonUniformIndexingNative() { return shaderSampledImageArrayNonUniformIndexingNative(this.segment(), 0L); }
    /// Sets `shaderSampledImageArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSampledImageArrayNonUniformIndexingNative(MemorySegment segment, long index, int value) { VH_shaderSampledImageArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderSampledImageArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties shaderSampledImageArrayNonUniformIndexingNative(int value) { shaderSampledImageArrayNonUniformIndexingNative(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageBufferArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageBufferArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderStorageBufferArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderStorageBufferArrayNonUniformIndexingNative`}
    public int shaderStorageBufferArrayNonUniformIndexingNative() { return shaderStorageBufferArrayNonUniformIndexingNative(this.segment(), 0L); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageBufferArrayNonUniformIndexingNative(MemorySegment segment, long index, int value) { VH_shaderStorageBufferArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties shaderStorageBufferArrayNonUniformIndexingNative(int value) { shaderStorageBufferArrayNonUniformIndexingNative(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageImageArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageImageArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderStorageImageArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderStorageImageArrayNonUniformIndexingNative`}
    public int shaderStorageImageArrayNonUniformIndexingNative() { return shaderStorageImageArrayNonUniformIndexingNative(this.segment(), 0L); }
    /// Sets `shaderStorageImageArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageImageArrayNonUniformIndexingNative(MemorySegment segment, long index, int value) { VH_shaderStorageImageArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties shaderStorageImageArrayNonUniformIndexingNative(int value) { shaderStorageImageArrayNonUniformIndexingNative(this.segment(), 0L, value); return this; }

    /// {@return `shaderInputAttachmentArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderInputAttachmentArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderInputAttachmentArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderInputAttachmentArrayNonUniformIndexingNative`}
    public int shaderInputAttachmentArrayNonUniformIndexingNative() { return shaderInputAttachmentArrayNonUniformIndexingNative(this.segment(), 0L); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderInputAttachmentArrayNonUniformIndexingNative(MemorySegment segment, long index, int value) { VH_shaderInputAttachmentArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties shaderInputAttachmentArrayNonUniformIndexingNative(int value) { shaderInputAttachmentArrayNonUniformIndexingNative(this.segment(), 0L, value); return this; }

    /// {@return `robustBufferAccessUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int robustBufferAccessUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_robustBufferAccessUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `robustBufferAccessUpdateAfterBind`}
    public int robustBufferAccessUpdateAfterBind() { return robustBufferAccessUpdateAfterBind(this.segment(), 0L); }
    /// Sets `robustBufferAccessUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void robustBufferAccessUpdateAfterBind(MemorySegment segment, long index, int value) { VH_robustBufferAccessUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `robustBufferAccessUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties robustBufferAccessUpdateAfterBind(int value) { robustBufferAccessUpdateAfterBind(this.segment(), 0L, value); return this; }

    /// {@return `quadDivergentImplicitLod` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int quadDivergentImplicitLod(MemorySegment segment, long index) { return (int) VH_quadDivergentImplicitLod.get(segment, 0L, index); }
    /// {@return `quadDivergentImplicitLod`}
    public int quadDivergentImplicitLod() { return quadDivergentImplicitLod(this.segment(), 0L); }
    /// Sets `quadDivergentImplicitLod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void quadDivergentImplicitLod(MemorySegment segment, long index, int value) { VH_quadDivergentImplicitLod.set(segment, 0L, index, value); }
    /// Sets `quadDivergentImplicitLod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties quadDivergentImplicitLod(int value) { quadDivergentImplicitLod(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindSamplers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindSamplers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindSamplers`}
    public int maxPerStageDescriptorUpdateAfterBindSamplers() { return maxPerStageDescriptorUpdateAfterBindSamplers(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindSamplers(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindSamplers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindSamplers(int value) { maxPerStageDescriptorUpdateAfterBindSamplers(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindUniformBuffers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindUniformBuffers`}
    public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() { return maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindUniformBuffers(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindUniformBuffers(int value) { maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindStorageBuffers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageBuffers`}
    public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() { return maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindStorageBuffers(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindStorageBuffers(int value) { maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindSampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindSampledImages(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindSampledImages.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindSampledImages`}
    public int maxPerStageDescriptorUpdateAfterBindSampledImages() { return maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindSampledImages(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindSampledImages.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindSampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindSampledImages(int value) { maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindStorageImages(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageImages.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageImages`}
    public int maxPerStageDescriptorUpdateAfterBindStorageImages() { return maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindStorageImages(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageImages.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindStorageImages(int value) { maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindInputAttachments(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindInputAttachments`}
    public int maxPerStageDescriptorUpdateAfterBindInputAttachments() { return maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindInputAttachments(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindInputAttachments(int value) { maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageUpdateAfterBindResources` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageUpdateAfterBindResources(MemorySegment segment, long index) { return (int) VH_maxPerStageUpdateAfterBindResources.get(segment, 0L, index); }
    /// {@return `maxPerStageUpdateAfterBindResources`}
    public int maxPerStageUpdateAfterBindResources() { return maxPerStageUpdateAfterBindResources(this.segment(), 0L); }
    /// Sets `maxPerStageUpdateAfterBindResources` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageUpdateAfterBindResources(MemorySegment segment, long index, int value) { VH_maxPerStageUpdateAfterBindResources.set(segment, 0L, index, value); }
    /// Sets `maxPerStageUpdateAfterBindResources` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageUpdateAfterBindResources(int value) { maxPerStageUpdateAfterBindResources(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindSamplers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindSamplers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindSamplers`}
    public int maxDescriptorSetUpdateAfterBindSamplers() { return maxDescriptorSetUpdateAfterBindSamplers(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindSamplers(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindSamplers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindSamplers(int value) { maxDescriptorSetUpdateAfterBindSamplers(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindUniformBuffers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffers`}
    public int maxDescriptorSetUpdateAfterBindUniformBuffers() { return maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindUniformBuffers(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindUniformBuffers(int value) { maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic`}
    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() { return maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(int value) { maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindStorageBuffers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffers`}
    public int maxDescriptorSetUpdateAfterBindStorageBuffers() { return maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindStorageBuffers(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindStorageBuffers(int value) { maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic`}
    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() { return maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(int value) { maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindSampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindSampledImages(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindSampledImages.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindSampledImages`}
    public int maxDescriptorSetUpdateAfterBindSampledImages() { return maxDescriptorSetUpdateAfterBindSampledImages(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindSampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindSampledImages(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindSampledImages.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindSampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindSampledImages(int value) { maxDescriptorSetUpdateAfterBindSampledImages(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindStorageImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindStorageImages(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageImages.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageImages`}
    public int maxDescriptorSetUpdateAfterBindStorageImages() { return maxDescriptorSetUpdateAfterBindStorageImages(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindStorageImages(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindStorageImages.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindStorageImages(int value) { maxDescriptorSetUpdateAfterBindStorageImages(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindInputAttachments(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindInputAttachments.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindInputAttachments`}
    public int maxDescriptorSetUpdateAfterBindInputAttachments() { return maxDescriptorSetUpdateAfterBindInputAttachments(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindInputAttachments(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindInputAttachments.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindInputAttachments(int value) { maxDescriptorSetUpdateAfterBindInputAttachments(this.segment(), 0L, value); return this; }

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

        /// {@return `maxUpdateAfterBindDescriptorsInAllPools` at the given index}
        /// @param index the index of the struct buffer
        public int maxUpdateAfterBindDescriptorsInAllPoolsAt(long index) { return maxUpdateAfterBindDescriptorsInAllPools(this.segment(), index); }
        /// Sets `maxUpdateAfterBindDescriptorsInAllPools` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxUpdateAfterBindDescriptorsInAllPoolsAt(long index, int value) { maxUpdateAfterBindDescriptorsInAllPools(this.segment(), index, value); return this; }

        /// {@return `shaderUniformBufferArrayNonUniformIndexingNative` at the given index}
        /// @param index the index of the struct buffer
        public int shaderUniformBufferArrayNonUniformIndexingNativeAt(long index) { return shaderUniformBufferArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderUniformBufferArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderUniformBufferArrayNonUniformIndexingNativeAt(long index, int value) { shaderUniformBufferArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderSampledImageArrayNonUniformIndexingNative` at the given index}
        /// @param index the index of the struct buffer
        public int shaderSampledImageArrayNonUniformIndexingNativeAt(long index) { return shaderSampledImageArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderSampledImageArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderSampledImageArrayNonUniformIndexingNativeAt(long index, int value) { shaderSampledImageArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderStorageBufferArrayNonUniformIndexingNative` at the given index}
        /// @param index the index of the struct buffer
        public int shaderStorageBufferArrayNonUniformIndexingNativeAt(long index) { return shaderStorageBufferArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderStorageBufferArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageBufferArrayNonUniformIndexingNativeAt(long index, int value) { shaderStorageBufferArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderStorageImageArrayNonUniformIndexingNative` at the given index}
        /// @param index the index of the struct buffer
        public int shaderStorageImageArrayNonUniformIndexingNativeAt(long index) { return shaderStorageImageArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderStorageImageArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageImageArrayNonUniformIndexingNativeAt(long index, int value) { shaderStorageImageArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `shaderInputAttachmentArrayNonUniformIndexingNative` at the given index}
        /// @param index the index of the struct buffer
        public int shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index) { return shaderInputAttachmentArrayNonUniformIndexingNative(this.segment(), index); }
        /// Sets `shaderInputAttachmentArrayNonUniformIndexingNative` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index, int value) { shaderInputAttachmentArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

        /// {@return `robustBufferAccessUpdateAfterBind` at the given index}
        /// @param index the index of the struct buffer
        public int robustBufferAccessUpdateAfterBindAt(long index) { return robustBufferAccessUpdateAfterBind(this.segment(), index); }
        /// Sets `robustBufferAccessUpdateAfterBind` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer robustBufferAccessUpdateAfterBindAt(long index, int value) { robustBufferAccessUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `quadDivergentImplicitLod` at the given index}
        /// @param index the index of the struct buffer
        public int quadDivergentImplicitLodAt(long index) { return quadDivergentImplicitLod(this.segment(), index); }
        /// Sets `quadDivergentImplicitLod` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer quadDivergentImplicitLodAt(long index, int value) { quadDivergentImplicitLod(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindSamplers` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageDescriptorUpdateAfterBindSamplersAt(long index) { return maxPerStageDescriptorUpdateAfterBindSamplers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindSamplers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindSamplersAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindSamplers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindUniformBuffers` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index) { return maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindUniformBuffers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindUniformBuffers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindStorageBuffers` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index) { return maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindStorageBuffers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindStorageBuffers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindSampledImages` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index) { return maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindSampledImages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindSampledImages(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindStorageImages` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index) { return maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindStorageImages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindStorageImages(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUpdateAfterBindInputAttachments` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index) { return maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUpdateAfterBindInputAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindInputAttachments(this.segment(), index, value); return this; }

        /// {@return `maxPerStageUpdateAfterBindResources` at the given index}
        /// @param index the index of the struct buffer
        public int maxPerStageUpdateAfterBindResourcesAt(long index) { return maxPerStageUpdateAfterBindResources(this.segment(), index); }
        /// Sets `maxPerStageUpdateAfterBindResources` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageUpdateAfterBindResourcesAt(long index, int value) { maxPerStageUpdateAfterBindResources(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindSamplers` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindSamplersAt(long index) { return maxDescriptorSetUpdateAfterBindSamplers(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindSamplers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindSamplersAt(long index, int value) { maxDescriptorSetUpdateAfterBindSamplers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffers` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index) { return maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index, int value) { maxDescriptorSetUpdateAfterBindUniformBuffers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index) { return maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindUniformBuffersDynamic` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index, int value) { maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffers` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index) { return maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index, int value) { maxDescriptorSetUpdateAfterBindStorageBuffers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index) { return maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindStorageBuffersDynamic` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index, int value) { maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindSampledImages` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindSampledImagesAt(long index) { return maxDescriptorSetUpdateAfterBindSampledImages(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindSampledImages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindSampledImagesAt(long index, int value) { maxDescriptorSetUpdateAfterBindSampledImages(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindStorageImages` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindStorageImagesAt(long index) { return maxDescriptorSetUpdateAfterBindStorageImages(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindStorageImages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindStorageImagesAt(long index, int value) { maxDescriptorSetUpdateAfterBindStorageImages(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUpdateAfterBindInputAttachments` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index) { return maxDescriptorSetUpdateAfterBindInputAttachments(this.segment(), index); }
        /// Sets `maxDescriptorSetUpdateAfterBindInputAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index, int value) { maxDescriptorSetUpdateAfterBindInputAttachments(this.segment(), index, value); return this; }

    }
}

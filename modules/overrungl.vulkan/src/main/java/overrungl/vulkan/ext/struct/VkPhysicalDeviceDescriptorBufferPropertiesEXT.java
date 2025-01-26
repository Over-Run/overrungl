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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceDescriptorBufferPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 combinedImageSamplerDescriptorSingleArray;
///     VkBool32 bufferlessPushDescriptors;
///     VkBool32 allowSamplerImageViewPostSubmitCreation;
///     VkDeviceSize descriptorBufferOffsetAlignment;
///     uint32_t maxDescriptorBufferBindings;
///     uint32_t maxResourceDescriptorBufferBindings;
///     uint32_t maxSamplerDescriptorBufferBindings;
///     uint32_t maxEmbeddedImmutableSamplerBindings;
///     uint32_t maxEmbeddedImmutableSamplers;
///     size_t bufferCaptureReplayDescriptorDataSize;
///     size_t imageCaptureReplayDescriptorDataSize;
///     size_t imageViewCaptureReplayDescriptorDataSize;
///     size_t samplerCaptureReplayDescriptorDataSize;
///     size_t accelerationStructureCaptureReplayDescriptorDataSize;
///     size_t samplerDescriptorSize;
///     size_t combinedImageSamplerDescriptorSize;
///     size_t sampledImageDescriptorSize;
///     size_t storageImageDescriptorSize;
///     size_t uniformTexelBufferDescriptorSize;
///     size_t robustUniformTexelBufferDescriptorSize;
///     size_t storageTexelBufferDescriptorSize;
///     size_t robustStorageTexelBufferDescriptorSize;
///     size_t uniformBufferDescriptorSize;
///     size_t robustUniformBufferDescriptorSize;
///     size_t storageBufferDescriptorSize;
///     size_t robustStorageBufferDescriptorSize;
///     size_t inputAttachmentDescriptorSize;
///     size_t accelerationStructureDescriptorSize;
///     VkDeviceSize maxSamplerDescriptorBufferRange;
///     VkDeviceSize maxResourceDescriptorBufferRange;
///     VkDeviceSize samplerDescriptorBufferAddressSpaceSize;
///     VkDeviceSize resourceDescriptorBufferAddressSpaceSize;
///     VkDeviceSize descriptorBufferAddressSpaceSize;
/// };
/// ```
public sealed class VkPhysicalDeviceDescriptorBufferPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDescriptorBufferPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("combinedImageSamplerDescriptorSingleArray"),
        ValueLayout.JAVA_INT.withName("bufferlessPushDescriptors"),
        ValueLayout.JAVA_INT.withName("allowSamplerImageViewPostSubmitCreation"),
        ValueLayout.JAVA_LONG.withName("descriptorBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("maxDescriptorBufferBindings"),
        ValueLayout.JAVA_INT.withName("maxResourceDescriptorBufferBindings"),
        ValueLayout.JAVA_INT.withName("maxSamplerDescriptorBufferBindings"),
        ValueLayout.JAVA_INT.withName("maxEmbeddedImmutableSamplerBindings"),
        ValueLayout.JAVA_INT.withName("maxEmbeddedImmutableSamplers"),
        CanonicalTypes.SIZE_T.withName("bufferCaptureReplayDescriptorDataSize"),
        CanonicalTypes.SIZE_T.withName("imageCaptureReplayDescriptorDataSize"),
        CanonicalTypes.SIZE_T.withName("imageViewCaptureReplayDescriptorDataSize"),
        CanonicalTypes.SIZE_T.withName("samplerCaptureReplayDescriptorDataSize"),
        CanonicalTypes.SIZE_T.withName("accelerationStructureCaptureReplayDescriptorDataSize"),
        CanonicalTypes.SIZE_T.withName("samplerDescriptorSize"),
        CanonicalTypes.SIZE_T.withName("combinedImageSamplerDescriptorSize"),
        CanonicalTypes.SIZE_T.withName("sampledImageDescriptorSize"),
        CanonicalTypes.SIZE_T.withName("storageImageDescriptorSize"),
        CanonicalTypes.SIZE_T.withName("uniformTexelBufferDescriptorSize"),
        CanonicalTypes.SIZE_T.withName("robustUniformTexelBufferDescriptorSize"),
        CanonicalTypes.SIZE_T.withName("storageTexelBufferDescriptorSize"),
        CanonicalTypes.SIZE_T.withName("robustStorageTexelBufferDescriptorSize"),
        CanonicalTypes.SIZE_T.withName("uniformBufferDescriptorSize"),
        CanonicalTypes.SIZE_T.withName("robustUniformBufferDescriptorSize"),
        CanonicalTypes.SIZE_T.withName("storageBufferDescriptorSize"),
        CanonicalTypes.SIZE_T.withName("robustStorageBufferDescriptorSize"),
        CanonicalTypes.SIZE_T.withName("inputAttachmentDescriptorSize"),
        CanonicalTypes.SIZE_T.withName("accelerationStructureDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("maxSamplerDescriptorBufferRange"),
        ValueLayout.JAVA_LONG.withName("maxResourceDescriptorBufferRange"),
        ValueLayout.JAVA_LONG.withName("samplerDescriptorBufferAddressSpaceSize"),
        ValueLayout.JAVA_LONG.withName("resourceDescriptorBufferAddressSpaceSize"),
        ValueLayout.JAVA_LONG.withName("descriptorBufferAddressSpaceSize")
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
    /// The byte offset of `combinedImageSamplerDescriptorSingleArray`.
    public static final long OFFSET_combinedImageSamplerDescriptorSingleArray = LAYOUT.byteOffset(PathElement.groupElement("combinedImageSamplerDescriptorSingleArray"));
    /// The memory layout of `combinedImageSamplerDescriptorSingleArray`.
    public static final MemoryLayout LAYOUT_combinedImageSamplerDescriptorSingleArray = LAYOUT.select(PathElement.groupElement("combinedImageSamplerDescriptorSingleArray"));
    /// The [VarHandle] of `combinedImageSamplerDescriptorSingleArray` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_combinedImageSamplerDescriptorSingleArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinedImageSamplerDescriptorSingleArray"));
    /// The byte offset of `bufferlessPushDescriptors`.
    public static final long OFFSET_bufferlessPushDescriptors = LAYOUT.byteOffset(PathElement.groupElement("bufferlessPushDescriptors"));
    /// The memory layout of `bufferlessPushDescriptors`.
    public static final MemoryLayout LAYOUT_bufferlessPushDescriptors = LAYOUT.select(PathElement.groupElement("bufferlessPushDescriptors"));
    /// The [VarHandle] of `bufferlessPushDescriptors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferlessPushDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferlessPushDescriptors"));
    /// The byte offset of `allowSamplerImageViewPostSubmitCreation`.
    public static final long OFFSET_allowSamplerImageViewPostSubmitCreation = LAYOUT.byteOffset(PathElement.groupElement("allowSamplerImageViewPostSubmitCreation"));
    /// The memory layout of `allowSamplerImageViewPostSubmitCreation`.
    public static final MemoryLayout LAYOUT_allowSamplerImageViewPostSubmitCreation = LAYOUT.select(PathElement.groupElement("allowSamplerImageViewPostSubmitCreation"));
    /// The [VarHandle] of `allowSamplerImageViewPostSubmitCreation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_allowSamplerImageViewPostSubmitCreation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allowSamplerImageViewPostSubmitCreation"));
    /// The byte offset of `descriptorBufferOffsetAlignment`.
    public static final long OFFSET_descriptorBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferOffsetAlignment"));
    /// The memory layout of `descriptorBufferOffsetAlignment`.
    public static final MemoryLayout LAYOUT_descriptorBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("descriptorBufferOffsetAlignment"));
    /// The [VarHandle] of `descriptorBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferOffsetAlignment"));
    /// The byte offset of `maxDescriptorBufferBindings`.
    public static final long OFFSET_maxDescriptorBufferBindings = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorBufferBindings"));
    /// The memory layout of `maxDescriptorBufferBindings`.
    public static final MemoryLayout LAYOUT_maxDescriptorBufferBindings = LAYOUT.select(PathElement.groupElement("maxDescriptorBufferBindings"));
    /// The [VarHandle] of `maxDescriptorBufferBindings` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorBufferBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorBufferBindings"));
    /// The byte offset of `maxResourceDescriptorBufferBindings`.
    public static final long OFFSET_maxResourceDescriptorBufferBindings = LAYOUT.byteOffset(PathElement.groupElement("maxResourceDescriptorBufferBindings"));
    /// The memory layout of `maxResourceDescriptorBufferBindings`.
    public static final MemoryLayout LAYOUT_maxResourceDescriptorBufferBindings = LAYOUT.select(PathElement.groupElement("maxResourceDescriptorBufferBindings"));
    /// The [VarHandle] of `maxResourceDescriptorBufferBindings` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxResourceDescriptorBufferBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxResourceDescriptorBufferBindings"));
    /// The byte offset of `maxSamplerDescriptorBufferBindings`.
    public static final long OFFSET_maxSamplerDescriptorBufferBindings = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerDescriptorBufferBindings"));
    /// The memory layout of `maxSamplerDescriptorBufferBindings`.
    public static final MemoryLayout LAYOUT_maxSamplerDescriptorBufferBindings = LAYOUT.select(PathElement.groupElement("maxSamplerDescriptorBufferBindings"));
    /// The [VarHandle] of `maxSamplerDescriptorBufferBindings` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxSamplerDescriptorBufferBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerDescriptorBufferBindings"));
    /// The byte offset of `maxEmbeddedImmutableSamplerBindings`.
    public static final long OFFSET_maxEmbeddedImmutableSamplerBindings = LAYOUT.byteOffset(PathElement.groupElement("maxEmbeddedImmutableSamplerBindings"));
    /// The memory layout of `maxEmbeddedImmutableSamplerBindings`.
    public static final MemoryLayout LAYOUT_maxEmbeddedImmutableSamplerBindings = LAYOUT.select(PathElement.groupElement("maxEmbeddedImmutableSamplerBindings"));
    /// The [VarHandle] of `maxEmbeddedImmutableSamplerBindings` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxEmbeddedImmutableSamplerBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxEmbeddedImmutableSamplerBindings"));
    /// The byte offset of `maxEmbeddedImmutableSamplers`.
    public static final long OFFSET_maxEmbeddedImmutableSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxEmbeddedImmutableSamplers"));
    /// The memory layout of `maxEmbeddedImmutableSamplers`.
    public static final MemoryLayout LAYOUT_maxEmbeddedImmutableSamplers = LAYOUT.select(PathElement.groupElement("maxEmbeddedImmutableSamplers"));
    /// The [VarHandle] of `maxEmbeddedImmutableSamplers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxEmbeddedImmutableSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxEmbeddedImmutableSamplers"));
    /// The byte offset of `bufferCaptureReplayDescriptorDataSize`.
    public static final long OFFSET_bufferCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PathElement.groupElement("bufferCaptureReplayDescriptorDataSize"));
    /// The memory layout of `bufferCaptureReplayDescriptorDataSize`.
    public static final MemoryLayout LAYOUT_bufferCaptureReplayDescriptorDataSize = LAYOUT.select(PathElement.groupElement("bufferCaptureReplayDescriptorDataSize"));
    /// The [VarHandle] of `bufferCaptureReplayDescriptorDataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCaptureReplayDescriptorDataSize"));
    /// The byte offset of `imageCaptureReplayDescriptorDataSize`.
    public static final long OFFSET_imageCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PathElement.groupElement("imageCaptureReplayDescriptorDataSize"));
    /// The memory layout of `imageCaptureReplayDescriptorDataSize`.
    public static final MemoryLayout LAYOUT_imageCaptureReplayDescriptorDataSize = LAYOUT.select(PathElement.groupElement("imageCaptureReplayDescriptorDataSize"));
    /// The [VarHandle] of `imageCaptureReplayDescriptorDataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCaptureReplayDescriptorDataSize"));
    /// The byte offset of `imageViewCaptureReplayDescriptorDataSize`.
    public static final long OFFSET_imageViewCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PathElement.groupElement("imageViewCaptureReplayDescriptorDataSize"));
    /// The memory layout of `imageViewCaptureReplayDescriptorDataSize`.
    public static final MemoryLayout LAYOUT_imageViewCaptureReplayDescriptorDataSize = LAYOUT.select(PathElement.groupElement("imageViewCaptureReplayDescriptorDataSize"));
    /// The [VarHandle] of `imageViewCaptureReplayDescriptorDataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageViewCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewCaptureReplayDescriptorDataSize"));
    /// The byte offset of `samplerCaptureReplayDescriptorDataSize`.
    public static final long OFFSET_samplerCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PathElement.groupElement("samplerCaptureReplayDescriptorDataSize"));
    /// The memory layout of `samplerCaptureReplayDescriptorDataSize`.
    public static final MemoryLayout LAYOUT_samplerCaptureReplayDescriptorDataSize = LAYOUT.select(PathElement.groupElement("samplerCaptureReplayDescriptorDataSize"));
    /// The [VarHandle] of `samplerCaptureReplayDescriptorDataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_samplerCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerCaptureReplayDescriptorDataSize"));
    /// The byte offset of `accelerationStructureCaptureReplayDescriptorDataSize`.
    public static final long OFFSET_accelerationStructureCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureCaptureReplayDescriptorDataSize"));
    /// The memory layout of `accelerationStructureCaptureReplayDescriptorDataSize`.
    public static final MemoryLayout LAYOUT_accelerationStructureCaptureReplayDescriptorDataSize = LAYOUT.select(PathElement.groupElement("accelerationStructureCaptureReplayDescriptorDataSize"));
    /// The [VarHandle] of `accelerationStructureCaptureReplayDescriptorDataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructureCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureCaptureReplayDescriptorDataSize"));
    /// The byte offset of `samplerDescriptorSize`.
    public static final long OFFSET_samplerDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("samplerDescriptorSize"));
    /// The memory layout of `samplerDescriptorSize`.
    public static final MemoryLayout LAYOUT_samplerDescriptorSize = LAYOUT.select(PathElement.groupElement("samplerDescriptorSize"));
    /// The [VarHandle] of `samplerDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_samplerDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerDescriptorSize"));
    /// The byte offset of `combinedImageSamplerDescriptorSize`.
    public static final long OFFSET_combinedImageSamplerDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("combinedImageSamplerDescriptorSize"));
    /// The memory layout of `combinedImageSamplerDescriptorSize`.
    public static final MemoryLayout LAYOUT_combinedImageSamplerDescriptorSize = LAYOUT.select(PathElement.groupElement("combinedImageSamplerDescriptorSize"));
    /// The [VarHandle] of `combinedImageSamplerDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_combinedImageSamplerDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinedImageSamplerDescriptorSize"));
    /// The byte offset of `sampledImageDescriptorSize`.
    public static final long OFFSET_sampledImageDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("sampledImageDescriptorSize"));
    /// The memory layout of `sampledImageDescriptorSize`.
    public static final MemoryLayout LAYOUT_sampledImageDescriptorSize = LAYOUT.select(PathElement.groupElement("sampledImageDescriptorSize"));
    /// The [VarHandle] of `sampledImageDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampledImageDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageDescriptorSize"));
    /// The byte offset of `storageImageDescriptorSize`.
    public static final long OFFSET_storageImageDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("storageImageDescriptorSize"));
    /// The memory layout of `storageImageDescriptorSize`.
    public static final MemoryLayout LAYOUT_storageImageDescriptorSize = LAYOUT.select(PathElement.groupElement("storageImageDescriptorSize"));
    /// The [VarHandle] of `storageImageDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storageImageDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageImageDescriptorSize"));
    /// The byte offset of `uniformTexelBufferDescriptorSize`.
    public static final long OFFSET_uniformTexelBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferDescriptorSize"));
    /// The memory layout of `uniformTexelBufferDescriptorSize`.
    public static final MemoryLayout LAYOUT_uniformTexelBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("uniformTexelBufferDescriptorSize"));
    /// The [VarHandle] of `uniformTexelBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_uniformTexelBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferDescriptorSize"));
    /// The byte offset of `robustUniformTexelBufferDescriptorSize`.
    public static final long OFFSET_robustUniformTexelBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("robustUniformTexelBufferDescriptorSize"));
    /// The memory layout of `robustUniformTexelBufferDescriptorSize`.
    public static final MemoryLayout LAYOUT_robustUniformTexelBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("robustUniformTexelBufferDescriptorSize"));
    /// The [VarHandle] of `robustUniformTexelBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_robustUniformTexelBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustUniformTexelBufferDescriptorSize"));
    /// The byte offset of `storageTexelBufferDescriptorSize`.
    public static final long OFFSET_storageTexelBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferDescriptorSize"));
    /// The memory layout of `storageTexelBufferDescriptorSize`.
    public static final MemoryLayout LAYOUT_storageTexelBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("storageTexelBufferDescriptorSize"));
    /// The [VarHandle] of `storageTexelBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storageTexelBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferDescriptorSize"));
    /// The byte offset of `robustStorageTexelBufferDescriptorSize`.
    public static final long OFFSET_robustStorageTexelBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("robustStorageTexelBufferDescriptorSize"));
    /// The memory layout of `robustStorageTexelBufferDescriptorSize`.
    public static final MemoryLayout LAYOUT_robustStorageTexelBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("robustStorageTexelBufferDescriptorSize"));
    /// The [VarHandle] of `robustStorageTexelBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_robustStorageTexelBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustStorageTexelBufferDescriptorSize"));
    /// The byte offset of `uniformBufferDescriptorSize`.
    public static final long OFFSET_uniformBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("uniformBufferDescriptorSize"));
    /// The memory layout of `uniformBufferDescriptorSize`.
    public static final MemoryLayout LAYOUT_uniformBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("uniformBufferDescriptorSize"));
    /// The [VarHandle] of `uniformBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_uniformBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformBufferDescriptorSize"));
    /// The byte offset of `robustUniformBufferDescriptorSize`.
    public static final long OFFSET_robustUniformBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("robustUniformBufferDescriptorSize"));
    /// The memory layout of `robustUniformBufferDescriptorSize`.
    public static final MemoryLayout LAYOUT_robustUniformBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("robustUniformBufferDescriptorSize"));
    /// The [VarHandle] of `robustUniformBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_robustUniformBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustUniformBufferDescriptorSize"));
    /// The byte offset of `storageBufferDescriptorSize`.
    public static final long OFFSET_storageBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("storageBufferDescriptorSize"));
    /// The memory layout of `storageBufferDescriptorSize`.
    public static final MemoryLayout LAYOUT_storageBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("storageBufferDescriptorSize"));
    /// The [VarHandle] of `storageBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storageBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBufferDescriptorSize"));
    /// The byte offset of `robustStorageBufferDescriptorSize`.
    public static final long OFFSET_robustStorageBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("robustStorageBufferDescriptorSize"));
    /// The memory layout of `robustStorageBufferDescriptorSize`.
    public static final MemoryLayout LAYOUT_robustStorageBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("robustStorageBufferDescriptorSize"));
    /// The [VarHandle] of `robustStorageBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_robustStorageBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustStorageBufferDescriptorSize"));
    /// The byte offset of `inputAttachmentDescriptorSize`.
    public static final long OFFSET_inputAttachmentDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("inputAttachmentDescriptorSize"));
    /// The memory layout of `inputAttachmentDescriptorSize`.
    public static final MemoryLayout LAYOUT_inputAttachmentDescriptorSize = LAYOUT.select(PathElement.groupElement("inputAttachmentDescriptorSize"));
    /// The [VarHandle] of `inputAttachmentDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_inputAttachmentDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputAttachmentDescriptorSize"));
    /// The byte offset of `accelerationStructureDescriptorSize`.
    public static final long OFFSET_accelerationStructureDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureDescriptorSize"));
    /// The memory layout of `accelerationStructureDescriptorSize`.
    public static final MemoryLayout LAYOUT_accelerationStructureDescriptorSize = LAYOUT.select(PathElement.groupElement("accelerationStructureDescriptorSize"));
    /// The [VarHandle] of `accelerationStructureDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructureDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureDescriptorSize"));
    /// The byte offset of `maxSamplerDescriptorBufferRange`.
    public static final long OFFSET_maxSamplerDescriptorBufferRange = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerDescriptorBufferRange"));
    /// The memory layout of `maxSamplerDescriptorBufferRange`.
    public static final MemoryLayout LAYOUT_maxSamplerDescriptorBufferRange = LAYOUT.select(PathElement.groupElement("maxSamplerDescriptorBufferRange"));
    /// The [VarHandle] of `maxSamplerDescriptorBufferRange` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxSamplerDescriptorBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerDescriptorBufferRange"));
    /// The byte offset of `maxResourceDescriptorBufferRange`.
    public static final long OFFSET_maxResourceDescriptorBufferRange = LAYOUT.byteOffset(PathElement.groupElement("maxResourceDescriptorBufferRange"));
    /// The memory layout of `maxResourceDescriptorBufferRange`.
    public static final MemoryLayout LAYOUT_maxResourceDescriptorBufferRange = LAYOUT.select(PathElement.groupElement("maxResourceDescriptorBufferRange"));
    /// The [VarHandle] of `maxResourceDescriptorBufferRange` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxResourceDescriptorBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxResourceDescriptorBufferRange"));
    /// The byte offset of `samplerDescriptorBufferAddressSpaceSize`.
    public static final long OFFSET_samplerDescriptorBufferAddressSpaceSize = LAYOUT.byteOffset(PathElement.groupElement("samplerDescriptorBufferAddressSpaceSize"));
    /// The memory layout of `samplerDescriptorBufferAddressSpaceSize`.
    public static final MemoryLayout LAYOUT_samplerDescriptorBufferAddressSpaceSize = LAYOUT.select(PathElement.groupElement("samplerDescriptorBufferAddressSpaceSize"));
    /// The [VarHandle] of `samplerDescriptorBufferAddressSpaceSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_samplerDescriptorBufferAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerDescriptorBufferAddressSpaceSize"));
    /// The byte offset of `resourceDescriptorBufferAddressSpaceSize`.
    public static final long OFFSET_resourceDescriptorBufferAddressSpaceSize = LAYOUT.byteOffset(PathElement.groupElement("resourceDescriptorBufferAddressSpaceSize"));
    /// The memory layout of `resourceDescriptorBufferAddressSpaceSize`.
    public static final MemoryLayout LAYOUT_resourceDescriptorBufferAddressSpaceSize = LAYOUT.select(PathElement.groupElement("resourceDescriptorBufferAddressSpaceSize"));
    /// The [VarHandle] of `resourceDescriptorBufferAddressSpaceSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_resourceDescriptorBufferAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceDescriptorBufferAddressSpaceSize"));
    /// The byte offset of `descriptorBufferAddressSpaceSize`.
    public static final long OFFSET_descriptorBufferAddressSpaceSize = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferAddressSpaceSize"));
    /// The memory layout of `descriptorBufferAddressSpaceSize`.
    public static final MemoryLayout LAYOUT_descriptorBufferAddressSpaceSize = LAYOUT.select(PathElement.groupElement("descriptorBufferAddressSpaceSize"));
    /// The [VarHandle] of `descriptorBufferAddressSpaceSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBufferAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferAddressSpaceSize"));

    /// Creates `VkPhysicalDeviceDescriptorBufferPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDescriptorBufferPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDescriptorBufferPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDescriptorBufferPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDescriptorBufferPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDescriptorBufferPropertiesEXT`
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDescriptorBufferPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDescriptorBufferPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT copyFrom(VkPhysicalDeviceDescriptorBufferPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `combinedImageSamplerDescriptorSingleArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int combinedImageSamplerDescriptorSingleArray(MemorySegment segment, long index) { return (int) VH_combinedImageSamplerDescriptorSingleArray.get(segment, 0L, index); }
    /// {@return `combinedImageSamplerDescriptorSingleArray`}
    public int combinedImageSamplerDescriptorSingleArray() { return combinedImageSamplerDescriptorSingleArray(this.segment(), 0L); }
    /// Sets `combinedImageSamplerDescriptorSingleArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void combinedImageSamplerDescriptorSingleArray(MemorySegment segment, long index, int value) { VH_combinedImageSamplerDescriptorSingleArray.set(segment, 0L, index, value); }
    /// Sets `combinedImageSamplerDescriptorSingleArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT combinedImageSamplerDescriptorSingleArray(int value) { combinedImageSamplerDescriptorSingleArray(this.segment(), 0L, value); return this; }

    /// {@return `bufferlessPushDescriptors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferlessPushDescriptors(MemorySegment segment, long index) { return (int) VH_bufferlessPushDescriptors.get(segment, 0L, index); }
    /// {@return `bufferlessPushDescriptors`}
    public int bufferlessPushDescriptors() { return bufferlessPushDescriptors(this.segment(), 0L); }
    /// Sets `bufferlessPushDescriptors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferlessPushDescriptors(MemorySegment segment, long index, int value) { VH_bufferlessPushDescriptors.set(segment, 0L, index, value); }
    /// Sets `bufferlessPushDescriptors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT bufferlessPushDescriptors(int value) { bufferlessPushDescriptors(this.segment(), 0L, value); return this; }

    /// {@return `allowSamplerImageViewPostSubmitCreation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int allowSamplerImageViewPostSubmitCreation(MemorySegment segment, long index) { return (int) VH_allowSamplerImageViewPostSubmitCreation.get(segment, 0L, index); }
    /// {@return `allowSamplerImageViewPostSubmitCreation`}
    public int allowSamplerImageViewPostSubmitCreation() { return allowSamplerImageViewPostSubmitCreation(this.segment(), 0L); }
    /// Sets `allowSamplerImageViewPostSubmitCreation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void allowSamplerImageViewPostSubmitCreation(MemorySegment segment, long index, int value) { VH_allowSamplerImageViewPostSubmitCreation.set(segment, 0L, index, value); }
    /// Sets `allowSamplerImageViewPostSubmitCreation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT allowSamplerImageViewPostSubmitCreation(int value) { allowSamplerImageViewPostSubmitCreation(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long descriptorBufferOffsetAlignment(MemorySegment segment, long index) { return (long) VH_descriptorBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `descriptorBufferOffsetAlignment`}
    public long descriptorBufferOffsetAlignment() { return descriptorBufferOffsetAlignment(this.segment(), 0L); }
    /// Sets `descriptorBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBufferOffsetAlignment(MemorySegment segment, long index, long value) { VH_descriptorBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `descriptorBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT descriptorBufferOffsetAlignment(long value) { descriptorBufferOffsetAlignment(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorBufferBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorBufferBindings(MemorySegment segment, long index) { return (int) VH_maxDescriptorBufferBindings.get(segment, 0L, index); }
    /// {@return `maxDescriptorBufferBindings`}
    public int maxDescriptorBufferBindings() { return maxDescriptorBufferBindings(this.segment(), 0L); }
    /// Sets `maxDescriptorBufferBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorBufferBindings(MemorySegment segment, long index, int value) { VH_maxDescriptorBufferBindings.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorBufferBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxDescriptorBufferBindings(int value) { maxDescriptorBufferBindings(this.segment(), 0L, value); return this; }

    /// {@return `maxResourceDescriptorBufferBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxResourceDescriptorBufferBindings(MemorySegment segment, long index) { return (int) VH_maxResourceDescriptorBufferBindings.get(segment, 0L, index); }
    /// {@return `maxResourceDescriptorBufferBindings`}
    public int maxResourceDescriptorBufferBindings() { return maxResourceDescriptorBufferBindings(this.segment(), 0L); }
    /// Sets `maxResourceDescriptorBufferBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxResourceDescriptorBufferBindings(MemorySegment segment, long index, int value) { VH_maxResourceDescriptorBufferBindings.set(segment, 0L, index, value); }
    /// Sets `maxResourceDescriptorBufferBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxResourceDescriptorBufferBindings(int value) { maxResourceDescriptorBufferBindings(this.segment(), 0L, value); return this; }

    /// {@return `maxSamplerDescriptorBufferBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSamplerDescriptorBufferBindings(MemorySegment segment, long index) { return (int) VH_maxSamplerDescriptorBufferBindings.get(segment, 0L, index); }
    /// {@return `maxSamplerDescriptorBufferBindings`}
    public int maxSamplerDescriptorBufferBindings() { return maxSamplerDescriptorBufferBindings(this.segment(), 0L); }
    /// Sets `maxSamplerDescriptorBufferBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSamplerDescriptorBufferBindings(MemorySegment segment, long index, int value) { VH_maxSamplerDescriptorBufferBindings.set(segment, 0L, index, value); }
    /// Sets `maxSamplerDescriptorBufferBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxSamplerDescriptorBufferBindings(int value) { maxSamplerDescriptorBufferBindings(this.segment(), 0L, value); return this; }

    /// {@return `maxEmbeddedImmutableSamplerBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxEmbeddedImmutableSamplerBindings(MemorySegment segment, long index) { return (int) VH_maxEmbeddedImmutableSamplerBindings.get(segment, 0L, index); }
    /// {@return `maxEmbeddedImmutableSamplerBindings`}
    public int maxEmbeddedImmutableSamplerBindings() { return maxEmbeddedImmutableSamplerBindings(this.segment(), 0L); }
    /// Sets `maxEmbeddedImmutableSamplerBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxEmbeddedImmutableSamplerBindings(MemorySegment segment, long index, int value) { VH_maxEmbeddedImmutableSamplerBindings.set(segment, 0L, index, value); }
    /// Sets `maxEmbeddedImmutableSamplerBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxEmbeddedImmutableSamplerBindings(int value) { maxEmbeddedImmutableSamplerBindings(this.segment(), 0L, value); return this; }

    /// {@return `maxEmbeddedImmutableSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxEmbeddedImmutableSamplers(MemorySegment segment, long index) { return (int) VH_maxEmbeddedImmutableSamplers.get(segment, 0L, index); }
    /// {@return `maxEmbeddedImmutableSamplers`}
    public int maxEmbeddedImmutableSamplers() { return maxEmbeddedImmutableSamplers(this.segment(), 0L); }
    /// Sets `maxEmbeddedImmutableSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxEmbeddedImmutableSamplers(MemorySegment segment, long index, int value) { VH_maxEmbeddedImmutableSamplers.set(segment, 0L, index, value); }
    /// Sets `maxEmbeddedImmutableSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxEmbeddedImmutableSamplers(int value) { maxEmbeddedImmutableSamplers(this.segment(), 0L, value); return this; }

    /// {@return `bufferCaptureReplayDescriptorDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long bufferCaptureReplayDescriptorDataSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_bufferCaptureReplayDescriptorDataSize.get(segment, 0L, index)); }
    /// {@return `bufferCaptureReplayDescriptorDataSize`}
    public long bufferCaptureReplayDescriptorDataSize() { return bufferCaptureReplayDescriptorDataSize(this.segment(), 0L); }
    /// Sets `bufferCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferCaptureReplayDescriptorDataSize(MemorySegment segment, long index, long value) { VH_bufferCaptureReplayDescriptorDataSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `bufferCaptureReplayDescriptorDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT bufferCaptureReplayDescriptorDataSize(long value) { bufferCaptureReplayDescriptorDataSize(this.segment(), 0L, value); return this; }

    /// {@return `imageCaptureReplayDescriptorDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long imageCaptureReplayDescriptorDataSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_imageCaptureReplayDescriptorDataSize.get(segment, 0L, index)); }
    /// {@return `imageCaptureReplayDescriptorDataSize`}
    public long imageCaptureReplayDescriptorDataSize() { return imageCaptureReplayDescriptorDataSize(this.segment(), 0L); }
    /// Sets `imageCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageCaptureReplayDescriptorDataSize(MemorySegment segment, long index, long value) { VH_imageCaptureReplayDescriptorDataSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `imageCaptureReplayDescriptorDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT imageCaptureReplayDescriptorDataSize(long value) { imageCaptureReplayDescriptorDataSize(this.segment(), 0L, value); return this; }

    /// {@return `imageViewCaptureReplayDescriptorDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long imageViewCaptureReplayDescriptorDataSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_imageViewCaptureReplayDescriptorDataSize.get(segment, 0L, index)); }
    /// {@return `imageViewCaptureReplayDescriptorDataSize`}
    public long imageViewCaptureReplayDescriptorDataSize() { return imageViewCaptureReplayDescriptorDataSize(this.segment(), 0L); }
    /// Sets `imageViewCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageViewCaptureReplayDescriptorDataSize(MemorySegment segment, long index, long value) { VH_imageViewCaptureReplayDescriptorDataSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `imageViewCaptureReplayDescriptorDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT imageViewCaptureReplayDescriptorDataSize(long value) { imageViewCaptureReplayDescriptorDataSize(this.segment(), 0L, value); return this; }

    /// {@return `samplerCaptureReplayDescriptorDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long samplerCaptureReplayDescriptorDataSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_samplerCaptureReplayDescriptorDataSize.get(segment, 0L, index)); }
    /// {@return `samplerCaptureReplayDescriptorDataSize`}
    public long samplerCaptureReplayDescriptorDataSize() { return samplerCaptureReplayDescriptorDataSize(this.segment(), 0L); }
    /// Sets `samplerCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samplerCaptureReplayDescriptorDataSize(MemorySegment segment, long index, long value) { VH_samplerCaptureReplayDescriptorDataSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `samplerCaptureReplayDescriptorDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerCaptureReplayDescriptorDataSize(long value) { samplerCaptureReplayDescriptorDataSize(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructureCaptureReplayDescriptorDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long accelerationStructureCaptureReplayDescriptorDataSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_accelerationStructureCaptureReplayDescriptorDataSize.get(segment, 0L, index)); }
    /// {@return `accelerationStructureCaptureReplayDescriptorDataSize`}
    public long accelerationStructureCaptureReplayDescriptorDataSize() { return accelerationStructureCaptureReplayDescriptorDataSize(this.segment(), 0L); }
    /// Sets `accelerationStructureCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructureCaptureReplayDescriptorDataSize(MemorySegment segment, long index, long value) { VH_accelerationStructureCaptureReplayDescriptorDataSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `accelerationStructureCaptureReplayDescriptorDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT accelerationStructureCaptureReplayDescriptorDataSize(long value) { accelerationStructureCaptureReplayDescriptorDataSize(this.segment(), 0L, value); return this; }

    /// {@return `samplerDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long samplerDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_samplerDescriptorSize.get(segment, 0L, index)); }
    /// {@return `samplerDescriptorSize`}
    public long samplerDescriptorSize() { return samplerDescriptorSize(this.segment(), 0L); }
    /// Sets `samplerDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samplerDescriptorSize(MemorySegment segment, long index, long value) { VH_samplerDescriptorSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `samplerDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerDescriptorSize(long value) { samplerDescriptorSize(this.segment(), 0L, value); return this; }

    /// {@return `combinedImageSamplerDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long combinedImageSamplerDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_combinedImageSamplerDescriptorSize.get(segment, 0L, index)); }
    /// {@return `combinedImageSamplerDescriptorSize`}
    public long combinedImageSamplerDescriptorSize() { return combinedImageSamplerDescriptorSize(this.segment(), 0L); }
    /// Sets `combinedImageSamplerDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void combinedImageSamplerDescriptorSize(MemorySegment segment, long index, long value) { VH_combinedImageSamplerDescriptorSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `combinedImageSamplerDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT combinedImageSamplerDescriptorSize(long value) { combinedImageSamplerDescriptorSize(this.segment(), 0L, value); return this; }

    /// {@return `sampledImageDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long sampledImageDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_sampledImageDescriptorSize.get(segment, 0L, index)); }
    /// {@return `sampledImageDescriptorSize`}
    public long sampledImageDescriptorSize() { return sampledImageDescriptorSize(this.segment(), 0L); }
    /// Sets `sampledImageDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampledImageDescriptorSize(MemorySegment segment, long index, long value) { VH_sampledImageDescriptorSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `sampledImageDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sampledImageDescriptorSize(long value) { sampledImageDescriptorSize(this.segment(), 0L, value); return this; }

    /// {@return `storageImageDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long storageImageDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_storageImageDescriptorSize.get(segment, 0L, index)); }
    /// {@return `storageImageDescriptorSize`}
    public long storageImageDescriptorSize() { return storageImageDescriptorSize(this.segment(), 0L); }
    /// Sets `storageImageDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageImageDescriptorSize(MemorySegment segment, long index, long value) { VH_storageImageDescriptorSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `storageImageDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageImageDescriptorSize(long value) { storageImageDescriptorSize(this.segment(), 0L, value); return this; }

    /// {@return `uniformTexelBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long uniformTexelBufferDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_uniformTexelBufferDescriptorSize.get(segment, 0L, index)); }
    /// {@return `uniformTexelBufferDescriptorSize`}
    public long uniformTexelBufferDescriptorSize() { return uniformTexelBufferDescriptorSize(this.segment(), 0L); }
    /// Sets `uniformTexelBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformTexelBufferDescriptorSize(MemorySegment segment, long index, long value) { VH_uniformTexelBufferDescriptorSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `uniformTexelBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT uniformTexelBufferDescriptorSize(long value) { uniformTexelBufferDescriptorSize(this.segment(), 0L, value); return this; }

    /// {@return `robustUniformTexelBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long robustUniformTexelBufferDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_robustUniformTexelBufferDescriptorSize.get(segment, 0L, index)); }
    /// {@return `robustUniformTexelBufferDescriptorSize`}
    public long robustUniformTexelBufferDescriptorSize() { return robustUniformTexelBufferDescriptorSize(this.segment(), 0L); }
    /// Sets `robustUniformTexelBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void robustUniformTexelBufferDescriptorSize(MemorySegment segment, long index, long value) { VH_robustUniformTexelBufferDescriptorSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `robustUniformTexelBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustUniformTexelBufferDescriptorSize(long value) { robustUniformTexelBufferDescriptorSize(this.segment(), 0L, value); return this; }

    /// {@return `storageTexelBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long storageTexelBufferDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_storageTexelBufferDescriptorSize.get(segment, 0L, index)); }
    /// {@return `storageTexelBufferDescriptorSize`}
    public long storageTexelBufferDescriptorSize() { return storageTexelBufferDescriptorSize(this.segment(), 0L); }
    /// Sets `storageTexelBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageTexelBufferDescriptorSize(MemorySegment segment, long index, long value) { VH_storageTexelBufferDescriptorSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `storageTexelBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageTexelBufferDescriptorSize(long value) { storageTexelBufferDescriptorSize(this.segment(), 0L, value); return this; }

    /// {@return `robustStorageTexelBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long robustStorageTexelBufferDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_robustStorageTexelBufferDescriptorSize.get(segment, 0L, index)); }
    /// {@return `robustStorageTexelBufferDescriptorSize`}
    public long robustStorageTexelBufferDescriptorSize() { return robustStorageTexelBufferDescriptorSize(this.segment(), 0L); }
    /// Sets `robustStorageTexelBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void robustStorageTexelBufferDescriptorSize(MemorySegment segment, long index, long value) { VH_robustStorageTexelBufferDescriptorSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `robustStorageTexelBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustStorageTexelBufferDescriptorSize(long value) { robustStorageTexelBufferDescriptorSize(this.segment(), 0L, value); return this; }

    /// {@return `uniformBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long uniformBufferDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_uniformBufferDescriptorSize.get(segment, 0L, index)); }
    /// {@return `uniformBufferDescriptorSize`}
    public long uniformBufferDescriptorSize() { return uniformBufferDescriptorSize(this.segment(), 0L); }
    /// Sets `uniformBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformBufferDescriptorSize(MemorySegment segment, long index, long value) { VH_uniformBufferDescriptorSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `uniformBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT uniformBufferDescriptorSize(long value) { uniformBufferDescriptorSize(this.segment(), 0L, value); return this; }

    /// {@return `robustUniformBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long robustUniformBufferDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_robustUniformBufferDescriptorSize.get(segment, 0L, index)); }
    /// {@return `robustUniformBufferDescriptorSize`}
    public long robustUniformBufferDescriptorSize() { return robustUniformBufferDescriptorSize(this.segment(), 0L); }
    /// Sets `robustUniformBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void robustUniformBufferDescriptorSize(MemorySegment segment, long index, long value) { VH_robustUniformBufferDescriptorSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `robustUniformBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustUniformBufferDescriptorSize(long value) { robustUniformBufferDescriptorSize(this.segment(), 0L, value); return this; }

    /// {@return `storageBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long storageBufferDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_storageBufferDescriptorSize.get(segment, 0L, index)); }
    /// {@return `storageBufferDescriptorSize`}
    public long storageBufferDescriptorSize() { return storageBufferDescriptorSize(this.segment(), 0L); }
    /// Sets `storageBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageBufferDescriptorSize(MemorySegment segment, long index, long value) { VH_storageBufferDescriptorSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `storageBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageBufferDescriptorSize(long value) { storageBufferDescriptorSize(this.segment(), 0L, value); return this; }

    /// {@return `robustStorageBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long robustStorageBufferDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_robustStorageBufferDescriptorSize.get(segment, 0L, index)); }
    /// {@return `robustStorageBufferDescriptorSize`}
    public long robustStorageBufferDescriptorSize() { return robustStorageBufferDescriptorSize(this.segment(), 0L); }
    /// Sets `robustStorageBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void robustStorageBufferDescriptorSize(MemorySegment segment, long index, long value) { VH_robustStorageBufferDescriptorSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `robustStorageBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustStorageBufferDescriptorSize(long value) { robustStorageBufferDescriptorSize(this.segment(), 0L, value); return this; }

    /// {@return `inputAttachmentDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long inputAttachmentDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_inputAttachmentDescriptorSize.get(segment, 0L, index)); }
    /// {@return `inputAttachmentDescriptorSize`}
    public long inputAttachmentDescriptorSize() { return inputAttachmentDescriptorSize(this.segment(), 0L); }
    /// Sets `inputAttachmentDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void inputAttachmentDescriptorSize(MemorySegment segment, long index, long value) { VH_inputAttachmentDescriptorSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `inputAttachmentDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT inputAttachmentDescriptorSize(long value) { inputAttachmentDescriptorSize(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructureDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long accelerationStructureDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_accelerationStructureDescriptorSize.get(segment, 0L, index)); }
    /// {@return `accelerationStructureDescriptorSize`}
    public long accelerationStructureDescriptorSize() { return accelerationStructureDescriptorSize(this.segment(), 0L); }
    /// Sets `accelerationStructureDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructureDescriptorSize(MemorySegment segment, long index, long value) { VH_accelerationStructureDescriptorSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `accelerationStructureDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT accelerationStructureDescriptorSize(long value) { accelerationStructureDescriptorSize(this.segment(), 0L, value); return this; }

    /// {@return `maxSamplerDescriptorBufferRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxSamplerDescriptorBufferRange(MemorySegment segment, long index) { return (long) VH_maxSamplerDescriptorBufferRange.get(segment, 0L, index); }
    /// {@return `maxSamplerDescriptorBufferRange`}
    public long maxSamplerDescriptorBufferRange() { return maxSamplerDescriptorBufferRange(this.segment(), 0L); }
    /// Sets `maxSamplerDescriptorBufferRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSamplerDescriptorBufferRange(MemorySegment segment, long index, long value) { VH_maxSamplerDescriptorBufferRange.set(segment, 0L, index, value); }
    /// Sets `maxSamplerDescriptorBufferRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxSamplerDescriptorBufferRange(long value) { maxSamplerDescriptorBufferRange(this.segment(), 0L, value); return this; }

    /// {@return `maxResourceDescriptorBufferRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxResourceDescriptorBufferRange(MemorySegment segment, long index) { return (long) VH_maxResourceDescriptorBufferRange.get(segment, 0L, index); }
    /// {@return `maxResourceDescriptorBufferRange`}
    public long maxResourceDescriptorBufferRange() { return maxResourceDescriptorBufferRange(this.segment(), 0L); }
    /// Sets `maxResourceDescriptorBufferRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxResourceDescriptorBufferRange(MemorySegment segment, long index, long value) { VH_maxResourceDescriptorBufferRange.set(segment, 0L, index, value); }
    /// Sets `maxResourceDescriptorBufferRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxResourceDescriptorBufferRange(long value) { maxResourceDescriptorBufferRange(this.segment(), 0L, value); return this; }

    /// {@return `samplerDescriptorBufferAddressSpaceSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long samplerDescriptorBufferAddressSpaceSize(MemorySegment segment, long index) { return (long) VH_samplerDescriptorBufferAddressSpaceSize.get(segment, 0L, index); }
    /// {@return `samplerDescriptorBufferAddressSpaceSize`}
    public long samplerDescriptorBufferAddressSpaceSize() { return samplerDescriptorBufferAddressSpaceSize(this.segment(), 0L); }
    /// Sets `samplerDescriptorBufferAddressSpaceSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samplerDescriptorBufferAddressSpaceSize(MemorySegment segment, long index, long value) { VH_samplerDescriptorBufferAddressSpaceSize.set(segment, 0L, index, value); }
    /// Sets `samplerDescriptorBufferAddressSpaceSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerDescriptorBufferAddressSpaceSize(long value) { samplerDescriptorBufferAddressSpaceSize(this.segment(), 0L, value); return this; }

    /// {@return `resourceDescriptorBufferAddressSpaceSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long resourceDescriptorBufferAddressSpaceSize(MemorySegment segment, long index) { return (long) VH_resourceDescriptorBufferAddressSpaceSize.get(segment, 0L, index); }
    /// {@return `resourceDescriptorBufferAddressSpaceSize`}
    public long resourceDescriptorBufferAddressSpaceSize() { return resourceDescriptorBufferAddressSpaceSize(this.segment(), 0L); }
    /// Sets `resourceDescriptorBufferAddressSpaceSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void resourceDescriptorBufferAddressSpaceSize(MemorySegment segment, long index, long value) { VH_resourceDescriptorBufferAddressSpaceSize.set(segment, 0L, index, value); }
    /// Sets `resourceDescriptorBufferAddressSpaceSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT resourceDescriptorBufferAddressSpaceSize(long value) { resourceDescriptorBufferAddressSpaceSize(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBufferAddressSpaceSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long descriptorBufferAddressSpaceSize(MemorySegment segment, long index) { return (long) VH_descriptorBufferAddressSpaceSize.get(segment, 0L, index); }
    /// {@return `descriptorBufferAddressSpaceSize`}
    public long descriptorBufferAddressSpaceSize() { return descriptorBufferAddressSpaceSize(this.segment(), 0L); }
    /// Sets `descriptorBufferAddressSpaceSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBufferAddressSpaceSize(MemorySegment segment, long index, long value) { VH_descriptorBufferAddressSpaceSize.set(segment, 0L, index, value); }
    /// Sets `descriptorBufferAddressSpaceSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT descriptorBufferAddressSpaceSize(long value) { descriptorBufferAddressSpaceSize(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceDescriptorBufferPropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceDescriptorBufferPropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDescriptorBufferPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDescriptorBufferPropertiesEXT`
        public VkPhysicalDeviceDescriptorBufferPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDescriptorBufferPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDescriptorBufferPropertiesEXT`
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

        /// {@return `combinedImageSamplerDescriptorSingleArray` at the given index}
        /// @param index the index of the struct buffer
        public int combinedImageSamplerDescriptorSingleArrayAt(long index) { return combinedImageSamplerDescriptorSingleArray(this.segment(), index); }
        /// Sets `combinedImageSamplerDescriptorSingleArray` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer combinedImageSamplerDescriptorSingleArrayAt(long index, int value) { combinedImageSamplerDescriptorSingleArray(this.segment(), index, value); return this; }

        /// {@return `bufferlessPushDescriptors` at the given index}
        /// @param index the index of the struct buffer
        public int bufferlessPushDescriptorsAt(long index) { return bufferlessPushDescriptors(this.segment(), index); }
        /// Sets `bufferlessPushDescriptors` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bufferlessPushDescriptorsAt(long index, int value) { bufferlessPushDescriptors(this.segment(), index, value); return this; }

        /// {@return `allowSamplerImageViewPostSubmitCreation` at the given index}
        /// @param index the index of the struct buffer
        public int allowSamplerImageViewPostSubmitCreationAt(long index) { return allowSamplerImageViewPostSubmitCreation(this.segment(), index); }
        /// Sets `allowSamplerImageViewPostSubmitCreation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer allowSamplerImageViewPostSubmitCreationAt(long index, int value) { allowSamplerImageViewPostSubmitCreation(this.segment(), index, value); return this; }

        /// {@return `descriptorBufferOffsetAlignment` at the given index}
        /// @param index the index of the struct buffer
        public long descriptorBufferOffsetAlignmentAt(long index) { return descriptorBufferOffsetAlignment(this.segment(), index); }
        /// Sets `descriptorBufferOffsetAlignment` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBufferOffsetAlignmentAt(long index, long value) { descriptorBufferOffsetAlignment(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorBufferBindings` at the given index}
        /// @param index the index of the struct buffer
        public int maxDescriptorBufferBindingsAt(long index) { return maxDescriptorBufferBindings(this.segment(), index); }
        /// Sets `maxDescriptorBufferBindings` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorBufferBindingsAt(long index, int value) { maxDescriptorBufferBindings(this.segment(), index, value); return this; }

        /// {@return `maxResourceDescriptorBufferBindings` at the given index}
        /// @param index the index of the struct buffer
        public int maxResourceDescriptorBufferBindingsAt(long index) { return maxResourceDescriptorBufferBindings(this.segment(), index); }
        /// Sets `maxResourceDescriptorBufferBindings` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxResourceDescriptorBufferBindingsAt(long index, int value) { maxResourceDescriptorBufferBindings(this.segment(), index, value); return this; }

        /// {@return `maxSamplerDescriptorBufferBindings` at the given index}
        /// @param index the index of the struct buffer
        public int maxSamplerDescriptorBufferBindingsAt(long index) { return maxSamplerDescriptorBufferBindings(this.segment(), index); }
        /// Sets `maxSamplerDescriptorBufferBindings` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxSamplerDescriptorBufferBindingsAt(long index, int value) { maxSamplerDescriptorBufferBindings(this.segment(), index, value); return this; }

        /// {@return `maxEmbeddedImmutableSamplerBindings` at the given index}
        /// @param index the index of the struct buffer
        public int maxEmbeddedImmutableSamplerBindingsAt(long index) { return maxEmbeddedImmutableSamplerBindings(this.segment(), index); }
        /// Sets `maxEmbeddedImmutableSamplerBindings` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxEmbeddedImmutableSamplerBindingsAt(long index, int value) { maxEmbeddedImmutableSamplerBindings(this.segment(), index, value); return this; }

        /// {@return `maxEmbeddedImmutableSamplers` at the given index}
        /// @param index the index of the struct buffer
        public int maxEmbeddedImmutableSamplersAt(long index) { return maxEmbeddedImmutableSamplers(this.segment(), index); }
        /// Sets `maxEmbeddedImmutableSamplers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxEmbeddedImmutableSamplersAt(long index, int value) { maxEmbeddedImmutableSamplers(this.segment(), index, value); return this; }

        /// {@return `bufferCaptureReplayDescriptorDataSize` at the given index}
        /// @param index the index of the struct buffer
        public long bufferCaptureReplayDescriptorDataSizeAt(long index) { return bufferCaptureReplayDescriptorDataSize(this.segment(), index); }
        /// Sets `bufferCaptureReplayDescriptorDataSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bufferCaptureReplayDescriptorDataSizeAt(long index, long value) { bufferCaptureReplayDescriptorDataSize(this.segment(), index, value); return this; }

        /// {@return `imageCaptureReplayDescriptorDataSize` at the given index}
        /// @param index the index of the struct buffer
        public long imageCaptureReplayDescriptorDataSizeAt(long index) { return imageCaptureReplayDescriptorDataSize(this.segment(), index); }
        /// Sets `imageCaptureReplayDescriptorDataSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageCaptureReplayDescriptorDataSizeAt(long index, long value) { imageCaptureReplayDescriptorDataSize(this.segment(), index, value); return this; }

        /// {@return `imageViewCaptureReplayDescriptorDataSize` at the given index}
        /// @param index the index of the struct buffer
        public long imageViewCaptureReplayDescriptorDataSizeAt(long index) { return imageViewCaptureReplayDescriptorDataSize(this.segment(), index); }
        /// Sets `imageViewCaptureReplayDescriptorDataSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageViewCaptureReplayDescriptorDataSizeAt(long index, long value) { imageViewCaptureReplayDescriptorDataSize(this.segment(), index, value); return this; }

        /// {@return `samplerCaptureReplayDescriptorDataSize` at the given index}
        /// @param index the index of the struct buffer
        public long samplerCaptureReplayDescriptorDataSizeAt(long index) { return samplerCaptureReplayDescriptorDataSize(this.segment(), index); }
        /// Sets `samplerCaptureReplayDescriptorDataSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer samplerCaptureReplayDescriptorDataSizeAt(long index, long value) { samplerCaptureReplayDescriptorDataSize(this.segment(), index, value); return this; }

        /// {@return `accelerationStructureCaptureReplayDescriptorDataSize` at the given index}
        /// @param index the index of the struct buffer
        public long accelerationStructureCaptureReplayDescriptorDataSizeAt(long index) { return accelerationStructureCaptureReplayDescriptorDataSize(this.segment(), index); }
        /// Sets `accelerationStructureCaptureReplayDescriptorDataSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer accelerationStructureCaptureReplayDescriptorDataSizeAt(long index, long value) { accelerationStructureCaptureReplayDescriptorDataSize(this.segment(), index, value); return this; }

        /// {@return `samplerDescriptorSize` at the given index}
        /// @param index the index of the struct buffer
        public long samplerDescriptorSizeAt(long index) { return samplerDescriptorSize(this.segment(), index); }
        /// Sets `samplerDescriptorSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer samplerDescriptorSizeAt(long index, long value) { samplerDescriptorSize(this.segment(), index, value); return this; }

        /// {@return `combinedImageSamplerDescriptorSize` at the given index}
        /// @param index the index of the struct buffer
        public long combinedImageSamplerDescriptorSizeAt(long index) { return combinedImageSamplerDescriptorSize(this.segment(), index); }
        /// Sets `combinedImageSamplerDescriptorSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer combinedImageSamplerDescriptorSizeAt(long index, long value) { combinedImageSamplerDescriptorSize(this.segment(), index, value); return this; }

        /// {@return `sampledImageDescriptorSize` at the given index}
        /// @param index the index of the struct buffer
        public long sampledImageDescriptorSizeAt(long index) { return sampledImageDescriptorSize(this.segment(), index); }
        /// Sets `sampledImageDescriptorSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sampledImageDescriptorSizeAt(long index, long value) { sampledImageDescriptorSize(this.segment(), index, value); return this; }

        /// {@return `storageImageDescriptorSize` at the given index}
        /// @param index the index of the struct buffer
        public long storageImageDescriptorSizeAt(long index) { return storageImageDescriptorSize(this.segment(), index); }
        /// Sets `storageImageDescriptorSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer storageImageDescriptorSizeAt(long index, long value) { storageImageDescriptorSize(this.segment(), index, value); return this; }

        /// {@return `uniformTexelBufferDescriptorSize` at the given index}
        /// @param index the index of the struct buffer
        public long uniformTexelBufferDescriptorSizeAt(long index) { return uniformTexelBufferDescriptorSize(this.segment(), index); }
        /// Sets `uniformTexelBufferDescriptorSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer uniformTexelBufferDescriptorSizeAt(long index, long value) { uniformTexelBufferDescriptorSize(this.segment(), index, value); return this; }

        /// {@return `robustUniformTexelBufferDescriptorSize` at the given index}
        /// @param index the index of the struct buffer
        public long robustUniformTexelBufferDescriptorSizeAt(long index) { return robustUniformTexelBufferDescriptorSize(this.segment(), index); }
        /// Sets `robustUniformTexelBufferDescriptorSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer robustUniformTexelBufferDescriptorSizeAt(long index, long value) { robustUniformTexelBufferDescriptorSize(this.segment(), index, value); return this; }

        /// {@return `storageTexelBufferDescriptorSize` at the given index}
        /// @param index the index of the struct buffer
        public long storageTexelBufferDescriptorSizeAt(long index) { return storageTexelBufferDescriptorSize(this.segment(), index); }
        /// Sets `storageTexelBufferDescriptorSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer storageTexelBufferDescriptorSizeAt(long index, long value) { storageTexelBufferDescriptorSize(this.segment(), index, value); return this; }

        /// {@return `robustStorageTexelBufferDescriptorSize` at the given index}
        /// @param index the index of the struct buffer
        public long robustStorageTexelBufferDescriptorSizeAt(long index) { return robustStorageTexelBufferDescriptorSize(this.segment(), index); }
        /// Sets `robustStorageTexelBufferDescriptorSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer robustStorageTexelBufferDescriptorSizeAt(long index, long value) { robustStorageTexelBufferDescriptorSize(this.segment(), index, value); return this; }

        /// {@return `uniformBufferDescriptorSize` at the given index}
        /// @param index the index of the struct buffer
        public long uniformBufferDescriptorSizeAt(long index) { return uniformBufferDescriptorSize(this.segment(), index); }
        /// Sets `uniformBufferDescriptorSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer uniformBufferDescriptorSizeAt(long index, long value) { uniformBufferDescriptorSize(this.segment(), index, value); return this; }

        /// {@return `robustUniformBufferDescriptorSize` at the given index}
        /// @param index the index of the struct buffer
        public long robustUniformBufferDescriptorSizeAt(long index) { return robustUniformBufferDescriptorSize(this.segment(), index); }
        /// Sets `robustUniformBufferDescriptorSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer robustUniformBufferDescriptorSizeAt(long index, long value) { robustUniformBufferDescriptorSize(this.segment(), index, value); return this; }

        /// {@return `storageBufferDescriptorSize` at the given index}
        /// @param index the index of the struct buffer
        public long storageBufferDescriptorSizeAt(long index) { return storageBufferDescriptorSize(this.segment(), index); }
        /// Sets `storageBufferDescriptorSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer storageBufferDescriptorSizeAt(long index, long value) { storageBufferDescriptorSize(this.segment(), index, value); return this; }

        /// {@return `robustStorageBufferDescriptorSize` at the given index}
        /// @param index the index of the struct buffer
        public long robustStorageBufferDescriptorSizeAt(long index) { return robustStorageBufferDescriptorSize(this.segment(), index); }
        /// Sets `robustStorageBufferDescriptorSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer robustStorageBufferDescriptorSizeAt(long index, long value) { robustStorageBufferDescriptorSize(this.segment(), index, value); return this; }

        /// {@return `inputAttachmentDescriptorSize` at the given index}
        /// @param index the index of the struct buffer
        public long inputAttachmentDescriptorSizeAt(long index) { return inputAttachmentDescriptorSize(this.segment(), index); }
        /// Sets `inputAttachmentDescriptorSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer inputAttachmentDescriptorSizeAt(long index, long value) { inputAttachmentDescriptorSize(this.segment(), index, value); return this; }

        /// {@return `accelerationStructureDescriptorSize` at the given index}
        /// @param index the index of the struct buffer
        public long accelerationStructureDescriptorSizeAt(long index) { return accelerationStructureDescriptorSize(this.segment(), index); }
        /// Sets `accelerationStructureDescriptorSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer accelerationStructureDescriptorSizeAt(long index, long value) { accelerationStructureDescriptorSize(this.segment(), index, value); return this; }

        /// {@return `maxSamplerDescriptorBufferRange` at the given index}
        /// @param index the index of the struct buffer
        public long maxSamplerDescriptorBufferRangeAt(long index) { return maxSamplerDescriptorBufferRange(this.segment(), index); }
        /// Sets `maxSamplerDescriptorBufferRange` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxSamplerDescriptorBufferRangeAt(long index, long value) { maxSamplerDescriptorBufferRange(this.segment(), index, value); return this; }

        /// {@return `maxResourceDescriptorBufferRange` at the given index}
        /// @param index the index of the struct buffer
        public long maxResourceDescriptorBufferRangeAt(long index) { return maxResourceDescriptorBufferRange(this.segment(), index); }
        /// Sets `maxResourceDescriptorBufferRange` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxResourceDescriptorBufferRangeAt(long index, long value) { maxResourceDescriptorBufferRange(this.segment(), index, value); return this; }

        /// {@return `samplerDescriptorBufferAddressSpaceSize` at the given index}
        /// @param index the index of the struct buffer
        public long samplerDescriptorBufferAddressSpaceSizeAt(long index) { return samplerDescriptorBufferAddressSpaceSize(this.segment(), index); }
        /// Sets `samplerDescriptorBufferAddressSpaceSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer samplerDescriptorBufferAddressSpaceSizeAt(long index, long value) { samplerDescriptorBufferAddressSpaceSize(this.segment(), index, value); return this; }

        /// {@return `resourceDescriptorBufferAddressSpaceSize` at the given index}
        /// @param index the index of the struct buffer
        public long resourceDescriptorBufferAddressSpaceSizeAt(long index) { return resourceDescriptorBufferAddressSpaceSize(this.segment(), index); }
        /// Sets `resourceDescriptorBufferAddressSpaceSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer resourceDescriptorBufferAddressSpaceSizeAt(long index, long value) { resourceDescriptorBufferAddressSpaceSize(this.segment(), index, value); return this; }

        /// {@return `descriptorBufferAddressSpaceSize` at the given index}
        /// @param index the index of the struct buffer
        public long descriptorBufferAddressSpaceSizeAt(long index) { return descriptorBufferAddressSpaceSize(this.segment(), index); }
        /// Sets `descriptorBufferAddressSpaceSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBufferAddressSpaceSizeAt(long index, long value) { descriptorBufferAddressSpaceSize(this.segment(), index, value); return this; }

    }
}

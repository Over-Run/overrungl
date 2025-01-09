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
/// ### combinedImageSamplerDescriptorSingleArray
/// [VarHandle][#VH_combinedImageSamplerDescriptorSingleArray] - [Getter][#combinedImageSamplerDescriptorSingleArray()] - [Setter][#combinedImageSamplerDescriptorSingleArray(int)]
/// ### bufferlessPushDescriptors
/// [VarHandle][#VH_bufferlessPushDescriptors] - [Getter][#bufferlessPushDescriptors()] - [Setter][#bufferlessPushDescriptors(int)]
/// ### allowSamplerImageViewPostSubmitCreation
/// [VarHandle][#VH_allowSamplerImageViewPostSubmitCreation] - [Getter][#allowSamplerImageViewPostSubmitCreation()] - [Setter][#allowSamplerImageViewPostSubmitCreation(int)]
/// ### descriptorBufferOffsetAlignment
/// [VarHandle][#VH_descriptorBufferOffsetAlignment] - [Getter][#descriptorBufferOffsetAlignment()] - [Setter][#descriptorBufferOffsetAlignment(long)]
/// ### maxDescriptorBufferBindings
/// [VarHandle][#VH_maxDescriptorBufferBindings] - [Getter][#maxDescriptorBufferBindings()] - [Setter][#maxDescriptorBufferBindings(int)]
/// ### maxResourceDescriptorBufferBindings
/// [VarHandle][#VH_maxResourceDescriptorBufferBindings] - [Getter][#maxResourceDescriptorBufferBindings()] - [Setter][#maxResourceDescriptorBufferBindings(int)]
/// ### maxSamplerDescriptorBufferBindings
/// [VarHandle][#VH_maxSamplerDescriptorBufferBindings] - [Getter][#maxSamplerDescriptorBufferBindings()] - [Setter][#maxSamplerDescriptorBufferBindings(int)]
/// ### maxEmbeddedImmutableSamplerBindings
/// [VarHandle][#VH_maxEmbeddedImmutableSamplerBindings] - [Getter][#maxEmbeddedImmutableSamplerBindings()] - [Setter][#maxEmbeddedImmutableSamplerBindings(int)]
/// ### maxEmbeddedImmutableSamplers
/// [VarHandle][#VH_maxEmbeddedImmutableSamplers] - [Getter][#maxEmbeddedImmutableSamplers()] - [Setter][#maxEmbeddedImmutableSamplers(int)]
/// ### bufferCaptureReplayDescriptorDataSize
/// [VarHandle][#VH_bufferCaptureReplayDescriptorDataSize] - [Getter][#bufferCaptureReplayDescriptorDataSize()] - [Setter][#bufferCaptureReplayDescriptorDataSize(long)]
/// ### imageCaptureReplayDescriptorDataSize
/// [VarHandle][#VH_imageCaptureReplayDescriptorDataSize] - [Getter][#imageCaptureReplayDescriptorDataSize()] - [Setter][#imageCaptureReplayDescriptorDataSize(long)]
/// ### imageViewCaptureReplayDescriptorDataSize
/// [VarHandle][#VH_imageViewCaptureReplayDescriptorDataSize] - [Getter][#imageViewCaptureReplayDescriptorDataSize()] - [Setter][#imageViewCaptureReplayDescriptorDataSize(long)]
/// ### samplerCaptureReplayDescriptorDataSize
/// [VarHandle][#VH_samplerCaptureReplayDescriptorDataSize] - [Getter][#samplerCaptureReplayDescriptorDataSize()] - [Setter][#samplerCaptureReplayDescriptorDataSize(long)]
/// ### accelerationStructureCaptureReplayDescriptorDataSize
/// [VarHandle][#VH_accelerationStructureCaptureReplayDescriptorDataSize] - [Getter][#accelerationStructureCaptureReplayDescriptorDataSize()] - [Setter][#accelerationStructureCaptureReplayDescriptorDataSize(long)]
/// ### samplerDescriptorSize
/// [VarHandle][#VH_samplerDescriptorSize] - [Getter][#samplerDescriptorSize()] - [Setter][#samplerDescriptorSize(long)]
/// ### combinedImageSamplerDescriptorSize
/// [VarHandle][#VH_combinedImageSamplerDescriptorSize] - [Getter][#combinedImageSamplerDescriptorSize()] - [Setter][#combinedImageSamplerDescriptorSize(long)]
/// ### sampledImageDescriptorSize
/// [VarHandle][#VH_sampledImageDescriptorSize] - [Getter][#sampledImageDescriptorSize()] - [Setter][#sampledImageDescriptorSize(long)]
/// ### storageImageDescriptorSize
/// [VarHandle][#VH_storageImageDescriptorSize] - [Getter][#storageImageDescriptorSize()] - [Setter][#storageImageDescriptorSize(long)]
/// ### uniformTexelBufferDescriptorSize
/// [VarHandle][#VH_uniformTexelBufferDescriptorSize] - [Getter][#uniformTexelBufferDescriptorSize()] - [Setter][#uniformTexelBufferDescriptorSize(long)]
/// ### robustUniformTexelBufferDescriptorSize
/// [VarHandle][#VH_robustUniformTexelBufferDescriptorSize] - [Getter][#robustUniformTexelBufferDescriptorSize()] - [Setter][#robustUniformTexelBufferDescriptorSize(long)]
/// ### storageTexelBufferDescriptorSize
/// [VarHandle][#VH_storageTexelBufferDescriptorSize] - [Getter][#storageTexelBufferDescriptorSize()] - [Setter][#storageTexelBufferDescriptorSize(long)]
/// ### robustStorageTexelBufferDescriptorSize
/// [VarHandle][#VH_robustStorageTexelBufferDescriptorSize] - [Getter][#robustStorageTexelBufferDescriptorSize()] - [Setter][#robustStorageTexelBufferDescriptorSize(long)]
/// ### uniformBufferDescriptorSize
/// [VarHandle][#VH_uniformBufferDescriptorSize] - [Getter][#uniformBufferDescriptorSize()] - [Setter][#uniformBufferDescriptorSize(long)]
/// ### robustUniformBufferDescriptorSize
/// [VarHandle][#VH_robustUniformBufferDescriptorSize] - [Getter][#robustUniformBufferDescriptorSize()] - [Setter][#robustUniformBufferDescriptorSize(long)]
/// ### storageBufferDescriptorSize
/// [VarHandle][#VH_storageBufferDescriptorSize] - [Getter][#storageBufferDescriptorSize()] - [Setter][#storageBufferDescriptorSize(long)]
/// ### robustStorageBufferDescriptorSize
/// [VarHandle][#VH_robustStorageBufferDescriptorSize] - [Getter][#robustStorageBufferDescriptorSize()] - [Setter][#robustStorageBufferDescriptorSize(long)]
/// ### inputAttachmentDescriptorSize
/// [VarHandle][#VH_inputAttachmentDescriptorSize] - [Getter][#inputAttachmentDescriptorSize()] - [Setter][#inputAttachmentDescriptorSize(long)]
/// ### accelerationStructureDescriptorSize
/// [VarHandle][#VH_accelerationStructureDescriptorSize] - [Getter][#accelerationStructureDescriptorSize()] - [Setter][#accelerationStructureDescriptorSize(long)]
/// ### maxSamplerDescriptorBufferRange
/// [VarHandle][#VH_maxSamplerDescriptorBufferRange] - [Getter][#maxSamplerDescriptorBufferRange()] - [Setter][#maxSamplerDescriptorBufferRange(long)]
/// ### maxResourceDescriptorBufferRange
/// [VarHandle][#VH_maxResourceDescriptorBufferRange] - [Getter][#maxResourceDescriptorBufferRange()] - [Setter][#maxResourceDescriptorBufferRange(long)]
/// ### samplerDescriptorBufferAddressSpaceSize
/// [VarHandle][#VH_samplerDescriptorBufferAddressSpaceSize] - [Getter][#samplerDescriptorBufferAddressSpaceSize()] - [Setter][#samplerDescriptorBufferAddressSpaceSize(long)]
/// ### resourceDescriptorBufferAddressSpaceSize
/// [VarHandle][#VH_resourceDescriptorBufferAddressSpaceSize] - [Getter][#resourceDescriptorBufferAddressSpaceSize()] - [Setter][#resourceDescriptorBufferAddressSpaceSize(long)]
/// ### descriptorBufferAddressSpaceSize
/// [VarHandle][#VH_descriptorBufferAddressSpaceSize] - [Getter][#descriptorBufferAddressSpaceSize()] - [Setter][#descriptorBufferAddressSpaceSize(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDescriptorBufferPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
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
/// } VkPhysicalDeviceDescriptorBufferPropertiesEXT;
/// ```
public final class VkPhysicalDeviceDescriptorBufferPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceDescriptorBufferPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
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
        ValueLayout.JAVA_LONG.withName("bufferCaptureReplayDescriptorDataSize"),
        ValueLayout.JAVA_LONG.withName("imageCaptureReplayDescriptorDataSize"),
        ValueLayout.JAVA_LONG.withName("imageViewCaptureReplayDescriptorDataSize"),
        ValueLayout.JAVA_LONG.withName("samplerCaptureReplayDescriptorDataSize"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureCaptureReplayDescriptorDataSize"),
        ValueLayout.JAVA_LONG.withName("samplerDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("combinedImageSamplerDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("sampledImageDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("storageImageDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("uniformTexelBufferDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("robustUniformTexelBufferDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("storageTexelBufferDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("robustStorageTexelBufferDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("uniformBufferDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("robustUniformBufferDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("storageBufferDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("robustStorageBufferDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("inputAttachmentDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("maxSamplerDescriptorBufferRange"),
        ValueLayout.JAVA_LONG.withName("maxResourceDescriptorBufferRange"),
        ValueLayout.JAVA_LONG.withName("samplerDescriptorBufferAddressSpaceSize"),
        ValueLayout.JAVA_LONG.withName("resourceDescriptorBufferAddressSpaceSize"),
        ValueLayout.JAVA_LONG.withName("descriptorBufferAddressSpaceSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `combinedImageSamplerDescriptorSingleArray` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_combinedImageSamplerDescriptorSingleArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinedImageSamplerDescriptorSingleArray"));
    /// The [VarHandle] of `bufferlessPushDescriptors` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferlessPushDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferlessPushDescriptors"));
    /// The [VarHandle] of `allowSamplerImageViewPostSubmitCreation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_allowSamplerImageViewPostSubmitCreation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allowSamplerImageViewPostSubmitCreation"));
    /// The [VarHandle] of `descriptorBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_descriptorBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferOffsetAlignment"));
    /// The [VarHandle] of `maxDescriptorBufferBindings` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorBufferBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorBufferBindings"));
    /// The [VarHandle] of `maxResourceDescriptorBufferBindings` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxResourceDescriptorBufferBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxResourceDescriptorBufferBindings"));
    /// The [VarHandle] of `maxSamplerDescriptorBufferBindings` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSamplerDescriptorBufferBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerDescriptorBufferBindings"));
    /// The [VarHandle] of `maxEmbeddedImmutableSamplerBindings` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxEmbeddedImmutableSamplerBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxEmbeddedImmutableSamplerBindings"));
    /// The [VarHandle] of `maxEmbeddedImmutableSamplers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxEmbeddedImmutableSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxEmbeddedImmutableSamplers"));
    /// The [VarHandle] of `bufferCaptureReplayDescriptorDataSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_bufferCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCaptureReplayDescriptorDataSize"));
    /// The [VarHandle] of `imageCaptureReplayDescriptorDataSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_imageCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCaptureReplayDescriptorDataSize"));
    /// The [VarHandle] of `imageViewCaptureReplayDescriptorDataSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_imageViewCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewCaptureReplayDescriptorDataSize"));
    /// The [VarHandle] of `samplerCaptureReplayDescriptorDataSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_samplerCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerCaptureReplayDescriptorDataSize"));
    /// The [VarHandle] of `accelerationStructureCaptureReplayDescriptorDataSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_accelerationStructureCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureCaptureReplayDescriptorDataSize"));
    /// The [VarHandle] of `samplerDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_samplerDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerDescriptorSize"));
    /// The [VarHandle] of `combinedImageSamplerDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_combinedImageSamplerDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinedImageSamplerDescriptorSize"));
    /// The [VarHandle] of `sampledImageDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_sampledImageDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageDescriptorSize"));
    /// The [VarHandle] of `storageImageDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_storageImageDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageImageDescriptorSize"));
    /// The [VarHandle] of `uniformTexelBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_uniformTexelBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferDescriptorSize"));
    /// The [VarHandle] of `robustUniformTexelBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_robustUniformTexelBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustUniformTexelBufferDescriptorSize"));
    /// The [VarHandle] of `storageTexelBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_storageTexelBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferDescriptorSize"));
    /// The [VarHandle] of `robustStorageTexelBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_robustStorageTexelBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustStorageTexelBufferDescriptorSize"));
    /// The [VarHandle] of `uniformBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_uniformBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformBufferDescriptorSize"));
    /// The [VarHandle] of `robustUniformBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_robustUniformBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustUniformBufferDescriptorSize"));
    /// The [VarHandle] of `storageBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_storageBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBufferDescriptorSize"));
    /// The [VarHandle] of `robustStorageBufferDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_robustStorageBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustStorageBufferDescriptorSize"));
    /// The [VarHandle] of `inputAttachmentDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_inputAttachmentDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputAttachmentDescriptorSize"));
    /// The [VarHandle] of `accelerationStructureDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_accelerationStructureDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureDescriptorSize"));
    /// The [VarHandle] of `maxSamplerDescriptorBufferRange` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxSamplerDescriptorBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerDescriptorBufferRange"));
    /// The [VarHandle] of `maxResourceDescriptorBufferRange` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxResourceDescriptorBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxResourceDescriptorBufferRange"));
    /// The [VarHandle] of `samplerDescriptorBufferAddressSpaceSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_samplerDescriptorBufferAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerDescriptorBufferAddressSpaceSize"));
    /// The [VarHandle] of `resourceDescriptorBufferAddressSpaceSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_resourceDescriptorBufferAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceDescriptorBufferAddressSpaceSize"));
    /// The [VarHandle] of `descriptorBufferAddressSpaceSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_descriptorBufferAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferAddressSpaceSize"));

    /// Creates `VkPhysicalDeviceDescriptorBufferPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDescriptorBufferPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceDescriptorBufferPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDescriptorBufferPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceDescriptorBufferPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDescriptorBufferPropertiesEXT`
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDescriptorBufferPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDescriptorBufferPropertiesEXT`
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `combinedImageSamplerDescriptorSingleArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_combinedImageSamplerDescriptorSingleArray(MemorySegment segment, long index) { return (int) VH_combinedImageSamplerDescriptorSingleArray.get(segment, 0L, index); }
    /// {@return `combinedImageSamplerDescriptorSingleArray`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_combinedImageSamplerDescriptorSingleArray(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_combinedImageSamplerDescriptorSingleArray(segment, 0L); }
    /// {@return `combinedImageSamplerDescriptorSingleArray` at the given index}
    /// @param index the index
    public @CType("VkBool32") int combinedImageSamplerDescriptorSingleArrayAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_combinedImageSamplerDescriptorSingleArray(this.segment(), index); }
    /// {@return `combinedImageSamplerDescriptorSingleArray`}
    public @CType("VkBool32") int combinedImageSamplerDescriptorSingleArray() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_combinedImageSamplerDescriptorSingleArray(this.segment()); }
    /// Sets `combinedImageSamplerDescriptorSingleArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_combinedImageSamplerDescriptorSingleArray(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_combinedImageSamplerDescriptorSingleArray.set(segment, 0L, index, value); }
    /// Sets `combinedImageSamplerDescriptorSingleArray` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_combinedImageSamplerDescriptorSingleArray(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_combinedImageSamplerDescriptorSingleArray(segment, 0L, value); }
    /// Sets `combinedImageSamplerDescriptorSingleArray` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT combinedImageSamplerDescriptorSingleArrayAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_combinedImageSamplerDescriptorSingleArray(this.segment(), index, value); return this; }
    /// Sets `combinedImageSamplerDescriptorSingleArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT combinedImageSamplerDescriptorSingleArray(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_combinedImageSamplerDescriptorSingleArray(this.segment(), value); return this; }

    /// {@return `bufferlessPushDescriptors` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_bufferlessPushDescriptors(MemorySegment segment, long index) { return (int) VH_bufferlessPushDescriptors.get(segment, 0L, index); }
    /// {@return `bufferlessPushDescriptors`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_bufferlessPushDescriptors(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_bufferlessPushDescriptors(segment, 0L); }
    /// {@return `bufferlessPushDescriptors` at the given index}
    /// @param index the index
    public @CType("VkBool32") int bufferlessPushDescriptorsAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_bufferlessPushDescriptors(this.segment(), index); }
    /// {@return `bufferlessPushDescriptors`}
    public @CType("VkBool32") int bufferlessPushDescriptors() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_bufferlessPushDescriptors(this.segment()); }
    /// Sets `bufferlessPushDescriptors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferlessPushDescriptors(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_bufferlessPushDescriptors.set(segment, 0L, index, value); }
    /// Sets `bufferlessPushDescriptors` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferlessPushDescriptors(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_bufferlessPushDescriptors(segment, 0L, value); }
    /// Sets `bufferlessPushDescriptors` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT bufferlessPushDescriptorsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_bufferlessPushDescriptors(this.segment(), index, value); return this; }
    /// Sets `bufferlessPushDescriptors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT bufferlessPushDescriptors(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_bufferlessPushDescriptors(this.segment(), value); return this; }

    /// {@return `allowSamplerImageViewPostSubmitCreation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_allowSamplerImageViewPostSubmitCreation(MemorySegment segment, long index) { return (int) VH_allowSamplerImageViewPostSubmitCreation.get(segment, 0L, index); }
    /// {@return `allowSamplerImageViewPostSubmitCreation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_allowSamplerImageViewPostSubmitCreation(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_allowSamplerImageViewPostSubmitCreation(segment, 0L); }
    /// {@return `allowSamplerImageViewPostSubmitCreation` at the given index}
    /// @param index the index
    public @CType("VkBool32") int allowSamplerImageViewPostSubmitCreationAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_allowSamplerImageViewPostSubmitCreation(this.segment(), index); }
    /// {@return `allowSamplerImageViewPostSubmitCreation`}
    public @CType("VkBool32") int allowSamplerImageViewPostSubmitCreation() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_allowSamplerImageViewPostSubmitCreation(this.segment()); }
    /// Sets `allowSamplerImageViewPostSubmitCreation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_allowSamplerImageViewPostSubmitCreation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_allowSamplerImageViewPostSubmitCreation.set(segment, 0L, index, value); }
    /// Sets `allowSamplerImageViewPostSubmitCreation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_allowSamplerImageViewPostSubmitCreation(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_allowSamplerImageViewPostSubmitCreation(segment, 0L, value); }
    /// Sets `allowSamplerImageViewPostSubmitCreation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT allowSamplerImageViewPostSubmitCreationAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_allowSamplerImageViewPostSubmitCreation(this.segment(), index, value); return this; }
    /// Sets `allowSamplerImageViewPostSubmitCreation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT allowSamplerImageViewPostSubmitCreation(@CType("VkBool32") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_allowSamplerImageViewPostSubmitCreation(this.segment(), value); return this; }

    /// {@return `descriptorBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_descriptorBufferOffsetAlignment(MemorySegment segment, long index) { return (long) VH_descriptorBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `descriptorBufferOffsetAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_descriptorBufferOffsetAlignment(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_descriptorBufferOffsetAlignment(segment, 0L); }
    /// {@return `descriptorBufferOffsetAlignment` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long descriptorBufferOffsetAlignmentAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_descriptorBufferOffsetAlignment(this.segment(), index); }
    /// {@return `descriptorBufferOffsetAlignment`}
    public @CType("VkDeviceSize") long descriptorBufferOffsetAlignment() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_descriptorBufferOffsetAlignment(this.segment()); }
    /// Sets `descriptorBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBufferOffsetAlignment(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_descriptorBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `descriptorBufferOffsetAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBufferOffsetAlignment(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_descriptorBufferOffsetAlignment(segment, 0L, value); }
    /// Sets `descriptorBufferOffsetAlignment` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT descriptorBufferOffsetAlignmentAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_descriptorBufferOffsetAlignment(this.segment(), index, value); return this; }
    /// Sets `descriptorBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT descriptorBufferOffsetAlignment(@CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_descriptorBufferOffsetAlignment(this.segment(), value); return this; }

    /// {@return `maxDescriptorBufferBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorBufferBindings(MemorySegment segment, long index) { return (int) VH_maxDescriptorBufferBindings.get(segment, 0L, index); }
    /// {@return `maxDescriptorBufferBindings`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorBufferBindings(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxDescriptorBufferBindings(segment, 0L); }
    /// {@return `maxDescriptorBufferBindings` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDescriptorBufferBindingsAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxDescriptorBufferBindings(this.segment(), index); }
    /// {@return `maxDescriptorBufferBindings`}
    public @CType("uint32_t") int maxDescriptorBufferBindings() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxDescriptorBufferBindings(this.segment()); }
    /// Sets `maxDescriptorBufferBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorBufferBindings(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorBufferBindings.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorBufferBindings` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorBufferBindings(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxDescriptorBufferBindings(segment, 0L, value); }
    /// Sets `maxDescriptorBufferBindings` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxDescriptorBufferBindingsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxDescriptorBufferBindings(this.segment(), index, value); return this; }
    /// Sets `maxDescriptorBufferBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxDescriptorBufferBindings(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxDescriptorBufferBindings(this.segment(), value); return this; }

    /// {@return `maxResourceDescriptorBufferBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxResourceDescriptorBufferBindings(MemorySegment segment, long index) { return (int) VH_maxResourceDescriptorBufferBindings.get(segment, 0L, index); }
    /// {@return `maxResourceDescriptorBufferBindings`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxResourceDescriptorBufferBindings(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxResourceDescriptorBufferBindings(segment, 0L); }
    /// {@return `maxResourceDescriptorBufferBindings` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxResourceDescriptorBufferBindingsAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxResourceDescriptorBufferBindings(this.segment(), index); }
    /// {@return `maxResourceDescriptorBufferBindings`}
    public @CType("uint32_t") int maxResourceDescriptorBufferBindings() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxResourceDescriptorBufferBindings(this.segment()); }
    /// Sets `maxResourceDescriptorBufferBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxResourceDescriptorBufferBindings(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxResourceDescriptorBufferBindings.set(segment, 0L, index, value); }
    /// Sets `maxResourceDescriptorBufferBindings` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxResourceDescriptorBufferBindings(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxResourceDescriptorBufferBindings(segment, 0L, value); }
    /// Sets `maxResourceDescriptorBufferBindings` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxResourceDescriptorBufferBindingsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxResourceDescriptorBufferBindings(this.segment(), index, value); return this; }
    /// Sets `maxResourceDescriptorBufferBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxResourceDescriptorBufferBindings(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxResourceDescriptorBufferBindings(this.segment(), value); return this; }

    /// {@return `maxSamplerDescriptorBufferBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSamplerDescriptorBufferBindings(MemorySegment segment, long index) { return (int) VH_maxSamplerDescriptorBufferBindings.get(segment, 0L, index); }
    /// {@return `maxSamplerDescriptorBufferBindings`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSamplerDescriptorBufferBindings(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxSamplerDescriptorBufferBindings(segment, 0L); }
    /// {@return `maxSamplerDescriptorBufferBindings` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxSamplerDescriptorBufferBindingsAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxSamplerDescriptorBufferBindings(this.segment(), index); }
    /// {@return `maxSamplerDescriptorBufferBindings`}
    public @CType("uint32_t") int maxSamplerDescriptorBufferBindings() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxSamplerDescriptorBufferBindings(this.segment()); }
    /// Sets `maxSamplerDescriptorBufferBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSamplerDescriptorBufferBindings(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSamplerDescriptorBufferBindings.set(segment, 0L, index, value); }
    /// Sets `maxSamplerDescriptorBufferBindings` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSamplerDescriptorBufferBindings(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxSamplerDescriptorBufferBindings(segment, 0L, value); }
    /// Sets `maxSamplerDescriptorBufferBindings` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxSamplerDescriptorBufferBindingsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxSamplerDescriptorBufferBindings(this.segment(), index, value); return this; }
    /// Sets `maxSamplerDescriptorBufferBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxSamplerDescriptorBufferBindings(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxSamplerDescriptorBufferBindings(this.segment(), value); return this; }

    /// {@return `maxEmbeddedImmutableSamplerBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxEmbeddedImmutableSamplerBindings(MemorySegment segment, long index) { return (int) VH_maxEmbeddedImmutableSamplerBindings.get(segment, 0L, index); }
    /// {@return `maxEmbeddedImmutableSamplerBindings`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxEmbeddedImmutableSamplerBindings(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxEmbeddedImmutableSamplerBindings(segment, 0L); }
    /// {@return `maxEmbeddedImmutableSamplerBindings` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxEmbeddedImmutableSamplerBindingsAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxEmbeddedImmutableSamplerBindings(this.segment(), index); }
    /// {@return `maxEmbeddedImmutableSamplerBindings`}
    public @CType("uint32_t") int maxEmbeddedImmutableSamplerBindings() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxEmbeddedImmutableSamplerBindings(this.segment()); }
    /// Sets `maxEmbeddedImmutableSamplerBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxEmbeddedImmutableSamplerBindings(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxEmbeddedImmutableSamplerBindings.set(segment, 0L, index, value); }
    /// Sets `maxEmbeddedImmutableSamplerBindings` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxEmbeddedImmutableSamplerBindings(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxEmbeddedImmutableSamplerBindings(segment, 0L, value); }
    /// Sets `maxEmbeddedImmutableSamplerBindings` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxEmbeddedImmutableSamplerBindingsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxEmbeddedImmutableSamplerBindings(this.segment(), index, value); return this; }
    /// Sets `maxEmbeddedImmutableSamplerBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxEmbeddedImmutableSamplerBindings(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxEmbeddedImmutableSamplerBindings(this.segment(), value); return this; }

    /// {@return `maxEmbeddedImmutableSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxEmbeddedImmutableSamplers(MemorySegment segment, long index) { return (int) VH_maxEmbeddedImmutableSamplers.get(segment, 0L, index); }
    /// {@return `maxEmbeddedImmutableSamplers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxEmbeddedImmutableSamplers(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxEmbeddedImmutableSamplers(segment, 0L); }
    /// {@return `maxEmbeddedImmutableSamplers` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxEmbeddedImmutableSamplersAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxEmbeddedImmutableSamplers(this.segment(), index); }
    /// {@return `maxEmbeddedImmutableSamplers`}
    public @CType("uint32_t") int maxEmbeddedImmutableSamplers() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxEmbeddedImmutableSamplers(this.segment()); }
    /// Sets `maxEmbeddedImmutableSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxEmbeddedImmutableSamplers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxEmbeddedImmutableSamplers.set(segment, 0L, index, value); }
    /// Sets `maxEmbeddedImmutableSamplers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxEmbeddedImmutableSamplers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxEmbeddedImmutableSamplers(segment, 0L, value); }
    /// Sets `maxEmbeddedImmutableSamplers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxEmbeddedImmutableSamplersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxEmbeddedImmutableSamplers(this.segment(), index, value); return this; }
    /// Sets `maxEmbeddedImmutableSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxEmbeddedImmutableSamplers(@CType("uint32_t") int value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxEmbeddedImmutableSamplers(this.segment(), value); return this; }

    /// {@return `bufferCaptureReplayDescriptorDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_bufferCaptureReplayDescriptorDataSize(MemorySegment segment, long index) { return (long) VH_bufferCaptureReplayDescriptorDataSize.get(segment, 0L, index); }
    /// {@return `bufferCaptureReplayDescriptorDataSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_bufferCaptureReplayDescriptorDataSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_bufferCaptureReplayDescriptorDataSize(segment, 0L); }
    /// {@return `bufferCaptureReplayDescriptorDataSize` at the given index}
    /// @param index the index
    public @CType("size_t") long bufferCaptureReplayDescriptorDataSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_bufferCaptureReplayDescriptorDataSize(this.segment(), index); }
    /// {@return `bufferCaptureReplayDescriptorDataSize`}
    public @CType("size_t") long bufferCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_bufferCaptureReplayDescriptorDataSize(this.segment()); }
    /// Sets `bufferCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferCaptureReplayDescriptorDataSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_bufferCaptureReplayDescriptorDataSize.set(segment, 0L, index, value); }
    /// Sets `bufferCaptureReplayDescriptorDataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferCaptureReplayDescriptorDataSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_bufferCaptureReplayDescriptorDataSize(segment, 0L, value); }
    /// Sets `bufferCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT bufferCaptureReplayDescriptorDataSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_bufferCaptureReplayDescriptorDataSize(this.segment(), index, value); return this; }
    /// Sets `bufferCaptureReplayDescriptorDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT bufferCaptureReplayDescriptorDataSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_bufferCaptureReplayDescriptorDataSize(this.segment(), value); return this; }

    /// {@return `imageCaptureReplayDescriptorDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_imageCaptureReplayDescriptorDataSize(MemorySegment segment, long index) { return (long) VH_imageCaptureReplayDescriptorDataSize.get(segment, 0L, index); }
    /// {@return `imageCaptureReplayDescriptorDataSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_imageCaptureReplayDescriptorDataSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_imageCaptureReplayDescriptorDataSize(segment, 0L); }
    /// {@return `imageCaptureReplayDescriptorDataSize` at the given index}
    /// @param index the index
    public @CType("size_t") long imageCaptureReplayDescriptorDataSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_imageCaptureReplayDescriptorDataSize(this.segment(), index); }
    /// {@return `imageCaptureReplayDescriptorDataSize`}
    public @CType("size_t") long imageCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_imageCaptureReplayDescriptorDataSize(this.segment()); }
    /// Sets `imageCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageCaptureReplayDescriptorDataSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_imageCaptureReplayDescriptorDataSize.set(segment, 0L, index, value); }
    /// Sets `imageCaptureReplayDescriptorDataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageCaptureReplayDescriptorDataSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_imageCaptureReplayDescriptorDataSize(segment, 0L, value); }
    /// Sets `imageCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT imageCaptureReplayDescriptorDataSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_imageCaptureReplayDescriptorDataSize(this.segment(), index, value); return this; }
    /// Sets `imageCaptureReplayDescriptorDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT imageCaptureReplayDescriptorDataSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_imageCaptureReplayDescriptorDataSize(this.segment(), value); return this; }

    /// {@return `imageViewCaptureReplayDescriptorDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_imageViewCaptureReplayDescriptorDataSize(MemorySegment segment, long index) { return (long) VH_imageViewCaptureReplayDescriptorDataSize.get(segment, 0L, index); }
    /// {@return `imageViewCaptureReplayDescriptorDataSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_imageViewCaptureReplayDescriptorDataSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_imageViewCaptureReplayDescriptorDataSize(segment, 0L); }
    /// {@return `imageViewCaptureReplayDescriptorDataSize` at the given index}
    /// @param index the index
    public @CType("size_t") long imageViewCaptureReplayDescriptorDataSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_imageViewCaptureReplayDescriptorDataSize(this.segment(), index); }
    /// {@return `imageViewCaptureReplayDescriptorDataSize`}
    public @CType("size_t") long imageViewCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_imageViewCaptureReplayDescriptorDataSize(this.segment()); }
    /// Sets `imageViewCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageViewCaptureReplayDescriptorDataSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_imageViewCaptureReplayDescriptorDataSize.set(segment, 0L, index, value); }
    /// Sets `imageViewCaptureReplayDescriptorDataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageViewCaptureReplayDescriptorDataSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_imageViewCaptureReplayDescriptorDataSize(segment, 0L, value); }
    /// Sets `imageViewCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT imageViewCaptureReplayDescriptorDataSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_imageViewCaptureReplayDescriptorDataSize(this.segment(), index, value); return this; }
    /// Sets `imageViewCaptureReplayDescriptorDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT imageViewCaptureReplayDescriptorDataSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_imageViewCaptureReplayDescriptorDataSize(this.segment(), value); return this; }

    /// {@return `samplerCaptureReplayDescriptorDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_samplerCaptureReplayDescriptorDataSize(MemorySegment segment, long index) { return (long) VH_samplerCaptureReplayDescriptorDataSize.get(segment, 0L, index); }
    /// {@return `samplerCaptureReplayDescriptorDataSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_samplerCaptureReplayDescriptorDataSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_samplerCaptureReplayDescriptorDataSize(segment, 0L); }
    /// {@return `samplerCaptureReplayDescriptorDataSize` at the given index}
    /// @param index the index
    public @CType("size_t") long samplerCaptureReplayDescriptorDataSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_samplerCaptureReplayDescriptorDataSize(this.segment(), index); }
    /// {@return `samplerCaptureReplayDescriptorDataSize`}
    public @CType("size_t") long samplerCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_samplerCaptureReplayDescriptorDataSize(this.segment()); }
    /// Sets `samplerCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplerCaptureReplayDescriptorDataSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_samplerCaptureReplayDescriptorDataSize.set(segment, 0L, index, value); }
    /// Sets `samplerCaptureReplayDescriptorDataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplerCaptureReplayDescriptorDataSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_samplerCaptureReplayDescriptorDataSize(segment, 0L, value); }
    /// Sets `samplerCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerCaptureReplayDescriptorDataSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_samplerCaptureReplayDescriptorDataSize(this.segment(), index, value); return this; }
    /// Sets `samplerCaptureReplayDescriptorDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerCaptureReplayDescriptorDataSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_samplerCaptureReplayDescriptorDataSize(this.segment(), value); return this; }

    /// {@return `accelerationStructureCaptureReplayDescriptorDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_accelerationStructureCaptureReplayDescriptorDataSize(MemorySegment segment, long index) { return (long) VH_accelerationStructureCaptureReplayDescriptorDataSize.get(segment, 0L, index); }
    /// {@return `accelerationStructureCaptureReplayDescriptorDataSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_accelerationStructureCaptureReplayDescriptorDataSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_accelerationStructureCaptureReplayDescriptorDataSize(segment, 0L); }
    /// {@return `accelerationStructureCaptureReplayDescriptorDataSize` at the given index}
    /// @param index the index
    public @CType("size_t") long accelerationStructureCaptureReplayDescriptorDataSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_accelerationStructureCaptureReplayDescriptorDataSize(this.segment(), index); }
    /// {@return `accelerationStructureCaptureReplayDescriptorDataSize`}
    public @CType("size_t") long accelerationStructureCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_accelerationStructureCaptureReplayDescriptorDataSize(this.segment()); }
    /// Sets `accelerationStructureCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructureCaptureReplayDescriptorDataSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_accelerationStructureCaptureReplayDescriptorDataSize.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureCaptureReplayDescriptorDataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructureCaptureReplayDescriptorDataSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_accelerationStructureCaptureReplayDescriptorDataSize(segment, 0L, value); }
    /// Sets `accelerationStructureCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT accelerationStructureCaptureReplayDescriptorDataSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_accelerationStructureCaptureReplayDescriptorDataSize(this.segment(), index, value); return this; }
    /// Sets `accelerationStructureCaptureReplayDescriptorDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT accelerationStructureCaptureReplayDescriptorDataSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_accelerationStructureCaptureReplayDescriptorDataSize(this.segment(), value); return this; }

    /// {@return `samplerDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_samplerDescriptorSize(MemorySegment segment, long index) { return (long) VH_samplerDescriptorSize.get(segment, 0L, index); }
    /// {@return `samplerDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_samplerDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_samplerDescriptorSize(segment, 0L); }
    /// {@return `samplerDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long samplerDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_samplerDescriptorSize(this.segment(), index); }
    /// {@return `samplerDescriptorSize`}
    public @CType("size_t") long samplerDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_samplerDescriptorSize(this.segment()); }
    /// Sets `samplerDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplerDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_samplerDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `samplerDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplerDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_samplerDescriptorSize(segment, 0L, value); }
    /// Sets `samplerDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_samplerDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `samplerDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_samplerDescriptorSize(this.segment(), value); return this; }

    /// {@return `combinedImageSamplerDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_combinedImageSamplerDescriptorSize(MemorySegment segment, long index) { return (long) VH_combinedImageSamplerDescriptorSize.get(segment, 0L, index); }
    /// {@return `combinedImageSamplerDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_combinedImageSamplerDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_combinedImageSamplerDescriptorSize(segment, 0L); }
    /// {@return `combinedImageSamplerDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long combinedImageSamplerDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_combinedImageSamplerDescriptorSize(this.segment(), index); }
    /// {@return `combinedImageSamplerDescriptorSize`}
    public @CType("size_t") long combinedImageSamplerDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_combinedImageSamplerDescriptorSize(this.segment()); }
    /// Sets `combinedImageSamplerDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_combinedImageSamplerDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_combinedImageSamplerDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `combinedImageSamplerDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_combinedImageSamplerDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_combinedImageSamplerDescriptorSize(segment, 0L, value); }
    /// Sets `combinedImageSamplerDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT combinedImageSamplerDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_combinedImageSamplerDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `combinedImageSamplerDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT combinedImageSamplerDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_combinedImageSamplerDescriptorSize(this.segment(), value); return this; }

    /// {@return `sampledImageDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_sampledImageDescriptorSize(MemorySegment segment, long index) { return (long) VH_sampledImageDescriptorSize.get(segment, 0L, index); }
    /// {@return `sampledImageDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_sampledImageDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_sampledImageDescriptorSize(segment, 0L); }
    /// {@return `sampledImageDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long sampledImageDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_sampledImageDescriptorSize(this.segment(), index); }
    /// {@return `sampledImageDescriptorSize`}
    public @CType("size_t") long sampledImageDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_sampledImageDescriptorSize(this.segment()); }
    /// Sets `sampledImageDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampledImageDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_sampledImageDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `sampledImageDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampledImageDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_sampledImageDescriptorSize(segment, 0L, value); }
    /// Sets `sampledImageDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sampledImageDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_sampledImageDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `sampledImageDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sampledImageDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_sampledImageDescriptorSize(this.segment(), value); return this; }

    /// {@return `storageImageDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_storageImageDescriptorSize(MemorySegment segment, long index) { return (long) VH_storageImageDescriptorSize.get(segment, 0L, index); }
    /// {@return `storageImageDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_storageImageDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_storageImageDescriptorSize(segment, 0L); }
    /// {@return `storageImageDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long storageImageDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_storageImageDescriptorSize(this.segment(), index); }
    /// {@return `storageImageDescriptorSize`}
    public @CType("size_t") long storageImageDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_storageImageDescriptorSize(this.segment()); }
    /// Sets `storageImageDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageImageDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_storageImageDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `storageImageDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageImageDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_storageImageDescriptorSize(segment, 0L, value); }
    /// Sets `storageImageDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageImageDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_storageImageDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `storageImageDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageImageDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_storageImageDescriptorSize(this.segment(), value); return this; }

    /// {@return `uniformTexelBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_uniformTexelBufferDescriptorSize(MemorySegment segment, long index) { return (long) VH_uniformTexelBufferDescriptorSize.get(segment, 0L, index); }
    /// {@return `uniformTexelBufferDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_uniformTexelBufferDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_uniformTexelBufferDescriptorSize(segment, 0L); }
    /// {@return `uniformTexelBufferDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long uniformTexelBufferDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_uniformTexelBufferDescriptorSize(this.segment(), index); }
    /// {@return `uniformTexelBufferDescriptorSize`}
    public @CType("size_t") long uniformTexelBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_uniformTexelBufferDescriptorSize(this.segment()); }
    /// Sets `uniformTexelBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniformTexelBufferDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_uniformTexelBufferDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `uniformTexelBufferDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniformTexelBufferDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_uniformTexelBufferDescriptorSize(segment, 0L, value); }
    /// Sets `uniformTexelBufferDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT uniformTexelBufferDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_uniformTexelBufferDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `uniformTexelBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT uniformTexelBufferDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_uniformTexelBufferDescriptorSize(this.segment(), value); return this; }

    /// {@return `robustUniformTexelBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_robustUniformTexelBufferDescriptorSize(MemorySegment segment, long index) { return (long) VH_robustUniformTexelBufferDescriptorSize.get(segment, 0L, index); }
    /// {@return `robustUniformTexelBufferDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_robustUniformTexelBufferDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_robustUniformTexelBufferDescriptorSize(segment, 0L); }
    /// {@return `robustUniformTexelBufferDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long robustUniformTexelBufferDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_robustUniformTexelBufferDescriptorSize(this.segment(), index); }
    /// {@return `robustUniformTexelBufferDescriptorSize`}
    public @CType("size_t") long robustUniformTexelBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_robustUniformTexelBufferDescriptorSize(this.segment()); }
    /// Sets `robustUniformTexelBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_robustUniformTexelBufferDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_robustUniformTexelBufferDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `robustUniformTexelBufferDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_robustUniformTexelBufferDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_robustUniformTexelBufferDescriptorSize(segment, 0L, value); }
    /// Sets `robustUniformTexelBufferDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustUniformTexelBufferDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_robustUniformTexelBufferDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `robustUniformTexelBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustUniformTexelBufferDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_robustUniformTexelBufferDescriptorSize(this.segment(), value); return this; }

    /// {@return `storageTexelBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_storageTexelBufferDescriptorSize(MemorySegment segment, long index) { return (long) VH_storageTexelBufferDescriptorSize.get(segment, 0L, index); }
    /// {@return `storageTexelBufferDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_storageTexelBufferDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_storageTexelBufferDescriptorSize(segment, 0L); }
    /// {@return `storageTexelBufferDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long storageTexelBufferDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_storageTexelBufferDescriptorSize(this.segment(), index); }
    /// {@return `storageTexelBufferDescriptorSize`}
    public @CType("size_t") long storageTexelBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_storageTexelBufferDescriptorSize(this.segment()); }
    /// Sets `storageTexelBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageTexelBufferDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_storageTexelBufferDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `storageTexelBufferDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageTexelBufferDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_storageTexelBufferDescriptorSize(segment, 0L, value); }
    /// Sets `storageTexelBufferDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageTexelBufferDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_storageTexelBufferDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `storageTexelBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageTexelBufferDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_storageTexelBufferDescriptorSize(this.segment(), value); return this; }

    /// {@return `robustStorageTexelBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_robustStorageTexelBufferDescriptorSize(MemorySegment segment, long index) { return (long) VH_robustStorageTexelBufferDescriptorSize.get(segment, 0L, index); }
    /// {@return `robustStorageTexelBufferDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_robustStorageTexelBufferDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_robustStorageTexelBufferDescriptorSize(segment, 0L); }
    /// {@return `robustStorageTexelBufferDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long robustStorageTexelBufferDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_robustStorageTexelBufferDescriptorSize(this.segment(), index); }
    /// {@return `robustStorageTexelBufferDescriptorSize`}
    public @CType("size_t") long robustStorageTexelBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_robustStorageTexelBufferDescriptorSize(this.segment()); }
    /// Sets `robustStorageTexelBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_robustStorageTexelBufferDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_robustStorageTexelBufferDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `robustStorageTexelBufferDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_robustStorageTexelBufferDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_robustStorageTexelBufferDescriptorSize(segment, 0L, value); }
    /// Sets `robustStorageTexelBufferDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustStorageTexelBufferDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_robustStorageTexelBufferDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `robustStorageTexelBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustStorageTexelBufferDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_robustStorageTexelBufferDescriptorSize(this.segment(), value); return this; }

    /// {@return `uniformBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_uniformBufferDescriptorSize(MemorySegment segment, long index) { return (long) VH_uniformBufferDescriptorSize.get(segment, 0L, index); }
    /// {@return `uniformBufferDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_uniformBufferDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_uniformBufferDescriptorSize(segment, 0L); }
    /// {@return `uniformBufferDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long uniformBufferDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_uniformBufferDescriptorSize(this.segment(), index); }
    /// {@return `uniformBufferDescriptorSize`}
    public @CType("size_t") long uniformBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_uniformBufferDescriptorSize(this.segment()); }
    /// Sets `uniformBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniformBufferDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_uniformBufferDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `uniformBufferDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniformBufferDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_uniformBufferDescriptorSize(segment, 0L, value); }
    /// Sets `uniformBufferDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT uniformBufferDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_uniformBufferDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `uniformBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT uniformBufferDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_uniformBufferDescriptorSize(this.segment(), value); return this; }

    /// {@return `robustUniformBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_robustUniformBufferDescriptorSize(MemorySegment segment, long index) { return (long) VH_robustUniformBufferDescriptorSize.get(segment, 0L, index); }
    /// {@return `robustUniformBufferDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_robustUniformBufferDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_robustUniformBufferDescriptorSize(segment, 0L); }
    /// {@return `robustUniformBufferDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long robustUniformBufferDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_robustUniformBufferDescriptorSize(this.segment(), index); }
    /// {@return `robustUniformBufferDescriptorSize`}
    public @CType("size_t") long robustUniformBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_robustUniformBufferDescriptorSize(this.segment()); }
    /// Sets `robustUniformBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_robustUniformBufferDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_robustUniformBufferDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `robustUniformBufferDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_robustUniformBufferDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_robustUniformBufferDescriptorSize(segment, 0L, value); }
    /// Sets `robustUniformBufferDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustUniformBufferDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_robustUniformBufferDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `robustUniformBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustUniformBufferDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_robustUniformBufferDescriptorSize(this.segment(), value); return this; }

    /// {@return `storageBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_storageBufferDescriptorSize(MemorySegment segment, long index) { return (long) VH_storageBufferDescriptorSize.get(segment, 0L, index); }
    /// {@return `storageBufferDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_storageBufferDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_storageBufferDescriptorSize(segment, 0L); }
    /// {@return `storageBufferDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long storageBufferDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_storageBufferDescriptorSize(this.segment(), index); }
    /// {@return `storageBufferDescriptorSize`}
    public @CType("size_t") long storageBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_storageBufferDescriptorSize(this.segment()); }
    /// Sets `storageBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageBufferDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_storageBufferDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `storageBufferDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageBufferDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_storageBufferDescriptorSize(segment, 0L, value); }
    /// Sets `storageBufferDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageBufferDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_storageBufferDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `storageBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageBufferDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_storageBufferDescriptorSize(this.segment(), value); return this; }

    /// {@return `robustStorageBufferDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_robustStorageBufferDescriptorSize(MemorySegment segment, long index) { return (long) VH_robustStorageBufferDescriptorSize.get(segment, 0L, index); }
    /// {@return `robustStorageBufferDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_robustStorageBufferDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_robustStorageBufferDescriptorSize(segment, 0L); }
    /// {@return `robustStorageBufferDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long robustStorageBufferDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_robustStorageBufferDescriptorSize(this.segment(), index); }
    /// {@return `robustStorageBufferDescriptorSize`}
    public @CType("size_t") long robustStorageBufferDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_robustStorageBufferDescriptorSize(this.segment()); }
    /// Sets `robustStorageBufferDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_robustStorageBufferDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_robustStorageBufferDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `robustStorageBufferDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_robustStorageBufferDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_robustStorageBufferDescriptorSize(segment, 0L, value); }
    /// Sets `robustStorageBufferDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustStorageBufferDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_robustStorageBufferDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `robustStorageBufferDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustStorageBufferDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_robustStorageBufferDescriptorSize(this.segment(), value); return this; }

    /// {@return `inputAttachmentDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_inputAttachmentDescriptorSize(MemorySegment segment, long index) { return (long) VH_inputAttachmentDescriptorSize.get(segment, 0L, index); }
    /// {@return `inputAttachmentDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_inputAttachmentDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_inputAttachmentDescriptorSize(segment, 0L); }
    /// {@return `inputAttachmentDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long inputAttachmentDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_inputAttachmentDescriptorSize(this.segment(), index); }
    /// {@return `inputAttachmentDescriptorSize`}
    public @CType("size_t") long inputAttachmentDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_inputAttachmentDescriptorSize(this.segment()); }
    /// Sets `inputAttachmentDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_inputAttachmentDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_inputAttachmentDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `inputAttachmentDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_inputAttachmentDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_inputAttachmentDescriptorSize(segment, 0L, value); }
    /// Sets `inputAttachmentDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT inputAttachmentDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_inputAttachmentDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `inputAttachmentDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT inputAttachmentDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_inputAttachmentDescriptorSize(this.segment(), value); return this; }

    /// {@return `accelerationStructureDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_accelerationStructureDescriptorSize(MemorySegment segment, long index) { return (long) VH_accelerationStructureDescriptorSize.get(segment, 0L, index); }
    /// {@return `accelerationStructureDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_accelerationStructureDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_accelerationStructureDescriptorSize(segment, 0L); }
    /// {@return `accelerationStructureDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long accelerationStructureDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_accelerationStructureDescriptorSize(this.segment(), index); }
    /// {@return `accelerationStructureDescriptorSize`}
    public @CType("size_t") long accelerationStructureDescriptorSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_accelerationStructureDescriptorSize(this.segment()); }
    /// Sets `accelerationStructureDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructureDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_accelerationStructureDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructureDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_accelerationStructureDescriptorSize(segment, 0L, value); }
    /// Sets `accelerationStructureDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT accelerationStructureDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_accelerationStructureDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `accelerationStructureDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT accelerationStructureDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_accelerationStructureDescriptorSize(this.segment(), value); return this; }

    /// {@return `maxSamplerDescriptorBufferRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_maxSamplerDescriptorBufferRange(MemorySegment segment, long index) { return (long) VH_maxSamplerDescriptorBufferRange.get(segment, 0L, index); }
    /// {@return `maxSamplerDescriptorBufferRange`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_maxSamplerDescriptorBufferRange(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxSamplerDescriptorBufferRange(segment, 0L); }
    /// {@return `maxSamplerDescriptorBufferRange` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long maxSamplerDescriptorBufferRangeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxSamplerDescriptorBufferRange(this.segment(), index); }
    /// {@return `maxSamplerDescriptorBufferRange`}
    public @CType("VkDeviceSize") long maxSamplerDescriptorBufferRange() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxSamplerDescriptorBufferRange(this.segment()); }
    /// Sets `maxSamplerDescriptorBufferRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSamplerDescriptorBufferRange(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_maxSamplerDescriptorBufferRange.set(segment, 0L, index, value); }
    /// Sets `maxSamplerDescriptorBufferRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSamplerDescriptorBufferRange(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxSamplerDescriptorBufferRange(segment, 0L, value); }
    /// Sets `maxSamplerDescriptorBufferRange` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxSamplerDescriptorBufferRangeAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxSamplerDescriptorBufferRange(this.segment(), index, value); return this; }
    /// Sets `maxSamplerDescriptorBufferRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxSamplerDescriptorBufferRange(@CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxSamplerDescriptorBufferRange(this.segment(), value); return this; }

    /// {@return `maxResourceDescriptorBufferRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_maxResourceDescriptorBufferRange(MemorySegment segment, long index) { return (long) VH_maxResourceDescriptorBufferRange.get(segment, 0L, index); }
    /// {@return `maxResourceDescriptorBufferRange`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_maxResourceDescriptorBufferRange(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxResourceDescriptorBufferRange(segment, 0L); }
    /// {@return `maxResourceDescriptorBufferRange` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long maxResourceDescriptorBufferRangeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxResourceDescriptorBufferRange(this.segment(), index); }
    /// {@return `maxResourceDescriptorBufferRange`}
    public @CType("VkDeviceSize") long maxResourceDescriptorBufferRange() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_maxResourceDescriptorBufferRange(this.segment()); }
    /// Sets `maxResourceDescriptorBufferRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxResourceDescriptorBufferRange(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_maxResourceDescriptorBufferRange.set(segment, 0L, index, value); }
    /// Sets `maxResourceDescriptorBufferRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxResourceDescriptorBufferRange(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxResourceDescriptorBufferRange(segment, 0L, value); }
    /// Sets `maxResourceDescriptorBufferRange` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxResourceDescriptorBufferRangeAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxResourceDescriptorBufferRange(this.segment(), index, value); return this; }
    /// Sets `maxResourceDescriptorBufferRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxResourceDescriptorBufferRange(@CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_maxResourceDescriptorBufferRange(this.segment(), value); return this; }

    /// {@return `samplerDescriptorBufferAddressSpaceSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_samplerDescriptorBufferAddressSpaceSize(MemorySegment segment, long index) { return (long) VH_samplerDescriptorBufferAddressSpaceSize.get(segment, 0L, index); }
    /// {@return `samplerDescriptorBufferAddressSpaceSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_samplerDescriptorBufferAddressSpaceSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_samplerDescriptorBufferAddressSpaceSize(segment, 0L); }
    /// {@return `samplerDescriptorBufferAddressSpaceSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long samplerDescriptorBufferAddressSpaceSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_samplerDescriptorBufferAddressSpaceSize(this.segment(), index); }
    /// {@return `samplerDescriptorBufferAddressSpaceSize`}
    public @CType("VkDeviceSize") long samplerDescriptorBufferAddressSpaceSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_samplerDescriptorBufferAddressSpaceSize(this.segment()); }
    /// Sets `samplerDescriptorBufferAddressSpaceSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplerDescriptorBufferAddressSpaceSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_samplerDescriptorBufferAddressSpaceSize.set(segment, 0L, index, value); }
    /// Sets `samplerDescriptorBufferAddressSpaceSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplerDescriptorBufferAddressSpaceSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_samplerDescriptorBufferAddressSpaceSize(segment, 0L, value); }
    /// Sets `samplerDescriptorBufferAddressSpaceSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerDescriptorBufferAddressSpaceSizeAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_samplerDescriptorBufferAddressSpaceSize(this.segment(), index, value); return this; }
    /// Sets `samplerDescriptorBufferAddressSpaceSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerDescriptorBufferAddressSpaceSize(@CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_samplerDescriptorBufferAddressSpaceSize(this.segment(), value); return this; }

    /// {@return `resourceDescriptorBufferAddressSpaceSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_resourceDescriptorBufferAddressSpaceSize(MemorySegment segment, long index) { return (long) VH_resourceDescriptorBufferAddressSpaceSize.get(segment, 0L, index); }
    /// {@return `resourceDescriptorBufferAddressSpaceSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_resourceDescriptorBufferAddressSpaceSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_resourceDescriptorBufferAddressSpaceSize(segment, 0L); }
    /// {@return `resourceDescriptorBufferAddressSpaceSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long resourceDescriptorBufferAddressSpaceSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_resourceDescriptorBufferAddressSpaceSize(this.segment(), index); }
    /// {@return `resourceDescriptorBufferAddressSpaceSize`}
    public @CType("VkDeviceSize") long resourceDescriptorBufferAddressSpaceSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_resourceDescriptorBufferAddressSpaceSize(this.segment()); }
    /// Sets `resourceDescriptorBufferAddressSpaceSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_resourceDescriptorBufferAddressSpaceSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_resourceDescriptorBufferAddressSpaceSize.set(segment, 0L, index, value); }
    /// Sets `resourceDescriptorBufferAddressSpaceSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_resourceDescriptorBufferAddressSpaceSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_resourceDescriptorBufferAddressSpaceSize(segment, 0L, value); }
    /// Sets `resourceDescriptorBufferAddressSpaceSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT resourceDescriptorBufferAddressSpaceSizeAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_resourceDescriptorBufferAddressSpaceSize(this.segment(), index, value); return this; }
    /// Sets `resourceDescriptorBufferAddressSpaceSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT resourceDescriptorBufferAddressSpaceSize(@CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_resourceDescriptorBufferAddressSpaceSize(this.segment(), value); return this; }

    /// {@return `descriptorBufferAddressSpaceSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_descriptorBufferAddressSpaceSize(MemorySegment segment, long index) { return (long) VH_descriptorBufferAddressSpaceSize.get(segment, 0L, index); }
    /// {@return `descriptorBufferAddressSpaceSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_descriptorBufferAddressSpaceSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_descriptorBufferAddressSpaceSize(segment, 0L); }
    /// {@return `descriptorBufferAddressSpaceSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long descriptorBufferAddressSpaceSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_descriptorBufferAddressSpaceSize(this.segment(), index); }
    /// {@return `descriptorBufferAddressSpaceSize`}
    public @CType("VkDeviceSize") long descriptorBufferAddressSpaceSize() { return VkPhysicalDeviceDescriptorBufferPropertiesEXT.get_descriptorBufferAddressSpaceSize(this.segment()); }
    /// Sets `descriptorBufferAddressSpaceSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBufferAddressSpaceSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_descriptorBufferAddressSpaceSize.set(segment, 0L, index, value); }
    /// Sets `descriptorBufferAddressSpaceSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBufferAddressSpaceSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_descriptorBufferAddressSpaceSize(segment, 0L, value); }
    /// Sets `descriptorBufferAddressSpaceSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT descriptorBufferAddressSpaceSizeAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_descriptorBufferAddressSpaceSize(this.segment(), index, value); return this; }
    /// Sets `descriptorBufferAddressSpaceSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT descriptorBufferAddressSpaceSize(@CType("VkDeviceSize") long value) { VkPhysicalDeviceDescriptorBufferPropertiesEXT.set_descriptorBufferAddressSpaceSize(this.segment(), value); return this; }

}

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
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVulkan12Features`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkan12Features {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 samplerMirrorClampToEdge;
///     (uint32_t) VkBool32 drawIndirectCount;
///     (uint32_t) VkBool32 storageBuffer8BitAccess;
///     (uint32_t) VkBool32 uniformAndStorageBuffer8BitAccess;
///     (uint32_t) VkBool32 storagePushConstant8;
///     (uint32_t) VkBool32 shaderBufferInt64Atomics;
///     (uint32_t) VkBool32 shaderSharedInt64Atomics;
///     (uint32_t) VkBool32 shaderFloat16;
///     (uint32_t) VkBool32 shaderInt8;
///     (uint32_t) VkBool32 descriptorIndexing;
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
///     (uint32_t) VkBool32 samplerFilterMinmax;
///     (uint32_t) VkBool32 scalarBlockLayout;
///     (uint32_t) VkBool32 imagelessFramebuffer;
///     (uint32_t) VkBool32 uniformBufferStandardLayout;
///     (uint32_t) VkBool32 shaderSubgroupExtendedTypes;
///     (uint32_t) VkBool32 separateDepthStencilLayouts;
///     (uint32_t) VkBool32 hostQueryReset;
///     (uint32_t) VkBool32 timelineSemaphore;
///     (uint32_t) VkBool32 bufferDeviceAddress;
///     (uint32_t) VkBool32 bufferDeviceAddressCaptureReplay;
///     (uint32_t) VkBool32 bufferDeviceAddressMultiDevice;
///     (uint32_t) VkBool32 vulkanMemoryModel;
///     (uint32_t) VkBool32 vulkanMemoryModelDeviceScope;
///     (uint32_t) VkBool32 vulkanMemoryModelAvailabilityVisibilityChains;
///     (uint32_t) VkBool32 shaderOutputViewportIndex;
///     (uint32_t) VkBool32 shaderOutputLayer;
///     (uint32_t) VkBool32 subgroupBroadcastDynamicId;
/// };
/// ```
public final class VkPhysicalDeviceVulkan12Features extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVulkan12Features`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("samplerMirrorClampToEdge"),
        ValueLayout.JAVA_INT.withName("drawIndirectCount"),
        ValueLayout.JAVA_INT.withName("storageBuffer8BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer8BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant8"),
        ValueLayout.JAVA_INT.withName("shaderBufferInt64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedInt64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderFloat16"),
        ValueLayout.JAVA_INT.withName("shaderInt8"),
        ValueLayout.JAVA_INT.withName("descriptorIndexing"),
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
        ValueLayout.JAVA_INT.withName("runtimeDescriptorArray"),
        ValueLayout.JAVA_INT.withName("samplerFilterMinmax"),
        ValueLayout.JAVA_INT.withName("scalarBlockLayout"),
        ValueLayout.JAVA_INT.withName("imagelessFramebuffer"),
        ValueLayout.JAVA_INT.withName("uniformBufferStandardLayout"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupExtendedTypes"),
        ValueLayout.JAVA_INT.withName("separateDepthStencilLayouts"),
        ValueLayout.JAVA_INT.withName("hostQueryReset"),
        ValueLayout.JAVA_INT.withName("timelineSemaphore"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddress"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressCaptureReplay"),
        ValueLayout.JAVA_INT.withName("bufferDeviceAddressMultiDevice"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModel"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelDeviceScope"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelAvailabilityVisibilityChains"),
        ValueLayout.JAVA_INT.withName("shaderOutputViewportIndex"),
        ValueLayout.JAVA_INT.withName("shaderOutputLayer"),
        ValueLayout.JAVA_INT.withName("subgroupBroadcastDynamicId")
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
    /// The byte offset of `samplerMirrorClampToEdge`.
    public static final long OFFSET_samplerMirrorClampToEdge = LAYOUT.byteOffset(PathElement.groupElement("samplerMirrorClampToEdge"));
    /// The memory layout of `samplerMirrorClampToEdge`.
    public static final MemoryLayout LAYOUT_samplerMirrorClampToEdge = LAYOUT.select(PathElement.groupElement("samplerMirrorClampToEdge"));
    /// The [VarHandle] of `samplerMirrorClampToEdge` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_samplerMirrorClampToEdge = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerMirrorClampToEdge"));
    /// The byte offset of `drawIndirectCount`.
    public static final long OFFSET_drawIndirectCount = LAYOUT.byteOffset(PathElement.groupElement("drawIndirectCount"));
    /// The memory layout of `drawIndirectCount`.
    public static final MemoryLayout LAYOUT_drawIndirectCount = LAYOUT.select(PathElement.groupElement("drawIndirectCount"));
    /// The [VarHandle] of `drawIndirectCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_drawIndirectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drawIndirectCount"));
    /// The byte offset of `storageBuffer8BitAccess`.
    public static final long OFFSET_storageBuffer8BitAccess = LAYOUT.byteOffset(PathElement.groupElement("storageBuffer8BitAccess"));
    /// The memory layout of `storageBuffer8BitAccess`.
    public static final MemoryLayout LAYOUT_storageBuffer8BitAccess = LAYOUT.select(PathElement.groupElement("storageBuffer8BitAccess"));
    /// The [VarHandle] of `storageBuffer8BitAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storageBuffer8BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffer8BitAccess"));
    /// The byte offset of `uniformAndStorageBuffer8BitAccess`.
    public static final long OFFSET_uniformAndStorageBuffer8BitAccess = LAYOUT.byteOffset(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    /// The memory layout of `uniformAndStorageBuffer8BitAccess`.
    public static final MemoryLayout LAYOUT_uniformAndStorageBuffer8BitAccess = LAYOUT.select(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    /// The [VarHandle] of `uniformAndStorageBuffer8BitAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_uniformAndStorageBuffer8BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    /// The byte offset of `storagePushConstant8`.
    public static final long OFFSET_storagePushConstant8 = LAYOUT.byteOffset(PathElement.groupElement("storagePushConstant8"));
    /// The memory layout of `storagePushConstant8`.
    public static final MemoryLayout LAYOUT_storagePushConstant8 = LAYOUT.select(PathElement.groupElement("storagePushConstant8"));
    /// The [VarHandle] of `storagePushConstant8` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storagePushConstant8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storagePushConstant8"));
    /// The byte offset of `shaderBufferInt64Atomics`.
    public static final long OFFSET_shaderBufferInt64Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferInt64Atomics"));
    /// The memory layout of `shaderBufferInt64Atomics`.
    public static final MemoryLayout LAYOUT_shaderBufferInt64Atomics = LAYOUT.select(PathElement.groupElement("shaderBufferInt64Atomics"));
    /// The [VarHandle] of `shaderBufferInt64Atomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderBufferInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferInt64Atomics"));
    /// The byte offset of `shaderSharedInt64Atomics`.
    public static final long OFFSET_shaderSharedInt64Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedInt64Atomics"));
    /// The memory layout of `shaderSharedInt64Atomics`.
    public static final MemoryLayout LAYOUT_shaderSharedInt64Atomics = LAYOUT.select(PathElement.groupElement("shaderSharedInt64Atomics"));
    /// The [VarHandle] of `shaderSharedInt64Atomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSharedInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedInt64Atomics"));
    /// The byte offset of `shaderFloat16`.
    public static final long OFFSET_shaderFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat16"));
    /// The memory layout of `shaderFloat16`.
    public static final MemoryLayout LAYOUT_shaderFloat16 = LAYOUT.select(PathElement.groupElement("shaderFloat16"));
    /// The [VarHandle] of `shaderFloat16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat16"));
    /// The byte offset of `shaderInt8`.
    public static final long OFFSET_shaderInt8 = LAYOUT.byteOffset(PathElement.groupElement("shaderInt8"));
    /// The memory layout of `shaderInt8`.
    public static final MemoryLayout LAYOUT_shaderInt8 = LAYOUT.select(PathElement.groupElement("shaderInt8"));
    /// The [VarHandle] of `shaderInt8` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderInt8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInt8"));
    /// The byte offset of `descriptorIndexing`.
    public static final long OFFSET_descriptorIndexing = LAYOUT.byteOffset(PathElement.groupElement("descriptorIndexing"));
    /// The memory layout of `descriptorIndexing`.
    public static final MemoryLayout LAYOUT_descriptorIndexing = LAYOUT.select(PathElement.groupElement("descriptorIndexing"));
    /// The [VarHandle] of `descriptorIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorIndexing"));
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
    /// The byte offset of `samplerFilterMinmax`.
    public static final long OFFSET_samplerFilterMinmax = LAYOUT.byteOffset(PathElement.groupElement("samplerFilterMinmax"));
    /// The memory layout of `samplerFilterMinmax`.
    public static final MemoryLayout LAYOUT_samplerFilterMinmax = LAYOUT.select(PathElement.groupElement("samplerFilterMinmax"));
    /// The [VarHandle] of `samplerFilterMinmax` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_samplerFilterMinmax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerFilterMinmax"));
    /// The byte offset of `scalarBlockLayout`.
    public static final long OFFSET_scalarBlockLayout = LAYOUT.byteOffset(PathElement.groupElement("scalarBlockLayout"));
    /// The memory layout of `scalarBlockLayout`.
    public static final MemoryLayout LAYOUT_scalarBlockLayout = LAYOUT.select(PathElement.groupElement("scalarBlockLayout"));
    /// The [VarHandle] of `scalarBlockLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_scalarBlockLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scalarBlockLayout"));
    /// The byte offset of `imagelessFramebuffer`.
    public static final long OFFSET_imagelessFramebuffer = LAYOUT.byteOffset(PathElement.groupElement("imagelessFramebuffer"));
    /// The memory layout of `imagelessFramebuffer`.
    public static final MemoryLayout LAYOUT_imagelessFramebuffer = LAYOUT.select(PathElement.groupElement("imagelessFramebuffer"));
    /// The [VarHandle] of `imagelessFramebuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imagelessFramebuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imagelessFramebuffer"));
    /// The byte offset of `uniformBufferStandardLayout`.
    public static final long OFFSET_uniformBufferStandardLayout = LAYOUT.byteOffset(PathElement.groupElement("uniformBufferStandardLayout"));
    /// The memory layout of `uniformBufferStandardLayout`.
    public static final MemoryLayout LAYOUT_uniformBufferStandardLayout = LAYOUT.select(PathElement.groupElement("uniformBufferStandardLayout"));
    /// The [VarHandle] of `uniformBufferStandardLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_uniformBufferStandardLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformBufferStandardLayout"));
    /// The byte offset of `shaderSubgroupExtendedTypes`.
    public static final long OFFSET_shaderSubgroupExtendedTypes = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupExtendedTypes"));
    /// The memory layout of `shaderSubgroupExtendedTypes`.
    public static final MemoryLayout LAYOUT_shaderSubgroupExtendedTypes = LAYOUT.select(PathElement.groupElement("shaderSubgroupExtendedTypes"));
    /// The [VarHandle] of `shaderSubgroupExtendedTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSubgroupExtendedTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupExtendedTypes"));
    /// The byte offset of `separateDepthStencilLayouts`.
    public static final long OFFSET_separateDepthStencilLayouts = LAYOUT.byteOffset(PathElement.groupElement("separateDepthStencilLayouts"));
    /// The memory layout of `separateDepthStencilLayouts`.
    public static final MemoryLayout LAYOUT_separateDepthStencilLayouts = LAYOUT.select(PathElement.groupElement("separateDepthStencilLayouts"));
    /// The [VarHandle] of `separateDepthStencilLayouts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_separateDepthStencilLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("separateDepthStencilLayouts"));
    /// The byte offset of `hostQueryReset`.
    public static final long OFFSET_hostQueryReset = LAYOUT.byteOffset(PathElement.groupElement("hostQueryReset"));
    /// The memory layout of `hostQueryReset`.
    public static final MemoryLayout LAYOUT_hostQueryReset = LAYOUT.select(PathElement.groupElement("hostQueryReset"));
    /// The [VarHandle] of `hostQueryReset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hostQueryReset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hostQueryReset"));
    /// The byte offset of `timelineSemaphore`.
    public static final long OFFSET_timelineSemaphore = LAYOUT.byteOffset(PathElement.groupElement("timelineSemaphore"));
    /// The memory layout of `timelineSemaphore`.
    public static final MemoryLayout LAYOUT_timelineSemaphore = LAYOUT.select(PathElement.groupElement("timelineSemaphore"));
    /// The [VarHandle] of `timelineSemaphore` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_timelineSemaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timelineSemaphore"));
    /// The byte offset of `bufferDeviceAddress`.
    public static final long OFFSET_bufferDeviceAddress = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddress"));
    /// The memory layout of `bufferDeviceAddress`.
    public static final MemoryLayout LAYOUT_bufferDeviceAddress = LAYOUT.select(PathElement.groupElement("bufferDeviceAddress"));
    /// The [VarHandle] of `bufferDeviceAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferDeviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddress"));
    /// The byte offset of `bufferDeviceAddressCaptureReplay`.
    public static final long OFFSET_bufferDeviceAddressCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    /// The memory layout of `bufferDeviceAddressCaptureReplay`.
    public static final MemoryLayout LAYOUT_bufferDeviceAddressCaptureReplay = LAYOUT.select(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    /// The [VarHandle] of `bufferDeviceAddressCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferDeviceAddressCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    /// The byte offset of `bufferDeviceAddressMultiDevice`.
    public static final long OFFSET_bufferDeviceAddressMultiDevice = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
    /// The memory layout of `bufferDeviceAddressMultiDevice`.
    public static final MemoryLayout LAYOUT_bufferDeviceAddressMultiDevice = LAYOUT.select(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
    /// The [VarHandle] of `bufferDeviceAddressMultiDevice` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferDeviceAddressMultiDevice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
    /// The byte offset of `vulkanMemoryModel`.
    public static final long OFFSET_vulkanMemoryModel = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModel"));
    /// The memory layout of `vulkanMemoryModel`.
    public static final MemoryLayout LAYOUT_vulkanMemoryModel = LAYOUT.select(PathElement.groupElement("vulkanMemoryModel"));
    /// The [VarHandle] of `vulkanMemoryModel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vulkanMemoryModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModel"));
    /// The byte offset of `vulkanMemoryModelDeviceScope`.
    public static final long OFFSET_vulkanMemoryModelDeviceScope = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    /// The memory layout of `vulkanMemoryModelDeviceScope`.
    public static final MemoryLayout LAYOUT_vulkanMemoryModelDeviceScope = LAYOUT.select(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    /// The [VarHandle] of `vulkanMemoryModelDeviceScope` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vulkanMemoryModelDeviceScope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    /// The byte offset of `vulkanMemoryModelAvailabilityVisibilityChains`.
    public static final long OFFSET_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
    /// The memory layout of `vulkanMemoryModelAvailabilityVisibilityChains`.
    public static final MemoryLayout LAYOUT_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.select(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
    /// The [VarHandle] of `vulkanMemoryModelAvailabilityVisibilityChains` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
    /// The byte offset of `shaderOutputViewportIndex`.
    public static final long OFFSET_shaderOutputViewportIndex = LAYOUT.byteOffset(PathElement.groupElement("shaderOutputViewportIndex"));
    /// The memory layout of `shaderOutputViewportIndex`.
    public static final MemoryLayout LAYOUT_shaderOutputViewportIndex = LAYOUT.select(PathElement.groupElement("shaderOutputViewportIndex"));
    /// The [VarHandle] of `shaderOutputViewportIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderOutputViewportIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderOutputViewportIndex"));
    /// The byte offset of `shaderOutputLayer`.
    public static final long OFFSET_shaderOutputLayer = LAYOUT.byteOffset(PathElement.groupElement("shaderOutputLayer"));
    /// The memory layout of `shaderOutputLayer`.
    public static final MemoryLayout LAYOUT_shaderOutputLayer = LAYOUT.select(PathElement.groupElement("shaderOutputLayer"));
    /// The [VarHandle] of `shaderOutputLayer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderOutputLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderOutputLayer"));
    /// The byte offset of `subgroupBroadcastDynamicId`.
    public static final long OFFSET_subgroupBroadcastDynamicId = LAYOUT.byteOffset(PathElement.groupElement("subgroupBroadcastDynamicId"));
    /// The memory layout of `subgroupBroadcastDynamicId`.
    public static final MemoryLayout LAYOUT_subgroupBroadcastDynamicId = LAYOUT.select(PathElement.groupElement("subgroupBroadcastDynamicId"));
    /// The [VarHandle] of `subgroupBroadcastDynamicId` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subgroupBroadcastDynamicId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupBroadcastDynamicId"));

    /// Creates `VkPhysicalDeviceVulkan12Features` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVulkan12Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVulkan12Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan12Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan12Features(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkan12Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan12Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan12Features(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVulkan12Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan12Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan12Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVulkan12Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan12Features`
    public static VkPhysicalDeviceVulkan12Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan12Features(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVulkan12Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan12Features`
    public static VkPhysicalDeviceVulkan12Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan12Features(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features copyFrom(VkPhysicalDeviceVulkan12Features src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVulkan12Features reinterpret(long count) { return new VkPhysicalDeviceVulkan12Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceVulkan12Features sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `samplerMirrorClampToEdge` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int samplerMirrorClampToEdge(MemorySegment segment, long index) { return (int) VH_samplerMirrorClampToEdge.get(segment, 0L, index); }
    /// {@return `samplerMirrorClampToEdge`}
    public int samplerMirrorClampToEdge() { return samplerMirrorClampToEdge(this.segment(), 0L); }
    /// Sets `samplerMirrorClampToEdge` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samplerMirrorClampToEdge(MemorySegment segment, long index, int value) { VH_samplerMirrorClampToEdge.set(segment, 0L, index, value); }
    /// Sets `samplerMirrorClampToEdge` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features samplerMirrorClampToEdge(int value) { samplerMirrorClampToEdge(this.segment(), 0L, value); return this; }

    /// {@return `drawIndirectCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int drawIndirectCount(MemorySegment segment, long index) { return (int) VH_drawIndirectCount.get(segment, 0L, index); }
    /// {@return `drawIndirectCount`}
    public int drawIndirectCount() { return drawIndirectCount(this.segment(), 0L); }
    /// Sets `drawIndirectCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void drawIndirectCount(MemorySegment segment, long index, int value) { VH_drawIndirectCount.set(segment, 0L, index, value); }
    /// Sets `drawIndirectCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features drawIndirectCount(int value) { drawIndirectCount(this.segment(), 0L, value); return this; }

    /// {@return `storageBuffer8BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storageBuffer8BitAccess(MemorySegment segment, long index) { return (int) VH_storageBuffer8BitAccess.get(segment, 0L, index); }
    /// {@return `storageBuffer8BitAccess`}
    public int storageBuffer8BitAccess() { return storageBuffer8BitAccess(this.segment(), 0L); }
    /// Sets `storageBuffer8BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageBuffer8BitAccess(MemorySegment segment, long index, int value) { VH_storageBuffer8BitAccess.set(segment, 0L, index, value); }
    /// Sets `storageBuffer8BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features storageBuffer8BitAccess(int value) { storageBuffer8BitAccess(this.segment(), 0L, value); return this; }

    /// {@return `uniformAndStorageBuffer8BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int uniformAndStorageBuffer8BitAccess(MemorySegment segment, long index) { return (int) VH_uniformAndStorageBuffer8BitAccess.get(segment, 0L, index); }
    /// {@return `uniformAndStorageBuffer8BitAccess`}
    public int uniformAndStorageBuffer8BitAccess() { return uniformAndStorageBuffer8BitAccess(this.segment(), 0L); }
    /// Sets `uniformAndStorageBuffer8BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformAndStorageBuffer8BitAccess(MemorySegment segment, long index, int value) { VH_uniformAndStorageBuffer8BitAccess.set(segment, 0L, index, value); }
    /// Sets `uniformAndStorageBuffer8BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features uniformAndStorageBuffer8BitAccess(int value) { uniformAndStorageBuffer8BitAccess(this.segment(), 0L, value); return this; }

    /// {@return `storagePushConstant8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storagePushConstant8(MemorySegment segment, long index) { return (int) VH_storagePushConstant8.get(segment, 0L, index); }
    /// {@return `storagePushConstant8`}
    public int storagePushConstant8() { return storagePushConstant8(this.segment(), 0L); }
    /// Sets `storagePushConstant8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storagePushConstant8(MemorySegment segment, long index, int value) { VH_storagePushConstant8.set(segment, 0L, index, value); }
    /// Sets `storagePushConstant8` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features storagePushConstant8(int value) { storagePushConstant8(this.segment(), 0L, value); return this; }

    /// {@return `shaderBufferInt64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBufferInt64Atomics(MemorySegment segment, long index) { return (int) VH_shaderBufferInt64Atomics.get(segment, 0L, index); }
    /// {@return `shaderBufferInt64Atomics`}
    public int shaderBufferInt64Atomics() { return shaderBufferInt64Atomics(this.segment(), 0L); }
    /// Sets `shaderBufferInt64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBufferInt64Atomics(MemorySegment segment, long index, int value) { VH_shaderBufferInt64Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderBufferInt64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderBufferInt64Atomics(int value) { shaderBufferInt64Atomics(this.segment(), 0L, value); return this; }

    /// {@return `shaderSharedInt64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSharedInt64Atomics(MemorySegment segment, long index) { return (int) VH_shaderSharedInt64Atomics.get(segment, 0L, index); }
    /// {@return `shaderSharedInt64Atomics`}
    public int shaderSharedInt64Atomics() { return shaderSharedInt64Atomics(this.segment(), 0L); }
    /// Sets `shaderSharedInt64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSharedInt64Atomics(MemorySegment segment, long index, int value) { VH_shaderSharedInt64Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderSharedInt64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderSharedInt64Atomics(int value) { shaderSharedInt64Atomics(this.segment(), 0L, value); return this; }

    /// {@return `shaderFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderFloat16(MemorySegment segment, long index) { return (int) VH_shaderFloat16.get(segment, 0L, index); }
    /// {@return `shaderFloat16`}
    public int shaderFloat16() { return shaderFloat16(this.segment(), 0L); }
    /// Sets `shaderFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderFloat16(MemorySegment segment, long index, int value) { VH_shaderFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderFloat16(int value) { shaderFloat16(this.segment(), 0L, value); return this; }

    /// {@return `shaderInt8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderInt8(MemorySegment segment, long index) { return (int) VH_shaderInt8.get(segment, 0L, index); }
    /// {@return `shaderInt8`}
    public int shaderInt8() { return shaderInt8(this.segment(), 0L); }
    /// Sets `shaderInt8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderInt8(MemorySegment segment, long index, int value) { VH_shaderInt8.set(segment, 0L, index, value); }
    /// Sets `shaderInt8` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderInt8(int value) { shaderInt8(this.segment(), 0L, value); return this; }

    /// {@return `descriptorIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorIndexing(MemorySegment segment, long index) { return (int) VH_descriptorIndexing.get(segment, 0L, index); }
    /// {@return `descriptorIndexing`}
    public int descriptorIndexing() { return descriptorIndexing(this.segment(), 0L); }
    /// Sets `descriptorIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorIndexing(MemorySegment segment, long index, int value) { VH_descriptorIndexing.set(segment, 0L, index, value); }
    /// Sets `descriptorIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorIndexing(int value) { descriptorIndexing(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayDynamicIndexing(int value) { shaderInputAttachmentArrayDynamicIndexing(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayDynamicIndexing(int value) { shaderUniformTexelBufferArrayDynamicIndexing(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayDynamicIndexing(int value) { shaderStorageTexelBufferArrayDynamicIndexing(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features shaderUniformBufferArrayNonUniformIndexing(int value) { shaderUniformBufferArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features shaderSampledImageArrayNonUniformIndexing(int value) { shaderSampledImageArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features shaderStorageBufferArrayNonUniformIndexing(int value) { shaderStorageBufferArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features shaderStorageImageArrayNonUniformIndexing(int value) { shaderStorageImageArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayNonUniformIndexing(int value) { shaderInputAttachmentArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayNonUniformIndexing(int value) { shaderUniformTexelBufferArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayNonUniformIndexing(int value) { shaderStorageTexelBufferArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformBufferUpdateAfterBind(int value) { descriptorBindingUniformBufferUpdateAfterBind(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features descriptorBindingSampledImageUpdateAfterBind(int value) { descriptorBindingSampledImageUpdateAfterBind(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageImageUpdateAfterBind(int value) { descriptorBindingStorageImageUpdateAfterBind(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageBufferUpdateAfterBind(int value) { descriptorBindingStorageBufferUpdateAfterBind(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformTexelBufferUpdateAfterBind(int value) { descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageTexelBufferUpdateAfterBind(int value) { descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features descriptorBindingUpdateUnusedWhilePending(int value) { descriptorBindingUpdateUnusedWhilePending(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features descriptorBindingPartiallyBound(int value) { descriptorBindingPartiallyBound(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features descriptorBindingVariableDescriptorCount(int value) { descriptorBindingVariableDescriptorCount(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan12Features runtimeDescriptorArray(int value) { runtimeDescriptorArray(this.segment(), 0L, value); return this; }

    /// {@return `samplerFilterMinmax` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int samplerFilterMinmax(MemorySegment segment, long index) { return (int) VH_samplerFilterMinmax.get(segment, 0L, index); }
    /// {@return `samplerFilterMinmax`}
    public int samplerFilterMinmax() { return samplerFilterMinmax(this.segment(), 0L); }
    /// Sets `samplerFilterMinmax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samplerFilterMinmax(MemorySegment segment, long index, int value) { VH_samplerFilterMinmax.set(segment, 0L, index, value); }
    /// Sets `samplerFilterMinmax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features samplerFilterMinmax(int value) { samplerFilterMinmax(this.segment(), 0L, value); return this; }

    /// {@return `scalarBlockLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int scalarBlockLayout(MemorySegment segment, long index) { return (int) VH_scalarBlockLayout.get(segment, 0L, index); }
    /// {@return `scalarBlockLayout`}
    public int scalarBlockLayout() { return scalarBlockLayout(this.segment(), 0L); }
    /// Sets `scalarBlockLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scalarBlockLayout(MemorySegment segment, long index, int value) { VH_scalarBlockLayout.set(segment, 0L, index, value); }
    /// Sets `scalarBlockLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features scalarBlockLayout(int value) { scalarBlockLayout(this.segment(), 0L, value); return this; }

    /// {@return `imagelessFramebuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imagelessFramebuffer(MemorySegment segment, long index) { return (int) VH_imagelessFramebuffer.get(segment, 0L, index); }
    /// {@return `imagelessFramebuffer`}
    public int imagelessFramebuffer() { return imagelessFramebuffer(this.segment(), 0L); }
    /// Sets `imagelessFramebuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imagelessFramebuffer(MemorySegment segment, long index, int value) { VH_imagelessFramebuffer.set(segment, 0L, index, value); }
    /// Sets `imagelessFramebuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features imagelessFramebuffer(int value) { imagelessFramebuffer(this.segment(), 0L, value); return this; }

    /// {@return `uniformBufferStandardLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int uniformBufferStandardLayout(MemorySegment segment, long index) { return (int) VH_uniformBufferStandardLayout.get(segment, 0L, index); }
    /// {@return `uniformBufferStandardLayout`}
    public int uniformBufferStandardLayout() { return uniformBufferStandardLayout(this.segment(), 0L); }
    /// Sets `uniformBufferStandardLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformBufferStandardLayout(MemorySegment segment, long index, int value) { VH_uniformBufferStandardLayout.set(segment, 0L, index, value); }
    /// Sets `uniformBufferStandardLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features uniformBufferStandardLayout(int value) { uniformBufferStandardLayout(this.segment(), 0L, value); return this; }

    /// {@return `shaderSubgroupExtendedTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSubgroupExtendedTypes(MemorySegment segment, long index) { return (int) VH_shaderSubgroupExtendedTypes.get(segment, 0L, index); }
    /// {@return `shaderSubgroupExtendedTypes`}
    public int shaderSubgroupExtendedTypes() { return shaderSubgroupExtendedTypes(this.segment(), 0L); }
    /// Sets `shaderSubgroupExtendedTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSubgroupExtendedTypes(MemorySegment segment, long index, int value) { VH_shaderSubgroupExtendedTypes.set(segment, 0L, index, value); }
    /// Sets `shaderSubgroupExtendedTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderSubgroupExtendedTypes(int value) { shaderSubgroupExtendedTypes(this.segment(), 0L, value); return this; }

    /// {@return `separateDepthStencilLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int separateDepthStencilLayouts(MemorySegment segment, long index) { return (int) VH_separateDepthStencilLayouts.get(segment, 0L, index); }
    /// {@return `separateDepthStencilLayouts`}
    public int separateDepthStencilLayouts() { return separateDepthStencilLayouts(this.segment(), 0L); }
    /// Sets `separateDepthStencilLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void separateDepthStencilLayouts(MemorySegment segment, long index, int value) { VH_separateDepthStencilLayouts.set(segment, 0L, index, value); }
    /// Sets `separateDepthStencilLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features separateDepthStencilLayouts(int value) { separateDepthStencilLayouts(this.segment(), 0L, value); return this; }

    /// {@return `hostQueryReset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hostQueryReset(MemorySegment segment, long index) { return (int) VH_hostQueryReset.get(segment, 0L, index); }
    /// {@return `hostQueryReset`}
    public int hostQueryReset() { return hostQueryReset(this.segment(), 0L); }
    /// Sets `hostQueryReset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hostQueryReset(MemorySegment segment, long index, int value) { VH_hostQueryReset.set(segment, 0L, index, value); }
    /// Sets `hostQueryReset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features hostQueryReset(int value) { hostQueryReset(this.segment(), 0L, value); return this; }

    /// {@return `timelineSemaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int timelineSemaphore(MemorySegment segment, long index) { return (int) VH_timelineSemaphore.get(segment, 0L, index); }
    /// {@return `timelineSemaphore`}
    public int timelineSemaphore() { return timelineSemaphore(this.segment(), 0L); }
    /// Sets `timelineSemaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void timelineSemaphore(MemorySegment segment, long index, int value) { VH_timelineSemaphore.set(segment, 0L, index, value); }
    /// Sets `timelineSemaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features timelineSemaphore(int value) { timelineSemaphore(this.segment(), 0L, value); return this; }

    /// {@return `bufferDeviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferDeviceAddress(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddress.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddress`}
    public int bufferDeviceAddress() { return bufferDeviceAddress(this.segment(), 0L); }
    /// Sets `bufferDeviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferDeviceAddress(MemorySegment segment, long index, int value) { VH_bufferDeviceAddress.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddress(int value) { bufferDeviceAddress(this.segment(), 0L, value); return this; }

    /// {@return `bufferDeviceAddressCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferDeviceAddressCaptureReplay(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddressCaptureReplay.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddressCaptureReplay`}
    public int bufferDeviceAddressCaptureReplay() { return bufferDeviceAddressCaptureReplay(this.segment(), 0L); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferDeviceAddressCaptureReplay(MemorySegment segment, long index, int value) { VH_bufferDeviceAddressCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressCaptureReplay(int value) { bufferDeviceAddressCaptureReplay(this.segment(), 0L, value); return this; }

    /// {@return `bufferDeviceAddressMultiDevice` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferDeviceAddressMultiDevice(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddressMultiDevice.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddressMultiDevice`}
    public int bufferDeviceAddressMultiDevice() { return bufferDeviceAddressMultiDevice(this.segment(), 0L); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferDeviceAddressMultiDevice(MemorySegment segment, long index, int value) { VH_bufferDeviceAddressMultiDevice.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressMultiDevice(int value) { bufferDeviceAddressMultiDevice(this.segment(), 0L, value); return this; }

    /// {@return `vulkanMemoryModel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vulkanMemoryModel(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModel.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModel`}
    public int vulkanMemoryModel() { return vulkanMemoryModel(this.segment(), 0L); }
    /// Sets `vulkanMemoryModel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vulkanMemoryModel(MemorySegment segment, long index, int value) { VH_vulkanMemoryModel.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModel(int value) { vulkanMemoryModel(this.segment(), 0L, value); return this; }

    /// {@return `vulkanMemoryModelDeviceScope` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vulkanMemoryModelDeviceScope(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModelDeviceScope.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModelDeviceScope`}
    public int vulkanMemoryModelDeviceScope() { return vulkanMemoryModelDeviceScope(this.segment(), 0L); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vulkanMemoryModelDeviceScope(MemorySegment segment, long index, int value) { VH_vulkanMemoryModelDeviceScope.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelDeviceScope(int value) { vulkanMemoryModelDeviceScope(this.segment(), 0L, value); return this; }

    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModelAvailabilityVisibilityChains.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains`}
    public int vulkanMemoryModelAvailabilityVisibilityChains() { return vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), 0L); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment segment, long index, int value) { VH_vulkanMemoryModelAvailabilityVisibilityChains.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelAvailabilityVisibilityChains(int value) { vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), 0L, value); return this; }

    /// {@return `shaderOutputViewportIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderOutputViewportIndex(MemorySegment segment, long index) { return (int) VH_shaderOutputViewportIndex.get(segment, 0L, index); }
    /// {@return `shaderOutputViewportIndex`}
    public int shaderOutputViewportIndex() { return shaderOutputViewportIndex(this.segment(), 0L); }
    /// Sets `shaderOutputViewportIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderOutputViewportIndex(MemorySegment segment, long index, int value) { VH_shaderOutputViewportIndex.set(segment, 0L, index, value); }
    /// Sets `shaderOutputViewportIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderOutputViewportIndex(int value) { shaderOutputViewportIndex(this.segment(), 0L, value); return this; }

    /// {@return `shaderOutputLayer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderOutputLayer(MemorySegment segment, long index) { return (int) VH_shaderOutputLayer.get(segment, 0L, index); }
    /// {@return `shaderOutputLayer`}
    public int shaderOutputLayer() { return shaderOutputLayer(this.segment(), 0L); }
    /// Sets `shaderOutputLayer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderOutputLayer(MemorySegment segment, long index, int value) { VH_shaderOutputLayer.set(segment, 0L, index, value); }
    /// Sets `shaderOutputLayer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderOutputLayer(int value) { shaderOutputLayer(this.segment(), 0L, value); return this; }

    /// {@return `subgroupBroadcastDynamicId` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subgroupBroadcastDynamicId(MemorySegment segment, long index) { return (int) VH_subgroupBroadcastDynamicId.get(segment, 0L, index); }
    /// {@return `subgroupBroadcastDynamicId`}
    public int subgroupBroadcastDynamicId() { return subgroupBroadcastDynamicId(this.segment(), 0L); }
    /// Sets `subgroupBroadcastDynamicId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subgroupBroadcastDynamicId(MemorySegment segment, long index, int value) { VH_subgroupBroadcastDynamicId.set(segment, 0L, index, value); }
    /// Sets `subgroupBroadcastDynamicId` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features subgroupBroadcastDynamicId(int value) { subgroupBroadcastDynamicId(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVulkan12Features`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVulkan12Features`
    public VkPhysicalDeviceVulkan12Features asSlice(long index) { return new VkPhysicalDeviceVulkan12Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVulkan12Features`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVulkan12Features`
    public VkPhysicalDeviceVulkan12Features asSlice(long index, long count) { return new VkPhysicalDeviceVulkan12Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVulkan12Features` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features at(long index, Consumer<VkPhysicalDeviceVulkan12Features> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `samplerMirrorClampToEdge` at the given index}
    /// @param index the index of the struct buffer
    public int samplerMirrorClampToEdgeAt(long index) { return samplerMirrorClampToEdge(this.segment(), index); }
    /// Sets `samplerMirrorClampToEdge` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features samplerMirrorClampToEdgeAt(long index, int value) { samplerMirrorClampToEdge(this.segment(), index, value); return this; }

    /// {@return `drawIndirectCount` at the given index}
    /// @param index the index of the struct buffer
    public int drawIndirectCountAt(long index) { return drawIndirectCount(this.segment(), index); }
    /// Sets `drawIndirectCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features drawIndirectCountAt(long index, int value) { drawIndirectCount(this.segment(), index, value); return this; }

    /// {@return `storageBuffer8BitAccess` at the given index}
    /// @param index the index of the struct buffer
    public int storageBuffer8BitAccessAt(long index) { return storageBuffer8BitAccess(this.segment(), index); }
    /// Sets `storageBuffer8BitAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features storageBuffer8BitAccessAt(long index, int value) { storageBuffer8BitAccess(this.segment(), index, value); return this; }

    /// {@return `uniformAndStorageBuffer8BitAccess` at the given index}
    /// @param index the index of the struct buffer
    public int uniformAndStorageBuffer8BitAccessAt(long index) { return uniformAndStorageBuffer8BitAccess(this.segment(), index); }
    /// Sets `uniformAndStorageBuffer8BitAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features uniformAndStorageBuffer8BitAccessAt(long index, int value) { uniformAndStorageBuffer8BitAccess(this.segment(), index, value); return this; }

    /// {@return `storagePushConstant8` at the given index}
    /// @param index the index of the struct buffer
    public int storagePushConstant8At(long index) { return storagePushConstant8(this.segment(), index); }
    /// Sets `storagePushConstant8` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features storagePushConstant8At(long index, int value) { storagePushConstant8(this.segment(), index, value); return this; }

    /// {@return `shaderBufferInt64Atomics` at the given index}
    /// @param index the index of the struct buffer
    public int shaderBufferInt64AtomicsAt(long index) { return shaderBufferInt64Atomics(this.segment(), index); }
    /// Sets `shaderBufferInt64Atomics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderBufferInt64AtomicsAt(long index, int value) { shaderBufferInt64Atomics(this.segment(), index, value); return this; }

    /// {@return `shaderSharedInt64Atomics` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSharedInt64AtomicsAt(long index) { return shaderSharedInt64Atomics(this.segment(), index); }
    /// Sets `shaderSharedInt64Atomics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderSharedInt64AtomicsAt(long index, int value) { shaderSharedInt64Atomics(this.segment(), index, value); return this; }

    /// {@return `shaderFloat16` at the given index}
    /// @param index the index of the struct buffer
    public int shaderFloat16At(long index) { return shaderFloat16(this.segment(), index); }
    /// Sets `shaderFloat16` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderFloat16At(long index, int value) { shaderFloat16(this.segment(), index, value); return this; }

    /// {@return `shaderInt8` at the given index}
    /// @param index the index of the struct buffer
    public int shaderInt8At(long index) { return shaderInt8(this.segment(), index); }
    /// Sets `shaderInt8` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderInt8At(long index, int value) { shaderInt8(this.segment(), index, value); return this; }

    /// {@return `descriptorIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorIndexingAt(long index) { return descriptorIndexing(this.segment(), index); }
    /// Sets `descriptorIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorIndexingAt(long index, int value) { descriptorIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderInputAttachmentArrayDynamicIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderInputAttachmentArrayDynamicIndexingAt(long index) { return shaderInputAttachmentArrayDynamicIndexing(this.segment(), index); }
    /// Sets `shaderInputAttachmentArrayDynamicIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayDynamicIndexingAt(long index, int value) { shaderInputAttachmentArrayDynamicIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderUniformTexelBufferArrayDynamicIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderUniformTexelBufferArrayDynamicIndexingAt(long index) { return shaderUniformTexelBufferArrayDynamicIndexing(this.segment(), index); }
    /// Sets `shaderUniformTexelBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayDynamicIndexingAt(long index, int value) { shaderUniformTexelBufferArrayDynamicIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderStorageTexelBufferArrayDynamicIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStorageTexelBufferArrayDynamicIndexingAt(long index) { return shaderStorageTexelBufferArrayDynamicIndexing(this.segment(), index); }
    /// Sets `shaderStorageTexelBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayDynamicIndexingAt(long index, int value) { shaderStorageTexelBufferArrayDynamicIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderUniformBufferArrayNonUniformIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderUniformBufferArrayNonUniformIndexingAt(long index) { return shaderUniformBufferArrayNonUniformIndexing(this.segment(), index); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderUniformBufferArrayNonUniformIndexingAt(long index, int value) { shaderUniformBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderSampledImageArrayNonUniformIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSampledImageArrayNonUniformIndexingAt(long index) { return shaderSampledImageArrayNonUniformIndexing(this.segment(), index); }
    /// Sets `shaderSampledImageArrayNonUniformIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderSampledImageArrayNonUniformIndexingAt(long index, int value) { shaderSampledImageArrayNonUniformIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderStorageBufferArrayNonUniformIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStorageBufferArrayNonUniformIndexingAt(long index) { return shaderStorageBufferArrayNonUniformIndexing(this.segment(), index); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderStorageBufferArrayNonUniformIndexingAt(long index, int value) { shaderStorageBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderStorageImageArrayNonUniformIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStorageImageArrayNonUniformIndexingAt(long index) { return shaderStorageImageArrayNonUniformIndexing(this.segment(), index); }
    /// Sets `shaderStorageImageArrayNonUniformIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderStorageImageArrayNonUniformIndexingAt(long index, int value) { shaderStorageImageArrayNonUniformIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderInputAttachmentArrayNonUniformIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderInputAttachmentArrayNonUniformIndexingAt(long index) { return shaderInputAttachmentArrayNonUniformIndexing(this.segment(), index); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayNonUniformIndexingAt(long index, int value) { shaderInputAttachmentArrayNonUniformIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderUniformTexelBufferArrayNonUniformIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderUniformTexelBufferArrayNonUniformIndexingAt(long index) { return shaderUniformTexelBufferArrayNonUniformIndexing(this.segment(), index); }
    /// Sets `shaderUniformTexelBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayNonUniformIndexingAt(long index, int value) { shaderUniformTexelBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderStorageTexelBufferArrayNonUniformIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStorageTexelBufferArrayNonUniformIndexingAt(long index) { return shaderStorageTexelBufferArrayNonUniformIndexing(this.segment(), index); }
    /// Sets `shaderStorageTexelBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayNonUniformIndexingAt(long index, int value) { shaderStorageTexelBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

    /// {@return `descriptorBindingUniformBufferUpdateAfterBind` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorBindingUniformBufferUpdateAfterBindAt(long index) { return descriptorBindingUniformBufferUpdateAfterBind(this.segment(), index); }
    /// Sets `descriptorBindingUniformBufferUpdateAfterBind` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformBufferUpdateAfterBindAt(long index, int value) { descriptorBindingUniformBufferUpdateAfterBind(this.segment(), index, value); return this; }

    /// {@return `descriptorBindingSampledImageUpdateAfterBind` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorBindingSampledImageUpdateAfterBindAt(long index) { return descriptorBindingSampledImageUpdateAfterBind(this.segment(), index); }
    /// Sets `descriptorBindingSampledImageUpdateAfterBind` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingSampledImageUpdateAfterBindAt(long index, int value) { descriptorBindingSampledImageUpdateAfterBind(this.segment(), index, value); return this; }

    /// {@return `descriptorBindingStorageImageUpdateAfterBind` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorBindingStorageImageUpdateAfterBindAt(long index) { return descriptorBindingStorageImageUpdateAfterBind(this.segment(), index); }
    /// Sets `descriptorBindingStorageImageUpdateAfterBind` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageImageUpdateAfterBindAt(long index, int value) { descriptorBindingStorageImageUpdateAfterBind(this.segment(), index, value); return this; }

    /// {@return `descriptorBindingStorageBufferUpdateAfterBind` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorBindingStorageBufferUpdateAfterBindAt(long index) { return descriptorBindingStorageBufferUpdateAfterBind(this.segment(), index); }
    /// Sets `descriptorBindingStorageBufferUpdateAfterBind` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageBufferUpdateAfterBindAt(long index, int value) { descriptorBindingStorageBufferUpdateAfterBind(this.segment(), index, value); return this; }

    /// {@return `descriptorBindingUniformTexelBufferUpdateAfterBind` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index) { return descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment(), index); }
    /// Sets `descriptorBindingUniformTexelBufferUpdateAfterBind` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index, int value) { descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment(), index, value); return this; }

    /// {@return `descriptorBindingStorageTexelBufferUpdateAfterBind` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index) { return descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment(), index); }
    /// Sets `descriptorBindingStorageTexelBufferUpdateAfterBind` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index, int value) { descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment(), index, value); return this; }

    /// {@return `descriptorBindingUpdateUnusedWhilePending` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorBindingUpdateUnusedWhilePendingAt(long index) { return descriptorBindingUpdateUnusedWhilePending(this.segment(), index); }
    /// Sets `descriptorBindingUpdateUnusedWhilePending` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingUpdateUnusedWhilePendingAt(long index, int value) { descriptorBindingUpdateUnusedWhilePending(this.segment(), index, value); return this; }

    /// {@return `descriptorBindingPartiallyBound` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorBindingPartiallyBoundAt(long index) { return descriptorBindingPartiallyBound(this.segment(), index); }
    /// Sets `descriptorBindingPartiallyBound` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingPartiallyBoundAt(long index, int value) { descriptorBindingPartiallyBound(this.segment(), index, value); return this; }

    /// {@return `descriptorBindingVariableDescriptorCount` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorBindingVariableDescriptorCountAt(long index) { return descriptorBindingVariableDescriptorCount(this.segment(), index); }
    /// Sets `descriptorBindingVariableDescriptorCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingVariableDescriptorCountAt(long index, int value) { descriptorBindingVariableDescriptorCount(this.segment(), index, value); return this; }

    /// {@return `runtimeDescriptorArray` at the given index}
    /// @param index the index of the struct buffer
    public int runtimeDescriptorArrayAt(long index) { return runtimeDescriptorArray(this.segment(), index); }
    /// Sets `runtimeDescriptorArray` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features runtimeDescriptorArrayAt(long index, int value) { runtimeDescriptorArray(this.segment(), index, value); return this; }

    /// {@return `samplerFilterMinmax` at the given index}
    /// @param index the index of the struct buffer
    public int samplerFilterMinmaxAt(long index) { return samplerFilterMinmax(this.segment(), index); }
    /// Sets `samplerFilterMinmax` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features samplerFilterMinmaxAt(long index, int value) { samplerFilterMinmax(this.segment(), index, value); return this; }

    /// {@return `scalarBlockLayout` at the given index}
    /// @param index the index of the struct buffer
    public int scalarBlockLayoutAt(long index) { return scalarBlockLayout(this.segment(), index); }
    /// Sets `scalarBlockLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features scalarBlockLayoutAt(long index, int value) { scalarBlockLayout(this.segment(), index, value); return this; }

    /// {@return `imagelessFramebuffer` at the given index}
    /// @param index the index of the struct buffer
    public int imagelessFramebufferAt(long index) { return imagelessFramebuffer(this.segment(), index); }
    /// Sets `imagelessFramebuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features imagelessFramebufferAt(long index, int value) { imagelessFramebuffer(this.segment(), index, value); return this; }

    /// {@return `uniformBufferStandardLayout` at the given index}
    /// @param index the index of the struct buffer
    public int uniformBufferStandardLayoutAt(long index) { return uniformBufferStandardLayout(this.segment(), index); }
    /// Sets `uniformBufferStandardLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features uniformBufferStandardLayoutAt(long index, int value) { uniformBufferStandardLayout(this.segment(), index, value); return this; }

    /// {@return `shaderSubgroupExtendedTypes` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSubgroupExtendedTypesAt(long index) { return shaderSubgroupExtendedTypes(this.segment(), index); }
    /// Sets `shaderSubgroupExtendedTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderSubgroupExtendedTypesAt(long index, int value) { shaderSubgroupExtendedTypes(this.segment(), index, value); return this; }

    /// {@return `separateDepthStencilLayouts` at the given index}
    /// @param index the index of the struct buffer
    public int separateDepthStencilLayoutsAt(long index) { return separateDepthStencilLayouts(this.segment(), index); }
    /// Sets `separateDepthStencilLayouts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features separateDepthStencilLayoutsAt(long index, int value) { separateDepthStencilLayouts(this.segment(), index, value); return this; }

    /// {@return `hostQueryReset` at the given index}
    /// @param index the index of the struct buffer
    public int hostQueryResetAt(long index) { return hostQueryReset(this.segment(), index); }
    /// Sets `hostQueryReset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features hostQueryResetAt(long index, int value) { hostQueryReset(this.segment(), index, value); return this; }

    /// {@return `timelineSemaphore` at the given index}
    /// @param index the index of the struct buffer
    public int timelineSemaphoreAt(long index) { return timelineSemaphore(this.segment(), index); }
    /// Sets `timelineSemaphore` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features timelineSemaphoreAt(long index, int value) { timelineSemaphore(this.segment(), index, value); return this; }

    /// {@return `bufferDeviceAddress` at the given index}
    /// @param index the index of the struct buffer
    public int bufferDeviceAddressAt(long index) { return bufferDeviceAddress(this.segment(), index); }
    /// Sets `bufferDeviceAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressAt(long index, int value) { bufferDeviceAddress(this.segment(), index, value); return this; }

    /// {@return `bufferDeviceAddressCaptureReplay` at the given index}
    /// @param index the index of the struct buffer
    public int bufferDeviceAddressCaptureReplayAt(long index) { return bufferDeviceAddressCaptureReplay(this.segment(), index); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressCaptureReplayAt(long index, int value) { bufferDeviceAddressCaptureReplay(this.segment(), index, value); return this; }

    /// {@return `bufferDeviceAddressMultiDevice` at the given index}
    /// @param index the index of the struct buffer
    public int bufferDeviceAddressMultiDeviceAt(long index) { return bufferDeviceAddressMultiDevice(this.segment(), index); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressMultiDeviceAt(long index, int value) { bufferDeviceAddressMultiDevice(this.segment(), index, value); return this; }

    /// {@return `vulkanMemoryModel` at the given index}
    /// @param index the index of the struct buffer
    public int vulkanMemoryModelAt(long index) { return vulkanMemoryModel(this.segment(), index); }
    /// Sets `vulkanMemoryModel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelAt(long index, int value) { vulkanMemoryModel(this.segment(), index, value); return this; }

    /// {@return `vulkanMemoryModelDeviceScope` at the given index}
    /// @param index the index of the struct buffer
    public int vulkanMemoryModelDeviceScopeAt(long index) { return vulkanMemoryModelDeviceScope(this.segment(), index); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelDeviceScopeAt(long index, int value) { vulkanMemoryModelDeviceScope(this.segment(), index, value); return this; }

    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains` at the given index}
    /// @param index the index of the struct buffer
    public int vulkanMemoryModelAvailabilityVisibilityChainsAt(long index) { return vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), index); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelAvailabilityVisibilityChainsAt(long index, int value) { vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), index, value); return this; }

    /// {@return `shaderOutputViewportIndex` at the given index}
    /// @param index the index of the struct buffer
    public int shaderOutputViewportIndexAt(long index) { return shaderOutputViewportIndex(this.segment(), index); }
    /// Sets `shaderOutputViewportIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderOutputViewportIndexAt(long index, int value) { shaderOutputViewportIndex(this.segment(), index, value); return this; }

    /// {@return `shaderOutputLayer` at the given index}
    /// @param index the index of the struct buffer
    public int shaderOutputLayerAt(long index) { return shaderOutputLayer(this.segment(), index); }
    /// Sets `shaderOutputLayer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderOutputLayerAt(long index, int value) { shaderOutputLayer(this.segment(), index, value); return this; }

    /// {@return `subgroupBroadcastDynamicId` at the given index}
    /// @param index the index of the struct buffer
    public int subgroupBroadcastDynamicIdAt(long index) { return subgroupBroadcastDynamicId(this.segment(), index); }
    /// Sets `subgroupBroadcastDynamicId` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features subgroupBroadcastDynamicIdAt(long index, int value) { subgroupBroadcastDynamicId(this.segment(), index, value); return this; }

}

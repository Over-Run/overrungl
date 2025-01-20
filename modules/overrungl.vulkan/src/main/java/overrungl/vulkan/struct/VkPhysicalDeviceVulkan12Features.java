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
/// ### samplerMirrorClampToEdge
/// [VarHandle][#VH_samplerMirrorClampToEdge] - [Getter][#samplerMirrorClampToEdge()] - [Setter][#samplerMirrorClampToEdge(int)]
/// ### drawIndirectCount
/// [VarHandle][#VH_drawIndirectCount] - [Getter][#drawIndirectCount()] - [Setter][#drawIndirectCount(int)]
/// ### storageBuffer8BitAccess
/// [VarHandle][#VH_storageBuffer8BitAccess] - [Getter][#storageBuffer8BitAccess()] - [Setter][#storageBuffer8BitAccess(int)]
/// ### uniformAndStorageBuffer8BitAccess
/// [VarHandle][#VH_uniformAndStorageBuffer8BitAccess] - [Getter][#uniformAndStorageBuffer8BitAccess()] - [Setter][#uniformAndStorageBuffer8BitAccess(int)]
/// ### storagePushConstant8
/// [VarHandle][#VH_storagePushConstant8] - [Getter][#storagePushConstant8()] - [Setter][#storagePushConstant8(int)]
/// ### shaderBufferInt64Atomics
/// [VarHandle][#VH_shaderBufferInt64Atomics] - [Getter][#shaderBufferInt64Atomics()] - [Setter][#shaderBufferInt64Atomics(int)]
/// ### shaderSharedInt64Atomics
/// [VarHandle][#VH_shaderSharedInt64Atomics] - [Getter][#shaderSharedInt64Atomics()] - [Setter][#shaderSharedInt64Atomics(int)]
/// ### shaderFloat16
/// [VarHandle][#VH_shaderFloat16] - [Getter][#shaderFloat16()] - [Setter][#shaderFloat16(int)]
/// ### shaderInt8
/// [VarHandle][#VH_shaderInt8] - [Getter][#shaderInt8()] - [Setter][#shaderInt8(int)]
/// ### descriptorIndexing
/// [VarHandle][#VH_descriptorIndexing] - [Getter][#descriptorIndexing()] - [Setter][#descriptorIndexing(int)]
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
/// ### samplerFilterMinmax
/// [VarHandle][#VH_samplerFilterMinmax] - [Getter][#samplerFilterMinmax()] - [Setter][#samplerFilterMinmax(int)]
/// ### scalarBlockLayout
/// [VarHandle][#VH_scalarBlockLayout] - [Getter][#scalarBlockLayout()] - [Setter][#scalarBlockLayout(int)]
/// ### imagelessFramebuffer
/// [VarHandle][#VH_imagelessFramebuffer] - [Getter][#imagelessFramebuffer()] - [Setter][#imagelessFramebuffer(int)]
/// ### uniformBufferStandardLayout
/// [VarHandle][#VH_uniformBufferStandardLayout] - [Getter][#uniformBufferStandardLayout()] - [Setter][#uniformBufferStandardLayout(int)]
/// ### shaderSubgroupExtendedTypes
/// [VarHandle][#VH_shaderSubgroupExtendedTypes] - [Getter][#shaderSubgroupExtendedTypes()] - [Setter][#shaderSubgroupExtendedTypes(int)]
/// ### separateDepthStencilLayouts
/// [VarHandle][#VH_separateDepthStencilLayouts] - [Getter][#separateDepthStencilLayouts()] - [Setter][#separateDepthStencilLayouts(int)]
/// ### hostQueryReset
/// [VarHandle][#VH_hostQueryReset] - [Getter][#hostQueryReset()] - [Setter][#hostQueryReset(int)]
/// ### timelineSemaphore
/// [VarHandle][#VH_timelineSemaphore] - [Getter][#timelineSemaphore()] - [Setter][#timelineSemaphore(int)]
/// ### bufferDeviceAddress
/// [VarHandle][#VH_bufferDeviceAddress] - [Getter][#bufferDeviceAddress()] - [Setter][#bufferDeviceAddress(int)]
/// ### bufferDeviceAddressCaptureReplay
/// [VarHandle][#VH_bufferDeviceAddressCaptureReplay] - [Getter][#bufferDeviceAddressCaptureReplay()] - [Setter][#bufferDeviceAddressCaptureReplay(int)]
/// ### bufferDeviceAddressMultiDevice
/// [VarHandle][#VH_bufferDeviceAddressMultiDevice] - [Getter][#bufferDeviceAddressMultiDevice()] - [Setter][#bufferDeviceAddressMultiDevice(int)]
/// ### vulkanMemoryModel
/// [VarHandle][#VH_vulkanMemoryModel] - [Getter][#vulkanMemoryModel()] - [Setter][#vulkanMemoryModel(int)]
/// ### vulkanMemoryModelDeviceScope
/// [VarHandle][#VH_vulkanMemoryModelDeviceScope] - [Getter][#vulkanMemoryModelDeviceScope()] - [Setter][#vulkanMemoryModelDeviceScope(int)]
/// ### vulkanMemoryModelAvailabilityVisibilityChains
/// [VarHandle][#VH_vulkanMemoryModelAvailabilityVisibilityChains] - [Getter][#vulkanMemoryModelAvailabilityVisibilityChains()] - [Setter][#vulkanMemoryModelAvailabilityVisibilityChains(int)]
/// ### shaderOutputViewportIndex
/// [VarHandle][#VH_shaderOutputViewportIndex] - [Getter][#shaderOutputViewportIndex()] - [Setter][#shaderOutputViewportIndex(int)]
/// ### shaderOutputLayer
/// [VarHandle][#VH_shaderOutputLayer] - [Getter][#shaderOutputLayer()] - [Setter][#shaderOutputLayer(int)]
/// ### subgroupBroadcastDynamicId
/// [VarHandle][#VH_subgroupBroadcastDynamicId] - [Getter][#subgroupBroadcastDynamicId()] - [Setter][#subgroupBroadcastDynamicId(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVulkan12Features {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 samplerMirrorClampToEdge;
///     VkBool32 drawIndirectCount;
///     VkBool32 storageBuffer8BitAccess;
///     VkBool32 uniformAndStorageBuffer8BitAccess;
///     VkBool32 storagePushConstant8;
///     VkBool32 shaderBufferInt64Atomics;
///     VkBool32 shaderSharedInt64Atomics;
///     VkBool32 shaderFloat16;
///     VkBool32 shaderInt8;
///     VkBool32 descriptorIndexing;
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
///     VkBool32 samplerFilterMinmax;
///     VkBool32 scalarBlockLayout;
///     VkBool32 imagelessFramebuffer;
///     VkBool32 uniformBufferStandardLayout;
///     VkBool32 shaderSubgroupExtendedTypes;
///     VkBool32 separateDepthStencilLayouts;
///     VkBool32 hostQueryReset;
///     VkBool32 timelineSemaphore;
///     VkBool32 bufferDeviceAddress;
///     VkBool32 bufferDeviceAddressCaptureReplay;
///     VkBool32 bufferDeviceAddressMultiDevice;
///     VkBool32 vulkanMemoryModel;
///     VkBool32 vulkanMemoryModelDeviceScope;
///     VkBool32 vulkanMemoryModelAvailabilityVisibilityChains;
///     VkBool32 shaderOutputViewportIndex;
///     VkBool32 shaderOutputLayer;
///     VkBool32 subgroupBroadcastDynamicId;
/// } VkPhysicalDeviceVulkan12Features;
/// ```
public sealed class VkPhysicalDeviceVulkan12Features extends Struct {
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
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `samplerMirrorClampToEdge` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_samplerMirrorClampToEdge = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerMirrorClampToEdge"));
    /// The [VarHandle] of `drawIndirectCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_drawIndirectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drawIndirectCount"));
    /// The [VarHandle] of `storageBuffer8BitAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storageBuffer8BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffer8BitAccess"));
    /// The [VarHandle] of `uniformAndStorageBuffer8BitAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_uniformAndStorageBuffer8BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    /// The [VarHandle] of `storagePushConstant8` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storagePushConstant8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storagePushConstant8"));
    /// The [VarHandle] of `shaderBufferInt64Atomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderBufferInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferInt64Atomics"));
    /// The [VarHandle] of `shaderSharedInt64Atomics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSharedInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedInt64Atomics"));
    /// The [VarHandle] of `shaderFloat16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat16"));
    /// The [VarHandle] of `shaderInt8` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderInt8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInt8"));
    /// The [VarHandle] of `descriptorIndexing` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorIndexing"));
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
    /// The [VarHandle] of `samplerFilterMinmax` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_samplerFilterMinmax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerFilterMinmax"));
    /// The [VarHandle] of `scalarBlockLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_scalarBlockLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scalarBlockLayout"));
    /// The [VarHandle] of `imagelessFramebuffer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imagelessFramebuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imagelessFramebuffer"));
    /// The [VarHandle] of `uniformBufferStandardLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_uniformBufferStandardLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformBufferStandardLayout"));
    /// The [VarHandle] of `shaderSubgroupExtendedTypes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSubgroupExtendedTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupExtendedTypes"));
    /// The [VarHandle] of `separateDepthStencilLayouts` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_separateDepthStencilLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("separateDepthStencilLayouts"));
    /// The [VarHandle] of `hostQueryReset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_hostQueryReset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hostQueryReset"));
    /// The [VarHandle] of `timelineSemaphore` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_timelineSemaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timelineSemaphore"));
    /// The [VarHandle] of `bufferDeviceAddress` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferDeviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddress"));
    /// The [VarHandle] of `bufferDeviceAddressCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferDeviceAddressCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    /// The [VarHandle] of `bufferDeviceAddressMultiDevice` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferDeviceAddressMultiDevice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
    /// The [VarHandle] of `vulkanMemoryModel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vulkanMemoryModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModel"));
    /// The [VarHandle] of `vulkanMemoryModelDeviceScope` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vulkanMemoryModelDeviceScope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    /// The [VarHandle] of `vulkanMemoryModelAvailabilityVisibilityChains` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
    /// The [VarHandle] of `shaderOutputViewportIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderOutputViewportIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderOutputViewportIndex"));
    /// The [VarHandle] of `shaderOutputLayer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderOutputLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderOutputLayer"));
    /// The [VarHandle] of `subgroupBroadcastDynamicId` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subgroupBroadcastDynamicId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupBroadcastDynamicId"));

    /// Creates `VkPhysicalDeviceVulkan12Features` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkan12Features(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkan12Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan12Features of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan12Features(segment); }

    /// Creates `VkPhysicalDeviceVulkan12Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkan12Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan12Features ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan12Features(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVulkan12Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceVulkan12Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan12Features`
    public static VkPhysicalDeviceVulkan12Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan12Features(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkan12Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan12Features`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceVulkan12Features` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan12Features`
    public static VkPhysicalDeviceVulkan12Features allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int samplerMirrorClampToEdge, @CType("VkBool32") int drawIndirectCount, @CType("VkBool32") int storageBuffer8BitAccess, @CType("VkBool32") int uniformAndStorageBuffer8BitAccess, @CType("VkBool32") int storagePushConstant8, @CType("VkBool32") int shaderBufferInt64Atomics, @CType("VkBool32") int shaderSharedInt64Atomics, @CType("VkBool32") int shaderFloat16, @CType("VkBool32") int shaderInt8, @CType("VkBool32") int descriptorIndexing, @CType("VkBool32") int shaderInputAttachmentArrayDynamicIndexing, @CType("VkBool32") int shaderUniformTexelBufferArrayDynamicIndexing, @CType("VkBool32") int shaderStorageTexelBufferArrayDynamicIndexing, @CType("VkBool32") int shaderUniformBufferArrayNonUniformIndexing, @CType("VkBool32") int shaderSampledImageArrayNonUniformIndexing, @CType("VkBool32") int shaderStorageBufferArrayNonUniformIndexing, @CType("VkBool32") int shaderStorageImageArrayNonUniformIndexing, @CType("VkBool32") int shaderInputAttachmentArrayNonUniformIndexing, @CType("VkBool32") int shaderUniformTexelBufferArrayNonUniformIndexing, @CType("VkBool32") int shaderStorageTexelBufferArrayNonUniformIndexing, @CType("VkBool32") int descriptorBindingUniformBufferUpdateAfterBind, @CType("VkBool32") int descriptorBindingSampledImageUpdateAfterBind, @CType("VkBool32") int descriptorBindingStorageImageUpdateAfterBind, @CType("VkBool32") int descriptorBindingStorageBufferUpdateAfterBind, @CType("VkBool32") int descriptorBindingUniformTexelBufferUpdateAfterBind, @CType("VkBool32") int descriptorBindingStorageTexelBufferUpdateAfterBind, @CType("VkBool32") int descriptorBindingUpdateUnusedWhilePending, @CType("VkBool32") int descriptorBindingPartiallyBound, @CType("VkBool32") int descriptorBindingVariableDescriptorCount, @CType("VkBool32") int runtimeDescriptorArray, @CType("VkBool32") int samplerFilterMinmax, @CType("VkBool32") int scalarBlockLayout, @CType("VkBool32") int imagelessFramebuffer, @CType("VkBool32") int uniformBufferStandardLayout, @CType("VkBool32") int shaderSubgroupExtendedTypes, @CType("VkBool32") int separateDepthStencilLayouts, @CType("VkBool32") int hostQueryReset, @CType("VkBool32") int timelineSemaphore, @CType("VkBool32") int bufferDeviceAddress, @CType("VkBool32") int bufferDeviceAddressCaptureReplay, @CType("VkBool32") int bufferDeviceAddressMultiDevice, @CType("VkBool32") int vulkanMemoryModel, @CType("VkBool32") int vulkanMemoryModelDeviceScope, @CType("VkBool32") int vulkanMemoryModelAvailabilityVisibilityChains, @CType("VkBool32") int shaderOutputViewportIndex, @CType("VkBool32") int shaderOutputLayer, @CType("VkBool32") int subgroupBroadcastDynamicId) { return alloc(allocator).sType(sType).pNext(pNext).samplerMirrorClampToEdge(samplerMirrorClampToEdge).drawIndirectCount(drawIndirectCount).storageBuffer8BitAccess(storageBuffer8BitAccess).uniformAndStorageBuffer8BitAccess(uniformAndStorageBuffer8BitAccess).storagePushConstant8(storagePushConstant8).shaderBufferInt64Atomics(shaderBufferInt64Atomics).shaderSharedInt64Atomics(shaderSharedInt64Atomics).shaderFloat16(shaderFloat16).shaderInt8(shaderInt8).descriptorIndexing(descriptorIndexing).shaderInputAttachmentArrayDynamicIndexing(shaderInputAttachmentArrayDynamicIndexing).shaderUniformTexelBufferArrayDynamicIndexing(shaderUniformTexelBufferArrayDynamicIndexing).shaderStorageTexelBufferArrayDynamicIndexing(shaderStorageTexelBufferArrayDynamicIndexing).shaderUniformBufferArrayNonUniformIndexing(shaderUniformBufferArrayNonUniformIndexing).shaderSampledImageArrayNonUniformIndexing(shaderSampledImageArrayNonUniformIndexing).shaderStorageBufferArrayNonUniformIndexing(shaderStorageBufferArrayNonUniformIndexing).shaderStorageImageArrayNonUniformIndexing(shaderStorageImageArrayNonUniformIndexing).shaderInputAttachmentArrayNonUniformIndexing(shaderInputAttachmentArrayNonUniformIndexing).shaderUniformTexelBufferArrayNonUniformIndexing(shaderUniformTexelBufferArrayNonUniformIndexing).shaderStorageTexelBufferArrayNonUniformIndexing(shaderStorageTexelBufferArrayNonUniformIndexing).descriptorBindingUniformBufferUpdateAfterBind(descriptorBindingUniformBufferUpdateAfterBind).descriptorBindingSampledImageUpdateAfterBind(descriptorBindingSampledImageUpdateAfterBind).descriptorBindingStorageImageUpdateAfterBind(descriptorBindingStorageImageUpdateAfterBind).descriptorBindingStorageBufferUpdateAfterBind(descriptorBindingStorageBufferUpdateAfterBind).descriptorBindingUniformTexelBufferUpdateAfterBind(descriptorBindingUniformTexelBufferUpdateAfterBind).descriptorBindingStorageTexelBufferUpdateAfterBind(descriptorBindingStorageTexelBufferUpdateAfterBind).descriptorBindingUpdateUnusedWhilePending(descriptorBindingUpdateUnusedWhilePending).descriptorBindingPartiallyBound(descriptorBindingPartiallyBound).descriptorBindingVariableDescriptorCount(descriptorBindingVariableDescriptorCount).runtimeDescriptorArray(runtimeDescriptorArray).samplerFilterMinmax(samplerFilterMinmax).scalarBlockLayout(scalarBlockLayout).imagelessFramebuffer(imagelessFramebuffer).uniformBufferStandardLayout(uniformBufferStandardLayout).shaderSubgroupExtendedTypes(shaderSubgroupExtendedTypes).separateDepthStencilLayouts(separateDepthStencilLayouts).hostQueryReset(hostQueryReset).timelineSemaphore(timelineSemaphore).bufferDeviceAddress(bufferDeviceAddress).bufferDeviceAddressCaptureReplay(bufferDeviceAddressCaptureReplay).bufferDeviceAddressMultiDevice(bufferDeviceAddressMultiDevice).vulkanMemoryModel(vulkanMemoryModel).vulkanMemoryModelDeviceScope(vulkanMemoryModelDeviceScope).vulkanMemoryModelAvailabilityVisibilityChains(vulkanMemoryModelAvailabilityVisibilityChains).shaderOutputViewportIndex(shaderOutputViewportIndex).shaderOutputLayer(shaderOutputLayer).subgroupBroadcastDynamicId(subgroupBroadcastDynamicId); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features copyFrom(VkPhysicalDeviceVulkan12Features src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVulkan12Features.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan12Features.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVulkan12Features.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceVulkan12Features.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceVulkan12Features.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceVulkan12Features.set_pNext(this.segment(), value); return this; }

    /// {@return `samplerMirrorClampToEdge` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_samplerMirrorClampToEdge(MemorySegment segment, long index) { return (int) VH_samplerMirrorClampToEdge.get(segment, 0L, index); }
    /// {@return `samplerMirrorClampToEdge`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_samplerMirrorClampToEdge(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_samplerMirrorClampToEdge(segment, 0L); }
    /// {@return `samplerMirrorClampToEdge`}
    public @CType("VkBool32") int samplerMirrorClampToEdge() { return VkPhysicalDeviceVulkan12Features.get_samplerMirrorClampToEdge(this.segment()); }
    /// Sets `samplerMirrorClampToEdge` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplerMirrorClampToEdge(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_samplerMirrorClampToEdge.set(segment, 0L, index, value); }
    /// Sets `samplerMirrorClampToEdge` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplerMirrorClampToEdge(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_samplerMirrorClampToEdge(segment, 0L, value); }
    /// Sets `samplerMirrorClampToEdge` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features samplerMirrorClampToEdge(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_samplerMirrorClampToEdge(this.segment(), value); return this; }

    /// {@return `drawIndirectCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_drawIndirectCount(MemorySegment segment, long index) { return (int) VH_drawIndirectCount.get(segment, 0L, index); }
    /// {@return `drawIndirectCount`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_drawIndirectCount(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_drawIndirectCount(segment, 0L); }
    /// {@return `drawIndirectCount`}
    public @CType("VkBool32") int drawIndirectCount() { return VkPhysicalDeviceVulkan12Features.get_drawIndirectCount(this.segment()); }
    /// Sets `drawIndirectCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_drawIndirectCount(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_drawIndirectCount.set(segment, 0L, index, value); }
    /// Sets `drawIndirectCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_drawIndirectCount(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_drawIndirectCount(segment, 0L, value); }
    /// Sets `drawIndirectCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features drawIndirectCount(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_drawIndirectCount(this.segment(), value); return this; }

    /// {@return `storageBuffer8BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_storageBuffer8BitAccess(MemorySegment segment, long index) { return (int) VH_storageBuffer8BitAccess.get(segment, 0L, index); }
    /// {@return `storageBuffer8BitAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_storageBuffer8BitAccess(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_storageBuffer8BitAccess(segment, 0L); }
    /// {@return `storageBuffer8BitAccess`}
    public @CType("VkBool32") int storageBuffer8BitAccess() { return VkPhysicalDeviceVulkan12Features.get_storageBuffer8BitAccess(this.segment()); }
    /// Sets `storageBuffer8BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageBuffer8BitAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_storageBuffer8BitAccess.set(segment, 0L, index, value); }
    /// Sets `storageBuffer8BitAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageBuffer8BitAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_storageBuffer8BitAccess(segment, 0L, value); }
    /// Sets `storageBuffer8BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features storageBuffer8BitAccess(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_storageBuffer8BitAccess(this.segment(), value); return this; }

    /// {@return `uniformAndStorageBuffer8BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_uniformAndStorageBuffer8BitAccess(MemorySegment segment, long index) { return (int) VH_uniformAndStorageBuffer8BitAccess.get(segment, 0L, index); }
    /// {@return `uniformAndStorageBuffer8BitAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_uniformAndStorageBuffer8BitAccess(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_uniformAndStorageBuffer8BitAccess(segment, 0L); }
    /// {@return `uniformAndStorageBuffer8BitAccess`}
    public @CType("VkBool32") int uniformAndStorageBuffer8BitAccess() { return VkPhysicalDeviceVulkan12Features.get_uniformAndStorageBuffer8BitAccess(this.segment()); }
    /// Sets `uniformAndStorageBuffer8BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniformAndStorageBuffer8BitAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_uniformAndStorageBuffer8BitAccess.set(segment, 0L, index, value); }
    /// Sets `uniformAndStorageBuffer8BitAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniformAndStorageBuffer8BitAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_uniformAndStorageBuffer8BitAccess(segment, 0L, value); }
    /// Sets `uniformAndStorageBuffer8BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features uniformAndStorageBuffer8BitAccess(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_uniformAndStorageBuffer8BitAccess(this.segment(), value); return this; }

    /// {@return `storagePushConstant8` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_storagePushConstant8(MemorySegment segment, long index) { return (int) VH_storagePushConstant8.get(segment, 0L, index); }
    /// {@return `storagePushConstant8`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_storagePushConstant8(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_storagePushConstant8(segment, 0L); }
    /// {@return `storagePushConstant8`}
    public @CType("VkBool32") int storagePushConstant8() { return VkPhysicalDeviceVulkan12Features.get_storagePushConstant8(this.segment()); }
    /// Sets `storagePushConstant8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storagePushConstant8(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_storagePushConstant8.set(segment, 0L, index, value); }
    /// Sets `storagePushConstant8` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storagePushConstant8(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_storagePushConstant8(segment, 0L, value); }
    /// Sets `storagePushConstant8` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features storagePushConstant8(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_storagePushConstant8(this.segment(), value); return this; }

    /// {@return `shaderBufferInt64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderBufferInt64Atomics(MemorySegment segment, long index) { return (int) VH_shaderBufferInt64Atomics.get(segment, 0L, index); }
    /// {@return `shaderBufferInt64Atomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderBufferInt64Atomics(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderBufferInt64Atomics(segment, 0L); }
    /// {@return `shaderBufferInt64Atomics`}
    public @CType("VkBool32") int shaderBufferInt64Atomics() { return VkPhysicalDeviceVulkan12Features.get_shaderBufferInt64Atomics(this.segment()); }
    /// Sets `shaderBufferInt64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderBufferInt64Atomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderBufferInt64Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderBufferInt64Atomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderBufferInt64Atomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderBufferInt64Atomics(segment, 0L, value); }
    /// Sets `shaderBufferInt64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderBufferInt64Atomics(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderBufferInt64Atomics(this.segment(), value); return this; }

    /// {@return `shaderSharedInt64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSharedInt64Atomics(MemorySegment segment, long index) { return (int) VH_shaderSharedInt64Atomics.get(segment, 0L, index); }
    /// {@return `shaderSharedInt64Atomics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSharedInt64Atomics(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderSharedInt64Atomics(segment, 0L); }
    /// {@return `shaderSharedInt64Atomics`}
    public @CType("VkBool32") int shaderSharedInt64Atomics() { return VkPhysicalDeviceVulkan12Features.get_shaderSharedInt64Atomics(this.segment()); }
    /// Sets `shaderSharedInt64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSharedInt64Atomics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSharedInt64Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderSharedInt64Atomics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSharedInt64Atomics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderSharedInt64Atomics(segment, 0L, value); }
    /// Sets `shaderSharedInt64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderSharedInt64Atomics(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderSharedInt64Atomics(this.segment(), value); return this; }

    /// {@return `shaderFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderFloat16(MemorySegment segment, long index) { return (int) VH_shaderFloat16.get(segment, 0L, index); }
    /// {@return `shaderFloat16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderFloat16(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderFloat16(segment, 0L); }
    /// {@return `shaderFloat16`}
    public @CType("VkBool32") int shaderFloat16() { return VkPhysicalDeviceVulkan12Features.get_shaderFloat16(this.segment()); }
    /// Sets `shaderFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderFloat16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderFloat16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderFloat16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderFloat16(segment, 0L, value); }
    /// Sets `shaderFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderFloat16(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderFloat16(this.segment(), value); return this; }

    /// {@return `shaderInt8` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderInt8(MemorySegment segment, long index) { return (int) VH_shaderInt8.get(segment, 0L, index); }
    /// {@return `shaderInt8`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderInt8(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderInt8(segment, 0L); }
    /// {@return `shaderInt8`}
    public @CType("VkBool32") int shaderInt8() { return VkPhysicalDeviceVulkan12Features.get_shaderInt8(this.segment()); }
    /// Sets `shaderInt8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderInt8(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderInt8.set(segment, 0L, index, value); }
    /// Sets `shaderInt8` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderInt8(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderInt8(segment, 0L, value); }
    /// Sets `shaderInt8` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderInt8(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderInt8(this.segment(), value); return this; }

    /// {@return `descriptorIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorIndexing(MemorySegment segment, long index) { return (int) VH_descriptorIndexing.get(segment, 0L, index); }
    /// {@return `descriptorIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorIndexing(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_descriptorIndexing(segment, 0L); }
    /// {@return `descriptorIndexing`}
    public @CType("VkBool32") int descriptorIndexing() { return VkPhysicalDeviceVulkan12Features.get_descriptorIndexing(this.segment()); }
    /// Sets `descriptorIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorIndexing.set(segment, 0L, index, value); }
    /// Sets `descriptorIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorIndexing(segment, 0L, value); }
    /// Sets `descriptorIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorIndexing(this.segment(), value); return this; }

    /// {@return `shaderInputAttachmentArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderInputAttachmentArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderInputAttachmentArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderInputAttachmentArrayDynamicIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderInputAttachmentArrayDynamicIndexing(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderInputAttachmentArrayDynamicIndexing(segment, 0L); }
    /// {@return `shaderInputAttachmentArrayDynamicIndexing`}
    public @CType("VkBool32") int shaderInputAttachmentArrayDynamicIndexing() { return VkPhysicalDeviceVulkan12Features.get_shaderInputAttachmentArrayDynamicIndexing(this.segment()); }
    /// Sets `shaderInputAttachmentArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderInputAttachmentArrayDynamicIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderInputAttachmentArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderInputAttachmentArrayDynamicIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderInputAttachmentArrayDynamicIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderInputAttachmentArrayDynamicIndexing(segment, 0L, value); }
    /// Sets `shaderInputAttachmentArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayDynamicIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderInputAttachmentArrayDynamicIndexing(this.segment(), value); return this; }

    /// {@return `shaderUniformTexelBufferArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderUniformTexelBufferArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderUniformTexelBufferArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderUniformTexelBufferArrayDynamicIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderUniformTexelBufferArrayDynamicIndexing(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderUniformTexelBufferArrayDynamicIndexing(segment, 0L); }
    /// {@return `shaderUniformTexelBufferArrayDynamicIndexing`}
    public @CType("VkBool32") int shaderUniformTexelBufferArrayDynamicIndexing() { return VkPhysicalDeviceVulkan12Features.get_shaderUniformTexelBufferArrayDynamicIndexing(this.segment()); }
    /// Sets `shaderUniformTexelBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderUniformTexelBufferArrayDynamicIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderUniformTexelBufferArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderUniformTexelBufferArrayDynamicIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderUniformTexelBufferArrayDynamicIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderUniformTexelBufferArrayDynamicIndexing(segment, 0L, value); }
    /// Sets `shaderUniformTexelBufferArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayDynamicIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderUniformTexelBufferArrayDynamicIndexing(this.segment(), value); return this; }

    /// {@return `shaderStorageTexelBufferArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageTexelBufferArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageTexelBufferArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageTexelBufferArrayDynamicIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageTexelBufferArrayDynamicIndexing(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderStorageTexelBufferArrayDynamicIndexing(segment, 0L); }
    /// {@return `shaderStorageTexelBufferArrayDynamicIndexing`}
    public @CType("VkBool32") int shaderStorageTexelBufferArrayDynamicIndexing() { return VkPhysicalDeviceVulkan12Features.get_shaderStorageTexelBufferArrayDynamicIndexing(this.segment()); }
    /// Sets `shaderStorageTexelBufferArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageTexelBufferArrayDynamicIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageTexelBufferArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageTexelBufferArrayDynamicIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageTexelBufferArrayDynamicIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderStorageTexelBufferArrayDynamicIndexing(segment, 0L, value); }
    /// Sets `shaderStorageTexelBufferArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayDynamicIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderStorageTexelBufferArrayDynamicIndexing(this.segment(), value); return this; }

    /// {@return `shaderUniformBufferArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderUniformBufferArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderUniformBufferArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderUniformBufferArrayNonUniformIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderUniformBufferArrayNonUniformIndexing(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderUniformBufferArrayNonUniformIndexing(segment, 0L); }
    /// {@return `shaderUniformBufferArrayNonUniformIndexing`}
    public @CType("VkBool32") int shaderUniformBufferArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.get_shaderUniformBufferArrayNonUniformIndexing(this.segment()); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderUniformBufferArrayNonUniformIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderUniformBufferArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderUniformBufferArrayNonUniformIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderUniformBufferArrayNonUniformIndexing(segment, 0L, value); }
    /// Sets `shaderUniformBufferArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderUniformBufferArrayNonUniformIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderUniformBufferArrayNonUniformIndexing(this.segment(), value); return this; }

    /// {@return `shaderSampledImageArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSampledImageArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderSampledImageArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderSampledImageArrayNonUniformIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSampledImageArrayNonUniformIndexing(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderSampledImageArrayNonUniformIndexing(segment, 0L); }
    /// {@return `shaderSampledImageArrayNonUniformIndexing`}
    public @CType("VkBool32") int shaderSampledImageArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.get_shaderSampledImageArrayNonUniformIndexing(this.segment()); }
    /// Sets `shaderSampledImageArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSampledImageArrayNonUniformIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSampledImageArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderSampledImageArrayNonUniformIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSampledImageArrayNonUniformIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderSampledImageArrayNonUniformIndexing(segment, 0L, value); }
    /// Sets `shaderSampledImageArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderSampledImageArrayNonUniformIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderSampledImageArrayNonUniformIndexing(this.segment(), value); return this; }

    /// {@return `shaderStorageBufferArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageBufferArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageBufferArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageBufferArrayNonUniformIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageBufferArrayNonUniformIndexing(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderStorageBufferArrayNonUniformIndexing(segment, 0L); }
    /// {@return `shaderStorageBufferArrayNonUniformIndexing`}
    public @CType("VkBool32") int shaderStorageBufferArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.get_shaderStorageBufferArrayNonUniformIndexing(this.segment()); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageBufferArrayNonUniformIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageBufferArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageBufferArrayNonUniformIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderStorageBufferArrayNonUniformIndexing(segment, 0L, value); }
    /// Sets `shaderStorageBufferArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderStorageBufferArrayNonUniformIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderStorageBufferArrayNonUniformIndexing(this.segment(), value); return this; }

    /// {@return `shaderStorageImageArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageImageArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageImageArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageImageArrayNonUniformIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageImageArrayNonUniformIndexing(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderStorageImageArrayNonUniformIndexing(segment, 0L); }
    /// {@return `shaderStorageImageArrayNonUniformIndexing`}
    public @CType("VkBool32") int shaderStorageImageArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.get_shaderStorageImageArrayNonUniformIndexing(this.segment()); }
    /// Sets `shaderStorageImageArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageImageArrayNonUniformIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageImageArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageImageArrayNonUniformIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageImageArrayNonUniformIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderStorageImageArrayNonUniformIndexing(segment, 0L, value); }
    /// Sets `shaderStorageImageArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderStorageImageArrayNonUniformIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderStorageImageArrayNonUniformIndexing(this.segment(), value); return this; }

    /// {@return `shaderInputAttachmentArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderInputAttachmentArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderInputAttachmentArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderInputAttachmentArrayNonUniformIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderInputAttachmentArrayNonUniformIndexing(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderInputAttachmentArrayNonUniformIndexing(segment, 0L); }
    /// {@return `shaderInputAttachmentArrayNonUniformIndexing`}
    public @CType("VkBool32") int shaderInputAttachmentArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.get_shaderInputAttachmentArrayNonUniformIndexing(this.segment()); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderInputAttachmentArrayNonUniformIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderInputAttachmentArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderInputAttachmentArrayNonUniformIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderInputAttachmentArrayNonUniformIndexing(segment, 0L, value); }
    /// Sets `shaderInputAttachmentArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayNonUniformIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderInputAttachmentArrayNonUniformIndexing(this.segment(), value); return this; }

    /// {@return `shaderUniformTexelBufferArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderUniformTexelBufferArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderUniformTexelBufferArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderUniformTexelBufferArrayNonUniformIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderUniformTexelBufferArrayNonUniformIndexing(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderUniformTexelBufferArrayNonUniformIndexing(segment, 0L); }
    /// {@return `shaderUniformTexelBufferArrayNonUniformIndexing`}
    public @CType("VkBool32") int shaderUniformTexelBufferArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.get_shaderUniformTexelBufferArrayNonUniformIndexing(this.segment()); }
    /// Sets `shaderUniformTexelBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderUniformTexelBufferArrayNonUniformIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderUniformTexelBufferArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderUniformTexelBufferArrayNonUniformIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderUniformTexelBufferArrayNonUniformIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderUniformTexelBufferArrayNonUniformIndexing(segment, 0L, value); }
    /// Sets `shaderUniformTexelBufferArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayNonUniformIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderUniformTexelBufferArrayNonUniformIndexing(this.segment(), value); return this; }

    /// {@return `shaderStorageTexelBufferArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderStorageTexelBufferArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageTexelBufferArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageTexelBufferArrayNonUniformIndexing`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderStorageTexelBufferArrayNonUniformIndexing(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderStorageTexelBufferArrayNonUniformIndexing(segment, 0L); }
    /// {@return `shaderStorageTexelBufferArrayNonUniformIndexing`}
    public @CType("VkBool32") int shaderStorageTexelBufferArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.get_shaderStorageTexelBufferArrayNonUniformIndexing(this.segment()); }
    /// Sets `shaderStorageTexelBufferArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStorageTexelBufferArrayNonUniformIndexing(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderStorageTexelBufferArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageTexelBufferArrayNonUniformIndexing` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStorageTexelBufferArrayNonUniformIndexing(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderStorageTexelBufferArrayNonUniformIndexing(segment, 0L, value); }
    /// Sets `shaderStorageTexelBufferArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayNonUniformIndexing(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderStorageTexelBufferArrayNonUniformIndexing(this.segment(), value); return this; }

    /// {@return `descriptorBindingUniformBufferUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingUniformBufferUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingUniformBufferUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingUniformBufferUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingUniformBufferUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingUniformBufferUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingUniformBufferUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingUniformBufferUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingUniformBufferUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingUniformBufferUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingUniformBufferUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingUniformBufferUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingUniformBufferUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingUniformBufferUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingUniformBufferUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingUniformBufferUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformBufferUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingUniformBufferUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `descriptorBindingSampledImageUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingSampledImageUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingSampledImageUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingSampledImageUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingSampledImageUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingSampledImageUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingSampledImageUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingSampledImageUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingSampledImageUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingSampledImageUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingSampledImageUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingSampledImageUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingSampledImageUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingSampledImageUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingSampledImageUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingSampledImageUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingSampledImageUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingSampledImageUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `descriptorBindingStorageImageUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingStorageImageUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingStorageImageUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingStorageImageUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingStorageImageUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingStorageImageUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingStorageImageUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingStorageImageUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingStorageImageUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingStorageImageUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingStorageImageUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingStorageImageUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingStorageImageUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingStorageImageUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingStorageImageUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingStorageImageUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageImageUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingStorageImageUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `descriptorBindingStorageBufferUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingStorageBufferUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingStorageBufferUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingStorageBufferUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingStorageBufferUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingStorageBufferUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingStorageBufferUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingStorageBufferUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingStorageBufferUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingStorageBufferUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingStorageBufferUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingStorageBufferUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingStorageBufferUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingStorageBufferUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingStorageBufferUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingStorageBufferUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageBufferUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingStorageBufferUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `descriptorBindingUniformTexelBufferUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingUniformTexelBufferUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingUniformTexelBufferUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingUniformTexelBufferUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingUniformTexelBufferUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingUniformTexelBufferUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingUniformTexelBufferUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingUniformTexelBufferUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingUniformTexelBufferUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingUniformTexelBufferUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingUniformTexelBufferUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingUniformTexelBufferUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingUniformTexelBufferUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingUniformTexelBufferUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingUniformTexelBufferUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformTexelBufferUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `descriptorBindingStorageTexelBufferUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingStorageTexelBufferUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingStorageTexelBufferUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingStorageTexelBufferUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingStorageTexelBufferUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingStorageTexelBufferUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingStorageTexelBufferUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingStorageTexelBufferUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingStorageTexelBufferUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingStorageTexelBufferUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingStorageTexelBufferUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingStorageTexelBufferUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingStorageTexelBufferUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingStorageTexelBufferUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingStorageTexelBufferUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageTexelBufferUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment(), value); return this; }

    /// {@return `descriptorBindingUpdateUnusedWhilePending` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingUpdateUnusedWhilePending(MemorySegment segment, long index) { return (int) VH_descriptorBindingUpdateUnusedWhilePending.get(segment, 0L, index); }
    /// {@return `descriptorBindingUpdateUnusedWhilePending`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingUpdateUnusedWhilePending(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingUpdateUnusedWhilePending(segment, 0L); }
    /// {@return `descriptorBindingUpdateUnusedWhilePending`}
    public @CType("VkBool32") int descriptorBindingUpdateUnusedWhilePending() { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingUpdateUnusedWhilePending(this.segment()); }
    /// Sets `descriptorBindingUpdateUnusedWhilePending` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingUpdateUnusedWhilePending(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingUpdateUnusedWhilePending.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingUpdateUnusedWhilePending` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingUpdateUnusedWhilePending(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingUpdateUnusedWhilePending(segment, 0L, value); }
    /// Sets `descriptorBindingUpdateUnusedWhilePending` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingUpdateUnusedWhilePending(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingUpdateUnusedWhilePending(this.segment(), value); return this; }

    /// {@return `descriptorBindingPartiallyBound` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingPartiallyBound(MemorySegment segment, long index) { return (int) VH_descriptorBindingPartiallyBound.get(segment, 0L, index); }
    /// {@return `descriptorBindingPartiallyBound`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingPartiallyBound(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingPartiallyBound(segment, 0L); }
    /// {@return `descriptorBindingPartiallyBound`}
    public @CType("VkBool32") int descriptorBindingPartiallyBound() { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingPartiallyBound(this.segment()); }
    /// Sets `descriptorBindingPartiallyBound` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingPartiallyBound(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingPartiallyBound.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingPartiallyBound` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingPartiallyBound(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingPartiallyBound(segment, 0L, value); }
    /// Sets `descriptorBindingPartiallyBound` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingPartiallyBound(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingPartiallyBound(this.segment(), value); return this; }

    /// {@return `descriptorBindingVariableDescriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingVariableDescriptorCount(MemorySegment segment, long index) { return (int) VH_descriptorBindingVariableDescriptorCount.get(segment, 0L, index); }
    /// {@return `descriptorBindingVariableDescriptorCount`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingVariableDescriptorCount(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingVariableDescriptorCount(segment, 0L); }
    /// {@return `descriptorBindingVariableDescriptorCount`}
    public @CType("VkBool32") int descriptorBindingVariableDescriptorCount() { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingVariableDescriptorCount(this.segment()); }
    /// Sets `descriptorBindingVariableDescriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingVariableDescriptorCount(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingVariableDescriptorCount.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingVariableDescriptorCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingVariableDescriptorCount(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingVariableDescriptorCount(segment, 0L, value); }
    /// Sets `descriptorBindingVariableDescriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features descriptorBindingVariableDescriptorCount(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingVariableDescriptorCount(this.segment(), value); return this; }

    /// {@return `runtimeDescriptorArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_runtimeDescriptorArray(MemorySegment segment, long index) { return (int) VH_runtimeDescriptorArray.get(segment, 0L, index); }
    /// {@return `runtimeDescriptorArray`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_runtimeDescriptorArray(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_runtimeDescriptorArray(segment, 0L); }
    /// {@return `runtimeDescriptorArray`}
    public @CType("VkBool32") int runtimeDescriptorArray() { return VkPhysicalDeviceVulkan12Features.get_runtimeDescriptorArray(this.segment()); }
    /// Sets `runtimeDescriptorArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_runtimeDescriptorArray(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_runtimeDescriptorArray.set(segment, 0L, index, value); }
    /// Sets `runtimeDescriptorArray` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_runtimeDescriptorArray(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_runtimeDescriptorArray(segment, 0L, value); }
    /// Sets `runtimeDescriptorArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features runtimeDescriptorArray(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_runtimeDescriptorArray(this.segment(), value); return this; }

    /// {@return `samplerFilterMinmax` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_samplerFilterMinmax(MemorySegment segment, long index) { return (int) VH_samplerFilterMinmax.get(segment, 0L, index); }
    /// {@return `samplerFilterMinmax`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_samplerFilterMinmax(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_samplerFilterMinmax(segment, 0L); }
    /// {@return `samplerFilterMinmax`}
    public @CType("VkBool32") int samplerFilterMinmax() { return VkPhysicalDeviceVulkan12Features.get_samplerFilterMinmax(this.segment()); }
    /// Sets `samplerFilterMinmax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplerFilterMinmax(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_samplerFilterMinmax.set(segment, 0L, index, value); }
    /// Sets `samplerFilterMinmax` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplerFilterMinmax(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_samplerFilterMinmax(segment, 0L, value); }
    /// Sets `samplerFilterMinmax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features samplerFilterMinmax(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_samplerFilterMinmax(this.segment(), value); return this; }

    /// {@return `scalarBlockLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_scalarBlockLayout(MemorySegment segment, long index) { return (int) VH_scalarBlockLayout.get(segment, 0L, index); }
    /// {@return `scalarBlockLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_scalarBlockLayout(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_scalarBlockLayout(segment, 0L); }
    /// {@return `scalarBlockLayout`}
    public @CType("VkBool32") int scalarBlockLayout() { return VkPhysicalDeviceVulkan12Features.get_scalarBlockLayout(this.segment()); }
    /// Sets `scalarBlockLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_scalarBlockLayout(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_scalarBlockLayout.set(segment, 0L, index, value); }
    /// Sets `scalarBlockLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_scalarBlockLayout(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_scalarBlockLayout(segment, 0L, value); }
    /// Sets `scalarBlockLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features scalarBlockLayout(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_scalarBlockLayout(this.segment(), value); return this; }

    /// {@return `imagelessFramebuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_imagelessFramebuffer(MemorySegment segment, long index) { return (int) VH_imagelessFramebuffer.get(segment, 0L, index); }
    /// {@return `imagelessFramebuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_imagelessFramebuffer(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_imagelessFramebuffer(segment, 0L); }
    /// {@return `imagelessFramebuffer`}
    public @CType("VkBool32") int imagelessFramebuffer() { return VkPhysicalDeviceVulkan12Features.get_imagelessFramebuffer(this.segment()); }
    /// Sets `imagelessFramebuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imagelessFramebuffer(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_imagelessFramebuffer.set(segment, 0L, index, value); }
    /// Sets `imagelessFramebuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imagelessFramebuffer(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_imagelessFramebuffer(segment, 0L, value); }
    /// Sets `imagelessFramebuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features imagelessFramebuffer(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_imagelessFramebuffer(this.segment(), value); return this; }

    /// {@return `uniformBufferStandardLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_uniformBufferStandardLayout(MemorySegment segment, long index) { return (int) VH_uniformBufferStandardLayout.get(segment, 0L, index); }
    /// {@return `uniformBufferStandardLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_uniformBufferStandardLayout(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_uniformBufferStandardLayout(segment, 0L); }
    /// {@return `uniformBufferStandardLayout`}
    public @CType("VkBool32") int uniformBufferStandardLayout() { return VkPhysicalDeviceVulkan12Features.get_uniformBufferStandardLayout(this.segment()); }
    /// Sets `uniformBufferStandardLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniformBufferStandardLayout(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_uniformBufferStandardLayout.set(segment, 0L, index, value); }
    /// Sets `uniformBufferStandardLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniformBufferStandardLayout(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_uniformBufferStandardLayout(segment, 0L, value); }
    /// Sets `uniformBufferStandardLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features uniformBufferStandardLayout(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_uniformBufferStandardLayout(this.segment(), value); return this; }

    /// {@return `shaderSubgroupExtendedTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSubgroupExtendedTypes(MemorySegment segment, long index) { return (int) VH_shaderSubgroupExtendedTypes.get(segment, 0L, index); }
    /// {@return `shaderSubgroupExtendedTypes`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSubgroupExtendedTypes(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderSubgroupExtendedTypes(segment, 0L); }
    /// {@return `shaderSubgroupExtendedTypes`}
    public @CType("VkBool32") int shaderSubgroupExtendedTypes() { return VkPhysicalDeviceVulkan12Features.get_shaderSubgroupExtendedTypes(this.segment()); }
    /// Sets `shaderSubgroupExtendedTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSubgroupExtendedTypes(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSubgroupExtendedTypes.set(segment, 0L, index, value); }
    /// Sets `shaderSubgroupExtendedTypes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSubgroupExtendedTypes(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderSubgroupExtendedTypes(segment, 0L, value); }
    /// Sets `shaderSubgroupExtendedTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderSubgroupExtendedTypes(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderSubgroupExtendedTypes(this.segment(), value); return this; }

    /// {@return `separateDepthStencilLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_separateDepthStencilLayouts(MemorySegment segment, long index) { return (int) VH_separateDepthStencilLayouts.get(segment, 0L, index); }
    /// {@return `separateDepthStencilLayouts`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_separateDepthStencilLayouts(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_separateDepthStencilLayouts(segment, 0L); }
    /// {@return `separateDepthStencilLayouts`}
    public @CType("VkBool32") int separateDepthStencilLayouts() { return VkPhysicalDeviceVulkan12Features.get_separateDepthStencilLayouts(this.segment()); }
    /// Sets `separateDepthStencilLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_separateDepthStencilLayouts(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_separateDepthStencilLayouts.set(segment, 0L, index, value); }
    /// Sets `separateDepthStencilLayouts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_separateDepthStencilLayouts(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_separateDepthStencilLayouts(segment, 0L, value); }
    /// Sets `separateDepthStencilLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features separateDepthStencilLayouts(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_separateDepthStencilLayouts(this.segment(), value); return this; }

    /// {@return `hostQueryReset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_hostQueryReset(MemorySegment segment, long index) { return (int) VH_hostQueryReset.get(segment, 0L, index); }
    /// {@return `hostQueryReset`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_hostQueryReset(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_hostQueryReset(segment, 0L); }
    /// {@return `hostQueryReset`}
    public @CType("VkBool32") int hostQueryReset() { return VkPhysicalDeviceVulkan12Features.get_hostQueryReset(this.segment()); }
    /// Sets `hostQueryReset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hostQueryReset(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_hostQueryReset.set(segment, 0L, index, value); }
    /// Sets `hostQueryReset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hostQueryReset(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_hostQueryReset(segment, 0L, value); }
    /// Sets `hostQueryReset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features hostQueryReset(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_hostQueryReset(this.segment(), value); return this; }

    /// {@return `timelineSemaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_timelineSemaphore(MemorySegment segment, long index) { return (int) VH_timelineSemaphore.get(segment, 0L, index); }
    /// {@return `timelineSemaphore`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_timelineSemaphore(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_timelineSemaphore(segment, 0L); }
    /// {@return `timelineSemaphore`}
    public @CType("VkBool32") int timelineSemaphore() { return VkPhysicalDeviceVulkan12Features.get_timelineSemaphore(this.segment()); }
    /// Sets `timelineSemaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_timelineSemaphore(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_timelineSemaphore.set(segment, 0L, index, value); }
    /// Sets `timelineSemaphore` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_timelineSemaphore(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_timelineSemaphore(segment, 0L, value); }
    /// Sets `timelineSemaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features timelineSemaphore(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_timelineSemaphore(this.segment(), value); return this; }

    /// {@return `bufferDeviceAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_bufferDeviceAddress(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddress.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_bufferDeviceAddress(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_bufferDeviceAddress(segment, 0L); }
    /// {@return `bufferDeviceAddress`}
    public @CType("VkBool32") int bufferDeviceAddress() { return VkPhysicalDeviceVulkan12Features.get_bufferDeviceAddress(this.segment()); }
    /// Sets `bufferDeviceAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferDeviceAddress(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_bufferDeviceAddress.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferDeviceAddress(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_bufferDeviceAddress(segment, 0L, value); }
    /// Sets `bufferDeviceAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddress(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_bufferDeviceAddress(this.segment(), value); return this; }

    /// {@return `bufferDeviceAddressCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_bufferDeviceAddressCaptureReplay(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddressCaptureReplay.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddressCaptureReplay`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_bufferDeviceAddressCaptureReplay(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_bufferDeviceAddressCaptureReplay(segment, 0L); }
    /// {@return `bufferDeviceAddressCaptureReplay`}
    public @CType("VkBool32") int bufferDeviceAddressCaptureReplay() { return VkPhysicalDeviceVulkan12Features.get_bufferDeviceAddressCaptureReplay(this.segment()); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferDeviceAddressCaptureReplay(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_bufferDeviceAddressCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferDeviceAddressCaptureReplay(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_bufferDeviceAddressCaptureReplay(segment, 0L, value); }
    /// Sets `bufferDeviceAddressCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressCaptureReplay(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_bufferDeviceAddressCaptureReplay(this.segment(), value); return this; }

    /// {@return `bufferDeviceAddressMultiDevice` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_bufferDeviceAddressMultiDevice(MemorySegment segment, long index) { return (int) VH_bufferDeviceAddressMultiDevice.get(segment, 0L, index); }
    /// {@return `bufferDeviceAddressMultiDevice`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_bufferDeviceAddressMultiDevice(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_bufferDeviceAddressMultiDevice(segment, 0L); }
    /// {@return `bufferDeviceAddressMultiDevice`}
    public @CType("VkBool32") int bufferDeviceAddressMultiDevice() { return VkPhysicalDeviceVulkan12Features.get_bufferDeviceAddressMultiDevice(this.segment()); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferDeviceAddressMultiDevice(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_bufferDeviceAddressMultiDevice.set(segment, 0L, index, value); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferDeviceAddressMultiDevice(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_bufferDeviceAddressMultiDevice(segment, 0L, value); }
    /// Sets `bufferDeviceAddressMultiDevice` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressMultiDevice(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_bufferDeviceAddressMultiDevice(this.segment(), value); return this; }

    /// {@return `vulkanMemoryModel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_vulkanMemoryModel(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModel.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModel`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_vulkanMemoryModel(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_vulkanMemoryModel(segment, 0L); }
    /// {@return `vulkanMemoryModel`}
    public @CType("VkBool32") int vulkanMemoryModel() { return VkPhysicalDeviceVulkan12Features.get_vulkanMemoryModel(this.segment()); }
    /// Sets `vulkanMemoryModel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vulkanMemoryModel(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_vulkanMemoryModel.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vulkanMemoryModel(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_vulkanMemoryModel(segment, 0L, value); }
    /// Sets `vulkanMemoryModel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModel(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_vulkanMemoryModel(this.segment(), value); return this; }

    /// {@return `vulkanMemoryModelDeviceScope` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_vulkanMemoryModelDeviceScope(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModelDeviceScope.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModelDeviceScope`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_vulkanMemoryModelDeviceScope(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_vulkanMemoryModelDeviceScope(segment, 0L); }
    /// {@return `vulkanMemoryModelDeviceScope`}
    public @CType("VkBool32") int vulkanMemoryModelDeviceScope() { return VkPhysicalDeviceVulkan12Features.get_vulkanMemoryModelDeviceScope(this.segment()); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vulkanMemoryModelDeviceScope(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_vulkanMemoryModelDeviceScope.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vulkanMemoryModelDeviceScope(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_vulkanMemoryModelDeviceScope(segment, 0L, value); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelDeviceScope(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_vulkanMemoryModelDeviceScope(this.segment(), value); return this; }

    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModelAvailabilityVisibilityChains.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_vulkanMemoryModelAvailabilityVisibilityChains(segment, 0L); }
    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains`}
    public @CType("VkBool32") int vulkanMemoryModelAvailabilityVisibilityChains() { return VkPhysicalDeviceVulkan12Features.get_vulkanMemoryModelAvailabilityVisibilityChains(this.segment()); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_vulkanMemoryModelAvailabilityVisibilityChains.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_vulkanMemoryModelAvailabilityVisibilityChains(segment, 0L, value); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelAvailabilityVisibilityChains(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), value); return this; }

    /// {@return `shaderOutputViewportIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderOutputViewportIndex(MemorySegment segment, long index) { return (int) VH_shaderOutputViewportIndex.get(segment, 0L, index); }
    /// {@return `shaderOutputViewportIndex`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderOutputViewportIndex(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderOutputViewportIndex(segment, 0L); }
    /// {@return `shaderOutputViewportIndex`}
    public @CType("VkBool32") int shaderOutputViewportIndex() { return VkPhysicalDeviceVulkan12Features.get_shaderOutputViewportIndex(this.segment()); }
    /// Sets `shaderOutputViewportIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderOutputViewportIndex(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderOutputViewportIndex.set(segment, 0L, index, value); }
    /// Sets `shaderOutputViewportIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderOutputViewportIndex(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderOutputViewportIndex(segment, 0L, value); }
    /// Sets `shaderOutputViewportIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderOutputViewportIndex(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderOutputViewportIndex(this.segment(), value); return this; }

    /// {@return `shaderOutputLayer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderOutputLayer(MemorySegment segment, long index) { return (int) VH_shaderOutputLayer.get(segment, 0L, index); }
    /// {@return `shaderOutputLayer`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderOutputLayer(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_shaderOutputLayer(segment, 0L); }
    /// {@return `shaderOutputLayer`}
    public @CType("VkBool32") int shaderOutputLayer() { return VkPhysicalDeviceVulkan12Features.get_shaderOutputLayer(this.segment()); }
    /// Sets `shaderOutputLayer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderOutputLayer(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderOutputLayer.set(segment, 0L, index, value); }
    /// Sets `shaderOutputLayer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderOutputLayer(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderOutputLayer(segment, 0L, value); }
    /// Sets `shaderOutputLayer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features shaderOutputLayer(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderOutputLayer(this.segment(), value); return this; }

    /// {@return `subgroupBroadcastDynamicId` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_subgroupBroadcastDynamicId(MemorySegment segment, long index) { return (int) VH_subgroupBroadcastDynamicId.get(segment, 0L, index); }
    /// {@return `subgroupBroadcastDynamicId`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_subgroupBroadcastDynamicId(MemorySegment segment) { return VkPhysicalDeviceVulkan12Features.get_subgroupBroadcastDynamicId(segment, 0L); }
    /// {@return `subgroupBroadcastDynamicId`}
    public @CType("VkBool32") int subgroupBroadcastDynamicId() { return VkPhysicalDeviceVulkan12Features.get_subgroupBroadcastDynamicId(this.segment()); }
    /// Sets `subgroupBroadcastDynamicId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subgroupBroadcastDynamicId(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_subgroupBroadcastDynamicId.set(segment, 0L, index, value); }
    /// Sets `subgroupBroadcastDynamicId` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subgroupBroadcastDynamicId(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_subgroupBroadcastDynamicId(segment, 0L, value); }
    /// Sets `subgroupBroadcastDynamicId` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan12Features subgroupBroadcastDynamicId(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_subgroupBroadcastDynamicId(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceVulkan12Features].
    public static final class Buffer extends VkPhysicalDeviceVulkan12Features {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceVulkan12Features.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceVulkan12Features`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceVulkan12Features`
        public VkPhysicalDeviceVulkan12Features asSlice(long index) { return new VkPhysicalDeviceVulkan12Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceVulkan12Features`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceVulkan12Features`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVulkan12Features.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan12Features.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceVulkan12Features.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceVulkan12Features.set_pNext(this.segment(), index, value); return this; }

        /// {@return `samplerMirrorClampToEdge` at the given index}
        /// @param index the index
        public @CType("VkBool32") int samplerMirrorClampToEdgeAt(long index) { return VkPhysicalDeviceVulkan12Features.get_samplerMirrorClampToEdge(this.segment(), index); }
        /// Sets `samplerMirrorClampToEdge` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer samplerMirrorClampToEdgeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_samplerMirrorClampToEdge(this.segment(), index, value); return this; }

        /// {@return `drawIndirectCount` at the given index}
        /// @param index the index
        public @CType("VkBool32") int drawIndirectCountAt(long index) { return VkPhysicalDeviceVulkan12Features.get_drawIndirectCount(this.segment(), index); }
        /// Sets `drawIndirectCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer drawIndirectCountAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_drawIndirectCount(this.segment(), index, value); return this; }

        /// {@return `storageBuffer8BitAccess` at the given index}
        /// @param index the index
        public @CType("VkBool32") int storageBuffer8BitAccessAt(long index) { return VkPhysicalDeviceVulkan12Features.get_storageBuffer8BitAccess(this.segment(), index); }
        /// Sets `storageBuffer8BitAccess` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer storageBuffer8BitAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_storageBuffer8BitAccess(this.segment(), index, value); return this; }

        /// {@return `uniformAndStorageBuffer8BitAccess` at the given index}
        /// @param index the index
        public @CType("VkBool32") int uniformAndStorageBuffer8BitAccessAt(long index) { return VkPhysicalDeviceVulkan12Features.get_uniformAndStorageBuffer8BitAccess(this.segment(), index); }
        /// Sets `uniformAndStorageBuffer8BitAccess` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer uniformAndStorageBuffer8BitAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_uniformAndStorageBuffer8BitAccess(this.segment(), index, value); return this; }

        /// {@return `storagePushConstant8` at the given index}
        /// @param index the index
        public @CType("VkBool32") int storagePushConstant8At(long index) { return VkPhysicalDeviceVulkan12Features.get_storagePushConstant8(this.segment(), index); }
        /// Sets `storagePushConstant8` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer storagePushConstant8At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_storagePushConstant8(this.segment(), index, value); return this; }

        /// {@return `shaderBufferInt64Atomics` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderBufferInt64AtomicsAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderBufferInt64Atomics(this.segment(), index); }
        /// Sets `shaderBufferInt64Atomics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderBufferInt64AtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderBufferInt64Atomics(this.segment(), index, value); return this; }

        /// {@return `shaderSharedInt64Atomics` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSharedInt64AtomicsAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderSharedInt64Atomics(this.segment(), index); }
        /// Sets `shaderSharedInt64Atomics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSharedInt64AtomicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderSharedInt64Atomics(this.segment(), index, value); return this; }

        /// {@return `shaderFloat16` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderFloat16At(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderFloat16(this.segment(), index); }
        /// Sets `shaderFloat16` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderFloat16At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderFloat16(this.segment(), index, value); return this; }

        /// {@return `shaderInt8` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderInt8At(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderInt8(this.segment(), index); }
        /// Sets `shaderInt8` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderInt8At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderInt8(this.segment(), index, value); return this; }

        /// {@return `descriptorIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorIndexingAt(long index) { return VkPhysicalDeviceVulkan12Features.get_descriptorIndexing(this.segment(), index); }
        /// Sets `descriptorIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderInputAttachmentArrayDynamicIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderInputAttachmentArrayDynamicIndexingAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderInputAttachmentArrayDynamicIndexing(this.segment(), index); }
        /// Sets `shaderInputAttachmentArrayDynamicIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderInputAttachmentArrayDynamicIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderInputAttachmentArrayDynamicIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderUniformTexelBufferArrayDynamicIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderUniformTexelBufferArrayDynamicIndexingAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderUniformTexelBufferArrayDynamicIndexing(this.segment(), index); }
        /// Sets `shaderUniformTexelBufferArrayDynamicIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderUniformTexelBufferArrayDynamicIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderUniformTexelBufferArrayDynamicIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderStorageTexelBufferArrayDynamicIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderStorageTexelBufferArrayDynamicIndexingAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderStorageTexelBufferArrayDynamicIndexing(this.segment(), index); }
        /// Sets `shaderStorageTexelBufferArrayDynamicIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageTexelBufferArrayDynamicIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderStorageTexelBufferArrayDynamicIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderUniformBufferArrayNonUniformIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderUniformBufferArrayNonUniformIndexingAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderUniformBufferArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderUniformBufferArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderUniformBufferArrayNonUniformIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderUniformBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderSampledImageArrayNonUniformIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSampledImageArrayNonUniformIndexingAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderSampledImageArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderSampledImageArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSampledImageArrayNonUniformIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderSampledImageArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderStorageBufferArrayNonUniformIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderStorageBufferArrayNonUniformIndexingAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderStorageBufferArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderStorageBufferArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageBufferArrayNonUniformIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderStorageBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderStorageImageArrayNonUniformIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderStorageImageArrayNonUniformIndexingAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderStorageImageArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderStorageImageArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageImageArrayNonUniformIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderStorageImageArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderInputAttachmentArrayNonUniformIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderInputAttachmentArrayNonUniformIndexingAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderInputAttachmentArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderInputAttachmentArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderInputAttachmentArrayNonUniformIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderInputAttachmentArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderUniformTexelBufferArrayNonUniformIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderUniformTexelBufferArrayNonUniformIndexingAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderUniformTexelBufferArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderUniformTexelBufferArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderUniformTexelBufferArrayNonUniformIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderUniformTexelBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `shaderStorageTexelBufferArrayNonUniformIndexing` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderStorageTexelBufferArrayNonUniformIndexingAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderStorageTexelBufferArrayNonUniformIndexing(this.segment(), index); }
        /// Sets `shaderStorageTexelBufferArrayNonUniformIndexing` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderStorageTexelBufferArrayNonUniformIndexingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderStorageTexelBufferArrayNonUniformIndexing(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingUniformBufferUpdateAfterBind` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingUniformBufferUpdateAfterBindAt(long index) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingUniformBufferUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingUniformBufferUpdateAfterBind` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingUniformBufferUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingUniformBufferUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingSampledImageUpdateAfterBind` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingSampledImageUpdateAfterBindAt(long index) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingSampledImageUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingSampledImageUpdateAfterBind` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingSampledImageUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingSampledImageUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingStorageImageUpdateAfterBind` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingStorageImageUpdateAfterBindAt(long index) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingStorageImageUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingStorageImageUpdateAfterBind` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingStorageImageUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingStorageImageUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingStorageBufferUpdateAfterBind` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingStorageBufferUpdateAfterBindAt(long index) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingStorageBufferUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingStorageBufferUpdateAfterBind` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingStorageBufferUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingStorageBufferUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingUniformTexelBufferUpdateAfterBind` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingUniformTexelBufferUpdateAfterBind` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingUniformTexelBufferUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingStorageTexelBufferUpdateAfterBind` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingStorageTexelBufferUpdateAfterBind` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingStorageTexelBufferUpdateAfterBind(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingUpdateUnusedWhilePending` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingUpdateUnusedWhilePendingAt(long index) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingUpdateUnusedWhilePending(this.segment(), index); }
        /// Sets `descriptorBindingUpdateUnusedWhilePending` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingUpdateUnusedWhilePendingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingUpdateUnusedWhilePending(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingPartiallyBound` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingPartiallyBoundAt(long index) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingPartiallyBound(this.segment(), index); }
        /// Sets `descriptorBindingPartiallyBound` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingPartiallyBoundAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingPartiallyBound(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingVariableDescriptorCount` at the given index}
        /// @param index the index
        public @CType("VkBool32") int descriptorBindingVariableDescriptorCountAt(long index) { return VkPhysicalDeviceVulkan12Features.get_descriptorBindingVariableDescriptorCount(this.segment(), index); }
        /// Sets `descriptorBindingVariableDescriptorCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingVariableDescriptorCountAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_descriptorBindingVariableDescriptorCount(this.segment(), index, value); return this; }

        /// {@return `runtimeDescriptorArray` at the given index}
        /// @param index the index
        public @CType("VkBool32") int runtimeDescriptorArrayAt(long index) { return VkPhysicalDeviceVulkan12Features.get_runtimeDescriptorArray(this.segment(), index); }
        /// Sets `runtimeDescriptorArray` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer runtimeDescriptorArrayAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_runtimeDescriptorArray(this.segment(), index, value); return this; }

        /// {@return `samplerFilterMinmax` at the given index}
        /// @param index the index
        public @CType("VkBool32") int samplerFilterMinmaxAt(long index) { return VkPhysicalDeviceVulkan12Features.get_samplerFilterMinmax(this.segment(), index); }
        /// Sets `samplerFilterMinmax` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer samplerFilterMinmaxAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_samplerFilterMinmax(this.segment(), index, value); return this; }

        /// {@return `scalarBlockLayout` at the given index}
        /// @param index the index
        public @CType("VkBool32") int scalarBlockLayoutAt(long index) { return VkPhysicalDeviceVulkan12Features.get_scalarBlockLayout(this.segment(), index); }
        /// Sets `scalarBlockLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer scalarBlockLayoutAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_scalarBlockLayout(this.segment(), index, value); return this; }

        /// {@return `imagelessFramebuffer` at the given index}
        /// @param index the index
        public @CType("VkBool32") int imagelessFramebufferAt(long index) { return VkPhysicalDeviceVulkan12Features.get_imagelessFramebuffer(this.segment(), index); }
        /// Sets `imagelessFramebuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imagelessFramebufferAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_imagelessFramebuffer(this.segment(), index, value); return this; }

        /// {@return `uniformBufferStandardLayout` at the given index}
        /// @param index the index
        public @CType("VkBool32") int uniformBufferStandardLayoutAt(long index) { return VkPhysicalDeviceVulkan12Features.get_uniformBufferStandardLayout(this.segment(), index); }
        /// Sets `uniformBufferStandardLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer uniformBufferStandardLayoutAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_uniformBufferStandardLayout(this.segment(), index, value); return this; }

        /// {@return `shaderSubgroupExtendedTypes` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSubgroupExtendedTypesAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderSubgroupExtendedTypes(this.segment(), index); }
        /// Sets `shaderSubgroupExtendedTypes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSubgroupExtendedTypesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderSubgroupExtendedTypes(this.segment(), index, value); return this; }

        /// {@return `separateDepthStencilLayouts` at the given index}
        /// @param index the index
        public @CType("VkBool32") int separateDepthStencilLayoutsAt(long index) { return VkPhysicalDeviceVulkan12Features.get_separateDepthStencilLayouts(this.segment(), index); }
        /// Sets `separateDepthStencilLayouts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer separateDepthStencilLayoutsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_separateDepthStencilLayouts(this.segment(), index, value); return this; }

        /// {@return `hostQueryReset` at the given index}
        /// @param index the index
        public @CType("VkBool32") int hostQueryResetAt(long index) { return VkPhysicalDeviceVulkan12Features.get_hostQueryReset(this.segment(), index); }
        /// Sets `hostQueryReset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer hostQueryResetAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_hostQueryReset(this.segment(), index, value); return this; }

        /// {@return `timelineSemaphore` at the given index}
        /// @param index the index
        public @CType("VkBool32") int timelineSemaphoreAt(long index) { return VkPhysicalDeviceVulkan12Features.get_timelineSemaphore(this.segment(), index); }
        /// Sets `timelineSemaphore` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer timelineSemaphoreAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_timelineSemaphore(this.segment(), index, value); return this; }

        /// {@return `bufferDeviceAddress` at the given index}
        /// @param index the index
        public @CType("VkBool32") int bufferDeviceAddressAt(long index) { return VkPhysicalDeviceVulkan12Features.get_bufferDeviceAddress(this.segment(), index); }
        /// Sets `bufferDeviceAddress` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferDeviceAddressAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_bufferDeviceAddress(this.segment(), index, value); return this; }

        /// {@return `bufferDeviceAddressCaptureReplay` at the given index}
        /// @param index the index
        public @CType("VkBool32") int bufferDeviceAddressCaptureReplayAt(long index) { return VkPhysicalDeviceVulkan12Features.get_bufferDeviceAddressCaptureReplay(this.segment(), index); }
        /// Sets `bufferDeviceAddressCaptureReplay` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferDeviceAddressCaptureReplayAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_bufferDeviceAddressCaptureReplay(this.segment(), index, value); return this; }

        /// {@return `bufferDeviceAddressMultiDevice` at the given index}
        /// @param index the index
        public @CType("VkBool32") int bufferDeviceAddressMultiDeviceAt(long index) { return VkPhysicalDeviceVulkan12Features.get_bufferDeviceAddressMultiDevice(this.segment(), index); }
        /// Sets `bufferDeviceAddressMultiDevice` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferDeviceAddressMultiDeviceAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_bufferDeviceAddressMultiDevice(this.segment(), index, value); return this; }

        /// {@return `vulkanMemoryModel` at the given index}
        /// @param index the index
        public @CType("VkBool32") int vulkanMemoryModelAt(long index) { return VkPhysicalDeviceVulkan12Features.get_vulkanMemoryModel(this.segment(), index); }
        /// Sets `vulkanMemoryModel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vulkanMemoryModelAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_vulkanMemoryModel(this.segment(), index, value); return this; }

        /// {@return `vulkanMemoryModelDeviceScope` at the given index}
        /// @param index the index
        public @CType("VkBool32") int vulkanMemoryModelDeviceScopeAt(long index) { return VkPhysicalDeviceVulkan12Features.get_vulkanMemoryModelDeviceScope(this.segment(), index); }
        /// Sets `vulkanMemoryModelDeviceScope` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vulkanMemoryModelDeviceScopeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_vulkanMemoryModelDeviceScope(this.segment(), index, value); return this; }

        /// {@return `vulkanMemoryModelAvailabilityVisibilityChains` at the given index}
        /// @param index the index
        public @CType("VkBool32") int vulkanMemoryModelAvailabilityVisibilityChainsAt(long index) { return VkPhysicalDeviceVulkan12Features.get_vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), index); }
        /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vulkanMemoryModelAvailabilityVisibilityChainsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), index, value); return this; }

        /// {@return `shaderOutputViewportIndex` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderOutputViewportIndexAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderOutputViewportIndex(this.segment(), index); }
        /// Sets `shaderOutputViewportIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderOutputViewportIndexAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderOutputViewportIndex(this.segment(), index, value); return this; }

        /// {@return `shaderOutputLayer` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderOutputLayerAt(long index) { return VkPhysicalDeviceVulkan12Features.get_shaderOutputLayer(this.segment(), index); }
        /// Sets `shaderOutputLayer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderOutputLayerAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_shaderOutputLayer(this.segment(), index, value); return this; }

        /// {@return `subgroupBroadcastDynamicId` at the given index}
        /// @param index the index
        public @CType("VkBool32") int subgroupBroadcastDynamicIdAt(long index) { return VkPhysicalDeviceVulkan12Features.get_subgroupBroadcastDynamicId(this.segment(), index); }
        /// Sets `subgroupBroadcastDynamicId` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subgroupBroadcastDynamicIdAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan12Features.set_subgroupBroadcastDynamicId(this.segment(), index, value); return this; }

    }
}

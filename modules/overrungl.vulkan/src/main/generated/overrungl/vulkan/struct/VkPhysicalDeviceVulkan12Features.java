// This file is auto-generated. DO NOT EDIT!
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
///     VkStructureType sType;
///     void* pNext;
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
/// }
/// ```
public final class VkPhysicalDeviceVulkan12Features extends GroupType {
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
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_samplerMirrorClampToEdge = LAYOUT.byteOffset(PathElement.groupElement("samplerMirrorClampToEdge"));
    public static final long OFFSET_drawIndirectCount = LAYOUT.byteOffset(PathElement.groupElement("drawIndirectCount"));
    public static final long OFFSET_storageBuffer8BitAccess = LAYOUT.byteOffset(PathElement.groupElement("storageBuffer8BitAccess"));
    public static final long OFFSET_uniformAndStorageBuffer8BitAccess = LAYOUT.byteOffset(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    public static final long OFFSET_storagePushConstant8 = LAYOUT.byteOffset(PathElement.groupElement("storagePushConstant8"));
    public static final long OFFSET_shaderBufferInt64Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferInt64Atomics"));
    public static final long OFFSET_shaderSharedInt64Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedInt64Atomics"));
    public static final long OFFSET_shaderFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat16"));
    public static final long OFFSET_shaderInt8 = LAYOUT.byteOffset(PathElement.groupElement("shaderInt8"));
    public static final long OFFSET_descriptorIndexing = LAYOUT.byteOffset(PathElement.groupElement("descriptorIndexing"));
    public static final long OFFSET_shaderInputAttachmentArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
    public static final long OFFSET_shaderUniformTexelBufferArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
    public static final long OFFSET_shaderStorageTexelBufferArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing"));
    public static final long OFFSET_shaderUniformBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing"));
    public static final long OFFSET_shaderSampledImageArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing"));
    public static final long OFFSET_shaderStorageBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing"));
    public static final long OFFSET_shaderStorageImageArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing"));
    public static final long OFFSET_shaderInputAttachmentArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing"));
    public static final long OFFSET_shaderUniformTexelBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing"));
    public static final long OFFSET_shaderStorageTexelBufferArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing"));
    public static final long OFFSET_descriptorBindingUniformBufferUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind"));
    public static final long OFFSET_descriptorBindingSampledImageUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind"));
    public static final long OFFSET_descriptorBindingStorageImageUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind"));
    public static final long OFFSET_descriptorBindingStorageBufferUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind"));
    public static final long OFFSET_descriptorBindingUniformTexelBufferUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind"));
    public static final long OFFSET_descriptorBindingStorageTexelBufferUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind"));
    public static final long OFFSET_descriptorBindingUpdateUnusedWhilePending = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending"));
    public static final long OFFSET_descriptorBindingPartiallyBound = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingPartiallyBound"));
    public static final long OFFSET_descriptorBindingVariableDescriptorCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingVariableDescriptorCount"));
    public static final long OFFSET_runtimeDescriptorArray = LAYOUT.byteOffset(PathElement.groupElement("runtimeDescriptorArray"));
    public static final long OFFSET_samplerFilterMinmax = LAYOUT.byteOffset(PathElement.groupElement("samplerFilterMinmax"));
    public static final long OFFSET_scalarBlockLayout = LAYOUT.byteOffset(PathElement.groupElement("scalarBlockLayout"));
    public static final long OFFSET_imagelessFramebuffer = LAYOUT.byteOffset(PathElement.groupElement("imagelessFramebuffer"));
    public static final long OFFSET_uniformBufferStandardLayout = LAYOUT.byteOffset(PathElement.groupElement("uniformBufferStandardLayout"));
    public static final long OFFSET_shaderSubgroupExtendedTypes = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupExtendedTypes"));
    public static final long OFFSET_separateDepthStencilLayouts = LAYOUT.byteOffset(PathElement.groupElement("separateDepthStencilLayouts"));
    public static final long OFFSET_hostQueryReset = LAYOUT.byteOffset(PathElement.groupElement("hostQueryReset"));
    public static final long OFFSET_timelineSemaphore = LAYOUT.byteOffset(PathElement.groupElement("timelineSemaphore"));
    public static final long OFFSET_bufferDeviceAddress = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddress"));
    public static final long OFFSET_bufferDeviceAddressCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    public static final long OFFSET_bufferDeviceAddressMultiDevice = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
    public static final long OFFSET_vulkanMemoryModel = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModel"));
    public static final long OFFSET_vulkanMemoryModelDeviceScope = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    public static final long OFFSET_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
    public static final long OFFSET_shaderOutputViewportIndex = LAYOUT.byteOffset(PathElement.groupElement("shaderOutputViewportIndex"));
    public static final long OFFSET_shaderOutputLayer = LAYOUT.byteOffset(PathElement.groupElement("shaderOutputLayer"));
    public static final long OFFSET_subgroupBroadcastDynamicId = LAYOUT.byteOffset(PathElement.groupElement("subgroupBroadcastDynamicId"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_samplerMirrorClampToEdge = LAYOUT.select(PathElement.groupElement("samplerMirrorClampToEdge"));
    public static final MemoryLayout LAYOUT_drawIndirectCount = LAYOUT.select(PathElement.groupElement("drawIndirectCount"));
    public static final MemoryLayout LAYOUT_storageBuffer8BitAccess = LAYOUT.select(PathElement.groupElement("storageBuffer8BitAccess"));
    public static final MemoryLayout LAYOUT_uniformAndStorageBuffer8BitAccess = LAYOUT.select(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    public static final MemoryLayout LAYOUT_storagePushConstant8 = LAYOUT.select(PathElement.groupElement("storagePushConstant8"));
    public static final MemoryLayout LAYOUT_shaderBufferInt64Atomics = LAYOUT.select(PathElement.groupElement("shaderBufferInt64Atomics"));
    public static final MemoryLayout LAYOUT_shaderSharedInt64Atomics = LAYOUT.select(PathElement.groupElement("shaderSharedInt64Atomics"));
    public static final MemoryLayout LAYOUT_shaderFloat16 = LAYOUT.select(PathElement.groupElement("shaderFloat16"));
    public static final MemoryLayout LAYOUT_shaderInt8 = LAYOUT.select(PathElement.groupElement("shaderInt8"));
    public static final MemoryLayout LAYOUT_descriptorIndexing = LAYOUT.select(PathElement.groupElement("descriptorIndexing"));
    public static final MemoryLayout LAYOUT_shaderInputAttachmentArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
    public static final MemoryLayout LAYOUT_shaderUniformTexelBufferArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
    public static final MemoryLayout LAYOUT_shaderStorageTexelBufferArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing"));
    public static final MemoryLayout LAYOUT_shaderUniformBufferArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_shaderSampledImageArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_shaderStorageBufferArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_shaderStorageImageArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_shaderInputAttachmentArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_shaderUniformTexelBufferArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_shaderStorageTexelBufferArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing"));
    public static final MemoryLayout LAYOUT_descriptorBindingUniformBufferUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_descriptorBindingSampledImageUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_descriptorBindingStorageImageUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_descriptorBindingStorageBufferUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_descriptorBindingUniformTexelBufferUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_descriptorBindingStorageTexelBufferUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_descriptorBindingUpdateUnusedWhilePending = LAYOUT.select(PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending"));
    public static final MemoryLayout LAYOUT_descriptorBindingPartiallyBound = LAYOUT.select(PathElement.groupElement("descriptorBindingPartiallyBound"));
    public static final MemoryLayout LAYOUT_descriptorBindingVariableDescriptorCount = LAYOUT.select(PathElement.groupElement("descriptorBindingVariableDescriptorCount"));
    public static final MemoryLayout LAYOUT_runtimeDescriptorArray = LAYOUT.select(PathElement.groupElement("runtimeDescriptorArray"));
    public static final MemoryLayout LAYOUT_samplerFilterMinmax = LAYOUT.select(PathElement.groupElement("samplerFilterMinmax"));
    public static final MemoryLayout LAYOUT_scalarBlockLayout = LAYOUT.select(PathElement.groupElement("scalarBlockLayout"));
    public static final MemoryLayout LAYOUT_imagelessFramebuffer = LAYOUT.select(PathElement.groupElement("imagelessFramebuffer"));
    public static final MemoryLayout LAYOUT_uniformBufferStandardLayout = LAYOUT.select(PathElement.groupElement("uniformBufferStandardLayout"));
    public static final MemoryLayout LAYOUT_shaderSubgroupExtendedTypes = LAYOUT.select(PathElement.groupElement("shaderSubgroupExtendedTypes"));
    public static final MemoryLayout LAYOUT_separateDepthStencilLayouts = LAYOUT.select(PathElement.groupElement("separateDepthStencilLayouts"));
    public static final MemoryLayout LAYOUT_hostQueryReset = LAYOUT.select(PathElement.groupElement("hostQueryReset"));
    public static final MemoryLayout LAYOUT_timelineSemaphore = LAYOUT.select(PathElement.groupElement("timelineSemaphore"));
    public static final MemoryLayout LAYOUT_bufferDeviceAddress = LAYOUT.select(PathElement.groupElement("bufferDeviceAddress"));
    public static final MemoryLayout LAYOUT_bufferDeviceAddressCaptureReplay = LAYOUT.select(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    public static final MemoryLayout LAYOUT_bufferDeviceAddressMultiDevice = LAYOUT.select(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
    public static final MemoryLayout LAYOUT_vulkanMemoryModel = LAYOUT.select(PathElement.groupElement("vulkanMemoryModel"));
    public static final MemoryLayout LAYOUT_vulkanMemoryModelDeviceScope = LAYOUT.select(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    public static final MemoryLayout LAYOUT_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.select(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
    public static final MemoryLayout LAYOUT_shaderOutputViewportIndex = LAYOUT.select(PathElement.groupElement("shaderOutputViewportIndex"));
    public static final MemoryLayout LAYOUT_shaderOutputLayer = LAYOUT.select(PathElement.groupElement("shaderOutputLayer"));
    public static final MemoryLayout LAYOUT_subgroupBroadcastDynamicId = LAYOUT.select(PathElement.groupElement("subgroupBroadcastDynamicId"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_samplerMirrorClampToEdge = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerMirrorClampToEdge"));
    public static final VarHandle VH_drawIndirectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drawIndirectCount"));
    public static final VarHandle VH_storageBuffer8BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffer8BitAccess"));
    public static final VarHandle VH_uniformAndStorageBuffer8BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    public static final VarHandle VH_storagePushConstant8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storagePushConstant8"));
    public static final VarHandle VH_shaderBufferInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferInt64Atomics"));
    public static final VarHandle VH_shaderSharedInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedInt64Atomics"));
    public static final VarHandle VH_shaderFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat16"));
    public static final VarHandle VH_shaderInt8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInt8"));
    public static final VarHandle VH_descriptorIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorIndexing"));
    public static final VarHandle VH_shaderInputAttachmentArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
    public static final VarHandle VH_shaderUniformTexelBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
    public static final VarHandle VH_shaderStorageTexelBufferArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing"));
    public static final VarHandle VH_shaderUniformBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing"));
    public static final VarHandle VH_shaderSampledImageArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing"));
    public static final VarHandle VH_shaderStorageBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing"));
    public static final VarHandle VH_shaderStorageImageArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing"));
    public static final VarHandle VH_shaderInputAttachmentArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing"));
    public static final VarHandle VH_shaderUniformTexelBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing"));
    public static final VarHandle VH_shaderStorageTexelBufferArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing"));
    public static final VarHandle VH_descriptorBindingUniformBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind"));
    public static final VarHandle VH_descriptorBindingSampledImageUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind"));
    public static final VarHandle VH_descriptorBindingStorageImageUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind"));
    public static final VarHandle VH_descriptorBindingStorageBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind"));
    public static final VarHandle VH_descriptorBindingUniformTexelBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind"));
    public static final VarHandle VH_descriptorBindingStorageTexelBufferUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind"));
    public static final VarHandle VH_descriptorBindingUpdateUnusedWhilePending = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending"));
    public static final VarHandle VH_descriptorBindingPartiallyBound = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingPartiallyBound"));
    public static final VarHandle VH_descriptorBindingVariableDescriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingVariableDescriptorCount"));
    public static final VarHandle VH_runtimeDescriptorArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("runtimeDescriptorArray"));
    public static final VarHandle VH_samplerFilterMinmax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerFilterMinmax"));
    public static final VarHandle VH_scalarBlockLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scalarBlockLayout"));
    public static final VarHandle VH_imagelessFramebuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imagelessFramebuffer"));
    public static final VarHandle VH_uniformBufferStandardLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformBufferStandardLayout"));
    public static final VarHandle VH_shaderSubgroupExtendedTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupExtendedTypes"));
    public static final VarHandle VH_separateDepthStencilLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("separateDepthStencilLayouts"));
    public static final VarHandle VH_hostQueryReset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hostQueryReset"));
    public static final VarHandle VH_timelineSemaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timelineSemaphore"));
    public static final VarHandle VH_bufferDeviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddress"));
    public static final VarHandle VH_bufferDeviceAddressCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
    public static final VarHandle VH_bufferDeviceAddressMultiDevice = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
    public static final VarHandle VH_vulkanMemoryModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModel"));
    public static final VarHandle VH_vulkanMemoryModelDeviceScope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    public static final VarHandle VH_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
    public static final VarHandle VH_shaderOutputViewportIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderOutputViewportIndex"));
    public static final VarHandle VH_shaderOutputLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderOutputLayer"));
    public static final VarHandle VH_subgroupBroadcastDynamicId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupBroadcastDynamicId"));

    public VkPhysicalDeviceVulkan12Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVulkan12Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan12Features(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVulkan12Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan12Features(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVulkan12Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan12Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVulkan12Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan12Features(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVulkan12Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan12Features(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVulkan12Features allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES); }
    public static VkPhysicalDeviceVulkan12Features allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES);
        return s;
    }
    public VkPhysicalDeviceVulkan12Features copyFrom(VkPhysicalDeviceVulkan12Features src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVulkan12Features reinterpret(long count) { return new VkPhysicalDeviceVulkan12Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVulkan12Features asSlice(long index) { return new VkPhysicalDeviceVulkan12Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVulkan12Features asSlice(long index, long count) { return new VkPhysicalDeviceVulkan12Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVulkan12Features at(long index, Consumer<VkPhysicalDeviceVulkan12Features> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int samplerMirrorClampToEdgeAt(long index) { return (int) VH_samplerMirrorClampToEdge.get(this.segment(), 0L, index); }
    public int drawIndirectCountAt(long index) { return (int) VH_drawIndirectCount.get(this.segment(), 0L, index); }
    public int storageBuffer8BitAccessAt(long index) { return (int) VH_storageBuffer8BitAccess.get(this.segment(), 0L, index); }
    public int uniformAndStorageBuffer8BitAccessAt(long index) { return (int) VH_uniformAndStorageBuffer8BitAccess.get(this.segment(), 0L, index); }
    public int storagePushConstant8At(long index) { return (int) VH_storagePushConstant8.get(this.segment(), 0L, index); }
    public int shaderBufferInt64AtomicsAt(long index) { return (int) VH_shaderBufferInt64Atomics.get(this.segment(), 0L, index); }
    public int shaderSharedInt64AtomicsAt(long index) { return (int) VH_shaderSharedInt64Atomics.get(this.segment(), 0L, index); }
    public int shaderFloat16At(long index) { return (int) VH_shaderFloat16.get(this.segment(), 0L, index); }
    public int shaderInt8At(long index) { return (int) VH_shaderInt8.get(this.segment(), 0L, index); }
    public int descriptorIndexingAt(long index) { return (int) VH_descriptorIndexing.get(this.segment(), 0L, index); }
    public int shaderInputAttachmentArrayDynamicIndexingAt(long index) { return (int) VH_shaderInputAttachmentArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int shaderUniformTexelBufferArrayDynamicIndexingAt(long index) { return (int) VH_shaderUniformTexelBufferArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int shaderStorageTexelBufferArrayDynamicIndexingAt(long index) { return (int) VH_shaderStorageTexelBufferArrayDynamicIndexing.get(this.segment(), 0L, index); }
    public int shaderUniformBufferArrayNonUniformIndexingAt(long index) { return (int) VH_shaderUniformBufferArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int shaderSampledImageArrayNonUniformIndexingAt(long index) { return (int) VH_shaderSampledImageArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int shaderStorageBufferArrayNonUniformIndexingAt(long index) { return (int) VH_shaderStorageBufferArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int shaderStorageImageArrayNonUniformIndexingAt(long index) { return (int) VH_shaderStorageImageArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int shaderInputAttachmentArrayNonUniformIndexingAt(long index) { return (int) VH_shaderInputAttachmentArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int shaderUniformTexelBufferArrayNonUniformIndexingAt(long index) { return (int) VH_shaderUniformTexelBufferArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int shaderStorageTexelBufferArrayNonUniformIndexingAt(long index) { return (int) VH_shaderStorageTexelBufferArrayNonUniformIndexing.get(this.segment(), 0L, index); }
    public int descriptorBindingUniformBufferUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingUniformBufferUpdateAfterBind.get(this.segment(), 0L, index); }
    public int descriptorBindingSampledImageUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingSampledImageUpdateAfterBind.get(this.segment(), 0L, index); }
    public int descriptorBindingStorageImageUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingStorageImageUpdateAfterBind.get(this.segment(), 0L, index); }
    public int descriptorBindingStorageBufferUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingStorageBufferUpdateAfterBind.get(this.segment(), 0L, index); }
    public int descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingUniformTexelBufferUpdateAfterBind.get(this.segment(), 0L, index); }
    public int descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingStorageTexelBufferUpdateAfterBind.get(this.segment(), 0L, index); }
    public int descriptorBindingUpdateUnusedWhilePendingAt(long index) { return (int) VH_descriptorBindingUpdateUnusedWhilePending.get(this.segment(), 0L, index); }
    public int descriptorBindingPartiallyBoundAt(long index) { return (int) VH_descriptorBindingPartiallyBound.get(this.segment(), 0L, index); }
    public int descriptorBindingVariableDescriptorCountAt(long index) { return (int) VH_descriptorBindingVariableDescriptorCount.get(this.segment(), 0L, index); }
    public int runtimeDescriptorArrayAt(long index) { return (int) VH_runtimeDescriptorArray.get(this.segment(), 0L, index); }
    public int samplerFilterMinmaxAt(long index) { return (int) VH_samplerFilterMinmax.get(this.segment(), 0L, index); }
    public int scalarBlockLayoutAt(long index) { return (int) VH_scalarBlockLayout.get(this.segment(), 0L, index); }
    public int imagelessFramebufferAt(long index) { return (int) VH_imagelessFramebuffer.get(this.segment(), 0L, index); }
    public int uniformBufferStandardLayoutAt(long index) { return (int) VH_uniformBufferStandardLayout.get(this.segment(), 0L, index); }
    public int shaderSubgroupExtendedTypesAt(long index) { return (int) VH_shaderSubgroupExtendedTypes.get(this.segment(), 0L, index); }
    public int separateDepthStencilLayoutsAt(long index) { return (int) VH_separateDepthStencilLayouts.get(this.segment(), 0L, index); }
    public int hostQueryResetAt(long index) { return (int) VH_hostQueryReset.get(this.segment(), 0L, index); }
    public int timelineSemaphoreAt(long index) { return (int) VH_timelineSemaphore.get(this.segment(), 0L, index); }
    public int bufferDeviceAddressAt(long index) { return (int) VH_bufferDeviceAddress.get(this.segment(), 0L, index); }
    public int bufferDeviceAddressCaptureReplayAt(long index) { return (int) VH_bufferDeviceAddressCaptureReplay.get(this.segment(), 0L, index); }
    public int bufferDeviceAddressMultiDeviceAt(long index) { return (int) VH_bufferDeviceAddressMultiDevice.get(this.segment(), 0L, index); }
    public int vulkanMemoryModelAt(long index) { return (int) VH_vulkanMemoryModel.get(this.segment(), 0L, index); }
    public int vulkanMemoryModelDeviceScopeAt(long index) { return (int) VH_vulkanMemoryModelDeviceScope.get(this.segment(), 0L, index); }
    public int vulkanMemoryModelAvailabilityVisibilityChainsAt(long index) { return (int) VH_vulkanMemoryModelAvailabilityVisibilityChains.get(this.segment(), 0L, index); }
    public int shaderOutputViewportIndexAt(long index) { return (int) VH_shaderOutputViewportIndex.get(this.segment(), 0L, index); }
    public int shaderOutputLayerAt(long index) { return (int) VH_shaderOutputLayer.get(this.segment(), 0L, index); }
    public int subgroupBroadcastDynamicIdAt(long index) { return (int) VH_subgroupBroadcastDynamicId.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int samplerMirrorClampToEdge() { return (int) VH_samplerMirrorClampToEdge.get(this.segment(), 0L, 0L); }
    public int drawIndirectCount() { return (int) VH_drawIndirectCount.get(this.segment(), 0L, 0L); }
    public int storageBuffer8BitAccess() { return (int) VH_storageBuffer8BitAccess.get(this.segment(), 0L, 0L); }
    public int uniformAndStorageBuffer8BitAccess() { return (int) VH_uniformAndStorageBuffer8BitAccess.get(this.segment(), 0L, 0L); }
    public int storagePushConstant8() { return (int) VH_storagePushConstant8.get(this.segment(), 0L, 0L); }
    public int shaderBufferInt64Atomics() { return (int) VH_shaderBufferInt64Atomics.get(this.segment(), 0L, 0L); }
    public int shaderSharedInt64Atomics() { return (int) VH_shaderSharedInt64Atomics.get(this.segment(), 0L, 0L); }
    public int shaderFloat16() { return (int) VH_shaderFloat16.get(this.segment(), 0L, 0L); }
    public int shaderInt8() { return (int) VH_shaderInt8.get(this.segment(), 0L, 0L); }
    public int descriptorIndexing() { return (int) VH_descriptorIndexing.get(this.segment(), 0L, 0L); }
    public int shaderInputAttachmentArrayDynamicIndexing() { return (int) VH_shaderInputAttachmentArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int shaderUniformTexelBufferArrayDynamicIndexing() { return (int) VH_shaderUniformTexelBufferArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int shaderStorageTexelBufferArrayDynamicIndexing() { return (int) VH_shaderStorageTexelBufferArrayDynamicIndexing.get(this.segment(), 0L, 0L); }
    public int shaderUniformBufferArrayNonUniformIndexing() { return (int) VH_shaderUniformBufferArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int shaderSampledImageArrayNonUniformIndexing() { return (int) VH_shaderSampledImageArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int shaderStorageBufferArrayNonUniformIndexing() { return (int) VH_shaderStorageBufferArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int shaderStorageImageArrayNonUniformIndexing() { return (int) VH_shaderStorageImageArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int shaderInputAttachmentArrayNonUniformIndexing() { return (int) VH_shaderInputAttachmentArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int shaderUniformTexelBufferArrayNonUniformIndexing() { return (int) VH_shaderUniformTexelBufferArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int shaderStorageTexelBufferArrayNonUniformIndexing() { return (int) VH_shaderStorageTexelBufferArrayNonUniformIndexing.get(this.segment(), 0L, 0L); }
    public int descriptorBindingUniformBufferUpdateAfterBind() { return (int) VH_descriptorBindingUniformBufferUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int descriptorBindingSampledImageUpdateAfterBind() { return (int) VH_descriptorBindingSampledImageUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int descriptorBindingStorageImageUpdateAfterBind() { return (int) VH_descriptorBindingStorageImageUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int descriptorBindingStorageBufferUpdateAfterBind() { return (int) VH_descriptorBindingStorageBufferUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int descriptorBindingUniformTexelBufferUpdateAfterBind() { return (int) VH_descriptorBindingUniformTexelBufferUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int descriptorBindingStorageTexelBufferUpdateAfterBind() { return (int) VH_descriptorBindingStorageTexelBufferUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int descriptorBindingUpdateUnusedWhilePending() { return (int) VH_descriptorBindingUpdateUnusedWhilePending.get(this.segment(), 0L, 0L); }
    public int descriptorBindingPartiallyBound() { return (int) VH_descriptorBindingPartiallyBound.get(this.segment(), 0L, 0L); }
    public int descriptorBindingVariableDescriptorCount() { return (int) VH_descriptorBindingVariableDescriptorCount.get(this.segment(), 0L, 0L); }
    public int runtimeDescriptorArray() { return (int) VH_runtimeDescriptorArray.get(this.segment(), 0L, 0L); }
    public int samplerFilterMinmax() { return (int) VH_samplerFilterMinmax.get(this.segment(), 0L, 0L); }
    public int scalarBlockLayout() { return (int) VH_scalarBlockLayout.get(this.segment(), 0L, 0L); }
    public int imagelessFramebuffer() { return (int) VH_imagelessFramebuffer.get(this.segment(), 0L, 0L); }
    public int uniformBufferStandardLayout() { return (int) VH_uniformBufferStandardLayout.get(this.segment(), 0L, 0L); }
    public int shaderSubgroupExtendedTypes() { return (int) VH_shaderSubgroupExtendedTypes.get(this.segment(), 0L, 0L); }
    public int separateDepthStencilLayouts() { return (int) VH_separateDepthStencilLayouts.get(this.segment(), 0L, 0L); }
    public int hostQueryReset() { return (int) VH_hostQueryReset.get(this.segment(), 0L, 0L); }
    public int timelineSemaphore() { return (int) VH_timelineSemaphore.get(this.segment(), 0L, 0L); }
    public int bufferDeviceAddress() { return (int) VH_bufferDeviceAddress.get(this.segment(), 0L, 0L); }
    public int bufferDeviceAddressCaptureReplay() { return (int) VH_bufferDeviceAddressCaptureReplay.get(this.segment(), 0L, 0L); }
    public int bufferDeviceAddressMultiDevice() { return (int) VH_bufferDeviceAddressMultiDevice.get(this.segment(), 0L, 0L); }
    public int vulkanMemoryModel() { return (int) VH_vulkanMemoryModel.get(this.segment(), 0L, 0L); }
    public int vulkanMemoryModelDeviceScope() { return (int) VH_vulkanMemoryModelDeviceScope.get(this.segment(), 0L, 0L); }
    public int vulkanMemoryModelAvailabilityVisibilityChains() { return (int) VH_vulkanMemoryModelAvailabilityVisibilityChains.get(this.segment(), 0L, 0L); }
    public int shaderOutputViewportIndex() { return (int) VH_shaderOutputViewportIndex.get(this.segment(), 0L, 0L); }
    public int shaderOutputLayer() { return (int) VH_shaderOutputLayer.get(this.segment(), 0L, 0L); }
    public int subgroupBroadcastDynamicId() { return (int) VH_subgroupBroadcastDynamicId.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVulkan12Features sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features samplerMirrorClampToEdgeAt(long index, int value) { VH_samplerMirrorClampToEdge.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features drawIndirectCountAt(long index, int value) { VH_drawIndirectCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features storageBuffer8BitAccessAt(long index, int value) { VH_storageBuffer8BitAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features uniformAndStorageBuffer8BitAccessAt(long index, int value) { VH_uniformAndStorageBuffer8BitAccess.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features storagePushConstant8At(long index, int value) { VH_storagePushConstant8.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderBufferInt64AtomicsAt(long index, int value) { VH_shaderBufferInt64Atomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderSharedInt64AtomicsAt(long index, int value) { VH_shaderSharedInt64Atomics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderFloat16At(long index, int value) { VH_shaderFloat16.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderInt8At(long index, int value) { VH_shaderInt8.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorIndexingAt(long index, int value) { VH_descriptorIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayDynamicIndexingAt(long index, int value) { VH_shaderInputAttachmentArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayDynamicIndexingAt(long index, int value) { VH_shaderUniformTexelBufferArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayDynamicIndexingAt(long index, int value) { VH_shaderStorageTexelBufferArrayDynamicIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderUniformBufferArrayNonUniformIndexingAt(long index, int value) { VH_shaderUniformBufferArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderSampledImageArrayNonUniformIndexingAt(long index, int value) { VH_shaderSampledImageArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderStorageBufferArrayNonUniformIndexingAt(long index, int value) { VH_shaderStorageBufferArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderStorageImageArrayNonUniformIndexingAt(long index, int value) { VH_shaderStorageImageArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayNonUniformIndexingAt(long index, int value) { VH_shaderInputAttachmentArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayNonUniformIndexingAt(long index, int value) { VH_shaderUniformTexelBufferArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayNonUniformIndexingAt(long index, int value) { VH_shaderStorageTexelBufferArrayNonUniformIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformBufferUpdateAfterBindAt(long index, int value) { VH_descriptorBindingUniformBufferUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingSampledImageUpdateAfterBindAt(long index, int value) { VH_descriptorBindingSampledImageUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageImageUpdateAfterBindAt(long index, int value) { VH_descriptorBindingStorageImageUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageBufferUpdateAfterBindAt(long index, int value) { VH_descriptorBindingStorageBufferUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index, int value) { VH_descriptorBindingUniformTexelBufferUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index, int value) { VH_descriptorBindingStorageTexelBufferUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingUpdateUnusedWhilePendingAt(long index, int value) { VH_descriptorBindingUpdateUnusedWhilePending.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingPartiallyBoundAt(long index, int value) { VH_descriptorBindingPartiallyBound.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingVariableDescriptorCountAt(long index, int value) { VH_descriptorBindingVariableDescriptorCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features runtimeDescriptorArrayAt(long index, int value) { VH_runtimeDescriptorArray.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features samplerFilterMinmaxAt(long index, int value) { VH_samplerFilterMinmax.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features scalarBlockLayoutAt(long index, int value) { VH_scalarBlockLayout.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features imagelessFramebufferAt(long index, int value) { VH_imagelessFramebuffer.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features uniformBufferStandardLayoutAt(long index, int value) { VH_uniformBufferStandardLayout.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderSubgroupExtendedTypesAt(long index, int value) { VH_shaderSubgroupExtendedTypes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features separateDepthStencilLayoutsAt(long index, int value) { VH_separateDepthStencilLayouts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features hostQueryResetAt(long index, int value) { VH_hostQueryReset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features timelineSemaphoreAt(long index, int value) { VH_timelineSemaphore.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressAt(long index, int value) { VH_bufferDeviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressCaptureReplayAt(long index, int value) { VH_bufferDeviceAddressCaptureReplay.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressMultiDeviceAt(long index, int value) { VH_bufferDeviceAddressMultiDevice.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelAt(long index, int value) { VH_vulkanMemoryModel.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelDeviceScopeAt(long index, int value) { VH_vulkanMemoryModelDeviceScope.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelAvailabilityVisibilityChainsAt(long index, int value) { VH_vulkanMemoryModelAvailabilityVisibilityChains.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderOutputViewportIndexAt(long index, int value) { VH_shaderOutputViewportIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderOutputLayerAt(long index, int value) { VH_shaderOutputLayer.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features subgroupBroadcastDynamicIdAt(long index, int value) { VH_subgroupBroadcastDynamicId.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan12Features sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features samplerMirrorClampToEdge(int value) { VH_samplerMirrorClampToEdge.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features drawIndirectCount(int value) { VH_drawIndirectCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features storageBuffer8BitAccess(int value) { VH_storageBuffer8BitAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features uniformAndStorageBuffer8BitAccess(int value) { VH_uniformAndStorageBuffer8BitAccess.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features storagePushConstant8(int value) { VH_storagePushConstant8.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderBufferInt64Atomics(int value) { VH_shaderBufferInt64Atomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderSharedInt64Atomics(int value) { VH_shaderSharedInt64Atomics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderFloat16(int value) { VH_shaderFloat16.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderInt8(int value) { VH_shaderInt8.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorIndexing(int value) { VH_descriptorIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayDynamicIndexing(int value) { VH_shaderInputAttachmentArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayDynamicIndexing(int value) { VH_shaderUniformTexelBufferArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayDynamicIndexing(int value) { VH_shaderStorageTexelBufferArrayDynamicIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderUniformBufferArrayNonUniformIndexing(int value) { VH_shaderUniformBufferArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderSampledImageArrayNonUniformIndexing(int value) { VH_shaderSampledImageArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderStorageBufferArrayNonUniformIndexing(int value) { VH_shaderStorageBufferArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderStorageImageArrayNonUniformIndexing(int value) { VH_shaderStorageImageArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayNonUniformIndexing(int value) { VH_shaderInputAttachmentArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayNonUniformIndexing(int value) { VH_shaderUniformTexelBufferArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayNonUniformIndexing(int value) { VH_shaderStorageTexelBufferArrayNonUniformIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformBufferUpdateAfterBind(int value) { VH_descriptorBindingUniformBufferUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingSampledImageUpdateAfterBind(int value) { VH_descriptorBindingSampledImageUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageImageUpdateAfterBind(int value) { VH_descriptorBindingStorageImageUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageBufferUpdateAfterBind(int value) { VH_descriptorBindingStorageBufferUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformTexelBufferUpdateAfterBind(int value) { VH_descriptorBindingUniformTexelBufferUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageTexelBufferUpdateAfterBind(int value) { VH_descriptorBindingStorageTexelBufferUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingUpdateUnusedWhilePending(int value) { VH_descriptorBindingUpdateUnusedWhilePending.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingPartiallyBound(int value) { VH_descriptorBindingPartiallyBound.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features descriptorBindingVariableDescriptorCount(int value) { VH_descriptorBindingVariableDescriptorCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features runtimeDescriptorArray(int value) { VH_runtimeDescriptorArray.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features samplerFilterMinmax(int value) { VH_samplerFilterMinmax.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features scalarBlockLayout(int value) { VH_scalarBlockLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features imagelessFramebuffer(int value) { VH_imagelessFramebuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features uniformBufferStandardLayout(int value) { VH_uniformBufferStandardLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderSubgroupExtendedTypes(int value) { VH_shaderSubgroupExtendedTypes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features separateDepthStencilLayouts(int value) { VH_separateDepthStencilLayouts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features hostQueryReset(int value) { VH_hostQueryReset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features timelineSemaphore(int value) { VH_timelineSemaphore.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddress(int value) { VH_bufferDeviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressCaptureReplay(int value) { VH_bufferDeviceAddressCaptureReplay.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressMultiDevice(int value) { VH_bufferDeviceAddressMultiDevice.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModel(int value) { VH_vulkanMemoryModel.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelDeviceScope(int value) { VH_vulkanMemoryModelDeviceScope.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelAvailabilityVisibilityChains(int value) { VH_vulkanMemoryModelAvailabilityVisibilityChains.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderOutputViewportIndex(int value) { VH_shaderOutputViewportIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features shaderOutputLayer(int value) { VH_shaderOutputLayer.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan12Features subgroupBroadcastDynamicId(int value) { VH_subgroupBroadcastDynamicId.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVulkan12Features _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVulkan12Features _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _samplerMirrorClampToEdgeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samplerMirrorClampToEdge, index), LAYOUT_samplerMirrorClampToEdge); }
    public MemorySegment _samplerMirrorClampToEdge() { return _samplerMirrorClampToEdgeAt(0L); }
    public VkPhysicalDeviceVulkan12Features _samplerMirrorClampToEdgeAt(long index, MemorySegment src) { _samplerMirrorClampToEdgeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _samplerMirrorClampToEdge(MemorySegment src) { return _samplerMirrorClampToEdgeAt(0L, src); }
    public MemorySegment _drawIndirectCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_drawIndirectCount, index), LAYOUT_drawIndirectCount); }
    public MemorySegment _drawIndirectCount() { return _drawIndirectCountAt(0L); }
    public VkPhysicalDeviceVulkan12Features _drawIndirectCountAt(long index, MemorySegment src) { _drawIndirectCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _drawIndirectCount(MemorySegment src) { return _drawIndirectCountAt(0L, src); }
    public MemorySegment _storageBuffer8BitAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageBuffer8BitAccess, index), LAYOUT_storageBuffer8BitAccess); }
    public MemorySegment _storageBuffer8BitAccess() { return _storageBuffer8BitAccessAt(0L); }
    public VkPhysicalDeviceVulkan12Features _storageBuffer8BitAccessAt(long index, MemorySegment src) { _storageBuffer8BitAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _storageBuffer8BitAccess(MemorySegment src) { return _storageBuffer8BitAccessAt(0L, src); }
    public MemorySegment _uniformAndStorageBuffer8BitAccessAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uniformAndStorageBuffer8BitAccess, index), LAYOUT_uniformAndStorageBuffer8BitAccess); }
    public MemorySegment _uniformAndStorageBuffer8BitAccess() { return _uniformAndStorageBuffer8BitAccessAt(0L); }
    public VkPhysicalDeviceVulkan12Features _uniformAndStorageBuffer8BitAccessAt(long index, MemorySegment src) { _uniformAndStorageBuffer8BitAccessAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _uniformAndStorageBuffer8BitAccess(MemorySegment src) { return _uniformAndStorageBuffer8BitAccessAt(0L, src); }
    public MemorySegment _storagePushConstant8At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storagePushConstant8, index), LAYOUT_storagePushConstant8); }
    public MemorySegment _storagePushConstant8() { return _storagePushConstant8At(0L); }
    public VkPhysicalDeviceVulkan12Features _storagePushConstant8At(long index, MemorySegment src) { _storagePushConstant8At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _storagePushConstant8(MemorySegment src) { return _storagePushConstant8At(0L, src); }
    public MemorySegment _shaderBufferInt64AtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBufferInt64Atomics, index), LAYOUT_shaderBufferInt64Atomics); }
    public MemorySegment _shaderBufferInt64Atomics() { return _shaderBufferInt64AtomicsAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderBufferInt64AtomicsAt(long index, MemorySegment src) { _shaderBufferInt64AtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderBufferInt64Atomics(MemorySegment src) { return _shaderBufferInt64AtomicsAt(0L, src); }
    public MemorySegment _shaderSharedInt64AtomicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSharedInt64Atomics, index), LAYOUT_shaderSharedInt64Atomics); }
    public MemorySegment _shaderSharedInt64Atomics() { return _shaderSharedInt64AtomicsAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderSharedInt64AtomicsAt(long index, MemorySegment src) { _shaderSharedInt64AtomicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderSharedInt64Atomics(MemorySegment src) { return _shaderSharedInt64AtomicsAt(0L, src); }
    public MemorySegment _shaderFloat16At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderFloat16, index), LAYOUT_shaderFloat16); }
    public MemorySegment _shaderFloat16() { return _shaderFloat16At(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderFloat16At(long index, MemorySegment src) { _shaderFloat16At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderFloat16(MemorySegment src) { return _shaderFloat16At(0L, src); }
    public MemorySegment _shaderInt8At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderInt8, index), LAYOUT_shaderInt8); }
    public MemorySegment _shaderInt8() { return _shaderInt8At(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderInt8At(long index, MemorySegment src) { _shaderInt8At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderInt8(MemorySegment src) { return _shaderInt8At(0L, src); }
    public MemorySegment _descriptorIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorIndexing, index), LAYOUT_descriptorIndexing); }
    public MemorySegment _descriptorIndexing() { return _descriptorIndexingAt(0L); }
    public VkPhysicalDeviceVulkan12Features _descriptorIndexingAt(long index, MemorySegment src) { _descriptorIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _descriptorIndexing(MemorySegment src) { return _descriptorIndexingAt(0L, src); }
    public MemorySegment _shaderInputAttachmentArrayDynamicIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderInputAttachmentArrayDynamicIndexing, index), LAYOUT_shaderInputAttachmentArrayDynamicIndexing); }
    public MemorySegment _shaderInputAttachmentArrayDynamicIndexing() { return _shaderInputAttachmentArrayDynamicIndexingAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderInputAttachmentArrayDynamicIndexingAt(long index, MemorySegment src) { _shaderInputAttachmentArrayDynamicIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderInputAttachmentArrayDynamicIndexing(MemorySegment src) { return _shaderInputAttachmentArrayDynamicIndexingAt(0L, src); }
    public MemorySegment _shaderUniformTexelBufferArrayDynamicIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderUniformTexelBufferArrayDynamicIndexing, index), LAYOUT_shaderUniformTexelBufferArrayDynamicIndexing); }
    public MemorySegment _shaderUniformTexelBufferArrayDynamicIndexing() { return _shaderUniformTexelBufferArrayDynamicIndexingAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderUniformTexelBufferArrayDynamicIndexingAt(long index, MemorySegment src) { _shaderUniformTexelBufferArrayDynamicIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderUniformTexelBufferArrayDynamicIndexing(MemorySegment src) { return _shaderUniformTexelBufferArrayDynamicIndexingAt(0L, src); }
    public MemorySegment _shaderStorageTexelBufferArrayDynamicIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageTexelBufferArrayDynamicIndexing, index), LAYOUT_shaderStorageTexelBufferArrayDynamicIndexing); }
    public MemorySegment _shaderStorageTexelBufferArrayDynamicIndexing() { return _shaderStorageTexelBufferArrayDynamicIndexingAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderStorageTexelBufferArrayDynamicIndexingAt(long index, MemorySegment src) { _shaderStorageTexelBufferArrayDynamicIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderStorageTexelBufferArrayDynamicIndexing(MemorySegment src) { return _shaderStorageTexelBufferArrayDynamicIndexingAt(0L, src); }
    public MemorySegment _shaderUniformBufferArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderUniformBufferArrayNonUniformIndexing, index), LAYOUT_shaderUniformBufferArrayNonUniformIndexing); }
    public MemorySegment _shaderUniformBufferArrayNonUniformIndexing() { return _shaderUniformBufferArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderUniformBufferArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderUniformBufferArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderUniformBufferArrayNonUniformIndexing(MemorySegment src) { return _shaderUniformBufferArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _shaderSampledImageArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSampledImageArrayNonUniformIndexing, index), LAYOUT_shaderSampledImageArrayNonUniformIndexing); }
    public MemorySegment _shaderSampledImageArrayNonUniformIndexing() { return _shaderSampledImageArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderSampledImageArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderSampledImageArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderSampledImageArrayNonUniformIndexing(MemorySegment src) { return _shaderSampledImageArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _shaderStorageBufferArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageBufferArrayNonUniformIndexing, index), LAYOUT_shaderStorageBufferArrayNonUniformIndexing); }
    public MemorySegment _shaderStorageBufferArrayNonUniformIndexing() { return _shaderStorageBufferArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderStorageBufferArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderStorageBufferArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderStorageBufferArrayNonUniformIndexing(MemorySegment src) { return _shaderStorageBufferArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _shaderStorageImageArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageImageArrayNonUniformIndexing, index), LAYOUT_shaderStorageImageArrayNonUniformIndexing); }
    public MemorySegment _shaderStorageImageArrayNonUniformIndexing() { return _shaderStorageImageArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderStorageImageArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderStorageImageArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderStorageImageArrayNonUniformIndexing(MemorySegment src) { return _shaderStorageImageArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _shaderInputAttachmentArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderInputAttachmentArrayNonUniformIndexing, index), LAYOUT_shaderInputAttachmentArrayNonUniformIndexing); }
    public MemorySegment _shaderInputAttachmentArrayNonUniformIndexing() { return _shaderInputAttachmentArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderInputAttachmentArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderInputAttachmentArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderInputAttachmentArrayNonUniformIndexing(MemorySegment src) { return _shaderInputAttachmentArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _shaderUniformTexelBufferArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderUniformTexelBufferArrayNonUniformIndexing, index), LAYOUT_shaderUniformTexelBufferArrayNonUniformIndexing); }
    public MemorySegment _shaderUniformTexelBufferArrayNonUniformIndexing() { return _shaderUniformTexelBufferArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderUniformTexelBufferArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderUniformTexelBufferArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderUniformTexelBufferArrayNonUniformIndexing(MemorySegment src) { return _shaderUniformTexelBufferArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _shaderStorageTexelBufferArrayNonUniformIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageTexelBufferArrayNonUniformIndexing, index), LAYOUT_shaderStorageTexelBufferArrayNonUniformIndexing); }
    public MemorySegment _shaderStorageTexelBufferArrayNonUniformIndexing() { return _shaderStorageTexelBufferArrayNonUniformIndexingAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderStorageTexelBufferArrayNonUniformIndexingAt(long index, MemorySegment src) { _shaderStorageTexelBufferArrayNonUniformIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderStorageTexelBufferArrayNonUniformIndexing(MemorySegment src) { return _shaderStorageTexelBufferArrayNonUniformIndexingAt(0L, src); }
    public MemorySegment _descriptorBindingUniformBufferUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingUniformBufferUpdateAfterBind, index), LAYOUT_descriptorBindingUniformBufferUpdateAfterBind); }
    public MemorySegment _descriptorBindingUniformBufferUpdateAfterBind() { return _descriptorBindingUniformBufferUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingUniformBufferUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingUniformBufferUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingUniformBufferUpdateAfterBind(MemorySegment src) { return _descriptorBindingUniformBufferUpdateAfterBindAt(0L, src); }
    public MemorySegment _descriptorBindingSampledImageUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingSampledImageUpdateAfterBind, index), LAYOUT_descriptorBindingSampledImageUpdateAfterBind); }
    public MemorySegment _descriptorBindingSampledImageUpdateAfterBind() { return _descriptorBindingSampledImageUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingSampledImageUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingSampledImageUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingSampledImageUpdateAfterBind(MemorySegment src) { return _descriptorBindingSampledImageUpdateAfterBindAt(0L, src); }
    public MemorySegment _descriptorBindingStorageImageUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingStorageImageUpdateAfterBind, index), LAYOUT_descriptorBindingStorageImageUpdateAfterBind); }
    public MemorySegment _descriptorBindingStorageImageUpdateAfterBind() { return _descriptorBindingStorageImageUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingStorageImageUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingStorageImageUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingStorageImageUpdateAfterBind(MemorySegment src) { return _descriptorBindingStorageImageUpdateAfterBindAt(0L, src); }
    public MemorySegment _descriptorBindingStorageBufferUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingStorageBufferUpdateAfterBind, index), LAYOUT_descriptorBindingStorageBufferUpdateAfterBind); }
    public MemorySegment _descriptorBindingStorageBufferUpdateAfterBind() { return _descriptorBindingStorageBufferUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingStorageBufferUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingStorageBufferUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingStorageBufferUpdateAfterBind(MemorySegment src) { return _descriptorBindingStorageBufferUpdateAfterBindAt(0L, src); }
    public MemorySegment _descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingUniformTexelBufferUpdateAfterBind, index), LAYOUT_descriptorBindingUniformTexelBufferUpdateAfterBind); }
    public MemorySegment _descriptorBindingUniformTexelBufferUpdateAfterBind() { return _descriptorBindingUniformTexelBufferUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingUniformTexelBufferUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingUniformTexelBufferUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingUniformTexelBufferUpdateAfterBind(MemorySegment src) { return _descriptorBindingUniformTexelBufferUpdateAfterBindAt(0L, src); }
    public MemorySegment _descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingStorageTexelBufferUpdateAfterBind, index), LAYOUT_descriptorBindingStorageTexelBufferUpdateAfterBind); }
    public MemorySegment _descriptorBindingStorageTexelBufferUpdateAfterBind() { return _descriptorBindingStorageTexelBufferUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingStorageTexelBufferUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingStorageTexelBufferUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingStorageTexelBufferUpdateAfterBind(MemorySegment src) { return _descriptorBindingStorageTexelBufferUpdateAfterBindAt(0L, src); }
    public MemorySegment _descriptorBindingUpdateUnusedWhilePendingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingUpdateUnusedWhilePending, index), LAYOUT_descriptorBindingUpdateUnusedWhilePending); }
    public MemorySegment _descriptorBindingUpdateUnusedWhilePending() { return _descriptorBindingUpdateUnusedWhilePendingAt(0L); }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingUpdateUnusedWhilePendingAt(long index, MemorySegment src) { _descriptorBindingUpdateUnusedWhilePendingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingUpdateUnusedWhilePending(MemorySegment src) { return _descriptorBindingUpdateUnusedWhilePendingAt(0L, src); }
    public MemorySegment _descriptorBindingPartiallyBoundAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingPartiallyBound, index), LAYOUT_descriptorBindingPartiallyBound); }
    public MemorySegment _descriptorBindingPartiallyBound() { return _descriptorBindingPartiallyBoundAt(0L); }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingPartiallyBoundAt(long index, MemorySegment src) { _descriptorBindingPartiallyBoundAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingPartiallyBound(MemorySegment src) { return _descriptorBindingPartiallyBoundAt(0L, src); }
    public MemorySegment _descriptorBindingVariableDescriptorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingVariableDescriptorCount, index), LAYOUT_descriptorBindingVariableDescriptorCount); }
    public MemorySegment _descriptorBindingVariableDescriptorCount() { return _descriptorBindingVariableDescriptorCountAt(0L); }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingVariableDescriptorCountAt(long index, MemorySegment src) { _descriptorBindingVariableDescriptorCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _descriptorBindingVariableDescriptorCount(MemorySegment src) { return _descriptorBindingVariableDescriptorCountAt(0L, src); }
    public MemorySegment _runtimeDescriptorArrayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_runtimeDescriptorArray, index), LAYOUT_runtimeDescriptorArray); }
    public MemorySegment _runtimeDescriptorArray() { return _runtimeDescriptorArrayAt(0L); }
    public VkPhysicalDeviceVulkan12Features _runtimeDescriptorArrayAt(long index, MemorySegment src) { _runtimeDescriptorArrayAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _runtimeDescriptorArray(MemorySegment src) { return _runtimeDescriptorArrayAt(0L, src); }
    public MemorySegment _samplerFilterMinmaxAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samplerFilterMinmax, index), LAYOUT_samplerFilterMinmax); }
    public MemorySegment _samplerFilterMinmax() { return _samplerFilterMinmaxAt(0L); }
    public VkPhysicalDeviceVulkan12Features _samplerFilterMinmaxAt(long index, MemorySegment src) { _samplerFilterMinmaxAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _samplerFilterMinmax(MemorySegment src) { return _samplerFilterMinmaxAt(0L, src); }
    public MemorySegment _scalarBlockLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_scalarBlockLayout, index), LAYOUT_scalarBlockLayout); }
    public MemorySegment _scalarBlockLayout() { return _scalarBlockLayoutAt(0L); }
    public VkPhysicalDeviceVulkan12Features _scalarBlockLayoutAt(long index, MemorySegment src) { _scalarBlockLayoutAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _scalarBlockLayout(MemorySegment src) { return _scalarBlockLayoutAt(0L, src); }
    public MemorySegment _imagelessFramebufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imagelessFramebuffer, index), LAYOUT_imagelessFramebuffer); }
    public MemorySegment _imagelessFramebuffer() { return _imagelessFramebufferAt(0L); }
    public VkPhysicalDeviceVulkan12Features _imagelessFramebufferAt(long index, MemorySegment src) { _imagelessFramebufferAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _imagelessFramebuffer(MemorySegment src) { return _imagelessFramebufferAt(0L, src); }
    public MemorySegment _uniformBufferStandardLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uniformBufferStandardLayout, index), LAYOUT_uniformBufferStandardLayout); }
    public MemorySegment _uniformBufferStandardLayout() { return _uniformBufferStandardLayoutAt(0L); }
    public VkPhysicalDeviceVulkan12Features _uniformBufferStandardLayoutAt(long index, MemorySegment src) { _uniformBufferStandardLayoutAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _uniformBufferStandardLayout(MemorySegment src) { return _uniformBufferStandardLayoutAt(0L, src); }
    public MemorySegment _shaderSubgroupExtendedTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSubgroupExtendedTypes, index), LAYOUT_shaderSubgroupExtendedTypes); }
    public MemorySegment _shaderSubgroupExtendedTypes() { return _shaderSubgroupExtendedTypesAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderSubgroupExtendedTypesAt(long index, MemorySegment src) { _shaderSubgroupExtendedTypesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderSubgroupExtendedTypes(MemorySegment src) { return _shaderSubgroupExtendedTypesAt(0L, src); }
    public MemorySegment _separateDepthStencilLayoutsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_separateDepthStencilLayouts, index), LAYOUT_separateDepthStencilLayouts); }
    public MemorySegment _separateDepthStencilLayouts() { return _separateDepthStencilLayoutsAt(0L); }
    public VkPhysicalDeviceVulkan12Features _separateDepthStencilLayoutsAt(long index, MemorySegment src) { _separateDepthStencilLayoutsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _separateDepthStencilLayouts(MemorySegment src) { return _separateDepthStencilLayoutsAt(0L, src); }
    public MemorySegment _hostQueryResetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hostQueryReset, index), LAYOUT_hostQueryReset); }
    public MemorySegment _hostQueryReset() { return _hostQueryResetAt(0L); }
    public VkPhysicalDeviceVulkan12Features _hostQueryResetAt(long index, MemorySegment src) { _hostQueryResetAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _hostQueryReset(MemorySegment src) { return _hostQueryResetAt(0L, src); }
    public MemorySegment _timelineSemaphoreAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timelineSemaphore, index), LAYOUT_timelineSemaphore); }
    public MemorySegment _timelineSemaphore() { return _timelineSemaphoreAt(0L); }
    public VkPhysicalDeviceVulkan12Features _timelineSemaphoreAt(long index, MemorySegment src) { _timelineSemaphoreAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _timelineSemaphore(MemorySegment src) { return _timelineSemaphoreAt(0L, src); }
    public MemorySegment _bufferDeviceAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferDeviceAddress, index), LAYOUT_bufferDeviceAddress); }
    public MemorySegment _bufferDeviceAddress() { return _bufferDeviceAddressAt(0L); }
    public VkPhysicalDeviceVulkan12Features _bufferDeviceAddressAt(long index, MemorySegment src) { _bufferDeviceAddressAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _bufferDeviceAddress(MemorySegment src) { return _bufferDeviceAddressAt(0L, src); }
    public MemorySegment _bufferDeviceAddressCaptureReplayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferDeviceAddressCaptureReplay, index), LAYOUT_bufferDeviceAddressCaptureReplay); }
    public MemorySegment _bufferDeviceAddressCaptureReplay() { return _bufferDeviceAddressCaptureReplayAt(0L); }
    public VkPhysicalDeviceVulkan12Features _bufferDeviceAddressCaptureReplayAt(long index, MemorySegment src) { _bufferDeviceAddressCaptureReplayAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _bufferDeviceAddressCaptureReplay(MemorySegment src) { return _bufferDeviceAddressCaptureReplayAt(0L, src); }
    public MemorySegment _bufferDeviceAddressMultiDeviceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferDeviceAddressMultiDevice, index), LAYOUT_bufferDeviceAddressMultiDevice); }
    public MemorySegment _bufferDeviceAddressMultiDevice() { return _bufferDeviceAddressMultiDeviceAt(0L); }
    public VkPhysicalDeviceVulkan12Features _bufferDeviceAddressMultiDeviceAt(long index, MemorySegment src) { _bufferDeviceAddressMultiDeviceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _bufferDeviceAddressMultiDevice(MemorySegment src) { return _bufferDeviceAddressMultiDeviceAt(0L, src); }
    public MemorySegment _vulkanMemoryModelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vulkanMemoryModel, index), LAYOUT_vulkanMemoryModel); }
    public MemorySegment _vulkanMemoryModel() { return _vulkanMemoryModelAt(0L); }
    public VkPhysicalDeviceVulkan12Features _vulkanMemoryModelAt(long index, MemorySegment src) { _vulkanMemoryModelAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _vulkanMemoryModel(MemorySegment src) { return _vulkanMemoryModelAt(0L, src); }
    public MemorySegment _vulkanMemoryModelDeviceScopeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vulkanMemoryModelDeviceScope, index), LAYOUT_vulkanMemoryModelDeviceScope); }
    public MemorySegment _vulkanMemoryModelDeviceScope() { return _vulkanMemoryModelDeviceScopeAt(0L); }
    public VkPhysicalDeviceVulkan12Features _vulkanMemoryModelDeviceScopeAt(long index, MemorySegment src) { _vulkanMemoryModelDeviceScopeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _vulkanMemoryModelDeviceScope(MemorySegment src) { return _vulkanMemoryModelDeviceScopeAt(0L, src); }
    public MemorySegment _vulkanMemoryModelAvailabilityVisibilityChainsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vulkanMemoryModelAvailabilityVisibilityChains, index), LAYOUT_vulkanMemoryModelAvailabilityVisibilityChains); }
    public MemorySegment _vulkanMemoryModelAvailabilityVisibilityChains() { return _vulkanMemoryModelAvailabilityVisibilityChainsAt(0L); }
    public VkPhysicalDeviceVulkan12Features _vulkanMemoryModelAvailabilityVisibilityChainsAt(long index, MemorySegment src) { _vulkanMemoryModelAvailabilityVisibilityChainsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment src) { return _vulkanMemoryModelAvailabilityVisibilityChainsAt(0L, src); }
    public MemorySegment _shaderOutputViewportIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderOutputViewportIndex, index), LAYOUT_shaderOutputViewportIndex); }
    public MemorySegment _shaderOutputViewportIndex() { return _shaderOutputViewportIndexAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderOutputViewportIndexAt(long index, MemorySegment src) { _shaderOutputViewportIndexAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderOutputViewportIndex(MemorySegment src) { return _shaderOutputViewportIndexAt(0L, src); }
    public MemorySegment _shaderOutputLayerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderOutputLayer, index), LAYOUT_shaderOutputLayer); }
    public MemorySegment _shaderOutputLayer() { return _shaderOutputLayerAt(0L); }
    public VkPhysicalDeviceVulkan12Features _shaderOutputLayerAt(long index, MemorySegment src) { _shaderOutputLayerAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _shaderOutputLayer(MemorySegment src) { return _shaderOutputLayerAt(0L, src); }
    public MemorySegment _subgroupBroadcastDynamicIdAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subgroupBroadcastDynamicId, index), LAYOUT_subgroupBroadcastDynamicId); }
    public MemorySegment _subgroupBroadcastDynamicId() { return _subgroupBroadcastDynamicIdAt(0L); }
    public VkPhysicalDeviceVulkan12Features _subgroupBroadcastDynamicIdAt(long index, MemorySegment src) { _subgroupBroadcastDynamicIdAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan12Features _subgroupBroadcastDynamicId(MemorySegment src) { return _subgroupBroadcastDynamicIdAt(0L, src); }
}

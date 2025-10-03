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

/// Represents `VkPhysicalDeviceVulkan13Properties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkan13Properties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t minSubgroupSize;
///     uint32_t maxSubgroupSize;
///     uint32_t maxComputeWorkgroupSubgroups;
///     ((uint32_t) VkFlags) VkShaderStageFlags requiredSubgroupSizeStages;
///     uint32_t maxInlineUniformBlockSize;
///     uint32_t maxPerStageDescriptorInlineUniformBlocks;
///     uint32_t maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
///     uint32_t maxDescriptorSetInlineUniformBlocks;
///     uint32_t maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
///     uint32_t maxInlineUniformTotalSize;
///     (uint32_t) VkBool32 integerDotProduct8BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct8BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct8BitMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProduct4x8BitPackedUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct4x8BitPackedSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct4x8BitPackedMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProduct16BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct16BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct16BitMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProduct32BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct32BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct32BitMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProduct64BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct64BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProduct64BitMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating8BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating8BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating16BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating16BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating32BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating32BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating64BitUnsignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating64BitSignedAccelerated;
///     (uint32_t) VkBool32 integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated;
///     (uint64_t) VkDeviceSize storageTexelBufferOffsetAlignmentBytes;
///     (uint32_t) VkBool32 storageTexelBufferOffsetSingleTexelAlignment;
///     (uint64_t) VkDeviceSize uniformTexelBufferOffsetAlignmentBytes;
///     (uint32_t) VkBool32 uniformTexelBufferOffsetSingleTexelAlignment;
///     (uint64_t) VkDeviceSize maxBufferSize;
/// };
/// ```
public final class VkPhysicalDeviceVulkan13Properties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVulkan13Properties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minSubgroupSize"),
        ValueLayout.JAVA_INT.withName("maxSubgroupSize"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkgroupSubgroups"),
        ValueLayout.JAVA_INT.withName("requiredSubgroupSizeStages"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformBlockSize"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformTotalSize"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_LONG.withName("storageTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("storageTexelBufferOffsetSingleTexelAlignment"),
        ValueLayout.JAVA_LONG.withName("uniformTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("uniformTexelBufferOffsetSingleTexelAlignment"),
        ValueLayout.JAVA_LONG.withName("maxBufferSize")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType")));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pNext = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext")));
    /// The byte offset of `minSubgroupSize`.
    public static final long OFFSET_minSubgroupSize = LAYOUT.byteOffset(PathElement.groupElement("minSubgroupSize"));
    /// The memory layout of `minSubgroupSize`.
    public static final MemoryLayout LAYOUT_minSubgroupSize = LAYOUT.select(PathElement.groupElement("minSubgroupSize"));
    /// The [VarHandle] of `minSubgroupSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minSubgroupSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSubgroupSize")));
    /// The byte offset of `maxSubgroupSize`.
    public static final long OFFSET_maxSubgroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxSubgroupSize"));
    /// The memory layout of `maxSubgroupSize`.
    public static final MemoryLayout LAYOUT_maxSubgroupSize = LAYOUT.select(PathElement.groupElement("maxSubgroupSize"));
    /// The [VarHandle] of `maxSubgroupSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxSubgroupSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubgroupSize")));
    /// The byte offset of `maxComputeWorkgroupSubgroups`.
    public static final long OFFSET_maxComputeWorkgroupSubgroups = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
    /// The memory layout of `maxComputeWorkgroupSubgroups`.
    public static final MemoryLayout LAYOUT_maxComputeWorkgroupSubgroups = LAYOUT.select(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
    /// The [VarHandle] of `maxComputeWorkgroupSubgroups` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxComputeWorkgroupSubgroups = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeWorkgroupSubgroups")));
    /// The byte offset of `requiredSubgroupSizeStages`.
    public static final long OFFSET_requiredSubgroupSizeStages = LAYOUT.byteOffset(PathElement.groupElement("requiredSubgroupSizeStages"));
    /// The memory layout of `requiredSubgroupSizeStages`.
    public static final MemoryLayout LAYOUT_requiredSubgroupSizeStages = LAYOUT.select(PathElement.groupElement("requiredSubgroupSizeStages"));
    /// The [VarHandle] of `requiredSubgroupSizeStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_requiredSubgroupSizeStages = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiredSubgroupSizeStages")));
    /// The byte offset of `maxInlineUniformBlockSize`.
    public static final long OFFSET_maxInlineUniformBlockSize = LAYOUT.byteOffset(PathElement.groupElement("maxInlineUniformBlockSize"));
    /// The memory layout of `maxInlineUniformBlockSize`.
    public static final MemoryLayout LAYOUT_maxInlineUniformBlockSize = LAYOUT.select(PathElement.groupElement("maxInlineUniformBlockSize"));
    /// The [VarHandle] of `maxInlineUniformBlockSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxInlineUniformBlockSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInlineUniformBlockSize")));
    /// The byte offset of `maxPerStageDescriptorInlineUniformBlocks`.
    public static final long OFFSET_maxPerStageDescriptorInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
    /// The memory layout of `maxPerStageDescriptorInlineUniformBlocks`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
    /// The [VarHandle] of `maxPerStageDescriptorInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxPerStageDescriptorInlineUniformBlocks = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks")));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks")));
    /// The byte offset of `maxDescriptorSetInlineUniformBlocks`.
    public static final long OFFSET_maxDescriptorSetInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
    /// The memory layout of `maxDescriptorSetInlineUniformBlocks`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
    /// The [VarHandle] of `maxDescriptorSetInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxDescriptorSetInlineUniformBlocks = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks")));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindInlineUniformBlocks`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindInlineUniformBlocks`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks")));
    /// The byte offset of `maxInlineUniformTotalSize`.
    public static final long OFFSET_maxInlineUniformTotalSize = LAYOUT.byteOffset(PathElement.groupElement("maxInlineUniformTotalSize"));
    /// The memory layout of `maxInlineUniformTotalSize`.
    public static final MemoryLayout LAYOUT_maxInlineUniformTotalSize = LAYOUT.select(PathElement.groupElement("maxInlineUniformTotalSize"));
    /// The [VarHandle] of `maxInlineUniformTotalSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxInlineUniformTotalSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInlineUniformTotalSize")));
    /// The byte offset of `integerDotProduct8BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProduct8BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProduct8BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct8BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct8BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct8BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProduct8BitSignedAccelerated`.
    public static final long OFFSET_integerDotProduct8BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
    /// The memory layout of `integerDotProduct8BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct8BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct8BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct8BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitSignedAccelerated")));
    /// The byte offset of `integerDotProduct8BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProduct8BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProduct8BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct8BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct8BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct8BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProduct4x8BitPackedUnsignedAccelerated`.
    public static final long OFFSET_integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
    /// The memory layout of `integerDotProduct4x8BitPackedUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct4x8BitPackedUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct4x8BitPackedUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated")));
    /// The byte offset of `integerDotProduct4x8BitPackedSignedAccelerated`.
    public static final long OFFSET_integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
    /// The memory layout of `integerDotProduct4x8BitPackedSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct4x8BitPackedSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct4x8BitPackedSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated")));
    /// The byte offset of `integerDotProduct4x8BitPackedMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProduct4x8BitPackedMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct4x8BitPackedMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProduct16BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProduct16BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProduct16BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct16BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct16BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct16BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProduct16BitSignedAccelerated`.
    public static final long OFFSET_integerDotProduct16BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
    /// The memory layout of `integerDotProduct16BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct16BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct16BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct16BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitSignedAccelerated")));
    /// The byte offset of `integerDotProduct16BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProduct16BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProduct16BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct16BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct16BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct16BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProduct32BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProduct32BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProduct32BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct32BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct32BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct32BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProduct32BitSignedAccelerated`.
    public static final long OFFSET_integerDotProduct32BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
    /// The memory layout of `integerDotProduct32BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct32BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct32BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct32BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitSignedAccelerated")));
    /// The byte offset of `integerDotProduct32BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProduct32BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProduct32BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct32BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct32BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct32BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProduct64BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProduct64BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProduct64BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct64BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct64BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct64BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProduct64BitSignedAccelerated`.
    public static final long OFFSET_integerDotProduct64BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
    /// The memory layout of `integerDotProduct64BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct64BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct64BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct64BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitSignedAccelerated")));
    /// The byte offset of `integerDotProduct64BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProduct64BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProduct64BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProduct64BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct64BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProduct64BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating8BitSignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating8BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating8BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating16BitSignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating16BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating16BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating32BitSignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating32BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating32BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating64BitSignedAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating64BitSignedAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating64BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated")));
    /// The byte offset of `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated`.
    public static final long OFFSET_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
    /// The memory layout of `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated`.
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated")));
    /// The byte offset of `storageTexelBufferOffsetAlignmentBytes`.
    public static final long OFFSET_storageTexelBufferOffsetAlignmentBytes = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    /// The memory layout of `storageTexelBufferOffsetAlignmentBytes`.
    public static final MemoryLayout LAYOUT_storageTexelBufferOffsetAlignmentBytes = LAYOUT.select(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    /// The [VarHandle] of `storageTexelBufferOffsetAlignmentBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_storageTexelBufferOffsetAlignmentBytes = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes")));
    /// The byte offset of `storageTexelBufferOffsetSingleTexelAlignment`.
    public static final long OFFSET_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    /// The memory layout of `storageTexelBufferOffsetSingleTexelAlignment`.
    public static final MemoryLayout LAYOUT_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.select(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    /// The [VarHandle] of `storageTexelBufferOffsetSingleTexelAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_storageTexelBufferOffsetSingleTexelAlignment = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment")));
    /// The byte offset of `uniformTexelBufferOffsetAlignmentBytes`.
    public static final long OFFSET_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    /// The memory layout of `uniformTexelBufferOffsetAlignmentBytes`.
    public static final MemoryLayout LAYOUT_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.select(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    /// The [VarHandle] of `uniformTexelBufferOffsetAlignmentBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_uniformTexelBufferOffsetAlignmentBytes = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes")));
    /// The byte offset of `uniformTexelBufferOffsetSingleTexelAlignment`.
    public static final long OFFSET_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
    /// The memory layout of `uniformTexelBufferOffsetSingleTexelAlignment`.
    public static final MemoryLayout LAYOUT_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.select(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
    /// The [VarHandle] of `uniformTexelBufferOffsetSingleTexelAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_uniformTexelBufferOffsetSingleTexelAlignment = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment")));
    /// The byte offset of `maxBufferSize`.
    public static final long OFFSET_maxBufferSize = LAYOUT.byteOffset(PathElement.groupElement("maxBufferSize"));
    /// The memory layout of `maxBufferSize`.
    public static final MemoryLayout LAYOUT_maxBufferSize = LAYOUT.select(PathElement.groupElement("maxBufferSize"));
    /// The [VarHandle] of `maxBufferSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxBufferSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBufferSize")));

    /// Creates `VkPhysicalDeviceVulkan13Properties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVulkan13Properties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVulkan13Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan13Properties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Properties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkan13Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan13Properties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Properties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVulkan13Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan13Properties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Properties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVulkan13Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan13Properties`
    public static VkPhysicalDeviceVulkan13Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan13Properties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVulkan13Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan13Properties`
    public static VkPhysicalDeviceVulkan13Properties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan13Properties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties copyFrom(VkPhysicalDeviceVulkan13Properties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVulkan13Properties reinterpret(long count) { return new VkPhysicalDeviceVulkan13Properties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get().get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.get().set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get().get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.get().set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `minSubgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minSubgroupSize(MemorySegment segment, long index) { return (int) VH_minSubgroupSize.get().get(segment, 0L, index); }
    /// {@return `minSubgroupSize`}
    public int minSubgroupSize() { return minSubgroupSize(this.segment(), 0L); }
    /// Sets `minSubgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minSubgroupSize(MemorySegment segment, long index, int value) { VH_minSubgroupSize.get().set(segment, 0L, index, value); }
    /// Sets `minSubgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties minSubgroupSize(int value) { minSubgroupSize(this.segment(), 0L, value); return this; }

    /// {@return `maxSubgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSubgroupSize(MemorySegment segment, long index) { return (int) VH_maxSubgroupSize.get().get(segment, 0L, index); }
    /// {@return `maxSubgroupSize`}
    public int maxSubgroupSize() { return maxSubgroupSize(this.segment(), 0L); }
    /// Sets `maxSubgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSubgroupSize(MemorySegment segment, long index, int value) { VH_maxSubgroupSize.get().set(segment, 0L, index, value); }
    /// Sets `maxSubgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxSubgroupSize(int value) { maxSubgroupSize(this.segment(), 0L, value); return this; }

    /// {@return `maxComputeWorkgroupSubgroups` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxComputeWorkgroupSubgroups(MemorySegment segment, long index) { return (int) VH_maxComputeWorkgroupSubgroups.get().get(segment, 0L, index); }
    /// {@return `maxComputeWorkgroupSubgroups`}
    public int maxComputeWorkgroupSubgroups() { return maxComputeWorkgroupSubgroups(this.segment(), 0L); }
    /// Sets `maxComputeWorkgroupSubgroups` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxComputeWorkgroupSubgroups(MemorySegment segment, long index, int value) { VH_maxComputeWorkgroupSubgroups.get().set(segment, 0L, index, value); }
    /// Sets `maxComputeWorkgroupSubgroups` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxComputeWorkgroupSubgroups(int value) { maxComputeWorkgroupSubgroups(this.segment(), 0L, value); return this; }

    /// {@return `requiredSubgroupSizeStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int requiredSubgroupSizeStages(MemorySegment segment, long index) { return (int) VH_requiredSubgroupSizeStages.get().get(segment, 0L, index); }
    /// {@return `requiredSubgroupSizeStages`}
    public int requiredSubgroupSizeStages() { return requiredSubgroupSizeStages(this.segment(), 0L); }
    /// Sets `requiredSubgroupSizeStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void requiredSubgroupSizeStages(MemorySegment segment, long index, int value) { VH_requiredSubgroupSizeStages.get().set(segment, 0L, index, value); }
    /// Sets `requiredSubgroupSizeStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties requiredSubgroupSizeStages(int value) { requiredSubgroupSizeStages(this.segment(), 0L, value); return this; }

    /// {@return `maxInlineUniformBlockSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxInlineUniformBlockSize(MemorySegment segment, long index) { return (int) VH_maxInlineUniformBlockSize.get().get(segment, 0L, index); }
    /// {@return `maxInlineUniformBlockSize`}
    public int maxInlineUniformBlockSize() { return maxInlineUniformBlockSize(this.segment(), 0L); }
    /// Sets `maxInlineUniformBlockSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxInlineUniformBlockSize(MemorySegment segment, long index, int value) { VH_maxInlineUniformBlockSize.get().set(segment, 0L, index, value); }
    /// Sets `maxInlineUniformBlockSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxInlineUniformBlockSize(int value) { maxInlineUniformBlockSize(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorInlineUniformBlocks.get().get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorInlineUniformBlocks`}
    public int maxPerStageDescriptorInlineUniformBlocks() { return maxPerStageDescriptorInlineUniformBlocks(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorInlineUniformBlocks(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorInlineUniformBlocks.get().set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxPerStageDescriptorInlineUniformBlocks(int value) { maxPerStageDescriptorInlineUniformBlocks(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.get().get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks`}
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.get().set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(int value) { maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetInlineUniformBlocks.get().get(segment, 0L, index); }
    /// {@return `maxDescriptorSetInlineUniformBlocks`}
    public int maxDescriptorSetInlineUniformBlocks() { return maxDescriptorSetInlineUniformBlocks(this.segment(), 0L); }
    /// Sets `maxDescriptorSetInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetInlineUniformBlocks(MemorySegment segment, long index, int value) { VH_maxDescriptorSetInlineUniformBlocks.get().set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxDescriptorSetInlineUniformBlocks(int value) { maxDescriptorSetInlineUniformBlocks(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.get().get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindInlineUniformBlocks`}
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.get().set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxDescriptorSetUpdateAfterBindInlineUniformBlocks(int value) { maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment(), 0L, value); return this; }

    /// {@return `maxInlineUniformTotalSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxInlineUniformTotalSize(MemorySegment segment, long index) { return (int) VH_maxInlineUniformTotalSize.get().get(segment, 0L, index); }
    /// {@return `maxInlineUniformTotalSize`}
    public int maxInlineUniformTotalSize() { return maxInlineUniformTotalSize(this.segment(), 0L); }
    /// Sets `maxInlineUniformTotalSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxInlineUniformTotalSize(MemorySegment segment, long index, int value) { VH_maxInlineUniformTotalSize.get().set(segment, 0L, index, value); }
    /// Sets `maxInlineUniformTotalSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxInlineUniformTotalSize(int value) { maxInlineUniformTotalSize(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct8BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct8BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct8BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct8BitUnsignedAccelerated`}
    public int integerDotProduct8BitUnsignedAccelerated() { return integerDotProduct8BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct8BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct8BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct8BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct8BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitUnsignedAccelerated(int value) { integerDotProduct8BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct8BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct8BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct8BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct8BitSignedAccelerated`}
    public int integerDotProduct8BitSignedAccelerated() { return integerDotProduct8BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct8BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct8BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct8BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct8BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitSignedAccelerated(int value) { integerDotProduct8BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct8BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct8BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct8BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct8BitMixedSignednessAccelerated`}
    public int integerDotProduct8BitMixedSignednessAccelerated() { return integerDotProduct8BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct8BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct8BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct8BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitMixedSignednessAccelerated(int value) { integerDotProduct8BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct4x8BitPackedUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct4x8BitPackedUnsignedAccelerated`}
    public int integerDotProduct4x8BitPackedUnsignedAccelerated() { return integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct4x8BitPackedUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct4x8BitPackedUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedUnsignedAccelerated(int value) { integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct4x8BitPackedSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct4x8BitPackedSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct4x8BitPackedSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct4x8BitPackedSignedAccelerated`}
    public int integerDotProduct4x8BitPackedSignedAccelerated() { return integerDotProduct4x8BitPackedSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct4x8BitPackedSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct4x8BitPackedSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct4x8BitPackedSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedSignedAccelerated(int value) { integerDotProduct4x8BitPackedSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct4x8BitPackedMixedSignednessAccelerated`}
    public int integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct4x8BitPackedMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedMixedSignednessAccelerated(int value) { integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct16BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct16BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct16BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct16BitUnsignedAccelerated`}
    public int integerDotProduct16BitUnsignedAccelerated() { return integerDotProduct16BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct16BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct16BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct16BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct16BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitUnsignedAccelerated(int value) { integerDotProduct16BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct16BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct16BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct16BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct16BitSignedAccelerated`}
    public int integerDotProduct16BitSignedAccelerated() { return integerDotProduct16BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct16BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct16BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct16BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct16BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitSignedAccelerated(int value) { integerDotProduct16BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct16BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct16BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct16BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct16BitMixedSignednessAccelerated`}
    public int integerDotProduct16BitMixedSignednessAccelerated() { return integerDotProduct16BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct16BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct16BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct16BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitMixedSignednessAccelerated(int value) { integerDotProduct16BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct32BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct32BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct32BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct32BitUnsignedAccelerated`}
    public int integerDotProduct32BitUnsignedAccelerated() { return integerDotProduct32BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct32BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct32BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct32BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct32BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitUnsignedAccelerated(int value) { integerDotProduct32BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct32BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct32BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct32BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct32BitSignedAccelerated`}
    public int integerDotProduct32BitSignedAccelerated() { return integerDotProduct32BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct32BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct32BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct32BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct32BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitSignedAccelerated(int value) { integerDotProduct32BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct32BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct32BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct32BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct32BitMixedSignednessAccelerated`}
    public int integerDotProduct32BitMixedSignednessAccelerated() { return integerDotProduct32BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct32BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct32BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct32BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitMixedSignednessAccelerated(int value) { integerDotProduct32BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct64BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct64BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct64BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct64BitUnsignedAccelerated`}
    public int integerDotProduct64BitUnsignedAccelerated() { return integerDotProduct64BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct64BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct64BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct64BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct64BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitUnsignedAccelerated(int value) { integerDotProduct64BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct64BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct64BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct64BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct64BitSignedAccelerated`}
    public int integerDotProduct64BitSignedAccelerated() { return integerDotProduct64BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct64BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct64BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct64BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct64BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitSignedAccelerated(int value) { integerDotProduct64BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProduct64BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProduct64BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct64BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProduct64BitMixedSignednessAccelerated`}
    public int integerDotProduct64BitMixedSignednessAccelerated() { return integerDotProduct64BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProduct64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProduct64BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProduct64BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProduct64BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitMixedSignednessAccelerated(int value) { integerDotProduct64BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated`}
    public int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(int value) { integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating8BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitSignedAccelerated`}
    public int integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating8BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating8BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitSignedAccelerated(int value) { integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated`}
    public int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(int value) { integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated`}
    public int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(int value) { integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated`}
    public int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(int value) { integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated`}
    public int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(int value) { integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated`}
    public int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(int value) { integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating16BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitSignedAccelerated`}
    public int integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating16BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating16BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitSignedAccelerated(int value) { integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated`}
    public int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(int value) { integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated`}
    public int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(int value) { integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating32BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitSignedAccelerated`}
    public int integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating32BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating32BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitSignedAccelerated(int value) { integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated`}
    public int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(int value) { integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated`}
    public int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(int value) { integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating64BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitSignedAccelerated`}
    public int integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating64BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating64BitSignedAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitSignedAccelerated(int value) { integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.get().get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated`}
    public int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment(), 0L); }
    /// Sets `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(MemorySegment segment, long index, int value) { VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.get().set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(int value) { integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `storageTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index) { return (long) VH_storageTexelBufferOffsetAlignmentBytes.get().get(segment, 0L, index); }
    /// {@return `storageTexelBufferOffsetAlignmentBytes`}
    public long storageTexelBufferOffsetAlignmentBytes() { return storageTexelBufferOffsetAlignmentBytes(this.segment(), 0L); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index, long value) { VH_storageTexelBufferOffsetAlignmentBytes.get().set(segment, 0L, index, value); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties storageTexelBufferOffsetAlignmentBytes(long value) { storageTexelBufferOffsetAlignmentBytes(this.segment(), 0L, value); return this; }

    /// {@return `storageTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index) { return (int) VH_storageTexelBufferOffsetSingleTexelAlignment.get().get(segment, 0L, index); }
    /// {@return `storageTexelBufferOffsetSingleTexelAlignment`}
    public int storageTexelBufferOffsetSingleTexelAlignment() { return storageTexelBufferOffsetSingleTexelAlignment(this.segment(), 0L); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index, int value) { VH_storageTexelBufferOffsetSingleTexelAlignment.get().set(segment, 0L, index, value); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties storageTexelBufferOffsetSingleTexelAlignment(int value) { storageTexelBufferOffsetSingleTexelAlignment(this.segment(), 0L, value); return this; }

    /// {@return `uniformTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index) { return (long) VH_uniformTexelBufferOffsetAlignmentBytes.get().get(segment, 0L, index); }
    /// {@return `uniformTexelBufferOffsetAlignmentBytes`}
    public long uniformTexelBufferOffsetAlignmentBytes() { return uniformTexelBufferOffsetAlignmentBytes(this.segment(), 0L); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index, long value) { VH_uniformTexelBufferOffsetAlignmentBytes.get().set(segment, 0L, index, value); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties uniformTexelBufferOffsetAlignmentBytes(long value) { uniformTexelBufferOffsetAlignmentBytes(this.segment(), 0L, value); return this; }

    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index) { return (int) VH_uniformTexelBufferOffsetSingleTexelAlignment.get().get(segment, 0L, index); }
    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment`}
    public int uniformTexelBufferOffsetSingleTexelAlignment() { return uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), 0L); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index, int value) { VH_uniformTexelBufferOffsetSingleTexelAlignment.get().set(segment, 0L, index, value); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties uniformTexelBufferOffsetSingleTexelAlignment(int value) { uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), 0L, value); return this; }

    /// {@return `maxBufferSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxBufferSize(MemorySegment segment, long index) { return (long) VH_maxBufferSize.get().get(segment, 0L, index); }
    /// {@return `maxBufferSize`}
    public long maxBufferSize() { return maxBufferSize(this.segment(), 0L); }
    /// Sets `maxBufferSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBufferSize(MemorySegment segment, long index, long value) { VH_maxBufferSize.get().set(segment, 0L, index, value); }
    /// Sets `maxBufferSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxBufferSize(long value) { maxBufferSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVulkan13Properties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVulkan13Properties`
    public VkPhysicalDeviceVulkan13Properties asSlice(long index) { return new VkPhysicalDeviceVulkan13Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVulkan13Properties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVulkan13Properties`
    public VkPhysicalDeviceVulkan13Properties asSlice(long index, long count) { return new VkPhysicalDeviceVulkan13Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVulkan13Properties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties at(long index, Consumer<VkPhysicalDeviceVulkan13Properties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `minSubgroupSize` at the given index}
    /// @param index the index of the struct buffer
    public int minSubgroupSizeAt(long index) { return minSubgroupSize(this.segment(), index); }
    /// Sets `minSubgroupSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties minSubgroupSizeAt(long index, int value) { minSubgroupSize(this.segment(), index, value); return this; }

    /// {@return `maxSubgroupSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxSubgroupSizeAt(long index) { return maxSubgroupSize(this.segment(), index); }
    /// Sets `maxSubgroupSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxSubgroupSizeAt(long index, int value) { maxSubgroupSize(this.segment(), index, value); return this; }

    /// {@return `maxComputeWorkgroupSubgroups` at the given index}
    /// @param index the index of the struct buffer
    public int maxComputeWorkgroupSubgroupsAt(long index) { return maxComputeWorkgroupSubgroups(this.segment(), index); }
    /// Sets `maxComputeWorkgroupSubgroups` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxComputeWorkgroupSubgroupsAt(long index, int value) { maxComputeWorkgroupSubgroups(this.segment(), index, value); return this; }

    /// {@return `requiredSubgroupSizeStages` at the given index}
    /// @param index the index of the struct buffer
    public int requiredSubgroupSizeStagesAt(long index) { return requiredSubgroupSizeStages(this.segment(), index); }
    /// Sets `requiredSubgroupSizeStages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties requiredSubgroupSizeStagesAt(long index, int value) { requiredSubgroupSizeStages(this.segment(), index, value); return this; }

    /// {@return `maxInlineUniformBlockSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxInlineUniformBlockSizeAt(long index) { return maxInlineUniformBlockSize(this.segment(), index); }
    /// Sets `maxInlineUniformBlockSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxInlineUniformBlockSizeAt(long index, int value) { maxInlineUniformBlockSize(this.segment(), index, value); return this; }

    /// {@return `maxPerStageDescriptorInlineUniformBlocks` at the given index}
    /// @param index the index of the struct buffer
    public int maxPerStageDescriptorInlineUniformBlocksAt(long index) { return maxPerStageDescriptorInlineUniformBlocks(this.segment(), index); }
    /// Sets `maxPerStageDescriptorInlineUniformBlocks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxPerStageDescriptorInlineUniformBlocksAt(long index, int value) { maxPerStageDescriptorInlineUniformBlocks(this.segment(), index, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` at the given index}
    /// @param index the index of the struct buffer
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index) { return maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment(), index); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetInlineUniformBlocks` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetInlineUniformBlocksAt(long index) { return maxDescriptorSetInlineUniformBlocks(this.segment(), index); }
    /// Sets `maxDescriptorSetInlineUniformBlocks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxDescriptorSetInlineUniformBlocksAt(long index, int value) { maxDescriptorSetInlineUniformBlocks(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index) { return maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment(), index); }
    /// Sets `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index, int value) { maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment(), index, value); return this; }

    /// {@return `maxInlineUniformTotalSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxInlineUniformTotalSizeAt(long index) { return maxInlineUniformTotalSize(this.segment(), index); }
    /// Sets `maxInlineUniformTotalSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxInlineUniformTotalSizeAt(long index, int value) { maxInlineUniformTotalSize(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct8BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct8BitUnsignedAcceleratedAt(long index) { return integerDotProduct8BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct8BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitUnsignedAcceleratedAt(long index, int value) { integerDotProduct8BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct8BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct8BitSignedAcceleratedAt(long index) { return integerDotProduct8BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct8BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitSignedAcceleratedAt(long index, int value) { integerDotProduct8BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct8BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct8BitMixedSignednessAcceleratedAt(long index) { return integerDotProduct8BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProduct8BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index) { return integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index, int value) { integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct4x8BitPackedSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct4x8BitPackedSignedAcceleratedAt(long index) { return integerDotProduct4x8BitPackedSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedSignedAcceleratedAt(long index, int value) { integerDotProduct4x8BitPackedSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index) { return integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index, int value) { integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct16BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct16BitUnsignedAcceleratedAt(long index) { return integerDotProduct16BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct16BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitUnsignedAcceleratedAt(long index, int value) { integerDotProduct16BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct16BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct16BitSignedAcceleratedAt(long index) { return integerDotProduct16BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct16BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitSignedAcceleratedAt(long index, int value) { integerDotProduct16BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct16BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct16BitMixedSignednessAcceleratedAt(long index) { return integerDotProduct16BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProduct16BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct32BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct32BitUnsignedAcceleratedAt(long index) { return integerDotProduct32BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct32BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitUnsignedAcceleratedAt(long index, int value) { integerDotProduct32BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct32BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct32BitSignedAcceleratedAt(long index) { return integerDotProduct32BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct32BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitSignedAcceleratedAt(long index, int value) { integerDotProduct32BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct32BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct32BitMixedSignednessAcceleratedAt(long index) { return integerDotProduct32BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProduct32BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct64BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct64BitUnsignedAcceleratedAt(long index) { return integerDotProduct64BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct64BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitUnsignedAcceleratedAt(long index, int value) { integerDotProduct64BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct64BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct64BitSignedAcceleratedAt(long index) { return integerDotProduct64BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct64BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitSignedAcceleratedAt(long index, int value) { integerDotProduct64BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProduct64BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProduct64BitMixedSignednessAcceleratedAt(long index) { return integerDotProduct64BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProduct64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProduct64BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating8BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating16BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating32BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitSignedAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating64BitSignedAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment(), index, value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` at the given index}
    /// @param index the index of the struct buffer
    public int integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index) { return integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment(), index); }
    /// Sets `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index, int value) { integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment(), index, value); return this; }

    /// {@return `storageTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param index the index of the struct buffer
    public long storageTexelBufferOffsetAlignmentBytesAt(long index) { return storageTexelBufferOffsetAlignmentBytes(this.segment(), index); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties storageTexelBufferOffsetAlignmentBytesAt(long index, long value) { storageTexelBufferOffsetAlignmentBytes(this.segment(), index, value); return this; }

    /// {@return `storageTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int storageTexelBufferOffsetSingleTexelAlignmentAt(long index) { return storageTexelBufferOffsetSingleTexelAlignment(this.segment(), index); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties storageTexelBufferOffsetSingleTexelAlignmentAt(long index, int value) { storageTexelBufferOffsetSingleTexelAlignment(this.segment(), index, value); return this; }

    /// {@return `uniformTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param index the index of the struct buffer
    public long uniformTexelBufferOffsetAlignmentBytesAt(long index) { return uniformTexelBufferOffsetAlignmentBytes(this.segment(), index); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties uniformTexelBufferOffsetAlignmentBytesAt(long index, long value) { uniformTexelBufferOffsetAlignmentBytes(this.segment(), index, value); return this; }

    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int uniformTexelBufferOffsetSingleTexelAlignmentAt(long index) { return uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), index); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties uniformTexelBufferOffsetSingleTexelAlignmentAt(long index, int value) { uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), index, value); return this; }

    /// {@return `maxBufferSize` at the given index}
    /// @param index the index of the struct buffer
    public long maxBufferSizeAt(long index) { return maxBufferSize(this.segment(), index); }
    /// Sets `maxBufferSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxBufferSizeAt(long index, long value) { maxBufferSize(this.segment(), index, value); return this; }

}

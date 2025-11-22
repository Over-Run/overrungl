// This file is auto-generated. DO NOT EDIT!
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
///     VkStructureType sType;
///     void* pNext;
///     uint32_t minSubgroupSize;
///     uint32_t maxSubgroupSize;
///     uint32_t maxComputeWorkgroupSubgroups;
///     VkShaderStageFlags requiredSubgroupSizeStages;
///     uint32_t maxInlineUniformBlockSize;
///     uint32_t maxPerStageDescriptorInlineUniformBlocks;
///     uint32_t maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
///     uint32_t maxDescriptorSetInlineUniformBlocks;
///     uint32_t maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
///     uint32_t maxInlineUniformTotalSize;
///     VkBool32 integerDotProduct8BitUnsignedAccelerated;
///     VkBool32 integerDotProduct8BitSignedAccelerated;
///     VkBool32 integerDotProduct8BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedUnsignedAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedSignedAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedMixedSignednessAccelerated;
///     VkBool32 integerDotProduct16BitUnsignedAccelerated;
///     VkBool32 integerDotProduct16BitSignedAccelerated;
///     VkBool32 integerDotProduct16BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct32BitUnsignedAccelerated;
///     VkBool32 integerDotProduct32BitSignedAccelerated;
///     VkBool32 integerDotProduct32BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct64BitUnsignedAccelerated;
///     VkBool32 integerDotProduct64BitSignedAccelerated;
///     VkBool32 integerDotProduct64BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated;
///     VkDeviceSize storageTexelBufferOffsetAlignmentBytes;
///     VkBool32 storageTexelBufferOffsetSingleTexelAlignment;
///     VkDeviceSize uniformTexelBufferOffsetAlignmentBytes;
///     VkBool32 uniformTexelBufferOffsetSingleTexelAlignment;
///     VkDeviceSize maxBufferSize;
/// }
/// ```
public final class VkPhysicalDeviceVulkan13Properties extends GroupType {
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
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_minSubgroupSize = LAYOUT.byteOffset(PathElement.groupElement("minSubgroupSize"));
    public static final long OFFSET_maxSubgroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxSubgroupSize"));
    public static final long OFFSET_maxComputeWorkgroupSubgroups = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
    public static final long OFFSET_requiredSubgroupSizeStages = LAYOUT.byteOffset(PathElement.groupElement("requiredSubgroupSizeStages"));
    public static final long OFFSET_maxInlineUniformBlockSize = LAYOUT.byteOffset(PathElement.groupElement("maxInlineUniformBlockSize"));
    public static final long OFFSET_maxPerStageDescriptorInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
    public static final long OFFSET_maxDescriptorSetInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
    public static final long OFFSET_maxInlineUniformTotalSize = LAYOUT.byteOffset(PathElement.groupElement("maxInlineUniformTotalSize"));
    public static final long OFFSET_integerDotProduct8BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProduct8BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
    public static final long OFFSET_integerDotProduct8BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
    public static final long OFFSET_integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
    public static final long OFFSET_integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProduct16BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProduct16BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
    public static final long OFFSET_integerDotProduct16BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProduct32BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProduct32BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
    public static final long OFFSET_integerDotProduct32BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProduct64BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProduct64BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
    public static final long OFFSET_integerDotProduct64BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
    public static final long OFFSET_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
    public static final long OFFSET_storageTexelBufferOffsetAlignmentBytes = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    public static final long OFFSET_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    public static final long OFFSET_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    public static final long OFFSET_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
    public static final long OFFSET_maxBufferSize = LAYOUT.byteOffset(PathElement.groupElement("maxBufferSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_minSubgroupSize = LAYOUT.select(PathElement.groupElement("minSubgroupSize"));
    public static final MemoryLayout LAYOUT_maxSubgroupSize = LAYOUT.select(PathElement.groupElement("maxSubgroupSize"));
    public static final MemoryLayout LAYOUT_maxComputeWorkgroupSubgroups = LAYOUT.select(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
    public static final MemoryLayout LAYOUT_requiredSubgroupSizeStages = LAYOUT.select(PathElement.groupElement("requiredSubgroupSizeStages"));
    public static final MemoryLayout LAYOUT_maxInlineUniformBlockSize = LAYOUT.select(PathElement.groupElement("maxInlineUniformBlockSize"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
    public static final MemoryLayout LAYOUT_maxInlineUniformTotalSize = LAYOUT.select(PathElement.groupElement("maxInlineUniformTotalSize"));
    public static final MemoryLayout LAYOUT_integerDotProduct8BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct8BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct8BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct16BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct16BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct16BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct32BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct32BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct32BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct64BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct64BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProduct64BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
    public static final MemoryLayout LAYOUT_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT.select(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
    public static final MemoryLayout LAYOUT_storageTexelBufferOffsetAlignmentBytes = LAYOUT.select(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    public static final MemoryLayout LAYOUT_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.select(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    public static final MemoryLayout LAYOUT_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.select(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    public static final MemoryLayout LAYOUT_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.select(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
    public static final MemoryLayout LAYOUT_maxBufferSize = LAYOUT.select(PathElement.groupElement("maxBufferSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_minSubgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSubgroupSize"));
    public static final VarHandle VH_maxSubgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubgroupSize"));
    public static final VarHandle VH_maxComputeWorkgroupSubgroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
    public static final VarHandle VH_requiredSubgroupSizeStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiredSubgroupSizeStages"));
    public static final VarHandle VH_maxInlineUniformBlockSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInlineUniformBlockSize"));
    public static final VarHandle VH_maxPerStageDescriptorInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
    public static final VarHandle VH_maxDescriptorSetInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
    public static final VarHandle VH_maxInlineUniformTotalSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInlineUniformTotalSize"));
    public static final VarHandle VH_integerDotProduct8BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProduct8BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProduct8BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
    public static final VarHandle VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProduct16BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProduct16BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProduct16BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProduct32BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProduct32BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProduct32BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProduct64BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProduct64BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProduct64BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
    public static final VarHandle VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
    public static final VarHandle VH_storageTexelBufferOffsetAlignmentBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    public static final VarHandle VH_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    public static final VarHandle VH_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    public static final VarHandle VH_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
    public static final VarHandle VH_maxBufferSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBufferSize"));

    public VkPhysicalDeviceVulkan13Properties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVulkan13Properties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Properties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVulkan13Properties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Properties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVulkan13Properties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Properties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVulkan13Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan13Properties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVulkan13Properties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan13Properties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVulkan13Properties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES); }
    public static VkPhysicalDeviceVulkan13Properties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceVulkan13Properties copyFrom(VkPhysicalDeviceVulkan13Properties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVulkan13Properties reinterpret(long count) { return new VkPhysicalDeviceVulkan13Properties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVulkan13Properties asSlice(long index) { return new VkPhysicalDeviceVulkan13Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVulkan13Properties asSlice(long index, long count) { return new VkPhysicalDeviceVulkan13Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVulkan13Properties at(long index, Consumer<VkPhysicalDeviceVulkan13Properties> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int minSubgroupSizeAt(long index) { return (int) VH_minSubgroupSize.get(this.segment(), 0L, index); }
    public int maxSubgroupSizeAt(long index) { return (int) VH_maxSubgroupSize.get(this.segment(), 0L, index); }
    public int maxComputeWorkgroupSubgroupsAt(long index) { return (int) VH_maxComputeWorkgroupSubgroups.get(this.segment(), 0L, index); }
    public int requiredSubgroupSizeStagesAt(long index) { return (int) VH_requiredSubgroupSizeStages.get(this.segment(), 0L, index); }
    public int maxInlineUniformBlockSizeAt(long index) { return (int) VH_maxInlineUniformBlockSize.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorInlineUniformBlocksAt(long index) { return (int) VH_maxPerStageDescriptorInlineUniformBlocks.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.get(this.segment(), 0L, index); }
    public int maxDescriptorSetInlineUniformBlocksAt(long index) { return (int) VH_maxDescriptorSetInlineUniformBlocks.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.get(this.segment(), 0L, index); }
    public int maxInlineUniformTotalSizeAt(long index) { return (int) VH_maxInlineUniformTotalSize.get(this.segment(), 0L, index); }
    public int integerDotProduct8BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProduct8BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct8BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProduct8BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct8BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProduct8BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProduct4x8BitPackedUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct4x8BitPackedSignedAcceleratedAt(long index) { return (int) VH_integerDotProduct4x8BitPackedSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct16BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProduct16BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct16BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProduct16BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct16BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProduct16BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct32BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProduct32BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct32BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProduct32BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct32BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProduct32BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct64BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProduct64BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct64BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProduct64BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProduct64BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProduct64BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.get(this.segment(), 0L, index); }
    public int integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.get(this.segment(), 0L, index); }
    public long storageTexelBufferOffsetAlignmentBytesAt(long index) { return (long) VH_storageTexelBufferOffsetAlignmentBytes.get(this.segment(), 0L, index); }
    public int storageTexelBufferOffsetSingleTexelAlignmentAt(long index) { return (int) VH_storageTexelBufferOffsetSingleTexelAlignment.get(this.segment(), 0L, index); }
    public long uniformTexelBufferOffsetAlignmentBytesAt(long index) { return (long) VH_uniformTexelBufferOffsetAlignmentBytes.get(this.segment(), 0L, index); }
    public int uniformTexelBufferOffsetSingleTexelAlignmentAt(long index) { return (int) VH_uniformTexelBufferOffsetSingleTexelAlignment.get(this.segment(), 0L, index); }
    public long maxBufferSizeAt(long index) { return (long) VH_maxBufferSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int minSubgroupSize() { return (int) VH_minSubgroupSize.get(this.segment(), 0L, 0L); }
    public int maxSubgroupSize() { return (int) VH_maxSubgroupSize.get(this.segment(), 0L, 0L); }
    public int maxComputeWorkgroupSubgroups() { return (int) VH_maxComputeWorkgroupSubgroups.get(this.segment(), 0L, 0L); }
    public int requiredSubgroupSizeStages() { return (int) VH_requiredSubgroupSizeStages.get(this.segment(), 0L, 0L); }
    public int maxInlineUniformBlockSize() { return (int) VH_maxInlineUniformBlockSize.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorInlineUniformBlocks() { return (int) VH_maxPerStageDescriptorInlineUniformBlocks.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return (int) VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetInlineUniformBlocks() { return (int) VH_maxDescriptorSetInlineUniformBlocks.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return (int) VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.get(this.segment(), 0L, 0L); }
    public int maxInlineUniformTotalSize() { return (int) VH_maxInlineUniformTotalSize.get(this.segment(), 0L, 0L); }
    public int integerDotProduct8BitUnsignedAccelerated() { return (int) VH_integerDotProduct8BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct8BitSignedAccelerated() { return (int) VH_integerDotProduct8BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct8BitMixedSignednessAccelerated() { return (int) VH_integerDotProduct8BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct4x8BitPackedUnsignedAccelerated() { return (int) VH_integerDotProduct4x8BitPackedUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct4x8BitPackedSignedAccelerated() { return (int) VH_integerDotProduct4x8BitPackedSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return (int) VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct16BitUnsignedAccelerated() { return (int) VH_integerDotProduct16BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct16BitSignedAccelerated() { return (int) VH_integerDotProduct16BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct16BitMixedSignednessAccelerated() { return (int) VH_integerDotProduct16BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct32BitUnsignedAccelerated() { return (int) VH_integerDotProduct32BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct32BitSignedAccelerated() { return (int) VH_integerDotProduct32BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct32BitMixedSignednessAccelerated() { return (int) VH_integerDotProduct32BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct64BitUnsignedAccelerated() { return (int) VH_integerDotProduct64BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct64BitSignedAccelerated() { return (int) VH_integerDotProduct64BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProduct64BitMixedSignednessAccelerated() { return (int) VH_integerDotProduct64BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.get(this.segment(), 0L, 0L); }
    public int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return (int) VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.get(this.segment(), 0L, 0L); }
    public long storageTexelBufferOffsetAlignmentBytes() { return (long) VH_storageTexelBufferOffsetAlignmentBytes.get(this.segment(), 0L, 0L); }
    public int storageTexelBufferOffsetSingleTexelAlignment() { return (int) VH_storageTexelBufferOffsetSingleTexelAlignment.get(this.segment(), 0L, 0L); }
    public long uniformTexelBufferOffsetAlignmentBytes() { return (long) VH_uniformTexelBufferOffsetAlignmentBytes.get(this.segment(), 0L, 0L); }
    public int uniformTexelBufferOffsetSingleTexelAlignment() { return (int) VH_uniformTexelBufferOffsetSingleTexelAlignment.get(this.segment(), 0L, 0L); }
    public long maxBufferSize() { return (long) VH_maxBufferSize.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVulkan13Properties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties minSubgroupSizeAt(long index, int value) { VH_minSubgroupSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxSubgroupSizeAt(long index, int value) { VH_maxSubgroupSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxComputeWorkgroupSubgroupsAt(long index, int value) { VH_maxComputeWorkgroupSubgroups.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties requiredSubgroupSizeStagesAt(long index, int value) { VH_requiredSubgroupSizeStages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxInlineUniformBlockSizeAt(long index, int value) { VH_maxInlineUniformBlockSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxPerStageDescriptorInlineUniformBlocksAt(long index, int value) { VH_maxPerStageDescriptorInlineUniformBlocks.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxDescriptorSetInlineUniformBlocksAt(long index, int value) { VH_maxDescriptorSetInlineUniformBlocks.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxInlineUniformTotalSizeAt(long index, int value) { VH_maxInlineUniformTotalSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProduct8BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitSignedAcceleratedAt(long index, int value) { VH_integerDotProduct8BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProduct8BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index, int value) { VH_integerDotProduct4x8BitPackedUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedSignedAcceleratedAt(long index, int value) { VH_integerDotProduct4x8BitPackedSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProduct16BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitSignedAcceleratedAt(long index, int value) { VH_integerDotProduct16BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProduct16BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProduct32BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitSignedAcceleratedAt(long index, int value) { VH_integerDotProduct32BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProduct32BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProduct64BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitSignedAcceleratedAt(long index, int value) { VH_integerDotProduct64BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProduct64BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index, int value) { VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties storageTexelBufferOffsetAlignmentBytesAt(long index, long value) { VH_storageTexelBufferOffsetAlignmentBytes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties storageTexelBufferOffsetSingleTexelAlignmentAt(long index, int value) { VH_storageTexelBufferOffsetSingleTexelAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties uniformTexelBufferOffsetAlignmentBytesAt(long index, long value) { VH_uniformTexelBufferOffsetAlignmentBytes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties uniformTexelBufferOffsetSingleTexelAlignmentAt(long index, int value) { VH_uniformTexelBufferOffsetSingleTexelAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxBufferSizeAt(long index, long value) { VH_maxBufferSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan13Properties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties minSubgroupSize(int value) { VH_minSubgroupSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxSubgroupSize(int value) { VH_maxSubgroupSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxComputeWorkgroupSubgroups(int value) { VH_maxComputeWorkgroupSubgroups.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties requiredSubgroupSizeStages(int value) { VH_requiredSubgroupSizeStages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxInlineUniformBlockSize(int value) { VH_maxInlineUniformBlockSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxPerStageDescriptorInlineUniformBlocks(int value) { VH_maxPerStageDescriptorInlineUniformBlocks.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(int value) { VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxDescriptorSetInlineUniformBlocks(int value) { VH_maxDescriptorSetInlineUniformBlocks.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxDescriptorSetUpdateAfterBindInlineUniformBlocks(int value) { VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxInlineUniformTotalSize(int value) { VH_maxInlineUniformTotalSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitUnsignedAccelerated(int value) { VH_integerDotProduct8BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitSignedAccelerated(int value) { VH_integerDotProduct8BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitMixedSignednessAccelerated(int value) { VH_integerDotProduct8BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedUnsignedAccelerated(int value) { VH_integerDotProduct4x8BitPackedUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedSignedAccelerated(int value) { VH_integerDotProduct4x8BitPackedSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedMixedSignednessAccelerated(int value) { VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitUnsignedAccelerated(int value) { VH_integerDotProduct16BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitSignedAccelerated(int value) { VH_integerDotProduct16BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitMixedSignednessAccelerated(int value) { VH_integerDotProduct16BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitUnsignedAccelerated(int value) { VH_integerDotProduct32BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitSignedAccelerated(int value) { VH_integerDotProduct32BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitMixedSignednessAccelerated(int value) { VH_integerDotProduct32BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitUnsignedAccelerated(int value) { VH_integerDotProduct64BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitSignedAccelerated(int value) { VH_integerDotProduct64BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitMixedSignednessAccelerated(int value) { VH_integerDotProduct64BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitSignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(int value) { VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitSignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(int value) { VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitSignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(int value) { VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitSignedAccelerated(int value) { VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(int value) { VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties storageTexelBufferOffsetAlignmentBytes(long value) { VH_storageTexelBufferOffsetAlignmentBytes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties storageTexelBufferOffsetSingleTexelAlignment(int value) { VH_storageTexelBufferOffsetSingleTexelAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties uniformTexelBufferOffsetAlignmentBytes(long value) { VH_uniformTexelBufferOffsetAlignmentBytes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties uniformTexelBufferOffsetSingleTexelAlignment(int value) { VH_uniformTexelBufferOffsetSingleTexelAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan13Properties maxBufferSize(long value) { VH_maxBufferSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _minSubgroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minSubgroupSize, index), LAYOUT_minSubgroupSize); }
    public MemorySegment _minSubgroupSize() { return _minSubgroupSizeAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _minSubgroupSizeAt(long index, MemorySegment src) { _minSubgroupSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _minSubgroupSize(MemorySegment src) { return _minSubgroupSizeAt(0L, src); }
    public MemorySegment _maxSubgroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSubgroupSize, index), LAYOUT_maxSubgroupSize); }
    public MemorySegment _maxSubgroupSize() { return _maxSubgroupSizeAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _maxSubgroupSizeAt(long index, MemorySegment src) { _maxSubgroupSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _maxSubgroupSize(MemorySegment src) { return _maxSubgroupSizeAt(0L, src); }
    public MemorySegment _maxComputeWorkgroupSubgroupsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxComputeWorkgroupSubgroups, index), LAYOUT_maxComputeWorkgroupSubgroups); }
    public MemorySegment _maxComputeWorkgroupSubgroups() { return _maxComputeWorkgroupSubgroupsAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _maxComputeWorkgroupSubgroupsAt(long index, MemorySegment src) { _maxComputeWorkgroupSubgroupsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _maxComputeWorkgroupSubgroups(MemorySegment src) { return _maxComputeWorkgroupSubgroupsAt(0L, src); }
    public MemorySegment _requiredSubgroupSizeStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_requiredSubgroupSizeStages, index), LAYOUT_requiredSubgroupSizeStages); }
    public MemorySegment _requiredSubgroupSizeStages() { return _requiredSubgroupSizeStagesAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _requiredSubgroupSizeStagesAt(long index, MemorySegment src) { _requiredSubgroupSizeStagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _requiredSubgroupSizeStages(MemorySegment src) { return _requiredSubgroupSizeStagesAt(0L, src); }
    public MemorySegment _maxInlineUniformBlockSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxInlineUniformBlockSize, index), LAYOUT_maxInlineUniformBlockSize); }
    public MemorySegment _maxInlineUniformBlockSize() { return _maxInlineUniformBlockSizeAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _maxInlineUniformBlockSizeAt(long index, MemorySegment src) { _maxInlineUniformBlockSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _maxInlineUniformBlockSize(MemorySegment src) { return _maxInlineUniformBlockSizeAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorInlineUniformBlocksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorInlineUniformBlocks, index), LAYOUT_maxPerStageDescriptorInlineUniformBlocks); }
    public MemorySegment _maxPerStageDescriptorInlineUniformBlocks() { return _maxPerStageDescriptorInlineUniformBlocksAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _maxPerStageDescriptorInlineUniformBlocksAt(long index, MemorySegment src) { _maxPerStageDescriptorInlineUniformBlocksAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _maxPerStageDescriptorInlineUniformBlocks(MemorySegment src) { return _maxPerStageDescriptorInlineUniformBlocksAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return _maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(0L, src); }
    public MemorySegment _maxDescriptorSetInlineUniformBlocksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetInlineUniformBlocks, index), LAYOUT_maxDescriptorSetInlineUniformBlocks); }
    public MemorySegment _maxDescriptorSetInlineUniformBlocks() { return _maxDescriptorSetInlineUniformBlocksAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _maxDescriptorSetInlineUniformBlocksAt(long index, MemorySegment src) { _maxDescriptorSetInlineUniformBlocksAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _maxDescriptorSetInlineUniformBlocks(MemorySegment src) { return _maxDescriptorSetInlineUniformBlocksAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindInlineUniformBlocks, index), LAYOUT_maxDescriptorSetUpdateAfterBindInlineUniformBlocks); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return _maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _maxDescriptorSetUpdateAfterBindInlineUniformBlocks(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(0L, src); }
    public MemorySegment _maxInlineUniformTotalSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxInlineUniformTotalSize, index), LAYOUT_maxInlineUniformTotalSize); }
    public MemorySegment _maxInlineUniformTotalSize() { return _maxInlineUniformTotalSizeAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _maxInlineUniformTotalSizeAt(long index, MemorySegment src) { _maxInlineUniformTotalSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _maxInlineUniformTotalSize(MemorySegment src) { return _maxInlineUniformTotalSizeAt(0L, src); }
    public MemorySegment _integerDotProduct8BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct8BitUnsignedAccelerated, index), LAYOUT_integerDotProduct8BitUnsignedAccelerated); }
    public MemorySegment _integerDotProduct8BitUnsignedAccelerated() { return _integerDotProduct8BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct8BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct8BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct8BitUnsignedAccelerated(MemorySegment src) { return _integerDotProduct8BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct8BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct8BitSignedAccelerated, index), LAYOUT_integerDotProduct8BitSignedAccelerated); }
    public MemorySegment _integerDotProduct8BitSignedAccelerated() { return _integerDotProduct8BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct8BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct8BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct8BitSignedAccelerated(MemorySegment src) { return _integerDotProduct8BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct8BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct8BitMixedSignednessAccelerated, index), LAYOUT_integerDotProduct8BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProduct8BitMixedSignednessAccelerated() { return _integerDotProduct8BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct8BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProduct8BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct8BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProduct8BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct4x8BitPackedUnsignedAccelerated, index), LAYOUT_integerDotProduct4x8BitPackedUnsignedAccelerated); }
    public MemorySegment _integerDotProduct4x8BitPackedUnsignedAccelerated() { return _integerDotProduct4x8BitPackedUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct4x8BitPackedUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct4x8BitPackedUnsignedAccelerated(MemorySegment src) { return _integerDotProduct4x8BitPackedUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct4x8BitPackedSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct4x8BitPackedSignedAccelerated, index), LAYOUT_integerDotProduct4x8BitPackedSignedAccelerated); }
    public MemorySegment _integerDotProduct4x8BitPackedSignedAccelerated() { return _integerDotProduct4x8BitPackedSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct4x8BitPackedSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct4x8BitPackedSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct4x8BitPackedSignedAccelerated(MemorySegment src) { return _integerDotProduct4x8BitPackedSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct4x8BitPackedMixedSignednessAccelerated, index), LAYOUT_integerDotProduct4x8BitPackedMixedSignednessAccelerated); }
    public MemorySegment _integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return _integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct4x8BitPackedMixedSignednessAccelerated(MemorySegment src) { return _integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct16BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct16BitUnsignedAccelerated, index), LAYOUT_integerDotProduct16BitUnsignedAccelerated); }
    public MemorySegment _integerDotProduct16BitUnsignedAccelerated() { return _integerDotProduct16BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct16BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct16BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct16BitUnsignedAccelerated(MemorySegment src) { return _integerDotProduct16BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct16BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct16BitSignedAccelerated, index), LAYOUT_integerDotProduct16BitSignedAccelerated); }
    public MemorySegment _integerDotProduct16BitSignedAccelerated() { return _integerDotProduct16BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct16BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct16BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct16BitSignedAccelerated(MemorySegment src) { return _integerDotProduct16BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct16BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct16BitMixedSignednessAccelerated, index), LAYOUT_integerDotProduct16BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProduct16BitMixedSignednessAccelerated() { return _integerDotProduct16BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct16BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProduct16BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct16BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProduct16BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct32BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct32BitUnsignedAccelerated, index), LAYOUT_integerDotProduct32BitUnsignedAccelerated); }
    public MemorySegment _integerDotProduct32BitUnsignedAccelerated() { return _integerDotProduct32BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct32BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct32BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct32BitUnsignedAccelerated(MemorySegment src) { return _integerDotProduct32BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct32BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct32BitSignedAccelerated, index), LAYOUT_integerDotProduct32BitSignedAccelerated); }
    public MemorySegment _integerDotProduct32BitSignedAccelerated() { return _integerDotProduct32BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct32BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct32BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct32BitSignedAccelerated(MemorySegment src) { return _integerDotProduct32BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct32BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct32BitMixedSignednessAccelerated, index), LAYOUT_integerDotProduct32BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProduct32BitMixedSignednessAccelerated() { return _integerDotProduct32BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct32BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProduct32BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct32BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProduct32BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct64BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct64BitUnsignedAccelerated, index), LAYOUT_integerDotProduct64BitUnsignedAccelerated); }
    public MemorySegment _integerDotProduct64BitUnsignedAccelerated() { return _integerDotProduct64BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct64BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct64BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct64BitUnsignedAccelerated(MemorySegment src) { return _integerDotProduct64BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct64BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct64BitSignedAccelerated, index), LAYOUT_integerDotProduct64BitSignedAccelerated); }
    public MemorySegment _integerDotProduct64BitSignedAccelerated() { return _integerDotProduct64BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct64BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProduct64BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct64BitSignedAccelerated(MemorySegment src) { return _integerDotProduct64BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProduct64BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProduct64BitMixedSignednessAccelerated, index), LAYOUT_integerDotProduct64BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProduct64BitMixedSignednessAccelerated() { return _integerDotProduct64BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct64BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProduct64BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProduct64BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProduct64BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return _integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating8BitSignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating8BitSignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return _integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating8BitSignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return _integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return _integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return _integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return _integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return _integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating16BitSignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating16BitSignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return _integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating16BitSignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return _integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return _integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating32BitSignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating32BitSignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return _integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating32BitSignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return _integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return _integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating64BitSignedAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating64BitSignedAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return _integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating64BitSignedAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(0L, src); }
    public MemorySegment _integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, index), LAYOUT_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated); }
    public MemorySegment _integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return _integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index, MemorySegment src) { _integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(MemorySegment src) { return _integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(0L, src); }
    public MemorySegment _storageTexelBufferOffsetAlignmentBytesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageTexelBufferOffsetAlignmentBytes, index), LAYOUT_storageTexelBufferOffsetAlignmentBytes); }
    public MemorySegment _storageTexelBufferOffsetAlignmentBytes() { return _storageTexelBufferOffsetAlignmentBytesAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _storageTexelBufferOffsetAlignmentBytesAt(long index, MemorySegment src) { _storageTexelBufferOffsetAlignmentBytesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _storageTexelBufferOffsetAlignmentBytes(MemorySegment src) { return _storageTexelBufferOffsetAlignmentBytesAt(0L, src); }
    public MemorySegment _storageTexelBufferOffsetSingleTexelAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageTexelBufferOffsetSingleTexelAlignment, index), LAYOUT_storageTexelBufferOffsetSingleTexelAlignment); }
    public MemorySegment _storageTexelBufferOffsetSingleTexelAlignment() { return _storageTexelBufferOffsetSingleTexelAlignmentAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _storageTexelBufferOffsetSingleTexelAlignmentAt(long index, MemorySegment src) { _storageTexelBufferOffsetSingleTexelAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _storageTexelBufferOffsetSingleTexelAlignment(MemorySegment src) { return _storageTexelBufferOffsetSingleTexelAlignmentAt(0L, src); }
    public MemorySegment _uniformTexelBufferOffsetAlignmentBytesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uniformTexelBufferOffsetAlignmentBytes, index), LAYOUT_uniformTexelBufferOffsetAlignmentBytes); }
    public MemorySegment _uniformTexelBufferOffsetAlignmentBytes() { return _uniformTexelBufferOffsetAlignmentBytesAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _uniformTexelBufferOffsetAlignmentBytesAt(long index, MemorySegment src) { _uniformTexelBufferOffsetAlignmentBytesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _uniformTexelBufferOffsetAlignmentBytes(MemorySegment src) { return _uniformTexelBufferOffsetAlignmentBytesAt(0L, src); }
    public MemorySegment _uniformTexelBufferOffsetSingleTexelAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uniformTexelBufferOffsetSingleTexelAlignment, index), LAYOUT_uniformTexelBufferOffsetSingleTexelAlignment); }
    public MemorySegment _uniformTexelBufferOffsetSingleTexelAlignment() { return _uniformTexelBufferOffsetSingleTexelAlignmentAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _uniformTexelBufferOffsetSingleTexelAlignmentAt(long index, MemorySegment src) { _uniformTexelBufferOffsetSingleTexelAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment src) { return _uniformTexelBufferOffsetSingleTexelAlignmentAt(0L, src); }
    public MemorySegment _maxBufferSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxBufferSize, index), LAYOUT_maxBufferSize); }
    public MemorySegment _maxBufferSize() { return _maxBufferSizeAt(0L); }
    public VkPhysicalDeviceVulkan13Properties _maxBufferSizeAt(long index, MemorySegment src) { _maxBufferSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan13Properties _maxBufferSize(MemorySegment src) { return _maxBufferSizeAt(0L, src); }
}

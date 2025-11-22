// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDescriptorIndexingPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDescriptorIndexingPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
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
/// }
/// ```
public final class VkPhysicalDeviceDescriptorIndexingPropertiesEXT extends GroupType {
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
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.byteOffset(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    public static final long OFFSET_shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    public static final long OFFSET_shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
    public static final long OFFSET_shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
    public static final long OFFSET_shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
    public static final long OFFSET_shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
    public static final long OFFSET_robustBufferAccessUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
    public static final long OFFSET_quadDivergentImplicitLod = LAYOUT.byteOffset(PathElement.groupElement("quadDivergentImplicitLod"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
    public static final long OFFSET_maxPerStageUpdateAfterBindResources = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.select(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    public static final MemoryLayout LAYOUT_shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    public static final MemoryLayout LAYOUT_shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
    public static final MemoryLayout LAYOUT_shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
    public static final MemoryLayout LAYOUT_shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
    public static final MemoryLayout LAYOUT_shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
    public static final MemoryLayout LAYOUT_robustBufferAccessUpdateAfterBind = LAYOUT.select(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_quadDivergentImplicitLod = LAYOUT.select(PathElement.groupElement("quadDivergentImplicitLod"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
    public static final MemoryLayout LAYOUT_maxPerStageUpdateAfterBindResources = LAYOUT.select(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxUpdateAfterBindDescriptorsInAllPools = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
    public static final VarHandle VH_shaderUniformBufferArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
    public static final VarHandle VH_shaderSampledImageArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
    public static final VarHandle VH_shaderStorageBufferArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
    public static final VarHandle VH_shaderStorageImageArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
    public static final VarHandle VH_shaderInputAttachmentArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
    public static final VarHandle VH_robustBufferAccessUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
    public static final VarHandle VH_quadDivergentImplicitLod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quadDivergentImplicitLod"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
    public static final VarHandle VH_maxPerStageUpdateAfterBindResources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));

    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorIndexingPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorIndexingPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorIndexingPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorIndexingPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDescriptorIndexingPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES); }
    public static VkPhysicalDeviceDescriptorIndexingPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT copyFrom(VkPhysicalDeviceDescriptorIndexingPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceDescriptorIndexingPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceDescriptorIndexingPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDescriptorIndexingPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT at(long index, Consumer<VkPhysicalDeviceDescriptorIndexingPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxUpdateAfterBindDescriptorsInAllPoolsAt(long index) { return (int) VH_maxUpdateAfterBindDescriptorsInAllPools.get(this.segment(), 0L, index); }
    public int shaderUniformBufferArrayNonUniformIndexingNativeAt(long index) { return (int) VH_shaderUniformBufferArrayNonUniformIndexingNative.get(this.segment(), 0L, index); }
    public int shaderSampledImageArrayNonUniformIndexingNativeAt(long index) { return (int) VH_shaderSampledImageArrayNonUniformIndexingNative.get(this.segment(), 0L, index); }
    public int shaderStorageBufferArrayNonUniformIndexingNativeAt(long index) { return (int) VH_shaderStorageBufferArrayNonUniformIndexingNative.get(this.segment(), 0L, index); }
    public int shaderStorageImageArrayNonUniformIndexingNativeAt(long index) { return (int) VH_shaderStorageImageArrayNonUniformIndexingNative.get(this.segment(), 0L, index); }
    public int shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index) { return (int) VH_shaderInputAttachmentArrayNonUniformIndexingNative.get(this.segment(), 0L, index); }
    public int robustBufferAccessUpdateAfterBindAt(long index) { return (int) VH_robustBufferAccessUpdateAfterBind.get(this.segment(), 0L, index); }
    public int quadDivergentImplicitLodAt(long index) { return (int) VH_quadDivergentImplicitLod.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindSamplersAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindSamplers.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindSampledImages.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageImages.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.get(this.segment(), 0L, index); }
    public int maxPerStageUpdateAfterBindResourcesAt(long index) { return (int) VH_maxPerStageUpdateAfterBindResources.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindSamplersAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindSamplers.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffers.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffers.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindSampledImagesAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindSampledImages.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindStorageImagesAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageImages.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index) { return (int) VH_maxDescriptorSetUpdateAfterBindInputAttachments.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxUpdateAfterBindDescriptorsInAllPools() { return (int) VH_maxUpdateAfterBindDescriptorsInAllPools.get(this.segment(), 0L, 0L); }
    public int shaderUniformBufferArrayNonUniformIndexingNative() { return (int) VH_shaderUniformBufferArrayNonUniformIndexingNative.get(this.segment(), 0L, 0L); }
    public int shaderSampledImageArrayNonUniformIndexingNative() { return (int) VH_shaderSampledImageArrayNonUniformIndexingNative.get(this.segment(), 0L, 0L); }
    public int shaderStorageBufferArrayNonUniformIndexingNative() { return (int) VH_shaderStorageBufferArrayNonUniformIndexingNative.get(this.segment(), 0L, 0L); }
    public int shaderStorageImageArrayNonUniformIndexingNative() { return (int) VH_shaderStorageImageArrayNonUniformIndexingNative.get(this.segment(), 0L, 0L); }
    public int shaderInputAttachmentArrayNonUniformIndexingNative() { return (int) VH_shaderInputAttachmentArrayNonUniformIndexingNative.get(this.segment(), 0L, 0L); }
    public int robustBufferAccessUpdateAfterBind() { return (int) VH_robustBufferAccessUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public int quadDivergentImplicitLod() { return (int) VH_quadDivergentImplicitLod.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindSamplers() { return (int) VH_maxPerStageDescriptorUpdateAfterBindSamplers.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() { return (int) VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindSampledImages() { return (int) VH_maxPerStageDescriptorUpdateAfterBindSampledImages.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindStorageImages() { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageImages.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUpdateAfterBindInputAttachments() { return (int) VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.get(this.segment(), 0L, 0L); }
    public int maxPerStageUpdateAfterBindResources() { return (int) VH_maxPerStageUpdateAfterBindResources.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindSamplers() { return (int) VH_maxDescriptorSetUpdateAfterBindSamplers.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindUniformBuffers() { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffers.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() { return (int) VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindStorageBuffers() { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffers.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() { return (int) VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindSampledImages() { return (int) VH_maxDescriptorSetUpdateAfterBindSampledImages.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindStorageImages() { return (int) VH_maxDescriptorSetUpdateAfterBindStorageImages.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUpdateAfterBindInputAttachments() { return (int) VH_maxDescriptorSetUpdateAfterBindInputAttachments.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxUpdateAfterBindDescriptorsInAllPoolsAt(long index, int value) { VH_maxUpdateAfterBindDescriptorsInAllPools.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT shaderUniformBufferArrayNonUniformIndexingNativeAt(long index, int value) { VH_shaderUniformBufferArrayNonUniformIndexingNative.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT shaderSampledImageArrayNonUniformIndexingNativeAt(long index, int value) { VH_shaderSampledImageArrayNonUniformIndexingNative.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT shaderStorageBufferArrayNonUniformIndexingNativeAt(long index, int value) { VH_shaderStorageBufferArrayNonUniformIndexingNative.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT shaderStorageImageArrayNonUniformIndexingNativeAt(long index, int value) { VH_shaderStorageImageArrayNonUniformIndexingNative.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index, int value) { VH_shaderInputAttachmentArrayNonUniformIndexingNative.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT robustBufferAccessUpdateAfterBindAt(long index, int value) { VH_robustBufferAccessUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT quadDivergentImplicitLodAt(long index, int value) { VH_quadDivergentImplicitLod.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxPerStageDescriptorUpdateAfterBindSamplersAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindSampledImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxPerStageUpdateAfterBindResourcesAt(long index, int value) { VH_maxPerStageUpdateAfterBindResources.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindSamplersAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindSampledImagesAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindSampledImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindStorageImagesAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindStorageImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index, int value) { VH_maxDescriptorSetUpdateAfterBindInputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxUpdateAfterBindDescriptorsInAllPools(int value) { VH_maxUpdateAfterBindDescriptorsInAllPools.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT shaderUniformBufferArrayNonUniformIndexingNative(int value) { VH_shaderUniformBufferArrayNonUniformIndexingNative.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT shaderSampledImageArrayNonUniformIndexingNative(int value) { VH_shaderSampledImageArrayNonUniformIndexingNative.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT shaderStorageBufferArrayNonUniformIndexingNative(int value) { VH_shaderStorageBufferArrayNonUniformIndexingNative.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT shaderStorageImageArrayNonUniformIndexingNative(int value) { VH_shaderStorageImageArrayNonUniformIndexingNative.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT shaderInputAttachmentArrayNonUniformIndexingNative(int value) { VH_shaderInputAttachmentArrayNonUniformIndexingNative.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT robustBufferAccessUpdateAfterBind(int value) { VH_robustBufferAccessUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT quadDivergentImplicitLod(int value) { VH_quadDivergentImplicitLod.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxPerStageDescriptorUpdateAfterBindSamplers(int value) { VH_maxPerStageDescriptorUpdateAfterBindSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxPerStageDescriptorUpdateAfterBindUniformBuffers(int value) { VH_maxPerStageDescriptorUpdateAfterBindUniformBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxPerStageDescriptorUpdateAfterBindStorageBuffers(int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxPerStageDescriptorUpdateAfterBindSampledImages(int value) { VH_maxPerStageDescriptorUpdateAfterBindSampledImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxPerStageDescriptorUpdateAfterBindStorageImages(int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxPerStageDescriptorUpdateAfterBindInputAttachments(int value) { VH_maxPerStageDescriptorUpdateAfterBindInputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxPerStageUpdateAfterBindResources(int value) { VH_maxPerStageUpdateAfterBindResources.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindSamplers(int value) { VH_maxDescriptorSetUpdateAfterBindSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindUniformBuffers(int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(int value) { VH_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindStorageBuffers(int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(int value) { VH_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindSampledImages(int value) { VH_maxDescriptorSetUpdateAfterBindSampledImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindStorageImages(int value) { VH_maxDescriptorSetUpdateAfterBindStorageImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT maxDescriptorSetUpdateAfterBindInputAttachments(int value) { VH_maxDescriptorSetUpdateAfterBindInputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxUpdateAfterBindDescriptorsInAllPoolsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxUpdateAfterBindDescriptorsInAllPools, index), LAYOUT_maxUpdateAfterBindDescriptorsInAllPools); }
    public MemorySegment _maxUpdateAfterBindDescriptorsInAllPools() { return _maxUpdateAfterBindDescriptorsInAllPoolsAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxUpdateAfterBindDescriptorsInAllPoolsAt(long index, MemorySegment src) { _maxUpdateAfterBindDescriptorsInAllPoolsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxUpdateAfterBindDescriptorsInAllPools(MemorySegment src) { return _maxUpdateAfterBindDescriptorsInAllPoolsAt(0L, src); }
    public MemorySegment _shaderUniformBufferArrayNonUniformIndexingNativeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderUniformBufferArrayNonUniformIndexingNative, index), LAYOUT_shaderUniformBufferArrayNonUniformIndexingNative); }
    public MemorySegment _shaderUniformBufferArrayNonUniformIndexingNative() { return _shaderUniformBufferArrayNonUniformIndexingNativeAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _shaderUniformBufferArrayNonUniformIndexingNativeAt(long index, MemorySegment src) { _shaderUniformBufferArrayNonUniformIndexingNativeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _shaderUniformBufferArrayNonUniformIndexingNative(MemorySegment src) { return _shaderUniformBufferArrayNonUniformIndexingNativeAt(0L, src); }
    public MemorySegment _shaderSampledImageArrayNonUniformIndexingNativeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSampledImageArrayNonUniformIndexingNative, index), LAYOUT_shaderSampledImageArrayNonUniformIndexingNative); }
    public MemorySegment _shaderSampledImageArrayNonUniformIndexingNative() { return _shaderSampledImageArrayNonUniformIndexingNativeAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _shaderSampledImageArrayNonUniformIndexingNativeAt(long index, MemorySegment src) { _shaderSampledImageArrayNonUniformIndexingNativeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _shaderSampledImageArrayNonUniformIndexingNative(MemorySegment src) { return _shaderSampledImageArrayNonUniformIndexingNativeAt(0L, src); }
    public MemorySegment _shaderStorageBufferArrayNonUniformIndexingNativeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageBufferArrayNonUniformIndexingNative, index), LAYOUT_shaderStorageBufferArrayNonUniformIndexingNative); }
    public MemorySegment _shaderStorageBufferArrayNonUniformIndexingNative() { return _shaderStorageBufferArrayNonUniformIndexingNativeAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _shaderStorageBufferArrayNonUniformIndexingNativeAt(long index, MemorySegment src) { _shaderStorageBufferArrayNonUniformIndexingNativeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _shaderStorageBufferArrayNonUniformIndexingNative(MemorySegment src) { return _shaderStorageBufferArrayNonUniformIndexingNativeAt(0L, src); }
    public MemorySegment _shaderStorageImageArrayNonUniformIndexingNativeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStorageImageArrayNonUniformIndexingNative, index), LAYOUT_shaderStorageImageArrayNonUniformIndexingNative); }
    public MemorySegment _shaderStorageImageArrayNonUniformIndexingNative() { return _shaderStorageImageArrayNonUniformIndexingNativeAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _shaderStorageImageArrayNonUniformIndexingNativeAt(long index, MemorySegment src) { _shaderStorageImageArrayNonUniformIndexingNativeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _shaderStorageImageArrayNonUniformIndexingNative(MemorySegment src) { return _shaderStorageImageArrayNonUniformIndexingNativeAt(0L, src); }
    public MemorySegment _shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderInputAttachmentArrayNonUniformIndexingNative, index), LAYOUT_shaderInputAttachmentArrayNonUniformIndexingNative); }
    public MemorySegment _shaderInputAttachmentArrayNonUniformIndexingNative() { return _shaderInputAttachmentArrayNonUniformIndexingNativeAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _shaderInputAttachmentArrayNonUniformIndexingNativeAt(long index, MemorySegment src) { _shaderInputAttachmentArrayNonUniformIndexingNativeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _shaderInputAttachmentArrayNonUniformIndexingNative(MemorySegment src) { return _shaderInputAttachmentArrayNonUniformIndexingNativeAt(0L, src); }
    public MemorySegment _robustBufferAccessUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustBufferAccessUpdateAfterBind, index), LAYOUT_robustBufferAccessUpdateAfterBind); }
    public MemorySegment _robustBufferAccessUpdateAfterBind() { return _robustBufferAccessUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _robustBufferAccessUpdateAfterBindAt(long index, MemorySegment src) { _robustBufferAccessUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _robustBufferAccessUpdateAfterBind(MemorySegment src) { return _robustBufferAccessUpdateAfterBindAt(0L, src); }
    public MemorySegment _quadDivergentImplicitLodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_quadDivergentImplicitLod, index), LAYOUT_quadDivergentImplicitLod); }
    public MemorySegment _quadDivergentImplicitLod() { return _quadDivergentImplicitLodAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _quadDivergentImplicitLodAt(long index, MemorySegment src) { _quadDivergentImplicitLodAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _quadDivergentImplicitLod(MemorySegment src) { return _quadDivergentImplicitLodAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindSamplersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindSamplers, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindSamplers); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindSamplers() { return _maxPerStageDescriptorUpdateAfterBindSamplersAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxPerStageDescriptorUpdateAfterBindSamplersAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindSamplersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxPerStageDescriptorUpdateAfterBindSamplers(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindSamplersAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindUniformBuffers, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindUniformBuffers); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindUniformBuffers() { return _maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxPerStageDescriptorUpdateAfterBindUniformBuffers(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindUniformBuffersAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindStorageBuffers, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageBuffers); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindStorageBuffers() { return _maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxPerStageDescriptorUpdateAfterBindStorageBuffers(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindStorageBuffersAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindSampledImages, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindSampledImages); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindSampledImages() { return _maxPerStageDescriptorUpdateAfterBindSampledImagesAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxPerStageDescriptorUpdateAfterBindSampledImagesAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindSampledImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxPerStageDescriptorUpdateAfterBindSampledImages(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindSampledImagesAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindStorageImages, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageImages); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindStorageImages() { return _maxPerStageDescriptorUpdateAfterBindStorageImagesAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxPerStageDescriptorUpdateAfterBindStorageImagesAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindStorageImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxPerStageDescriptorUpdateAfterBindStorageImages(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindStorageImagesAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUpdateAfterBindInputAttachments, index), LAYOUT_maxPerStageDescriptorUpdateAfterBindInputAttachments); }
    public MemorySegment _maxPerStageDescriptorUpdateAfterBindInputAttachments() { return _maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(long index, MemorySegment src) { _maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxPerStageDescriptorUpdateAfterBindInputAttachments(MemorySegment src) { return _maxPerStageDescriptorUpdateAfterBindInputAttachmentsAt(0L, src); }
    public MemorySegment _maxPerStageUpdateAfterBindResourcesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageUpdateAfterBindResources, index), LAYOUT_maxPerStageUpdateAfterBindResources); }
    public MemorySegment _maxPerStageUpdateAfterBindResources() { return _maxPerStageUpdateAfterBindResourcesAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxPerStageUpdateAfterBindResourcesAt(long index, MemorySegment src) { _maxPerStageUpdateAfterBindResourcesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxPerStageUpdateAfterBindResources(MemorySegment src) { return _maxPerStageUpdateAfterBindResourcesAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindSamplersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindSamplers, index), LAYOUT_maxDescriptorSetUpdateAfterBindSamplers); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindSamplers() { return _maxDescriptorSetUpdateAfterBindSamplersAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindSamplersAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindSamplersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindSamplers(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindSamplersAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindUniformBuffers, index), LAYOUT_maxDescriptorSetUpdateAfterBindUniformBuffers); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindUniformBuffers() { return _maxDescriptorSetUpdateAfterBindUniformBuffersAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindUniformBuffersAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindUniformBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindUniformBuffers(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindUniformBuffersAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, index), LAYOUT_maxDescriptorSetUpdateAfterBindUniformBuffersDynamic); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() { return _maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindUniformBuffersDynamicAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindStorageBuffers, index), LAYOUT_maxDescriptorSetUpdateAfterBindStorageBuffers); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindStorageBuffers() { return _maxDescriptorSetUpdateAfterBindStorageBuffersAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindStorageBuffersAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindStorageBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindStorageBuffers(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindStorageBuffersAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, index), LAYOUT_maxDescriptorSetUpdateAfterBindStorageBuffersDynamic); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() { return _maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindStorageBuffersDynamicAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindSampledImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindSampledImages, index), LAYOUT_maxDescriptorSetUpdateAfterBindSampledImages); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindSampledImages() { return _maxDescriptorSetUpdateAfterBindSampledImagesAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindSampledImagesAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindSampledImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindSampledImages(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindSampledImagesAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindStorageImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindStorageImages, index), LAYOUT_maxDescriptorSetUpdateAfterBindStorageImages); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindStorageImages() { return _maxDescriptorSetUpdateAfterBindStorageImagesAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindStorageImagesAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindStorageImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindStorageImages(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindStorageImagesAt(0L, src); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUpdateAfterBindInputAttachments, index), LAYOUT_maxDescriptorSetUpdateAfterBindInputAttachments); }
    public MemorySegment _maxDescriptorSetUpdateAfterBindInputAttachments() { return _maxDescriptorSetUpdateAfterBindInputAttachmentsAt(0L); }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindInputAttachmentsAt(long index, MemorySegment src) { _maxDescriptorSetUpdateAfterBindInputAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT _maxDescriptorSetUpdateAfterBindInputAttachments(MemorySegment src) { return _maxDescriptorSetUpdateAfterBindInputAttachmentsAt(0L, src); }
}

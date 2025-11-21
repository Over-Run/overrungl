// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDescriptorBufferPropertiesEXT`.
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
/// }
/// ```
public final class VkPhysicalDeviceDescriptorBufferPropertiesEXT extends GroupType {
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
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_combinedImageSamplerDescriptorSingleArray = LAYOUT.byteOffset(PathElement.groupElement("combinedImageSamplerDescriptorSingleArray"));
    public static final long OFFSET_bufferlessPushDescriptors = LAYOUT.byteOffset(PathElement.groupElement("bufferlessPushDescriptors"));
    public static final long OFFSET_allowSamplerImageViewPostSubmitCreation = LAYOUT.byteOffset(PathElement.groupElement("allowSamplerImageViewPostSubmitCreation"));
    public static final long OFFSET_descriptorBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferOffsetAlignment"));
    public static final long OFFSET_maxDescriptorBufferBindings = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorBufferBindings"));
    public static final long OFFSET_maxResourceDescriptorBufferBindings = LAYOUT.byteOffset(PathElement.groupElement("maxResourceDescriptorBufferBindings"));
    public static final long OFFSET_maxSamplerDescriptorBufferBindings = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerDescriptorBufferBindings"));
    public static final long OFFSET_maxEmbeddedImmutableSamplerBindings = LAYOUT.byteOffset(PathElement.groupElement("maxEmbeddedImmutableSamplerBindings"));
    public static final long OFFSET_maxEmbeddedImmutableSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxEmbeddedImmutableSamplers"));
    public static final long OFFSET_bufferCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PathElement.groupElement("bufferCaptureReplayDescriptorDataSize"));
    public static final long OFFSET_imageCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PathElement.groupElement("imageCaptureReplayDescriptorDataSize"));
    public static final long OFFSET_imageViewCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PathElement.groupElement("imageViewCaptureReplayDescriptorDataSize"));
    public static final long OFFSET_samplerCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PathElement.groupElement("samplerCaptureReplayDescriptorDataSize"));
    public static final long OFFSET_accelerationStructureCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureCaptureReplayDescriptorDataSize"));
    public static final long OFFSET_samplerDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("samplerDescriptorSize"));
    public static final long OFFSET_combinedImageSamplerDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("combinedImageSamplerDescriptorSize"));
    public static final long OFFSET_sampledImageDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("sampledImageDescriptorSize"));
    public static final long OFFSET_storageImageDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("storageImageDescriptorSize"));
    public static final long OFFSET_uniformTexelBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferDescriptorSize"));
    public static final long OFFSET_robustUniformTexelBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("robustUniformTexelBufferDescriptorSize"));
    public static final long OFFSET_storageTexelBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferDescriptorSize"));
    public static final long OFFSET_robustStorageTexelBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("robustStorageTexelBufferDescriptorSize"));
    public static final long OFFSET_uniformBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("uniformBufferDescriptorSize"));
    public static final long OFFSET_robustUniformBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("robustUniformBufferDescriptorSize"));
    public static final long OFFSET_storageBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("storageBufferDescriptorSize"));
    public static final long OFFSET_robustStorageBufferDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("robustStorageBufferDescriptorSize"));
    public static final long OFFSET_inputAttachmentDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("inputAttachmentDescriptorSize"));
    public static final long OFFSET_accelerationStructureDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureDescriptorSize"));
    public static final long OFFSET_maxSamplerDescriptorBufferRange = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerDescriptorBufferRange"));
    public static final long OFFSET_maxResourceDescriptorBufferRange = LAYOUT.byteOffset(PathElement.groupElement("maxResourceDescriptorBufferRange"));
    public static final long OFFSET_samplerDescriptorBufferAddressSpaceSize = LAYOUT.byteOffset(PathElement.groupElement("samplerDescriptorBufferAddressSpaceSize"));
    public static final long OFFSET_resourceDescriptorBufferAddressSpaceSize = LAYOUT.byteOffset(PathElement.groupElement("resourceDescriptorBufferAddressSpaceSize"));
    public static final long OFFSET_descriptorBufferAddressSpaceSize = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferAddressSpaceSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_combinedImageSamplerDescriptorSingleArray = LAYOUT.select(PathElement.groupElement("combinedImageSamplerDescriptorSingleArray"));
    public static final MemoryLayout LAYOUT_bufferlessPushDescriptors = LAYOUT.select(PathElement.groupElement("bufferlessPushDescriptors"));
    public static final MemoryLayout LAYOUT_allowSamplerImageViewPostSubmitCreation = LAYOUT.select(PathElement.groupElement("allowSamplerImageViewPostSubmitCreation"));
    public static final MemoryLayout LAYOUT_descriptorBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("descriptorBufferOffsetAlignment"));
    public static final MemoryLayout LAYOUT_maxDescriptorBufferBindings = LAYOUT.select(PathElement.groupElement("maxDescriptorBufferBindings"));
    public static final MemoryLayout LAYOUT_maxResourceDescriptorBufferBindings = LAYOUT.select(PathElement.groupElement("maxResourceDescriptorBufferBindings"));
    public static final MemoryLayout LAYOUT_maxSamplerDescriptorBufferBindings = LAYOUT.select(PathElement.groupElement("maxSamplerDescriptorBufferBindings"));
    public static final MemoryLayout LAYOUT_maxEmbeddedImmutableSamplerBindings = LAYOUT.select(PathElement.groupElement("maxEmbeddedImmutableSamplerBindings"));
    public static final MemoryLayout LAYOUT_maxEmbeddedImmutableSamplers = LAYOUT.select(PathElement.groupElement("maxEmbeddedImmutableSamplers"));
    public static final MemoryLayout LAYOUT_bufferCaptureReplayDescriptorDataSize = LAYOUT.select(PathElement.groupElement("bufferCaptureReplayDescriptorDataSize"));
    public static final MemoryLayout LAYOUT_imageCaptureReplayDescriptorDataSize = LAYOUT.select(PathElement.groupElement("imageCaptureReplayDescriptorDataSize"));
    public static final MemoryLayout LAYOUT_imageViewCaptureReplayDescriptorDataSize = LAYOUT.select(PathElement.groupElement("imageViewCaptureReplayDescriptorDataSize"));
    public static final MemoryLayout LAYOUT_samplerCaptureReplayDescriptorDataSize = LAYOUT.select(PathElement.groupElement("samplerCaptureReplayDescriptorDataSize"));
    public static final MemoryLayout LAYOUT_accelerationStructureCaptureReplayDescriptorDataSize = LAYOUT.select(PathElement.groupElement("accelerationStructureCaptureReplayDescriptorDataSize"));
    public static final MemoryLayout LAYOUT_samplerDescriptorSize = LAYOUT.select(PathElement.groupElement("samplerDescriptorSize"));
    public static final MemoryLayout LAYOUT_combinedImageSamplerDescriptorSize = LAYOUT.select(PathElement.groupElement("combinedImageSamplerDescriptorSize"));
    public static final MemoryLayout LAYOUT_sampledImageDescriptorSize = LAYOUT.select(PathElement.groupElement("sampledImageDescriptorSize"));
    public static final MemoryLayout LAYOUT_storageImageDescriptorSize = LAYOUT.select(PathElement.groupElement("storageImageDescriptorSize"));
    public static final MemoryLayout LAYOUT_uniformTexelBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("uniformTexelBufferDescriptorSize"));
    public static final MemoryLayout LAYOUT_robustUniformTexelBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("robustUniformTexelBufferDescriptorSize"));
    public static final MemoryLayout LAYOUT_storageTexelBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("storageTexelBufferDescriptorSize"));
    public static final MemoryLayout LAYOUT_robustStorageTexelBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("robustStorageTexelBufferDescriptorSize"));
    public static final MemoryLayout LAYOUT_uniformBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("uniformBufferDescriptorSize"));
    public static final MemoryLayout LAYOUT_robustUniformBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("robustUniformBufferDescriptorSize"));
    public static final MemoryLayout LAYOUT_storageBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("storageBufferDescriptorSize"));
    public static final MemoryLayout LAYOUT_robustStorageBufferDescriptorSize = LAYOUT.select(PathElement.groupElement("robustStorageBufferDescriptorSize"));
    public static final MemoryLayout LAYOUT_inputAttachmentDescriptorSize = LAYOUT.select(PathElement.groupElement("inputAttachmentDescriptorSize"));
    public static final MemoryLayout LAYOUT_accelerationStructureDescriptorSize = LAYOUT.select(PathElement.groupElement("accelerationStructureDescriptorSize"));
    public static final MemoryLayout LAYOUT_maxSamplerDescriptorBufferRange = LAYOUT.select(PathElement.groupElement("maxSamplerDescriptorBufferRange"));
    public static final MemoryLayout LAYOUT_maxResourceDescriptorBufferRange = LAYOUT.select(PathElement.groupElement("maxResourceDescriptorBufferRange"));
    public static final MemoryLayout LAYOUT_samplerDescriptorBufferAddressSpaceSize = LAYOUT.select(PathElement.groupElement("samplerDescriptorBufferAddressSpaceSize"));
    public static final MemoryLayout LAYOUT_resourceDescriptorBufferAddressSpaceSize = LAYOUT.select(PathElement.groupElement("resourceDescriptorBufferAddressSpaceSize"));
    public static final MemoryLayout LAYOUT_descriptorBufferAddressSpaceSize = LAYOUT.select(PathElement.groupElement("descriptorBufferAddressSpaceSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_combinedImageSamplerDescriptorSingleArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinedImageSamplerDescriptorSingleArray"));
    public static final VarHandle VH_bufferlessPushDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferlessPushDescriptors"));
    public static final VarHandle VH_allowSamplerImageViewPostSubmitCreation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("allowSamplerImageViewPostSubmitCreation"));
    public static final VarHandle VH_descriptorBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferOffsetAlignment"));
    public static final VarHandle VH_maxDescriptorBufferBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorBufferBindings"));
    public static final VarHandle VH_maxResourceDescriptorBufferBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxResourceDescriptorBufferBindings"));
    public static final VarHandle VH_maxSamplerDescriptorBufferBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerDescriptorBufferBindings"));
    public static final VarHandle VH_maxEmbeddedImmutableSamplerBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxEmbeddedImmutableSamplerBindings"));
    public static final VarHandle VH_maxEmbeddedImmutableSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxEmbeddedImmutableSamplers"));
    public static final VarHandle VH_bufferCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCaptureReplayDescriptorDataSize"));
    public static final VarHandle VH_imageCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCaptureReplayDescriptorDataSize"));
    public static final VarHandle VH_imageViewCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewCaptureReplayDescriptorDataSize"));
    public static final VarHandle VH_samplerCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerCaptureReplayDescriptorDataSize"));
    public static final VarHandle VH_accelerationStructureCaptureReplayDescriptorDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureCaptureReplayDescriptorDataSize"));
    public static final VarHandle VH_samplerDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerDescriptorSize"));
    public static final VarHandle VH_combinedImageSamplerDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinedImageSamplerDescriptorSize"));
    public static final VarHandle VH_sampledImageDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageDescriptorSize"));
    public static final VarHandle VH_storageImageDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageImageDescriptorSize"));
    public static final VarHandle VH_uniformTexelBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferDescriptorSize"));
    public static final VarHandle VH_robustUniformTexelBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustUniformTexelBufferDescriptorSize"));
    public static final VarHandle VH_storageTexelBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferDescriptorSize"));
    public static final VarHandle VH_robustStorageTexelBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustStorageTexelBufferDescriptorSize"));
    public static final VarHandle VH_uniformBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformBufferDescriptorSize"));
    public static final VarHandle VH_robustUniformBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustUniformBufferDescriptorSize"));
    public static final VarHandle VH_storageBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBufferDescriptorSize"));
    public static final VarHandle VH_robustStorageBufferDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustStorageBufferDescriptorSize"));
    public static final VarHandle VH_inputAttachmentDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputAttachmentDescriptorSize"));
    public static final VarHandle VH_accelerationStructureDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureDescriptorSize"));
    public static final VarHandle VH_maxSamplerDescriptorBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerDescriptorBufferRange"));
    public static final VarHandle VH_maxResourceDescriptorBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxResourceDescriptorBufferRange"));
    public static final VarHandle VH_samplerDescriptorBufferAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerDescriptorBufferAddressSpaceSize"));
    public static final VarHandle VH_resourceDescriptorBufferAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceDescriptorBufferAddressSpaceSize"));
    public static final VarHandle VH_descriptorBufferAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferAddressSpaceSize"));

    public VkPhysicalDeviceDescriptorBufferPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT); }
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT copyFrom(VkPhysicalDeviceDescriptorBufferPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDescriptorBufferPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT at(long index, Consumer<VkPhysicalDeviceDescriptorBufferPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int combinedImageSamplerDescriptorSingleArrayAt(long index) { return (int) VH_combinedImageSamplerDescriptorSingleArray.get(this.segment(), 0L, index); }
    public int bufferlessPushDescriptorsAt(long index) { return (int) VH_bufferlessPushDescriptors.get(this.segment(), 0L, index); }
    public int allowSamplerImageViewPostSubmitCreationAt(long index) { return (int) VH_allowSamplerImageViewPostSubmitCreation.get(this.segment(), 0L, index); }
    public long descriptorBufferOffsetAlignmentAt(long index) { return (long) VH_descriptorBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public int maxDescriptorBufferBindingsAt(long index) { return (int) VH_maxDescriptorBufferBindings.get(this.segment(), 0L, index); }
    public int maxResourceDescriptorBufferBindingsAt(long index) { return (int) VH_maxResourceDescriptorBufferBindings.get(this.segment(), 0L, index); }
    public int maxSamplerDescriptorBufferBindingsAt(long index) { return (int) VH_maxSamplerDescriptorBufferBindings.get(this.segment(), 0L, index); }
    public int maxEmbeddedImmutableSamplerBindingsAt(long index) { return (int) VH_maxEmbeddedImmutableSamplerBindings.get(this.segment(), 0L, index); }
    public int maxEmbeddedImmutableSamplersAt(long index) { return (int) VH_maxEmbeddedImmutableSamplers.get(this.segment(), 0L, index); }
    public long bufferCaptureReplayDescriptorDataSizeAt(long index) { return (long) VH_bufferCaptureReplayDescriptorDataSize.get(this.segment(), 0L, index); }
    public long imageCaptureReplayDescriptorDataSizeAt(long index) { return (long) VH_imageCaptureReplayDescriptorDataSize.get(this.segment(), 0L, index); }
    public long imageViewCaptureReplayDescriptorDataSizeAt(long index) { return (long) VH_imageViewCaptureReplayDescriptorDataSize.get(this.segment(), 0L, index); }
    public long samplerCaptureReplayDescriptorDataSizeAt(long index) { return (long) VH_samplerCaptureReplayDescriptorDataSize.get(this.segment(), 0L, index); }
    public long accelerationStructureCaptureReplayDescriptorDataSizeAt(long index) { return (long) VH_accelerationStructureCaptureReplayDescriptorDataSize.get(this.segment(), 0L, index); }
    public long samplerDescriptorSizeAt(long index) { return (long) VH_samplerDescriptorSize.get(this.segment(), 0L, index); }
    public long combinedImageSamplerDescriptorSizeAt(long index) { return (long) VH_combinedImageSamplerDescriptorSize.get(this.segment(), 0L, index); }
    public long sampledImageDescriptorSizeAt(long index) { return (long) VH_sampledImageDescriptorSize.get(this.segment(), 0L, index); }
    public long storageImageDescriptorSizeAt(long index) { return (long) VH_storageImageDescriptorSize.get(this.segment(), 0L, index); }
    public long uniformTexelBufferDescriptorSizeAt(long index) { return (long) VH_uniformTexelBufferDescriptorSize.get(this.segment(), 0L, index); }
    public long robustUniformTexelBufferDescriptorSizeAt(long index) { return (long) VH_robustUniformTexelBufferDescriptorSize.get(this.segment(), 0L, index); }
    public long storageTexelBufferDescriptorSizeAt(long index) { return (long) VH_storageTexelBufferDescriptorSize.get(this.segment(), 0L, index); }
    public long robustStorageTexelBufferDescriptorSizeAt(long index) { return (long) VH_robustStorageTexelBufferDescriptorSize.get(this.segment(), 0L, index); }
    public long uniformBufferDescriptorSizeAt(long index) { return (long) VH_uniformBufferDescriptorSize.get(this.segment(), 0L, index); }
    public long robustUniformBufferDescriptorSizeAt(long index) { return (long) VH_robustUniformBufferDescriptorSize.get(this.segment(), 0L, index); }
    public long storageBufferDescriptorSizeAt(long index) { return (long) VH_storageBufferDescriptorSize.get(this.segment(), 0L, index); }
    public long robustStorageBufferDescriptorSizeAt(long index) { return (long) VH_robustStorageBufferDescriptorSize.get(this.segment(), 0L, index); }
    public long inputAttachmentDescriptorSizeAt(long index) { return (long) VH_inputAttachmentDescriptorSize.get(this.segment(), 0L, index); }
    public long accelerationStructureDescriptorSizeAt(long index) { return (long) VH_accelerationStructureDescriptorSize.get(this.segment(), 0L, index); }
    public long maxSamplerDescriptorBufferRangeAt(long index) { return (long) VH_maxSamplerDescriptorBufferRange.get(this.segment(), 0L, index); }
    public long maxResourceDescriptorBufferRangeAt(long index) { return (long) VH_maxResourceDescriptorBufferRange.get(this.segment(), 0L, index); }
    public long samplerDescriptorBufferAddressSpaceSizeAt(long index) { return (long) VH_samplerDescriptorBufferAddressSpaceSize.get(this.segment(), 0L, index); }
    public long resourceDescriptorBufferAddressSpaceSizeAt(long index) { return (long) VH_resourceDescriptorBufferAddressSpaceSize.get(this.segment(), 0L, index); }
    public long descriptorBufferAddressSpaceSizeAt(long index) { return (long) VH_descriptorBufferAddressSpaceSize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int combinedImageSamplerDescriptorSingleArray() { return (int) VH_combinedImageSamplerDescriptorSingleArray.get(this.segment(), 0L, 0L); }
    public int bufferlessPushDescriptors() { return (int) VH_bufferlessPushDescriptors.get(this.segment(), 0L, 0L); }
    public int allowSamplerImageViewPostSubmitCreation() { return (int) VH_allowSamplerImageViewPostSubmitCreation.get(this.segment(), 0L, 0L); }
    public long descriptorBufferOffsetAlignment() { return (long) VH_descriptorBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public int maxDescriptorBufferBindings() { return (int) VH_maxDescriptorBufferBindings.get(this.segment(), 0L, 0L); }
    public int maxResourceDescriptorBufferBindings() { return (int) VH_maxResourceDescriptorBufferBindings.get(this.segment(), 0L, 0L); }
    public int maxSamplerDescriptorBufferBindings() { return (int) VH_maxSamplerDescriptorBufferBindings.get(this.segment(), 0L, 0L); }
    public int maxEmbeddedImmutableSamplerBindings() { return (int) VH_maxEmbeddedImmutableSamplerBindings.get(this.segment(), 0L, 0L); }
    public int maxEmbeddedImmutableSamplers() { return (int) VH_maxEmbeddedImmutableSamplers.get(this.segment(), 0L, 0L); }
    public long bufferCaptureReplayDescriptorDataSize() { return (long) VH_bufferCaptureReplayDescriptorDataSize.get(this.segment(), 0L, 0L); }
    public long imageCaptureReplayDescriptorDataSize() { return (long) VH_imageCaptureReplayDescriptorDataSize.get(this.segment(), 0L, 0L); }
    public long imageViewCaptureReplayDescriptorDataSize() { return (long) VH_imageViewCaptureReplayDescriptorDataSize.get(this.segment(), 0L, 0L); }
    public long samplerCaptureReplayDescriptorDataSize() { return (long) VH_samplerCaptureReplayDescriptorDataSize.get(this.segment(), 0L, 0L); }
    public long accelerationStructureCaptureReplayDescriptorDataSize() { return (long) VH_accelerationStructureCaptureReplayDescriptorDataSize.get(this.segment(), 0L, 0L); }
    public long samplerDescriptorSize() { return (long) VH_samplerDescriptorSize.get(this.segment(), 0L, 0L); }
    public long combinedImageSamplerDescriptorSize() { return (long) VH_combinedImageSamplerDescriptorSize.get(this.segment(), 0L, 0L); }
    public long sampledImageDescriptorSize() { return (long) VH_sampledImageDescriptorSize.get(this.segment(), 0L, 0L); }
    public long storageImageDescriptorSize() { return (long) VH_storageImageDescriptorSize.get(this.segment(), 0L, 0L); }
    public long uniformTexelBufferDescriptorSize() { return (long) VH_uniformTexelBufferDescriptorSize.get(this.segment(), 0L, 0L); }
    public long robustUniformTexelBufferDescriptorSize() { return (long) VH_robustUniformTexelBufferDescriptorSize.get(this.segment(), 0L, 0L); }
    public long storageTexelBufferDescriptorSize() { return (long) VH_storageTexelBufferDescriptorSize.get(this.segment(), 0L, 0L); }
    public long robustStorageTexelBufferDescriptorSize() { return (long) VH_robustStorageTexelBufferDescriptorSize.get(this.segment(), 0L, 0L); }
    public long uniformBufferDescriptorSize() { return (long) VH_uniformBufferDescriptorSize.get(this.segment(), 0L, 0L); }
    public long robustUniformBufferDescriptorSize() { return (long) VH_robustUniformBufferDescriptorSize.get(this.segment(), 0L, 0L); }
    public long storageBufferDescriptorSize() { return (long) VH_storageBufferDescriptorSize.get(this.segment(), 0L, 0L); }
    public long robustStorageBufferDescriptorSize() { return (long) VH_robustStorageBufferDescriptorSize.get(this.segment(), 0L, 0L); }
    public long inputAttachmentDescriptorSize() { return (long) VH_inputAttachmentDescriptorSize.get(this.segment(), 0L, 0L); }
    public long accelerationStructureDescriptorSize() { return (long) VH_accelerationStructureDescriptorSize.get(this.segment(), 0L, 0L); }
    public long maxSamplerDescriptorBufferRange() { return (long) VH_maxSamplerDescriptorBufferRange.get(this.segment(), 0L, 0L); }
    public long maxResourceDescriptorBufferRange() { return (long) VH_maxResourceDescriptorBufferRange.get(this.segment(), 0L, 0L); }
    public long samplerDescriptorBufferAddressSpaceSize() { return (long) VH_samplerDescriptorBufferAddressSpaceSize.get(this.segment(), 0L, 0L); }
    public long resourceDescriptorBufferAddressSpaceSize() { return (long) VH_resourceDescriptorBufferAddressSpaceSize.get(this.segment(), 0L, 0L); }
    public long descriptorBufferAddressSpaceSize() { return (long) VH_descriptorBufferAddressSpaceSize.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT combinedImageSamplerDescriptorSingleArrayAt(long index, int value) { VH_combinedImageSamplerDescriptorSingleArray.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT bufferlessPushDescriptorsAt(long index, int value) { VH_bufferlessPushDescriptors.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT allowSamplerImageViewPostSubmitCreationAt(long index, int value) { VH_allowSamplerImageViewPostSubmitCreation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT descriptorBufferOffsetAlignmentAt(long index, long value) { VH_descriptorBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxDescriptorBufferBindingsAt(long index, int value) { VH_maxDescriptorBufferBindings.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxResourceDescriptorBufferBindingsAt(long index, int value) { VH_maxResourceDescriptorBufferBindings.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxSamplerDescriptorBufferBindingsAt(long index, int value) { VH_maxSamplerDescriptorBufferBindings.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxEmbeddedImmutableSamplerBindingsAt(long index, int value) { VH_maxEmbeddedImmutableSamplerBindings.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxEmbeddedImmutableSamplersAt(long index, int value) { VH_maxEmbeddedImmutableSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT bufferCaptureReplayDescriptorDataSizeAt(long index, long value) { VH_bufferCaptureReplayDescriptorDataSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT imageCaptureReplayDescriptorDataSizeAt(long index, long value) { VH_imageCaptureReplayDescriptorDataSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT imageViewCaptureReplayDescriptorDataSizeAt(long index, long value) { VH_imageViewCaptureReplayDescriptorDataSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerCaptureReplayDescriptorDataSizeAt(long index, long value) { VH_samplerCaptureReplayDescriptorDataSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT accelerationStructureCaptureReplayDescriptorDataSizeAt(long index, long value) { VH_accelerationStructureCaptureReplayDescriptorDataSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerDescriptorSizeAt(long index, long value) { VH_samplerDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT combinedImageSamplerDescriptorSizeAt(long index, long value) { VH_combinedImageSamplerDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sampledImageDescriptorSizeAt(long index, long value) { VH_sampledImageDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageImageDescriptorSizeAt(long index, long value) { VH_storageImageDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT uniformTexelBufferDescriptorSizeAt(long index, long value) { VH_uniformTexelBufferDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustUniformTexelBufferDescriptorSizeAt(long index, long value) { VH_robustUniformTexelBufferDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageTexelBufferDescriptorSizeAt(long index, long value) { VH_storageTexelBufferDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustStorageTexelBufferDescriptorSizeAt(long index, long value) { VH_robustStorageTexelBufferDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT uniformBufferDescriptorSizeAt(long index, long value) { VH_uniformBufferDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustUniformBufferDescriptorSizeAt(long index, long value) { VH_robustUniformBufferDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageBufferDescriptorSizeAt(long index, long value) { VH_storageBufferDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustStorageBufferDescriptorSizeAt(long index, long value) { VH_robustStorageBufferDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT inputAttachmentDescriptorSizeAt(long index, long value) { VH_inputAttachmentDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT accelerationStructureDescriptorSizeAt(long index, long value) { VH_accelerationStructureDescriptorSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxSamplerDescriptorBufferRangeAt(long index, long value) { VH_maxSamplerDescriptorBufferRange.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxResourceDescriptorBufferRangeAt(long index, long value) { VH_maxResourceDescriptorBufferRange.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerDescriptorBufferAddressSpaceSizeAt(long index, long value) { VH_samplerDescriptorBufferAddressSpaceSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT resourceDescriptorBufferAddressSpaceSizeAt(long index, long value) { VH_resourceDescriptorBufferAddressSpaceSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT descriptorBufferAddressSpaceSizeAt(long index, long value) { VH_descriptorBufferAddressSpaceSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT combinedImageSamplerDescriptorSingleArray(int value) { VH_combinedImageSamplerDescriptorSingleArray.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT bufferlessPushDescriptors(int value) { VH_bufferlessPushDescriptors.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT allowSamplerImageViewPostSubmitCreation(int value) { VH_allowSamplerImageViewPostSubmitCreation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT descriptorBufferOffsetAlignment(long value) { VH_descriptorBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxDescriptorBufferBindings(int value) { VH_maxDescriptorBufferBindings.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxResourceDescriptorBufferBindings(int value) { VH_maxResourceDescriptorBufferBindings.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxSamplerDescriptorBufferBindings(int value) { VH_maxSamplerDescriptorBufferBindings.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxEmbeddedImmutableSamplerBindings(int value) { VH_maxEmbeddedImmutableSamplerBindings.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxEmbeddedImmutableSamplers(int value) { VH_maxEmbeddedImmutableSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT bufferCaptureReplayDescriptorDataSize(long value) { VH_bufferCaptureReplayDescriptorDataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT imageCaptureReplayDescriptorDataSize(long value) { VH_imageCaptureReplayDescriptorDataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT imageViewCaptureReplayDescriptorDataSize(long value) { VH_imageViewCaptureReplayDescriptorDataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerCaptureReplayDescriptorDataSize(long value) { VH_samplerCaptureReplayDescriptorDataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT accelerationStructureCaptureReplayDescriptorDataSize(long value) { VH_accelerationStructureCaptureReplayDescriptorDataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerDescriptorSize(long value) { VH_samplerDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT combinedImageSamplerDescriptorSize(long value) { VH_combinedImageSamplerDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sampledImageDescriptorSize(long value) { VH_sampledImageDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageImageDescriptorSize(long value) { VH_storageImageDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT uniformTexelBufferDescriptorSize(long value) { VH_uniformTexelBufferDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustUniformTexelBufferDescriptorSize(long value) { VH_robustUniformTexelBufferDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageTexelBufferDescriptorSize(long value) { VH_storageTexelBufferDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustStorageTexelBufferDescriptorSize(long value) { VH_robustStorageTexelBufferDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT uniformBufferDescriptorSize(long value) { VH_uniformBufferDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustUniformBufferDescriptorSize(long value) { VH_robustUniformBufferDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageBufferDescriptorSize(long value) { VH_storageBufferDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustStorageBufferDescriptorSize(long value) { VH_robustStorageBufferDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT inputAttachmentDescriptorSize(long value) { VH_inputAttachmentDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT accelerationStructureDescriptorSize(long value) { VH_accelerationStructureDescriptorSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxSamplerDescriptorBufferRange(long value) { VH_maxSamplerDescriptorBufferRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxResourceDescriptorBufferRange(long value) { VH_maxResourceDescriptorBufferRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerDescriptorBufferAddressSpaceSize(long value) { VH_samplerDescriptorBufferAddressSpaceSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT resourceDescriptorBufferAddressSpaceSize(long value) { VH_resourceDescriptorBufferAddressSpaceSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT descriptorBufferAddressSpaceSize(long value) { VH_descriptorBufferAddressSpaceSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _combinedImageSamplerDescriptorSingleArrayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_combinedImageSamplerDescriptorSingleArray, index), LAYOUT_combinedImageSamplerDescriptorSingleArray); }
    public MemorySegment _combinedImageSamplerDescriptorSingleArray() { return _combinedImageSamplerDescriptorSingleArrayAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _combinedImageSamplerDescriptorSingleArrayAt(long index, MemorySegment src) { _combinedImageSamplerDescriptorSingleArrayAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _combinedImageSamplerDescriptorSingleArray(MemorySegment src) { return _combinedImageSamplerDescriptorSingleArrayAt(0L, src); }
    public MemorySegment _bufferlessPushDescriptorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferlessPushDescriptors, index), LAYOUT_bufferlessPushDescriptors); }
    public MemorySegment _bufferlessPushDescriptors() { return _bufferlessPushDescriptorsAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _bufferlessPushDescriptorsAt(long index, MemorySegment src) { _bufferlessPushDescriptorsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _bufferlessPushDescriptors(MemorySegment src) { return _bufferlessPushDescriptorsAt(0L, src); }
    public MemorySegment _allowSamplerImageViewPostSubmitCreationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_allowSamplerImageViewPostSubmitCreation, index), LAYOUT_allowSamplerImageViewPostSubmitCreation); }
    public MemorySegment _allowSamplerImageViewPostSubmitCreation() { return _allowSamplerImageViewPostSubmitCreationAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _allowSamplerImageViewPostSubmitCreationAt(long index, MemorySegment src) { _allowSamplerImageViewPostSubmitCreationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _allowSamplerImageViewPostSubmitCreation(MemorySegment src) { return _allowSamplerImageViewPostSubmitCreationAt(0L, src); }
    public MemorySegment _descriptorBufferOffsetAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBufferOffsetAlignment, index), LAYOUT_descriptorBufferOffsetAlignment); }
    public MemorySegment _descriptorBufferOffsetAlignment() { return _descriptorBufferOffsetAlignmentAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _descriptorBufferOffsetAlignmentAt(long index, MemorySegment src) { _descriptorBufferOffsetAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _descriptorBufferOffsetAlignment(MemorySegment src) { return _descriptorBufferOffsetAlignmentAt(0L, src); }
    public MemorySegment _maxDescriptorBufferBindingsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorBufferBindings, index), LAYOUT_maxDescriptorBufferBindings); }
    public MemorySegment _maxDescriptorBufferBindings() { return _maxDescriptorBufferBindingsAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _maxDescriptorBufferBindingsAt(long index, MemorySegment src) { _maxDescriptorBufferBindingsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _maxDescriptorBufferBindings(MemorySegment src) { return _maxDescriptorBufferBindingsAt(0L, src); }
    public MemorySegment _maxResourceDescriptorBufferBindingsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxResourceDescriptorBufferBindings, index), LAYOUT_maxResourceDescriptorBufferBindings); }
    public MemorySegment _maxResourceDescriptorBufferBindings() { return _maxResourceDescriptorBufferBindingsAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _maxResourceDescriptorBufferBindingsAt(long index, MemorySegment src) { _maxResourceDescriptorBufferBindingsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _maxResourceDescriptorBufferBindings(MemorySegment src) { return _maxResourceDescriptorBufferBindingsAt(0L, src); }
    public MemorySegment _maxSamplerDescriptorBufferBindingsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSamplerDescriptorBufferBindings, index), LAYOUT_maxSamplerDescriptorBufferBindings); }
    public MemorySegment _maxSamplerDescriptorBufferBindings() { return _maxSamplerDescriptorBufferBindingsAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _maxSamplerDescriptorBufferBindingsAt(long index, MemorySegment src) { _maxSamplerDescriptorBufferBindingsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _maxSamplerDescriptorBufferBindings(MemorySegment src) { return _maxSamplerDescriptorBufferBindingsAt(0L, src); }
    public MemorySegment _maxEmbeddedImmutableSamplerBindingsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxEmbeddedImmutableSamplerBindings, index), LAYOUT_maxEmbeddedImmutableSamplerBindings); }
    public MemorySegment _maxEmbeddedImmutableSamplerBindings() { return _maxEmbeddedImmutableSamplerBindingsAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _maxEmbeddedImmutableSamplerBindingsAt(long index, MemorySegment src) { _maxEmbeddedImmutableSamplerBindingsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _maxEmbeddedImmutableSamplerBindings(MemorySegment src) { return _maxEmbeddedImmutableSamplerBindingsAt(0L, src); }
    public MemorySegment _maxEmbeddedImmutableSamplersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxEmbeddedImmutableSamplers, index), LAYOUT_maxEmbeddedImmutableSamplers); }
    public MemorySegment _maxEmbeddedImmutableSamplers() { return _maxEmbeddedImmutableSamplersAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _maxEmbeddedImmutableSamplersAt(long index, MemorySegment src) { _maxEmbeddedImmutableSamplersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _maxEmbeddedImmutableSamplers(MemorySegment src) { return _maxEmbeddedImmutableSamplersAt(0L, src); }
    public MemorySegment _bufferCaptureReplayDescriptorDataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferCaptureReplayDescriptorDataSize, index), LAYOUT_bufferCaptureReplayDescriptorDataSize); }
    public MemorySegment _bufferCaptureReplayDescriptorDataSize() { return _bufferCaptureReplayDescriptorDataSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _bufferCaptureReplayDescriptorDataSizeAt(long index, MemorySegment src) { _bufferCaptureReplayDescriptorDataSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _bufferCaptureReplayDescriptorDataSize(MemorySegment src) { return _bufferCaptureReplayDescriptorDataSizeAt(0L, src); }
    public MemorySegment _imageCaptureReplayDescriptorDataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageCaptureReplayDescriptorDataSize, index), LAYOUT_imageCaptureReplayDescriptorDataSize); }
    public MemorySegment _imageCaptureReplayDescriptorDataSize() { return _imageCaptureReplayDescriptorDataSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _imageCaptureReplayDescriptorDataSizeAt(long index, MemorySegment src) { _imageCaptureReplayDescriptorDataSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _imageCaptureReplayDescriptorDataSize(MemorySegment src) { return _imageCaptureReplayDescriptorDataSizeAt(0L, src); }
    public MemorySegment _imageViewCaptureReplayDescriptorDataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_imageViewCaptureReplayDescriptorDataSize, index), LAYOUT_imageViewCaptureReplayDescriptorDataSize); }
    public MemorySegment _imageViewCaptureReplayDescriptorDataSize() { return _imageViewCaptureReplayDescriptorDataSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _imageViewCaptureReplayDescriptorDataSizeAt(long index, MemorySegment src) { _imageViewCaptureReplayDescriptorDataSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _imageViewCaptureReplayDescriptorDataSize(MemorySegment src) { return _imageViewCaptureReplayDescriptorDataSizeAt(0L, src); }
    public MemorySegment _samplerCaptureReplayDescriptorDataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samplerCaptureReplayDescriptorDataSize, index), LAYOUT_samplerCaptureReplayDescriptorDataSize); }
    public MemorySegment _samplerCaptureReplayDescriptorDataSize() { return _samplerCaptureReplayDescriptorDataSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _samplerCaptureReplayDescriptorDataSizeAt(long index, MemorySegment src) { _samplerCaptureReplayDescriptorDataSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _samplerCaptureReplayDescriptorDataSize(MemorySegment src) { return _samplerCaptureReplayDescriptorDataSizeAt(0L, src); }
    public MemorySegment _accelerationStructureCaptureReplayDescriptorDataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructureCaptureReplayDescriptorDataSize, index), LAYOUT_accelerationStructureCaptureReplayDescriptorDataSize); }
    public MemorySegment _accelerationStructureCaptureReplayDescriptorDataSize() { return _accelerationStructureCaptureReplayDescriptorDataSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _accelerationStructureCaptureReplayDescriptorDataSizeAt(long index, MemorySegment src) { _accelerationStructureCaptureReplayDescriptorDataSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _accelerationStructureCaptureReplayDescriptorDataSize(MemorySegment src) { return _accelerationStructureCaptureReplayDescriptorDataSizeAt(0L, src); }
    public MemorySegment _samplerDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samplerDescriptorSize, index), LAYOUT_samplerDescriptorSize); }
    public MemorySegment _samplerDescriptorSize() { return _samplerDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _samplerDescriptorSizeAt(long index, MemorySegment src) { _samplerDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _samplerDescriptorSize(MemorySegment src) { return _samplerDescriptorSizeAt(0L, src); }
    public MemorySegment _combinedImageSamplerDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_combinedImageSamplerDescriptorSize, index), LAYOUT_combinedImageSamplerDescriptorSize); }
    public MemorySegment _combinedImageSamplerDescriptorSize() { return _combinedImageSamplerDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _combinedImageSamplerDescriptorSizeAt(long index, MemorySegment src) { _combinedImageSamplerDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _combinedImageSamplerDescriptorSize(MemorySegment src) { return _combinedImageSamplerDescriptorSizeAt(0L, src); }
    public MemorySegment _sampledImageDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampledImageDescriptorSize, index), LAYOUT_sampledImageDescriptorSize); }
    public MemorySegment _sampledImageDescriptorSize() { return _sampledImageDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _sampledImageDescriptorSizeAt(long index, MemorySegment src) { _sampledImageDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _sampledImageDescriptorSize(MemorySegment src) { return _sampledImageDescriptorSizeAt(0L, src); }
    public MemorySegment _storageImageDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageImageDescriptorSize, index), LAYOUT_storageImageDescriptorSize); }
    public MemorySegment _storageImageDescriptorSize() { return _storageImageDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _storageImageDescriptorSizeAt(long index, MemorySegment src) { _storageImageDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _storageImageDescriptorSize(MemorySegment src) { return _storageImageDescriptorSizeAt(0L, src); }
    public MemorySegment _uniformTexelBufferDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uniformTexelBufferDescriptorSize, index), LAYOUT_uniformTexelBufferDescriptorSize); }
    public MemorySegment _uniformTexelBufferDescriptorSize() { return _uniformTexelBufferDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _uniformTexelBufferDescriptorSizeAt(long index, MemorySegment src) { _uniformTexelBufferDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _uniformTexelBufferDescriptorSize(MemorySegment src) { return _uniformTexelBufferDescriptorSizeAt(0L, src); }
    public MemorySegment _robustUniformTexelBufferDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustUniformTexelBufferDescriptorSize, index), LAYOUT_robustUniformTexelBufferDescriptorSize); }
    public MemorySegment _robustUniformTexelBufferDescriptorSize() { return _robustUniformTexelBufferDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _robustUniformTexelBufferDescriptorSizeAt(long index, MemorySegment src) { _robustUniformTexelBufferDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _robustUniformTexelBufferDescriptorSize(MemorySegment src) { return _robustUniformTexelBufferDescriptorSizeAt(0L, src); }
    public MemorySegment _storageTexelBufferDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageTexelBufferDescriptorSize, index), LAYOUT_storageTexelBufferDescriptorSize); }
    public MemorySegment _storageTexelBufferDescriptorSize() { return _storageTexelBufferDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _storageTexelBufferDescriptorSizeAt(long index, MemorySegment src) { _storageTexelBufferDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _storageTexelBufferDescriptorSize(MemorySegment src) { return _storageTexelBufferDescriptorSizeAt(0L, src); }
    public MemorySegment _robustStorageTexelBufferDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustStorageTexelBufferDescriptorSize, index), LAYOUT_robustStorageTexelBufferDescriptorSize); }
    public MemorySegment _robustStorageTexelBufferDescriptorSize() { return _robustStorageTexelBufferDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _robustStorageTexelBufferDescriptorSizeAt(long index, MemorySegment src) { _robustStorageTexelBufferDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _robustStorageTexelBufferDescriptorSize(MemorySegment src) { return _robustStorageTexelBufferDescriptorSizeAt(0L, src); }
    public MemorySegment _uniformBufferDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_uniformBufferDescriptorSize, index), LAYOUT_uniformBufferDescriptorSize); }
    public MemorySegment _uniformBufferDescriptorSize() { return _uniformBufferDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _uniformBufferDescriptorSizeAt(long index, MemorySegment src) { _uniformBufferDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _uniformBufferDescriptorSize(MemorySegment src) { return _uniformBufferDescriptorSizeAt(0L, src); }
    public MemorySegment _robustUniformBufferDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustUniformBufferDescriptorSize, index), LAYOUT_robustUniformBufferDescriptorSize); }
    public MemorySegment _robustUniformBufferDescriptorSize() { return _robustUniformBufferDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _robustUniformBufferDescriptorSizeAt(long index, MemorySegment src) { _robustUniformBufferDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _robustUniformBufferDescriptorSize(MemorySegment src) { return _robustUniformBufferDescriptorSizeAt(0L, src); }
    public MemorySegment _storageBufferDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageBufferDescriptorSize, index), LAYOUT_storageBufferDescriptorSize); }
    public MemorySegment _storageBufferDescriptorSize() { return _storageBufferDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _storageBufferDescriptorSizeAt(long index, MemorySegment src) { _storageBufferDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _storageBufferDescriptorSize(MemorySegment src) { return _storageBufferDescriptorSizeAt(0L, src); }
    public MemorySegment _robustStorageBufferDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_robustStorageBufferDescriptorSize, index), LAYOUT_robustStorageBufferDescriptorSize); }
    public MemorySegment _robustStorageBufferDescriptorSize() { return _robustStorageBufferDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _robustStorageBufferDescriptorSizeAt(long index, MemorySegment src) { _robustStorageBufferDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _robustStorageBufferDescriptorSize(MemorySegment src) { return _robustStorageBufferDescriptorSizeAt(0L, src); }
    public MemorySegment _inputAttachmentDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_inputAttachmentDescriptorSize, index), LAYOUT_inputAttachmentDescriptorSize); }
    public MemorySegment _inputAttachmentDescriptorSize() { return _inputAttachmentDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _inputAttachmentDescriptorSizeAt(long index, MemorySegment src) { _inputAttachmentDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _inputAttachmentDescriptorSize(MemorySegment src) { return _inputAttachmentDescriptorSizeAt(0L, src); }
    public MemorySegment _accelerationStructureDescriptorSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructureDescriptorSize, index), LAYOUT_accelerationStructureDescriptorSize); }
    public MemorySegment _accelerationStructureDescriptorSize() { return _accelerationStructureDescriptorSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _accelerationStructureDescriptorSizeAt(long index, MemorySegment src) { _accelerationStructureDescriptorSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _accelerationStructureDescriptorSize(MemorySegment src) { return _accelerationStructureDescriptorSizeAt(0L, src); }
    public MemorySegment _maxSamplerDescriptorBufferRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSamplerDescriptorBufferRange, index), LAYOUT_maxSamplerDescriptorBufferRange); }
    public MemorySegment _maxSamplerDescriptorBufferRange() { return _maxSamplerDescriptorBufferRangeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _maxSamplerDescriptorBufferRangeAt(long index, MemorySegment src) { _maxSamplerDescriptorBufferRangeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _maxSamplerDescriptorBufferRange(MemorySegment src) { return _maxSamplerDescriptorBufferRangeAt(0L, src); }
    public MemorySegment _maxResourceDescriptorBufferRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxResourceDescriptorBufferRange, index), LAYOUT_maxResourceDescriptorBufferRange); }
    public MemorySegment _maxResourceDescriptorBufferRange() { return _maxResourceDescriptorBufferRangeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _maxResourceDescriptorBufferRangeAt(long index, MemorySegment src) { _maxResourceDescriptorBufferRangeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _maxResourceDescriptorBufferRange(MemorySegment src) { return _maxResourceDescriptorBufferRangeAt(0L, src); }
    public MemorySegment _samplerDescriptorBufferAddressSpaceSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samplerDescriptorBufferAddressSpaceSize, index), LAYOUT_samplerDescriptorBufferAddressSpaceSize); }
    public MemorySegment _samplerDescriptorBufferAddressSpaceSize() { return _samplerDescriptorBufferAddressSpaceSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _samplerDescriptorBufferAddressSpaceSizeAt(long index, MemorySegment src) { _samplerDescriptorBufferAddressSpaceSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _samplerDescriptorBufferAddressSpaceSize(MemorySegment src) { return _samplerDescriptorBufferAddressSpaceSizeAt(0L, src); }
    public MemorySegment _resourceDescriptorBufferAddressSpaceSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_resourceDescriptorBufferAddressSpaceSize, index), LAYOUT_resourceDescriptorBufferAddressSpaceSize); }
    public MemorySegment _resourceDescriptorBufferAddressSpaceSize() { return _resourceDescriptorBufferAddressSpaceSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _resourceDescriptorBufferAddressSpaceSizeAt(long index, MemorySegment src) { _resourceDescriptorBufferAddressSpaceSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _resourceDescriptorBufferAddressSpaceSize(MemorySegment src) { return _resourceDescriptorBufferAddressSpaceSizeAt(0L, src); }
    public MemorySegment _descriptorBufferAddressSpaceSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBufferAddressSpaceSize, index), LAYOUT_descriptorBufferAddressSpaceSize); }
    public MemorySegment _descriptorBufferAddressSpaceSize() { return _descriptorBufferAddressSpaceSizeAt(0L); }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _descriptorBufferAddressSpaceSizeAt(long index, MemorySegment src) { _descriptorBufferAddressSpaceSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT _descriptorBufferAddressSpaceSize(MemorySegment src) { return _descriptorBufferAddressSpaceSizeAt(0L, src); }
}

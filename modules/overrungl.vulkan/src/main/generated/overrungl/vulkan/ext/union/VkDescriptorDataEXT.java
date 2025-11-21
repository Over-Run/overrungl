// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.union;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorDataEXT`.
/// ## Layout
/// ```
/// union VkDescriptorDataEXT {
///     const VkSampler* pSampler;
///     const VkDescriptorImageInfo* pCombinedImageSampler;
///     const VkDescriptorImageInfo* pInputAttachmentImage;
///     const VkDescriptorImageInfo* pSampledImage;
///     const VkDescriptorImageInfo* pStorageImage;
///     const VkDescriptorAddressInfoEXT* pUniformTexelBuffer;
///     const VkDescriptorAddressInfoEXT* pStorageTexelBuffer;
///     const VkDescriptorAddressInfoEXT* pUniformBuffer;
///     const VkDescriptorAddressInfoEXT* pStorageBuffer;
///     VkDeviceAddress accelerationStructure;
/// }
/// ```
public final class VkDescriptorDataEXT extends GroupType {
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.ADDRESS.withName("pSampler"),
        ValueLayout.ADDRESS.withName("pCombinedImageSampler"),
        ValueLayout.ADDRESS.withName("pInputAttachmentImage"),
        ValueLayout.ADDRESS.withName("pSampledImage"),
        ValueLayout.ADDRESS.withName("pStorageImage"),
        ValueLayout.ADDRESS.withName("pUniformTexelBuffer"),
        ValueLayout.ADDRESS.withName("pStorageTexelBuffer"),
        ValueLayout.ADDRESS.withName("pUniformBuffer"),
        ValueLayout.ADDRESS.withName("pStorageBuffer"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure")
    );
    public static final long OFFSET_pSampler = LAYOUT.byteOffset(PathElement.groupElement("pSampler"));
    public static final long OFFSET_pCombinedImageSampler = LAYOUT.byteOffset(PathElement.groupElement("pCombinedImageSampler"));
    public static final long OFFSET_pInputAttachmentImage = LAYOUT.byteOffset(PathElement.groupElement("pInputAttachmentImage"));
    public static final long OFFSET_pSampledImage = LAYOUT.byteOffset(PathElement.groupElement("pSampledImage"));
    public static final long OFFSET_pStorageImage = LAYOUT.byteOffset(PathElement.groupElement("pStorageImage"));
    public static final long OFFSET_pUniformTexelBuffer = LAYOUT.byteOffset(PathElement.groupElement("pUniformTexelBuffer"));
    public static final long OFFSET_pStorageTexelBuffer = LAYOUT.byteOffset(PathElement.groupElement("pStorageTexelBuffer"));
    public static final long OFFSET_pUniformBuffer = LAYOUT.byteOffset(PathElement.groupElement("pUniformBuffer"));
    public static final long OFFSET_pStorageBuffer = LAYOUT.byteOffset(PathElement.groupElement("pStorageBuffer"));
    public static final long OFFSET_accelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
    public static final MemoryLayout LAYOUT_pSampler = LAYOUT.select(PathElement.groupElement("pSampler"));
    public static final MemoryLayout LAYOUT_pCombinedImageSampler = LAYOUT.select(PathElement.groupElement("pCombinedImageSampler"));
    public static final MemoryLayout LAYOUT_pInputAttachmentImage = LAYOUT.select(PathElement.groupElement("pInputAttachmentImage"));
    public static final MemoryLayout LAYOUT_pSampledImage = LAYOUT.select(PathElement.groupElement("pSampledImage"));
    public static final MemoryLayout LAYOUT_pStorageImage = LAYOUT.select(PathElement.groupElement("pStorageImage"));
    public static final MemoryLayout LAYOUT_pUniformTexelBuffer = LAYOUT.select(PathElement.groupElement("pUniformTexelBuffer"));
    public static final MemoryLayout LAYOUT_pStorageTexelBuffer = LAYOUT.select(PathElement.groupElement("pStorageTexelBuffer"));
    public static final MemoryLayout LAYOUT_pUniformBuffer = LAYOUT.select(PathElement.groupElement("pUniformBuffer"));
    public static final MemoryLayout LAYOUT_pStorageBuffer = LAYOUT.select(PathElement.groupElement("pStorageBuffer"));
    public static final MemoryLayout LAYOUT_accelerationStructure = LAYOUT.select(PathElement.groupElement("accelerationStructure"));
    public static final VarHandle VH_pSampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampler"));
    public static final VarHandle VH_pCombinedImageSampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCombinedImageSampler"));
    public static final VarHandle VH_pInputAttachmentImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInputAttachmentImage"));
    public static final VarHandle VH_pSampledImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampledImage"));
    public static final VarHandle VH_pStorageImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStorageImage"));
    public static final VarHandle VH_pUniformTexelBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUniformTexelBuffer"));
    public static final VarHandle VH_pStorageTexelBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStorageTexelBuffer"));
    public static final VarHandle VH_pUniformBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUniformBuffer"));
    public static final VarHandle VH_pStorageBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStorageBuffer"));
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));

    public VkDescriptorDataEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorDataEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorDataEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorDataEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorDataEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorDataEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorDataEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorDataEXT alloc(SegmentAllocator allocator) { return new VkDescriptorDataEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorDataEXT alloc(SegmentAllocator allocator, long count) { return new VkDescriptorDataEXT(allocator.allocate(LAYOUT, count), count); }
    public VkDescriptorDataEXT copyFrom(VkDescriptorDataEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorDataEXT reinterpret(long count) { return new VkDescriptorDataEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorDataEXT asSlice(long index) { return new VkDescriptorDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorDataEXT asSlice(long index, long count) { return new VkDescriptorDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorDataEXT at(long index, Consumer<VkDescriptorDataEXT> func) { func.accept(asSlice(index)); return this; }
    public MemorySegment pSamplerAt(long index) { return (MemorySegment) VH_pSampler.get(this.segment(), 0L, index); }
    public MemorySegment pCombinedImageSamplerAt(long index) { return (MemorySegment) VH_pCombinedImageSampler.get(this.segment(), 0L, index); }
    public MemorySegment pInputAttachmentImageAt(long index) { return (MemorySegment) VH_pInputAttachmentImage.get(this.segment(), 0L, index); }
    public MemorySegment pSampledImageAt(long index) { return (MemorySegment) VH_pSampledImage.get(this.segment(), 0L, index); }
    public MemorySegment pStorageImageAt(long index) { return (MemorySegment) VH_pStorageImage.get(this.segment(), 0L, index); }
    public MemorySegment pUniformTexelBufferAt(long index) { return (MemorySegment) VH_pUniformTexelBuffer.get(this.segment(), 0L, index); }
    public MemorySegment pStorageTexelBufferAt(long index) { return (MemorySegment) VH_pStorageTexelBuffer.get(this.segment(), 0L, index); }
    public MemorySegment pUniformBufferAt(long index) { return (MemorySegment) VH_pUniformBuffer.get(this.segment(), 0L, index); }
    public MemorySegment pStorageBufferAt(long index) { return (MemorySegment) VH_pStorageBuffer.get(this.segment(), 0L, index); }
    public long accelerationStructureAt(long index) { return (long) VH_accelerationStructure.get(this.segment(), 0L, index); }
    public MemorySegment pSampler() { return (MemorySegment) VH_pSampler.get(this.segment(), 0L, 0L); }
    public MemorySegment pCombinedImageSampler() { return (MemorySegment) VH_pCombinedImageSampler.get(this.segment(), 0L, 0L); }
    public MemorySegment pInputAttachmentImage() { return (MemorySegment) VH_pInputAttachmentImage.get(this.segment(), 0L, 0L); }
    public MemorySegment pSampledImage() { return (MemorySegment) VH_pSampledImage.get(this.segment(), 0L, 0L); }
    public MemorySegment pStorageImage() { return (MemorySegment) VH_pStorageImage.get(this.segment(), 0L, 0L); }
    public MemorySegment pUniformTexelBuffer() { return (MemorySegment) VH_pUniformTexelBuffer.get(this.segment(), 0L, 0L); }
    public MemorySegment pStorageTexelBuffer() { return (MemorySegment) VH_pStorageTexelBuffer.get(this.segment(), 0L, 0L); }
    public MemorySegment pUniformBuffer() { return (MemorySegment) VH_pUniformBuffer.get(this.segment(), 0L, 0L); }
    public MemorySegment pStorageBuffer() { return (MemorySegment) VH_pStorageBuffer.get(this.segment(), 0L, 0L); }
    public long accelerationStructure() { return (long) VH_accelerationStructure.get(this.segment(), 0L, 0L); }
    public VkDescriptorDataEXT pSamplerAt(long index, MemorySegment value) { VH_pSampler.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorDataEXT pCombinedImageSamplerAt(long index, MemorySegment value) { VH_pCombinedImageSampler.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorDataEXT pInputAttachmentImageAt(long index, MemorySegment value) { VH_pInputAttachmentImage.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorDataEXT pSampledImageAt(long index, MemorySegment value) { VH_pSampledImage.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorDataEXT pStorageImageAt(long index, MemorySegment value) { VH_pStorageImage.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorDataEXT pUniformTexelBufferAt(long index, MemorySegment value) { VH_pUniformTexelBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorDataEXT pStorageTexelBufferAt(long index, MemorySegment value) { VH_pStorageTexelBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorDataEXT pUniformBufferAt(long index, MemorySegment value) { VH_pUniformBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorDataEXT pStorageBufferAt(long index, MemorySegment value) { VH_pStorageBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorDataEXT accelerationStructureAt(long index, long value) { VH_accelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorDataEXT pSampler(MemorySegment value) { VH_pSampler.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorDataEXT pCombinedImageSampler(MemorySegment value) { VH_pCombinedImageSampler.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorDataEXT pInputAttachmentImage(MemorySegment value) { VH_pInputAttachmentImage.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorDataEXT pSampledImage(MemorySegment value) { VH_pSampledImage.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorDataEXT pStorageImage(MemorySegment value) { VH_pStorageImage.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorDataEXT pUniformTexelBuffer(MemorySegment value) { VH_pUniformTexelBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorDataEXT pStorageTexelBuffer(MemorySegment value) { VH_pStorageTexelBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorDataEXT pUniformBuffer(MemorySegment value) { VH_pUniformBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorDataEXT pStorageBuffer(MemorySegment value) { VH_pStorageBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorDataEXT accelerationStructure(long value) { VH_accelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _pSamplerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSampler, index), LAYOUT_pSampler); }
    public MemorySegment _pSampler() { return _pSamplerAt(0L); }
    public VkDescriptorDataEXT _pSamplerAt(long index, MemorySegment src) { _pSamplerAt(index).copyFrom(src); return this; }
    public VkDescriptorDataEXT _pSampler(MemorySegment src) { return _pSamplerAt(0L, src); }
    public MemorySegment _pCombinedImageSamplerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCombinedImageSampler, index), LAYOUT_pCombinedImageSampler); }
    public MemorySegment _pCombinedImageSampler() { return _pCombinedImageSamplerAt(0L); }
    public VkDescriptorDataEXT _pCombinedImageSamplerAt(long index, MemorySegment src) { _pCombinedImageSamplerAt(index).copyFrom(src); return this; }
    public VkDescriptorDataEXT _pCombinedImageSampler(MemorySegment src) { return _pCombinedImageSamplerAt(0L, src); }
    public MemorySegment _pInputAttachmentImageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pInputAttachmentImage, index), LAYOUT_pInputAttachmentImage); }
    public MemorySegment _pInputAttachmentImage() { return _pInputAttachmentImageAt(0L); }
    public VkDescriptorDataEXT _pInputAttachmentImageAt(long index, MemorySegment src) { _pInputAttachmentImageAt(index).copyFrom(src); return this; }
    public VkDescriptorDataEXT _pInputAttachmentImage(MemorySegment src) { return _pInputAttachmentImageAt(0L, src); }
    public MemorySegment _pSampledImageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSampledImage, index), LAYOUT_pSampledImage); }
    public MemorySegment _pSampledImage() { return _pSampledImageAt(0L); }
    public VkDescriptorDataEXT _pSampledImageAt(long index, MemorySegment src) { _pSampledImageAt(index).copyFrom(src); return this; }
    public VkDescriptorDataEXT _pSampledImage(MemorySegment src) { return _pSampledImageAt(0L, src); }
    public MemorySegment _pStorageImageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStorageImage, index), LAYOUT_pStorageImage); }
    public MemorySegment _pStorageImage() { return _pStorageImageAt(0L); }
    public VkDescriptorDataEXT _pStorageImageAt(long index, MemorySegment src) { _pStorageImageAt(index).copyFrom(src); return this; }
    public VkDescriptorDataEXT _pStorageImage(MemorySegment src) { return _pStorageImageAt(0L, src); }
    public MemorySegment _pUniformTexelBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pUniformTexelBuffer, index), LAYOUT_pUniformTexelBuffer); }
    public MemorySegment _pUniformTexelBuffer() { return _pUniformTexelBufferAt(0L); }
    public VkDescriptorDataEXT _pUniformTexelBufferAt(long index, MemorySegment src) { _pUniformTexelBufferAt(index).copyFrom(src); return this; }
    public VkDescriptorDataEXT _pUniformTexelBuffer(MemorySegment src) { return _pUniformTexelBufferAt(0L, src); }
    public MemorySegment _pStorageTexelBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStorageTexelBuffer, index), LAYOUT_pStorageTexelBuffer); }
    public MemorySegment _pStorageTexelBuffer() { return _pStorageTexelBufferAt(0L); }
    public VkDescriptorDataEXT _pStorageTexelBufferAt(long index, MemorySegment src) { _pStorageTexelBufferAt(index).copyFrom(src); return this; }
    public VkDescriptorDataEXT _pStorageTexelBuffer(MemorySegment src) { return _pStorageTexelBufferAt(0L, src); }
    public MemorySegment _pUniformBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pUniformBuffer, index), LAYOUT_pUniformBuffer); }
    public MemorySegment _pUniformBuffer() { return _pUniformBufferAt(0L); }
    public VkDescriptorDataEXT _pUniformBufferAt(long index, MemorySegment src) { _pUniformBufferAt(index).copyFrom(src); return this; }
    public VkDescriptorDataEXT _pUniformBuffer(MemorySegment src) { return _pUniformBufferAt(0L, src); }
    public MemorySegment _pStorageBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStorageBuffer, index), LAYOUT_pStorageBuffer); }
    public MemorySegment _pStorageBuffer() { return _pStorageBufferAt(0L); }
    public VkDescriptorDataEXT _pStorageBufferAt(long index, MemorySegment src) { _pStorageBufferAt(index).copyFrom(src); return this; }
    public VkDescriptorDataEXT _pStorageBuffer(MemorySegment src) { return _pStorageBufferAt(0L, src); }
    public MemorySegment _accelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructure, index), LAYOUT_accelerationStructure); }
    public MemorySegment _accelerationStructure() { return _accelerationStructureAt(0L); }
    public VkDescriptorDataEXT _accelerationStructureAt(long index, MemorySegment src) { _accelerationStructureAt(index).copyFrom(src); return this; }
    public VkDescriptorDataEXT _accelerationStructure(MemorySegment src) { return _accelerationStructureAt(0L, src); }
}

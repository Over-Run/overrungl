// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorGetInfoEXT`.
/// ## Layout
/// ```
/// struct VkDescriptorGetInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorType type;
///     VkDescriptorDataEXT data;
/// }
/// ```
public final class VkDescriptorGetInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        overrungl.vulkan.ext.union.VkDescriptorDataEXT.LAYOUT.withName("data")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_data = LAYOUT.select(PathElement.groupElement("data"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_data$pSampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("pSampler"));
    public static final VarHandle VH_data$pCombinedImageSampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("pCombinedImageSampler"));
    public static final VarHandle VH_data$pInputAttachmentImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("pInputAttachmentImage"));
    public static final VarHandle VH_data$pSampledImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("pSampledImage"));
    public static final VarHandle VH_data$pStorageImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("pStorageImage"));
    public static final VarHandle VH_data$pUniformTexelBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("pUniformTexelBuffer"));
    public static final VarHandle VH_data$pStorageTexelBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("pStorageTexelBuffer"));
    public static final VarHandle VH_data$pUniformBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("pUniformBuffer"));
    public static final VarHandle VH_data$pStorageBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("pStorageBuffer"));
    public static final VarHandle VH_data$accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("accelerationStructure"));

    public VkDescriptorGetInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorGetInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorGetInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorGetInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorGetInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorGetInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorGetInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorGetInfoEXT alloc(SegmentAllocator allocator) { return new VkDescriptorGetInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorGetInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDescriptorGetInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDescriptorGetInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT); }
    public static VkDescriptorGetInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT);
        return s;
    }
    public VkDescriptorGetInfoEXT copyFrom(VkDescriptorGetInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorGetInfoEXT reinterpret(long count) { return new VkDescriptorGetInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorGetInfoEXT asSlice(long index) { return new VkDescriptorGetInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorGetInfoEXT asSlice(long index, long count) { return new VkDescriptorGetInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorGetInfoEXT at(long index, Consumer<VkDescriptorGetInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public MemorySegment data$pSamplerAt(long index) { return (MemorySegment) VH_data$pSampler.get(this.segment(), 0L, index); }
    public MemorySegment data$pCombinedImageSamplerAt(long index) { return (MemorySegment) VH_data$pCombinedImageSampler.get(this.segment(), 0L, index); }
    public MemorySegment data$pInputAttachmentImageAt(long index) { return (MemorySegment) VH_data$pInputAttachmentImage.get(this.segment(), 0L, index); }
    public MemorySegment data$pSampledImageAt(long index) { return (MemorySegment) VH_data$pSampledImage.get(this.segment(), 0L, index); }
    public MemorySegment data$pStorageImageAt(long index) { return (MemorySegment) VH_data$pStorageImage.get(this.segment(), 0L, index); }
    public MemorySegment data$pUniformTexelBufferAt(long index) { return (MemorySegment) VH_data$pUniformTexelBuffer.get(this.segment(), 0L, index); }
    public MemorySegment data$pStorageTexelBufferAt(long index) { return (MemorySegment) VH_data$pStorageTexelBuffer.get(this.segment(), 0L, index); }
    public MemorySegment data$pUniformBufferAt(long index) { return (MemorySegment) VH_data$pUniformBuffer.get(this.segment(), 0L, index); }
    public MemorySegment data$pStorageBufferAt(long index) { return (MemorySegment) VH_data$pStorageBuffer.get(this.segment(), 0L, index); }
    public long data$accelerationStructureAt(long index) { return (long) VH_data$accelerationStructure.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public MemorySegment data$pSampler() { return (MemorySegment) VH_data$pSampler.get(this.segment(), 0L, 0L); }
    public MemorySegment data$pCombinedImageSampler() { return (MemorySegment) VH_data$pCombinedImageSampler.get(this.segment(), 0L, 0L); }
    public MemorySegment data$pInputAttachmentImage() { return (MemorySegment) VH_data$pInputAttachmentImage.get(this.segment(), 0L, 0L); }
    public MemorySegment data$pSampledImage() { return (MemorySegment) VH_data$pSampledImage.get(this.segment(), 0L, 0L); }
    public MemorySegment data$pStorageImage() { return (MemorySegment) VH_data$pStorageImage.get(this.segment(), 0L, 0L); }
    public MemorySegment data$pUniformTexelBuffer() { return (MemorySegment) VH_data$pUniformTexelBuffer.get(this.segment(), 0L, 0L); }
    public MemorySegment data$pStorageTexelBuffer() { return (MemorySegment) VH_data$pStorageTexelBuffer.get(this.segment(), 0L, 0L); }
    public MemorySegment data$pUniformBuffer() { return (MemorySegment) VH_data$pUniformBuffer.get(this.segment(), 0L, 0L); }
    public MemorySegment data$pStorageBuffer() { return (MemorySegment) VH_data$pStorageBuffer.get(this.segment(), 0L, 0L); }
    public long data$accelerationStructure() { return (long) VH_data$accelerationStructure.get(this.segment(), 0L, 0L); }
    public VkDescriptorGetInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorGetInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorGetInfoEXT typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorGetInfoEXT data$pSamplerAt(long index, MemorySegment value) { VH_data$pSampler.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorGetInfoEXT data$pCombinedImageSamplerAt(long index, MemorySegment value) { VH_data$pCombinedImageSampler.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorGetInfoEXT data$pInputAttachmentImageAt(long index, MemorySegment value) { VH_data$pInputAttachmentImage.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorGetInfoEXT data$pSampledImageAt(long index, MemorySegment value) { VH_data$pSampledImage.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorGetInfoEXT data$pStorageImageAt(long index, MemorySegment value) { VH_data$pStorageImage.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorGetInfoEXT data$pUniformTexelBufferAt(long index, MemorySegment value) { VH_data$pUniformTexelBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorGetInfoEXT data$pStorageTexelBufferAt(long index, MemorySegment value) { VH_data$pStorageTexelBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorGetInfoEXT data$pUniformBufferAt(long index, MemorySegment value) { VH_data$pUniformBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorGetInfoEXT data$pStorageBufferAt(long index, MemorySegment value) { VH_data$pStorageBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorGetInfoEXT data$accelerationStructureAt(long index, long value) { VH_data$accelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorGetInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorGetInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorGetInfoEXT type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorGetInfoEXT data$pSampler(MemorySegment value) { VH_data$pSampler.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorGetInfoEXT data$pCombinedImageSampler(MemorySegment value) { VH_data$pCombinedImageSampler.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorGetInfoEXT data$pInputAttachmentImage(MemorySegment value) { VH_data$pInputAttachmentImage.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorGetInfoEXT data$pSampledImage(MemorySegment value) { VH_data$pSampledImage.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorGetInfoEXT data$pStorageImage(MemorySegment value) { VH_data$pStorageImage.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorGetInfoEXT data$pUniformTexelBuffer(MemorySegment value) { VH_data$pUniformTexelBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorGetInfoEXT data$pStorageTexelBuffer(MemorySegment value) { VH_data$pStorageTexelBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorGetInfoEXT data$pUniformBuffer(MemorySegment value) { VH_data$pUniformBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorGetInfoEXT data$pStorageBuffer(MemorySegment value) { VH_data$pStorageBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorGetInfoEXT data$accelerationStructure(long value) { VH_data$accelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDescriptorGetInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorGetInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDescriptorGetInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDescriptorGetInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkDescriptorGetInfoEXT _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkDescriptorGetInfoEXT _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _dataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_data, index), LAYOUT_data); }
    public MemorySegment _data() { return _dataAt(0L); }
    public VkDescriptorGetInfoEXT _dataAt(long index, MemorySegment src) { _dataAt(index).copyFrom(src); return this; }
    public VkDescriptorGetInfoEXT _data(MemorySegment src) { return _dataAt(0L, src); }
}

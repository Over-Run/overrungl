// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSamplerYcbcrConversionImageFormatPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkSamplerYcbcrConversionImageFormatPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t combinedImageSamplerDescriptorCount;
/// }
/// ```
public final class VkSamplerYcbcrConversionImageFormatPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("combinedImageSamplerDescriptorCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_combinedImageSamplerDescriptorCount = LAYOUT.byteOffset(PathElement.groupElement("combinedImageSamplerDescriptorCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_combinedImageSamplerDescriptorCount = LAYOUT.select(PathElement.groupElement("combinedImageSamplerDescriptorCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_combinedImageSamplerDescriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinedImageSamplerDescriptorCount"));

    public VkSamplerYcbcrConversionImageFormatPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionImageFormatPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionImageFormatPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionImageFormatPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR alloc(SegmentAllocator allocator) { return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES); }
    public static VkSamplerYcbcrConversionImageFormatPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES);
        return s;
    }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR copyFrom(VkSamplerYcbcrConversionImageFormatPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR reinterpret(long count) { return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR asSlice(long index) { return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR asSlice(long index, long count) { return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR at(long index, Consumer<VkSamplerYcbcrConversionImageFormatPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int combinedImageSamplerDescriptorCountAt(long index) { return (int) VH_combinedImageSamplerDescriptorCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int combinedImageSamplerDescriptorCount() { return (int) VH_combinedImageSamplerDescriptorCount.get(this.segment(), 0L, 0L); }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR combinedImageSamplerDescriptorCountAt(long index, int value) { VH_combinedImageSamplerDescriptorCount.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR combinedImageSamplerDescriptorCount(int value) { VH_combinedImageSamplerDescriptorCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _combinedImageSamplerDescriptorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_combinedImageSamplerDescriptorCount, index), LAYOUT_combinedImageSamplerDescriptorCount); }
    public MemorySegment _combinedImageSamplerDescriptorCount() { return _combinedImageSamplerDescriptorCountAt(0L); }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR _combinedImageSamplerDescriptorCountAt(long index, MemorySegment src) { _combinedImageSamplerDescriptorCountAt(index).copyFrom(src); return this; }
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR _combinedImageSamplerDescriptorCount(MemorySegment src) { return _combinedImageSamplerDescriptorCountAt(0L, src); }
}

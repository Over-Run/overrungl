// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 samplerYcbcrConversion;
/// }
/// ```
public final class VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("samplerYcbcrConversion")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_samplerYcbcrConversion = LAYOUT.byteOffset(PathElement.groupElement("samplerYcbcrConversion"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_samplerYcbcrConversion = LAYOUT.select(PathElement.groupElement("samplerYcbcrConversion"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_samplerYcbcrConversion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversion"));

    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES); }
    public static VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES);
        return s;
    }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR copyFrom(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR at(long index, Consumer<VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int samplerYcbcrConversionAt(long index) { return (int) VH_samplerYcbcrConversion.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversion() { return (int) VH_samplerYcbcrConversion.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR samplerYcbcrConversionAt(long index, int value) { VH_samplerYcbcrConversion.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR samplerYcbcrConversion(int value) { VH_samplerYcbcrConversion.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _samplerYcbcrConversionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samplerYcbcrConversion, index), LAYOUT_samplerYcbcrConversion); }
    public MemorySegment _samplerYcbcrConversion() { return _samplerYcbcrConversionAt(0L); }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR _samplerYcbcrConversionAt(long index, MemorySegment src) { _samplerYcbcrConversionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR _samplerYcbcrConversion(MemorySegment src) { return _samplerYcbcrConversionAt(0L, src); }
}

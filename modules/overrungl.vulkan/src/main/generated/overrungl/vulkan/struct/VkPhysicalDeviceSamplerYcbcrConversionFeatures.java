// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSamplerYcbcrConversionFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSamplerYcbcrConversionFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 samplerYcbcrConversion;
/// }
/// ```
public final class VkPhysicalDeviceSamplerYcbcrConversionFeatures extends GroupType {
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

    public VkPhysicalDeviceSamplerYcbcrConversionFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerYcbcrConversionFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerYcbcrConversionFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSamplerYcbcrConversionFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES); }
    public static VkPhysicalDeviceSamplerYcbcrConversionFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES);
        return s;
    }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures copyFrom(VkPhysicalDeviceSamplerYcbcrConversionFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures reinterpret(long count) { return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures asSlice(long index) { return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures asSlice(long index, long count) { return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures at(long index, Consumer<VkPhysicalDeviceSamplerYcbcrConversionFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int samplerYcbcrConversionAt(long index) { return (int) VH_samplerYcbcrConversion.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int samplerYcbcrConversion() { return (int) VH_samplerYcbcrConversion.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures samplerYcbcrConversionAt(long index, int value) { VH_samplerYcbcrConversion.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures samplerYcbcrConversion(int value) { VH_samplerYcbcrConversion.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _samplerYcbcrConversionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samplerYcbcrConversion, index), LAYOUT_samplerYcbcrConversion); }
    public MemorySegment _samplerYcbcrConversion() { return _samplerYcbcrConversionAt(0L); }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures _samplerYcbcrConversionAt(long index, MemorySegment src) { _samplerYcbcrConversionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures _samplerYcbcrConversion(MemorySegment src) { return _samplerYcbcrConversionAt(0L, src); }
}

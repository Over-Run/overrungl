// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShadingRateImageFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShadingRateImageFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shadingRateImage;
///     VkBool32 shadingRateCoarseSampleOrder;
/// }
/// ```
public final class VkPhysicalDeviceShadingRateImageFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateImage"),
        ValueLayout.JAVA_INT.withName("shadingRateCoarseSampleOrder")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shadingRateImage = LAYOUT.byteOffset(PathElement.groupElement("shadingRateImage"));
    public static final long OFFSET_shadingRateCoarseSampleOrder = LAYOUT.byteOffset(PathElement.groupElement("shadingRateCoarseSampleOrder"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shadingRateImage = LAYOUT.select(PathElement.groupElement("shadingRateImage"));
    public static final MemoryLayout LAYOUT_shadingRateCoarseSampleOrder = LAYOUT.select(PathElement.groupElement("shadingRateCoarseSampleOrder"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shadingRateImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateImage"));
    public static final VarHandle VH_shadingRateCoarseSampleOrder = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateCoarseSampleOrder"));

    public VkPhysicalDeviceShadingRateImageFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShadingRateImageFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImageFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShadingRateImageFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImageFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShadingRateImageFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImageFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShadingRateImageFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShadingRateImageFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShadingRateImageFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVShadingRateImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV); }
    public static VkPhysicalDeviceShadingRateImageFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVShadingRateImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceShadingRateImageFeaturesNV copyFrom(VkPhysicalDeviceShadingRateImageFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShadingRateImageFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShadingRateImageFeaturesNV asSlice(long index) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShadingRateImageFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShadingRateImageFeaturesNV at(long index, Consumer<VkPhysicalDeviceShadingRateImageFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shadingRateImageAt(long index) { return (int) VH_shadingRateImage.get(this.segment(), 0L, index); }
    public int shadingRateCoarseSampleOrderAt(long index) { return (int) VH_shadingRateCoarseSampleOrder.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shadingRateImage() { return (int) VH_shadingRateImage.get(this.segment(), 0L, 0L); }
    public int shadingRateCoarseSampleOrder() { return (int) VH_shadingRateCoarseSampleOrder.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShadingRateImageFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShadingRateImageFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateImageAt(long index, int value) { VH_shadingRateImage.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateCoarseSampleOrderAt(long index, int value) { VH_shadingRateCoarseSampleOrder.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShadingRateImageFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShadingRateImageFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateImage(int value) { VH_shadingRateImage.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateCoarseSampleOrder(int value) { VH_shadingRateCoarseSampleOrder.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShadingRateImageFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShadingRateImageFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShadingRateImageFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShadingRateImageFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shadingRateImageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shadingRateImage, index), LAYOUT_shadingRateImage); }
    public MemorySegment _shadingRateImage() { return _shadingRateImageAt(0L); }
    public VkPhysicalDeviceShadingRateImageFeaturesNV _shadingRateImageAt(long index, MemorySegment src) { _shadingRateImageAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShadingRateImageFeaturesNV _shadingRateImage(MemorySegment src) { return _shadingRateImageAt(0L, src); }
    public MemorySegment _shadingRateCoarseSampleOrderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shadingRateCoarseSampleOrder, index), LAYOUT_shadingRateCoarseSampleOrder); }
    public MemorySegment _shadingRateCoarseSampleOrder() { return _shadingRateCoarseSampleOrderAt(0L); }
    public VkPhysicalDeviceShadingRateImageFeaturesNV _shadingRateCoarseSampleOrderAt(long index, MemorySegment src) { _shadingRateCoarseSampleOrderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShadingRateImageFeaturesNV _shadingRateCoarseSampleOrder(MemorySegment src) { return _shadingRateCoarseSampleOrderAt(0L, src); }
}

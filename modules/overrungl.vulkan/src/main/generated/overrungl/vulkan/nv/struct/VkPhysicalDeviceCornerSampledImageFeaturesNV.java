// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCornerSampledImageFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCornerSampledImageFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 cornerSampledImage;
/// }
/// ```
public final class VkPhysicalDeviceCornerSampledImageFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cornerSampledImage")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_cornerSampledImage = LAYOUT.byteOffset(PathElement.groupElement("cornerSampledImage"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_cornerSampledImage = LAYOUT.select(PathElement.groupElement("cornerSampledImage"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_cornerSampledImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cornerSampledImage"));

    public VkPhysicalDeviceCornerSampledImageFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCornerSampledImageFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCornerSampledImageFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCornerSampledImageFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCornerSampledImageFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCornerSampledImageFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCornerSampledImageFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCornerSampledImageFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCornerSampledImageFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCornerSampledImageFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCornerSampledImageFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCornerSampledImageFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCornerSampledImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CORNER_SAMPLED_IMAGE_FEATURES_NV); }
    public static VkPhysicalDeviceCornerSampledImageFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCornerSampledImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CORNER_SAMPLED_IMAGE_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV copyFrom(VkPhysicalDeviceCornerSampledImageFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceCornerSampledImageFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV asSlice(long index) { return new VkPhysicalDeviceCornerSampledImageFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceCornerSampledImageFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV at(long index, Consumer<VkPhysicalDeviceCornerSampledImageFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int cornerSampledImageAt(long index) { return (int) VH_cornerSampledImage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int cornerSampledImage() { return (int) VH_cornerSampledImage.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV cornerSampledImageAt(long index, int value) { VH_cornerSampledImage.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV cornerSampledImage(int value) { VH_cornerSampledImage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _cornerSampledImageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cornerSampledImage, index), LAYOUT_cornerSampledImage); }
    public MemorySegment _cornerSampledImage() { return _cornerSampledImageAt(0L); }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV _cornerSampledImageAt(long index, MemorySegment src) { _cornerSampledImageAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCornerSampledImageFeaturesNV _cornerSampledImage(MemorySegment src) { return _cornerSampledImageAt(0L, src); }
}

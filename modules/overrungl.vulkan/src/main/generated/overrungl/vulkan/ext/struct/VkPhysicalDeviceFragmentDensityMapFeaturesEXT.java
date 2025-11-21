// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentDensityMapFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 fragmentDensityMap;
///     VkBool32 fragmentDensityMapDynamic;
///     VkBool32 fragmentDensityMapNonSubsampledImages;
/// }
/// ```
public final class VkPhysicalDeviceFragmentDensityMapFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMap"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapDynamic"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapNonSubsampledImages")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fragmentDensityMap = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMap"));
    public static final long OFFSET_fragmentDensityMapDynamic = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapDynamic"));
    public static final long OFFSET_fragmentDensityMapNonSubsampledImages = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapNonSubsampledImages"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fragmentDensityMap = LAYOUT.select(PathElement.groupElement("fragmentDensityMap"));
    public static final MemoryLayout LAYOUT_fragmentDensityMapDynamic = LAYOUT.select(PathElement.groupElement("fragmentDensityMapDynamic"));
    public static final MemoryLayout LAYOUT_fragmentDensityMapNonSubsampledImages = LAYOUT.select(PathElement.groupElement("fragmentDensityMapNonSubsampledImages"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fragmentDensityMap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMap"));
    public static final VarHandle VH_fragmentDensityMapDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapDynamic"));
    public static final VarHandle VH_fragmentDensityMapNonSubsampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapNonSubsampledImages"));

    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFragmentDensityMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT); }
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFragmentDensityMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT copyFrom(VkPhysicalDeviceFragmentDensityMapFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT at(long index, Consumer<VkPhysicalDeviceFragmentDensityMapFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fragmentDensityMapAt(long index) { return (int) VH_fragmentDensityMap.get(this.segment(), 0L, index); }
    public int fragmentDensityMapDynamicAt(long index) { return (int) VH_fragmentDensityMapDynamic.get(this.segment(), 0L, index); }
    public int fragmentDensityMapNonSubsampledImagesAt(long index) { return (int) VH_fragmentDensityMapNonSubsampledImages.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fragmentDensityMap() { return (int) VH_fragmentDensityMap.get(this.segment(), 0L, 0L); }
    public int fragmentDensityMapDynamic() { return (int) VH_fragmentDensityMapDynamic.get(this.segment(), 0L, 0L); }
    public int fragmentDensityMapNonSubsampledImages() { return (int) VH_fragmentDensityMapNonSubsampledImages.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapAt(long index, int value) { VH_fragmentDensityMap.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapDynamicAt(long index, int value) { VH_fragmentDensityMapDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapNonSubsampledImagesAt(long index, int value) { VH_fragmentDensityMapNonSubsampledImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMap(int value) { VH_fragmentDensityMap.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapDynamic(int value) { VH_fragmentDensityMapDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapNonSubsampledImages(int value) { VH_fragmentDensityMapNonSubsampledImages.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fragmentDensityMapAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentDensityMap, index), LAYOUT_fragmentDensityMap); }
    public MemorySegment _fragmentDensityMap() { return _fragmentDensityMapAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT _fragmentDensityMapAt(long index, MemorySegment src) { _fragmentDensityMapAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT _fragmentDensityMap(MemorySegment src) { return _fragmentDensityMapAt(0L, src); }
    public MemorySegment _fragmentDensityMapDynamicAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentDensityMapDynamic, index), LAYOUT_fragmentDensityMapDynamic); }
    public MemorySegment _fragmentDensityMapDynamic() { return _fragmentDensityMapDynamicAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT _fragmentDensityMapDynamicAt(long index, MemorySegment src) { _fragmentDensityMapDynamicAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT _fragmentDensityMapDynamic(MemorySegment src) { return _fragmentDensityMapDynamicAt(0L, src); }
    public MemorySegment _fragmentDensityMapNonSubsampledImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentDensityMapNonSubsampledImages, index), LAYOUT_fragmentDensityMapNonSubsampledImages); }
    public MemorySegment _fragmentDensityMapNonSubsampledImages() { return _fragmentDensityMapNonSubsampledImagesAt(0L); }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT _fragmentDensityMapNonSubsampledImagesAt(long index, MemorySegment src) { _fragmentDensityMapNonSubsampledImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT _fragmentDensityMapNonSubsampledImages(MemorySegment src) { return _fragmentDensityMapNonSubsampledImagesAt(0L, src); }
}

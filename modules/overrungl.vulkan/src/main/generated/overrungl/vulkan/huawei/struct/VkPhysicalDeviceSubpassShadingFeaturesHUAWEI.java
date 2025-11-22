// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.huawei.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSubpassShadingFeaturesHUAWEI`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSubpassShadingFeaturesHUAWEI {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 subpassShading;
/// }
/// ```
public final class VkPhysicalDeviceSubpassShadingFeaturesHUAWEI extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subpassShading")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_subpassShading = LAYOUT.byteOffset(PathElement.groupElement("subpassShading"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_subpassShading = LAYOUT.select(PathElement.groupElement("subpassShading"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_subpassShading = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassShading"));

    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.huawei.VKHUAWEISubpassShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI); }
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.huawei.VKHUAWEISubpassShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI);
        return s;
    }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI copyFrom(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI reinterpret(long count) { return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI asSlice(long index) { return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI asSlice(long index, long count) { return new VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI at(long index, Consumer<VkPhysicalDeviceSubpassShadingFeaturesHUAWEI> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int subpassShadingAt(long index) { return (int) VH_subpassShading.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int subpassShading() { return (int) VH_subpassShading.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI subpassShadingAt(long index, int value) { VH_subpassShading.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI subpassShading(int value) { VH_subpassShading.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _subpassShadingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subpassShading, index), LAYOUT_subpassShading); }
    public MemorySegment _subpassShading() { return _subpassShadingAt(0L); }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI _subpassShadingAt(long index, MemorySegment src) { _subpassShadingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI _subpassShading(MemorySegment src) { return _subpassShadingAt(0L, src); }
}

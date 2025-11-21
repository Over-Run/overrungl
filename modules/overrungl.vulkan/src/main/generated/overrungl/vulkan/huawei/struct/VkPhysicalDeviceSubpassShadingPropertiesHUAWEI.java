// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.huawei.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSubpassShadingPropertiesHUAWEI`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSubpassShadingPropertiesHUAWEI {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxSubpassShadingWorkgroupSizeAspectRatio;
/// }
/// ```
public final class VkPhysicalDeviceSubpassShadingPropertiesHUAWEI extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxSubpassShadingWorkgroupSizeAspectRatio")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxSubpassShadingWorkgroupSizeAspectRatio = LAYOUT.byteOffset(PathElement.groupElement("maxSubpassShadingWorkgroupSizeAspectRatio"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxSubpassShadingWorkgroupSizeAspectRatio = LAYOUT.select(PathElement.groupElement("maxSubpassShadingWorkgroupSizeAspectRatio"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxSubpassShadingWorkgroupSizeAspectRatio = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubpassShadingWorkgroupSizeAspectRatio"));

    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubpassShadingPropertiesHUAWEI(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubpassShadingPropertiesHUAWEI(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubpassShadingPropertiesHUAWEI(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSubpassShadingPropertiesHUAWEI(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSubpassShadingPropertiesHUAWEI(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.huawei.VKHUAWEISubpassShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI); }
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.huawei.VKHUAWEISubpassShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI);
        return s;
    }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI copyFrom(VkPhysicalDeviceSubpassShadingPropertiesHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI reinterpret(long count) { return new VkPhysicalDeviceSubpassShadingPropertiesHUAWEI(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI asSlice(long index) { return new VkPhysicalDeviceSubpassShadingPropertiesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI asSlice(long index, long count) { return new VkPhysicalDeviceSubpassShadingPropertiesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI at(long index, Consumer<VkPhysicalDeviceSubpassShadingPropertiesHUAWEI> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxSubpassShadingWorkgroupSizeAspectRatioAt(long index) { return (int) VH_maxSubpassShadingWorkgroupSizeAspectRatio.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxSubpassShadingWorkgroupSizeAspectRatio() { return (int) VH_maxSubpassShadingWorkgroupSizeAspectRatio.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI maxSubpassShadingWorkgroupSizeAspectRatioAt(long index, int value) { VH_maxSubpassShadingWorkgroupSizeAspectRatio.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI maxSubpassShadingWorkgroupSizeAspectRatio(int value) { VH_maxSubpassShadingWorkgroupSizeAspectRatio.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxSubpassShadingWorkgroupSizeAspectRatioAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSubpassShadingWorkgroupSizeAspectRatio, index), LAYOUT_maxSubpassShadingWorkgroupSizeAspectRatio); }
    public MemorySegment _maxSubpassShadingWorkgroupSizeAspectRatio() { return _maxSubpassShadingWorkgroupSizeAspectRatioAt(0L); }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI _maxSubpassShadingWorkgroupSizeAspectRatioAt(long index, MemorySegment src) { _maxSubpassShadingWorkgroupSizeAspectRatioAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI _maxSubpassShadingWorkgroupSizeAspectRatio(MemorySegment src) { return _maxSubpassShadingWorkgroupSizeAspectRatioAt(0L, src); }
}

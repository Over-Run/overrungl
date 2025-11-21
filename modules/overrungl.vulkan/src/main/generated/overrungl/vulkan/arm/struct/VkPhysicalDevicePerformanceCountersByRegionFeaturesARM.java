// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePerformanceCountersByRegionFeaturesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePerformanceCountersByRegionFeaturesARM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 performanceCountersByRegion;
/// }
/// ```
public final class VkPhysicalDevicePerformanceCountersByRegionFeaturesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("performanceCountersByRegion")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_performanceCountersByRegion = LAYOUT.byteOffset(PathElement.groupElement("performanceCountersByRegion"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_performanceCountersByRegion = LAYOUT.select(PathElement.groupElement("performanceCountersByRegion"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_performanceCountersByRegion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("performanceCountersByRegion"));

    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM); }
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM);
        return s;
    }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM copyFrom(VkPhysicalDevicePerformanceCountersByRegionFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM reinterpret(long count) { return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM asSlice(long index) { return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM asSlice(long index, long count) { return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM at(long index, Consumer<VkPhysicalDevicePerformanceCountersByRegionFeaturesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int performanceCountersByRegionAt(long index) { return (int) VH_performanceCountersByRegion.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int performanceCountersByRegion() { return (int) VH_performanceCountersByRegion.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM performanceCountersByRegionAt(long index, int value) { VH_performanceCountersByRegion.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM performanceCountersByRegion(int value) { VH_performanceCountersByRegion.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _performanceCountersByRegionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_performanceCountersByRegion, index), LAYOUT_performanceCountersByRegion); }
    public MemorySegment _performanceCountersByRegion() { return _performanceCountersByRegionAt(0L); }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM _performanceCountersByRegionAt(long index, MemorySegment src) { _performanceCountersByRegionAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM _performanceCountersByRegion(MemorySegment src) { return _performanceCountersByRegionAt(0L, src); }
}

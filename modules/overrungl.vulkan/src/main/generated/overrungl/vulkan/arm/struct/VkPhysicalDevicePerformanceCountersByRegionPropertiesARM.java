// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePerformanceCountersByRegionPropertiesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePerformanceCountersByRegionPropertiesARM {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxPerRegionPerformanceCounters;
///     VkExtent2D performanceCounterRegionSize;
///     uint32_t rowStrideAlignment;
///     uint32_t regionAlignment;
///     VkBool32 identityTransformOrder;
/// }
/// ```
public final class VkPhysicalDevicePerformanceCountersByRegionPropertiesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxPerRegionPerformanceCounters"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("performanceCounterRegionSize"),
        ValueLayout.JAVA_INT.withName("rowStrideAlignment"),
        ValueLayout.JAVA_INT.withName("regionAlignment"),
        ValueLayout.JAVA_INT.withName("identityTransformOrder")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxPerRegionPerformanceCounters = LAYOUT.byteOffset(PathElement.groupElement("maxPerRegionPerformanceCounters"));
    public static final long OFFSET_performanceCounterRegionSize = LAYOUT.byteOffset(PathElement.groupElement("performanceCounterRegionSize"));
    public static final long OFFSET_rowStrideAlignment = LAYOUT.byteOffset(PathElement.groupElement("rowStrideAlignment"));
    public static final long OFFSET_regionAlignment = LAYOUT.byteOffset(PathElement.groupElement("regionAlignment"));
    public static final long OFFSET_identityTransformOrder = LAYOUT.byteOffset(PathElement.groupElement("identityTransformOrder"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxPerRegionPerformanceCounters = LAYOUT.select(PathElement.groupElement("maxPerRegionPerformanceCounters"));
    public static final MemoryLayout LAYOUT_performanceCounterRegionSize = LAYOUT.select(PathElement.groupElement("performanceCounterRegionSize"));
    public static final MemoryLayout LAYOUT_rowStrideAlignment = LAYOUT.select(PathElement.groupElement("rowStrideAlignment"));
    public static final MemoryLayout LAYOUT_regionAlignment = LAYOUT.select(PathElement.groupElement("regionAlignment"));
    public static final MemoryLayout LAYOUT_identityTransformOrder = LAYOUT.select(PathElement.groupElement("identityTransformOrder"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxPerRegionPerformanceCounters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerRegionPerformanceCounters"));
    public static final VarHandle VH_performanceCounterRegionSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("performanceCounterRegionSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_performanceCounterRegionSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("performanceCounterRegionSize"), PathElement.groupElement("height"));
    public static final VarHandle VH_rowStrideAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rowStrideAlignment"));
    public static final VarHandle VH_regionAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionAlignment"));
    public static final VarHandle VH_identityTransformOrder = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identityTransformOrder"));

    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePerformanceCountersByRegionPropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePerformanceCountersByRegionPropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePerformanceCountersByRegionPropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePerformanceCountersByRegionPropertiesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePerformanceCountersByRegionPropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePerformanceCountersByRegionPropertiesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_PROPERTIES_ARM); }
    public static VkPhysicalDevicePerformanceCountersByRegionPropertiesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_PROPERTIES_ARM);
        return s;
    }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM copyFrom(VkPhysicalDevicePerformanceCountersByRegionPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM reinterpret(long count) { return new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM asSlice(long index) { return new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM asSlice(long index, long count) { return new VkPhysicalDevicePerformanceCountersByRegionPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM at(long index, Consumer<VkPhysicalDevicePerformanceCountersByRegionPropertiesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxPerRegionPerformanceCountersAt(long index) { return (int) VH_maxPerRegionPerformanceCounters.get(this.segment(), 0L, index); }
    public int performanceCounterRegionSize$widthAt(long index) { return (int) VH_performanceCounterRegionSize$width.get(this.segment(), 0L, index); }
    public int performanceCounterRegionSize$heightAt(long index) { return (int) VH_performanceCounterRegionSize$height.get(this.segment(), 0L, index); }
    public int rowStrideAlignmentAt(long index) { return (int) VH_rowStrideAlignment.get(this.segment(), 0L, index); }
    public int regionAlignmentAt(long index) { return (int) VH_regionAlignment.get(this.segment(), 0L, index); }
    public int identityTransformOrderAt(long index) { return (int) VH_identityTransformOrder.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxPerRegionPerformanceCounters() { return (int) VH_maxPerRegionPerformanceCounters.get(this.segment(), 0L, 0L); }
    public int performanceCounterRegionSize$width() { return (int) VH_performanceCounterRegionSize$width.get(this.segment(), 0L, 0L); }
    public int performanceCounterRegionSize$height() { return (int) VH_performanceCounterRegionSize$height.get(this.segment(), 0L, 0L); }
    public int rowStrideAlignment() { return (int) VH_rowStrideAlignment.get(this.segment(), 0L, 0L); }
    public int regionAlignment() { return (int) VH_regionAlignment.get(this.segment(), 0L, 0L); }
    public int identityTransformOrder() { return (int) VH_identityTransformOrder.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM maxPerRegionPerformanceCountersAt(long index, int value) { VH_maxPerRegionPerformanceCounters.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM performanceCounterRegionSize$widthAt(long index, int value) { VH_performanceCounterRegionSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM performanceCounterRegionSize$heightAt(long index, int value) { VH_performanceCounterRegionSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM rowStrideAlignmentAt(long index, int value) { VH_rowStrideAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM regionAlignmentAt(long index, int value) { VH_regionAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM identityTransformOrderAt(long index, int value) { VH_identityTransformOrder.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM maxPerRegionPerformanceCounters(int value) { VH_maxPerRegionPerformanceCounters.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM performanceCounterRegionSize$width(int value) { VH_performanceCounterRegionSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM performanceCounterRegionSize$height(int value) { VH_performanceCounterRegionSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM rowStrideAlignment(int value) { VH_rowStrideAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM regionAlignment(int value) { VH_regionAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM identityTransformOrder(int value) { VH_identityTransformOrder.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxPerRegionPerformanceCountersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerRegionPerformanceCounters, index), LAYOUT_maxPerRegionPerformanceCounters); }
    public MemorySegment _maxPerRegionPerformanceCounters() { return _maxPerRegionPerformanceCountersAt(0L); }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM _maxPerRegionPerformanceCountersAt(long index, MemorySegment src) { _maxPerRegionPerformanceCountersAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM _maxPerRegionPerformanceCounters(MemorySegment src) { return _maxPerRegionPerformanceCountersAt(0L, src); }
    public MemorySegment _performanceCounterRegionSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_performanceCounterRegionSize, index), LAYOUT_performanceCounterRegionSize); }
    public MemorySegment _performanceCounterRegionSize() { return _performanceCounterRegionSizeAt(0L); }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM _performanceCounterRegionSizeAt(long index, MemorySegment src) { _performanceCounterRegionSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM _performanceCounterRegionSize(MemorySegment src) { return _performanceCounterRegionSizeAt(0L, src); }
    public MemorySegment _rowStrideAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rowStrideAlignment, index), LAYOUT_rowStrideAlignment); }
    public MemorySegment _rowStrideAlignment() { return _rowStrideAlignmentAt(0L); }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM _rowStrideAlignmentAt(long index, MemorySegment src) { _rowStrideAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM _rowStrideAlignment(MemorySegment src) { return _rowStrideAlignmentAt(0L, src); }
    public MemorySegment _regionAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_regionAlignment, index), LAYOUT_regionAlignment); }
    public MemorySegment _regionAlignment() { return _regionAlignmentAt(0L); }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM _regionAlignmentAt(long index, MemorySegment src) { _regionAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM _regionAlignment(MemorySegment src) { return _regionAlignmentAt(0L, src); }
    public MemorySegment _identityTransformOrderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_identityTransformOrder, index), LAYOUT_identityTransformOrder); }
    public MemorySegment _identityTransformOrder() { return _identityTransformOrderAt(0L); }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM _identityTransformOrderAt(long index, MemorySegment src) { _identityTransformOrderAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePerformanceCountersByRegionPropertiesARM _identityTransformOrder(MemorySegment src) { return _identityTransformOrderAt(0L, src); }
}

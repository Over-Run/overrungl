// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassPerformanceCountersByRegionBeginInfoARM`.
/// ## Layout
/// ```
/// struct VkRenderPassPerformanceCountersByRegionBeginInfoARM {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t counterAddressCount;
///     const VkDeviceAddress* pCounterAddresses;
///     VkBool32 serializeRegions;
///     uint32_t counterIndexCount;
///     uint32_t* pCounterIndices;
/// }
/// ```
public final class VkRenderPassPerformanceCountersByRegionBeginInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("counterAddressCount"),
        ValueLayout.ADDRESS.withName("pCounterAddresses"),
        ValueLayout.JAVA_INT.withName("serializeRegions"),
        ValueLayout.JAVA_INT.withName("counterIndexCount"),
        ValueLayout.ADDRESS.withName("pCounterIndices")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_counterAddressCount = LAYOUT.byteOffset(PathElement.groupElement("counterAddressCount"));
    public static final long OFFSET_pCounterAddresses = LAYOUT.byteOffset(PathElement.groupElement("pCounterAddresses"));
    public static final long OFFSET_serializeRegions = LAYOUT.byteOffset(PathElement.groupElement("serializeRegions"));
    public static final long OFFSET_counterIndexCount = LAYOUT.byteOffset(PathElement.groupElement("counterIndexCount"));
    public static final long OFFSET_pCounterIndices = LAYOUT.byteOffset(PathElement.groupElement("pCounterIndices"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_counterAddressCount = LAYOUT.select(PathElement.groupElement("counterAddressCount"));
    public static final MemoryLayout LAYOUT_pCounterAddresses = LAYOUT.select(PathElement.groupElement("pCounterAddresses"));
    public static final MemoryLayout LAYOUT_serializeRegions = LAYOUT.select(PathElement.groupElement("serializeRegions"));
    public static final MemoryLayout LAYOUT_counterIndexCount = LAYOUT.select(PathElement.groupElement("counterIndexCount"));
    public static final MemoryLayout LAYOUT_pCounterIndices = LAYOUT.select(PathElement.groupElement("pCounterIndices"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_counterAddressCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("counterAddressCount"));
    public static final VarHandle VH_pCounterAddresses = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCounterAddresses"));
    public static final VarHandle VH_serializeRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("serializeRegions"));
    public static final VarHandle VH_counterIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("counterIndexCount"));
    public static final VarHandle VH_pCounterIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCounterIndices"));

    public VkRenderPassPerformanceCountersByRegionBeginInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassPerformanceCountersByRegionBeginInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassPerformanceCountersByRegionBeginInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassPerformanceCountersByRegionBeginInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM alloc(SegmentAllocator allocator) { return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM alloc(SegmentAllocator allocator, long count) { return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM); }
    public static VkRenderPassPerformanceCountersByRegionBeginInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_RENDER_PASS_PERFORMANCE_COUNTERS_BY_REGION_BEGIN_INFO_ARM);
        return s;
    }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM copyFrom(VkRenderPassPerformanceCountersByRegionBeginInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM reinterpret(long count) { return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM asSlice(long index) { return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM asSlice(long index, long count) { return new VkRenderPassPerformanceCountersByRegionBeginInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM at(long index, Consumer<VkRenderPassPerformanceCountersByRegionBeginInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int counterAddressCountAt(long index) { return (int) VH_counterAddressCount.get(this.segment(), 0L, index); }
    public MemorySegment pCounterAddressesAt(long index) { return (MemorySegment) VH_pCounterAddresses.get(this.segment(), 0L, index); }
    public int serializeRegionsAt(long index) { return (int) VH_serializeRegions.get(this.segment(), 0L, index); }
    public int counterIndexCountAt(long index) { return (int) VH_counterIndexCount.get(this.segment(), 0L, index); }
    public MemorySegment pCounterIndicesAt(long index) { return (MemorySegment) VH_pCounterIndices.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int counterAddressCount() { return (int) VH_counterAddressCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCounterAddresses() { return (MemorySegment) VH_pCounterAddresses.get(this.segment(), 0L, 0L); }
    public int serializeRegions() { return (int) VH_serializeRegions.get(this.segment(), 0L, 0L); }
    public int counterIndexCount() { return (int) VH_counterIndexCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCounterIndices() { return (MemorySegment) VH_pCounterIndices.get(this.segment(), 0L, 0L); }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM counterAddressCountAt(long index, int value) { VH_counterAddressCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pCounterAddressesAt(long index, MemorySegment value) { VH_pCounterAddresses.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM serializeRegionsAt(long index, int value) { VH_serializeRegions.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM counterIndexCountAt(long index, int value) { VH_counterIndexCount.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pCounterIndicesAt(long index, MemorySegment value) { VH_pCounterIndices.set(this.segment(), 0L, index, value); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM counterAddressCount(int value) { VH_counterAddressCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pCounterAddresses(MemorySegment value) { VH_pCounterAddresses.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM serializeRegions(int value) { VH_serializeRegions.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM counterIndexCount(int value) { VH_counterIndexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM pCounterIndices(MemorySegment value) { VH_pCounterIndices.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _counterAddressCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_counterAddressCount, index), LAYOUT_counterAddressCount); }
    public MemorySegment _counterAddressCount() { return _counterAddressCountAt(0L); }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM _counterAddressCountAt(long index, MemorySegment src) { _counterAddressCountAt(index).copyFrom(src); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM _counterAddressCount(MemorySegment src) { return _counterAddressCountAt(0L, src); }
    public MemorySegment _pCounterAddressesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCounterAddresses, index), LAYOUT_pCounterAddresses); }
    public MemorySegment _pCounterAddresses() { return _pCounterAddressesAt(0L); }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM _pCounterAddressesAt(long index, MemorySegment src) { _pCounterAddressesAt(index).copyFrom(src); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM _pCounterAddresses(MemorySegment src) { return _pCounterAddressesAt(0L, src); }
    public MemorySegment _serializeRegionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_serializeRegions, index), LAYOUT_serializeRegions); }
    public MemorySegment _serializeRegions() { return _serializeRegionsAt(0L); }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM _serializeRegionsAt(long index, MemorySegment src) { _serializeRegionsAt(index).copyFrom(src); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM _serializeRegions(MemorySegment src) { return _serializeRegionsAt(0L, src); }
    public MemorySegment _counterIndexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_counterIndexCount, index), LAYOUT_counterIndexCount); }
    public MemorySegment _counterIndexCount() { return _counterIndexCountAt(0L); }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM _counterIndexCountAt(long index, MemorySegment src) { _counterIndexCountAt(index).copyFrom(src); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM _counterIndexCount(MemorySegment src) { return _counterIndexCountAt(0L, src); }
    public MemorySegment _pCounterIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCounterIndices, index), LAYOUT_pCounterIndices); }
    public MemorySegment _pCounterIndices() { return _pCounterIndicesAt(0L); }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM _pCounterIndicesAt(long index, MemorySegment src) { _pCounterIndicesAt(index).copyFrom(src); return this; }
    public VkRenderPassPerformanceCountersByRegionBeginInfoARM _pCounterIndices(MemorySegment src) { return _pCounterIndicesAt(0L, src); }
}

// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindImageMemoryDeviceGroupInfoKHR`.
/// ## Layout
/// ```
/// struct VkBindImageMemoryDeviceGroupInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t deviceIndexCount;
///     const uint32_t* pDeviceIndices;
///     uint32_t splitInstanceBindRegionCount;
///     const VkRect2D* pSplitInstanceBindRegions;
/// }
/// ```
public final class VkBindImageMemoryDeviceGroupInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceIndexCount"),
        ValueLayout.ADDRESS.withName("pDeviceIndices"),
        ValueLayout.JAVA_INT.withName("splitInstanceBindRegionCount"),
        ValueLayout.ADDRESS.withName("pSplitInstanceBindRegions")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceIndexCount = LAYOUT.byteOffset(PathElement.groupElement("deviceIndexCount"));
    public static final long OFFSET_pDeviceIndices = LAYOUT.byteOffset(PathElement.groupElement("pDeviceIndices"));
    public static final long OFFSET_splitInstanceBindRegionCount = LAYOUT.byteOffset(PathElement.groupElement("splitInstanceBindRegionCount"));
    public static final long OFFSET_pSplitInstanceBindRegions = LAYOUT.byteOffset(PathElement.groupElement("pSplitInstanceBindRegions"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceIndexCount = LAYOUT.select(PathElement.groupElement("deviceIndexCount"));
    public static final MemoryLayout LAYOUT_pDeviceIndices = LAYOUT.select(PathElement.groupElement("pDeviceIndices"));
    public static final MemoryLayout LAYOUT_splitInstanceBindRegionCount = LAYOUT.select(PathElement.groupElement("splitInstanceBindRegionCount"));
    public static final MemoryLayout LAYOUT_pSplitInstanceBindRegions = LAYOUT.select(PathElement.groupElement("pSplitInstanceBindRegions"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceIndexCount"));
    public static final VarHandle VH_pDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceIndices"));
    public static final VarHandle VH_splitInstanceBindRegionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("splitInstanceBindRegionCount"));
    public static final VarHandle VH_pSplitInstanceBindRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSplitInstanceBindRegions"));

    public VkBindImageMemoryDeviceGroupInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBindImageMemoryDeviceGroupInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImageMemoryDeviceGroupInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkBindImageMemoryDeviceGroupInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImageMemoryDeviceGroupInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBindImageMemoryDeviceGroupInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImageMemoryDeviceGroupInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBindImageMemoryDeviceGroupInfoKHR alloc(SegmentAllocator allocator) { return new VkBindImageMemoryDeviceGroupInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkBindImageMemoryDeviceGroupInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkBindImageMemoryDeviceGroupInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkBindImageMemoryDeviceGroupInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO); }
    public static VkBindImageMemoryDeviceGroupInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO);
        return s;
    }
    public VkBindImageMemoryDeviceGroupInfoKHR copyFrom(VkBindImageMemoryDeviceGroupInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR reinterpret(long count) { return new VkBindImageMemoryDeviceGroupInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBindImageMemoryDeviceGroupInfoKHR asSlice(long index) { return new VkBindImageMemoryDeviceGroupInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBindImageMemoryDeviceGroupInfoKHR asSlice(long index, long count) { return new VkBindImageMemoryDeviceGroupInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBindImageMemoryDeviceGroupInfoKHR at(long index, Consumer<VkBindImageMemoryDeviceGroupInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int deviceIndexCountAt(long index) { return (int) VH_deviceIndexCount.get(this.segment(), 0L, index); }
    public MemorySegment pDeviceIndicesAt(long index) { return (MemorySegment) VH_pDeviceIndices.get(this.segment(), 0L, index); }
    public int splitInstanceBindRegionCountAt(long index) { return (int) VH_splitInstanceBindRegionCount.get(this.segment(), 0L, index); }
    public MemorySegment pSplitInstanceBindRegionsAt(long index) { return (MemorySegment) VH_pSplitInstanceBindRegions.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int deviceIndexCount() { return (int) VH_deviceIndexCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDeviceIndices() { return (MemorySegment) VH_pDeviceIndices.get(this.segment(), 0L, 0L); }
    public int splitInstanceBindRegionCount() { return (int) VH_splitInstanceBindRegionCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSplitInstanceBindRegions() { return (MemorySegment) VH_pSplitInstanceBindRegions.get(this.segment(), 0L, 0L); }
    public VkBindImageMemoryDeviceGroupInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR deviceIndexCountAt(long index, int value) { VH_deviceIndexCount.set(this.segment(), 0L, index, value); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR pDeviceIndicesAt(long index, MemorySegment value) { VH_pDeviceIndices.set(this.segment(), 0L, index, value); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR splitInstanceBindRegionCountAt(long index, int value) { VH_splitInstanceBindRegionCount.set(this.segment(), 0L, index, value); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR pSplitInstanceBindRegionsAt(long index, MemorySegment value) { VH_pSplitInstanceBindRegions.set(this.segment(), 0L, index, value); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR deviceIndexCount(int value) { VH_deviceIndexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR pDeviceIndices(MemorySegment value) { VH_pDeviceIndices.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR splitInstanceBindRegionCount(int value) { VH_splitInstanceBindRegionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR pSplitInstanceBindRegions(MemorySegment value) { VH_pSplitInstanceBindRegions.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBindImageMemoryDeviceGroupInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBindImageMemoryDeviceGroupInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceIndexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceIndexCount, index), LAYOUT_deviceIndexCount); }
    public MemorySegment _deviceIndexCount() { return _deviceIndexCountAt(0L); }
    public VkBindImageMemoryDeviceGroupInfoKHR _deviceIndexCountAt(long index, MemorySegment src) { _deviceIndexCountAt(index).copyFrom(src); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR _deviceIndexCount(MemorySegment src) { return _deviceIndexCountAt(0L, src); }
    public MemorySegment _pDeviceIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDeviceIndices, index), LAYOUT_pDeviceIndices); }
    public MemorySegment _pDeviceIndices() { return _pDeviceIndicesAt(0L); }
    public VkBindImageMemoryDeviceGroupInfoKHR _pDeviceIndicesAt(long index, MemorySegment src) { _pDeviceIndicesAt(index).copyFrom(src); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR _pDeviceIndices(MemorySegment src) { return _pDeviceIndicesAt(0L, src); }
    public MemorySegment _splitInstanceBindRegionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_splitInstanceBindRegionCount, index), LAYOUT_splitInstanceBindRegionCount); }
    public MemorySegment _splitInstanceBindRegionCount() { return _splitInstanceBindRegionCountAt(0L); }
    public VkBindImageMemoryDeviceGroupInfoKHR _splitInstanceBindRegionCountAt(long index, MemorySegment src) { _splitInstanceBindRegionCountAt(index).copyFrom(src); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR _splitInstanceBindRegionCount(MemorySegment src) { return _splitInstanceBindRegionCountAt(0L, src); }
    public MemorySegment _pSplitInstanceBindRegionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSplitInstanceBindRegions, index), LAYOUT_pSplitInstanceBindRegions); }
    public MemorySegment _pSplitInstanceBindRegions() { return _pSplitInstanceBindRegionsAt(0L); }
    public VkBindImageMemoryDeviceGroupInfoKHR _pSplitInstanceBindRegionsAt(long index, MemorySegment src) { _pSplitInstanceBindRegionsAt(index).copyFrom(src); return this; }
    public VkBindImageMemoryDeviceGroupInfoKHR _pSplitInstanceBindRegions(MemorySegment src) { return _pSplitInstanceBindRegionsAt(0L, src); }
}

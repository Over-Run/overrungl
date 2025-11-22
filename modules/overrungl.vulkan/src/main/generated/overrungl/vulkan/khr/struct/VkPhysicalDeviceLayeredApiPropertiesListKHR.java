// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceLayeredApiPropertiesListKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLayeredApiPropertiesListKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t layeredApiCount;
///     VkPhysicalDeviceLayeredApiPropertiesKHR* pLayeredApis;
/// }
/// ```
public final class VkPhysicalDeviceLayeredApiPropertiesListKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("layeredApiCount"),
        ValueLayout.ADDRESS.withName("pLayeredApis")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_layeredApiCount = LAYOUT.byteOffset(PathElement.groupElement("layeredApiCount"));
    public static final long OFFSET_pLayeredApis = LAYOUT.byteOffset(PathElement.groupElement("pLayeredApis"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_layeredApiCount = LAYOUT.select(PathElement.groupElement("layeredApiCount"));
    public static final MemoryLayout LAYOUT_pLayeredApis = LAYOUT.select(PathElement.groupElement("pLayeredApis"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_layeredApiCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layeredApiCount"));
    public static final VarHandle VH_pLayeredApis = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLayeredApis"));

    public VkPhysicalDeviceLayeredApiPropertiesListKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLayeredApiPropertiesListKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLayeredApiPropertiesListKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR); }
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR);
        return s;
    }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR copyFrom(VkPhysicalDeviceLayeredApiPropertiesListKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR reinterpret(long count) { return new VkPhysicalDeviceLayeredApiPropertiesListKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR asSlice(long index) { return new VkPhysicalDeviceLayeredApiPropertiesListKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR asSlice(long index, long count) { return new VkPhysicalDeviceLayeredApiPropertiesListKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR at(long index, Consumer<VkPhysicalDeviceLayeredApiPropertiesListKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int layeredApiCountAt(long index) { return (int) VH_layeredApiCount.get(this.segment(), 0L, index); }
    public MemorySegment pLayeredApisAt(long index) { return (MemorySegment) VH_pLayeredApis.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int layeredApiCount() { return (int) VH_layeredApiCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pLayeredApis() { return (MemorySegment) VH_pLayeredApis.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR layeredApiCountAt(long index, int value) { VH_layeredApiCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pLayeredApisAt(long index, MemorySegment value) { VH_pLayeredApis.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR layeredApiCount(int value) { VH_layeredApiCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pLayeredApis(MemorySegment value) { VH_pLayeredApis.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _layeredApiCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layeredApiCount, index), LAYOUT_layeredApiCount); }
    public MemorySegment _layeredApiCount() { return _layeredApiCountAt(0L); }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR _layeredApiCountAt(long index, MemorySegment src) { _layeredApiCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR _layeredApiCount(MemorySegment src) { return _layeredApiCountAt(0L, src); }
    public MemorySegment _pLayeredApisAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pLayeredApis, index), LAYOUT_pLayeredApis); }
    public MemorySegment _pLayeredApis() { return _pLayeredApisAt(0L); }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR _pLayeredApisAt(long index, MemorySegment src) { _pLayeredApisAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLayeredApiPropertiesListKHR _pLayeredApis(MemorySegment src) { return _pLayeredApisAt(0L, src); }
}

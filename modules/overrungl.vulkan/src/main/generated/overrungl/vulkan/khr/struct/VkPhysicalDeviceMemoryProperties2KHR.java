// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMemoryProperties2KHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMemoryProperties2KHR {
///     VkStructureType sType;
///     void* pNext;
///     VkPhysicalDeviceMemoryProperties memoryProperties;
/// }
/// ```
public final class VkPhysicalDeviceMemoryProperties2KHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkPhysicalDeviceMemoryProperties.LAYOUT.withName("memoryProperties")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_memoryProperties = LAYOUT.byteOffset(PathElement.groupElement("memoryProperties"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_memoryProperties = LAYOUT.select(PathElement.groupElement("memoryProperties"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_memoryProperties$memoryTypeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryProperties"), PathElement.groupElement("memoryTypeCount"));
    public static final VarHandle VH_memoryProperties$memoryTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryProperties"), PathElement.groupElement("memoryTypes"), PathElement.sequenceElement());
    public static final VarHandle VH_memoryProperties$memoryHeapCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryProperties"), PathElement.groupElement("memoryHeapCount"));
    public static final VarHandle VH_memoryProperties$memoryHeaps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryProperties"), PathElement.groupElement("memoryHeaps"), PathElement.sequenceElement());

    public VkPhysicalDeviceMemoryProperties2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMemoryProperties2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties2KHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMemoryProperties2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMemoryProperties2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMemoryProperties2KHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryProperties2KHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMemoryProperties2KHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMemoryProperties2KHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMemoryProperties2KHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2); }
    public static VkPhysicalDeviceMemoryProperties2KHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2);
        return s;
    }
    public VkPhysicalDeviceMemoryProperties2KHR copyFrom(VkPhysicalDeviceMemoryProperties2KHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR reinterpret(long count) { return new VkPhysicalDeviceMemoryProperties2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMemoryProperties2KHR asSlice(long index) { return new VkPhysicalDeviceMemoryProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMemoryProperties2KHR asSlice(long index, long count) { return new VkPhysicalDeviceMemoryProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMemoryProperties2KHR at(long index, Consumer<VkPhysicalDeviceMemoryProperties2KHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int memoryProperties$memoryTypeCountAt(long index) { return (int) VH_memoryProperties$memoryTypeCount.get(this.segment(), 0L, index); }
    public MemorySegment memoryProperties$memoryTypesAt(long index, long index0) { return (MemorySegment) VH_memoryProperties$memoryTypes.get(this.segment(), 0L, index, index0); }
    public int memoryProperties$memoryHeapCountAt(long index) { return (int) VH_memoryProperties$memoryHeapCount.get(this.segment(), 0L, index); }
    public MemorySegment memoryProperties$memoryHeapsAt(long index, long index0) { return (MemorySegment) VH_memoryProperties$memoryHeaps.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int memoryProperties$memoryTypeCount() { return (int) VH_memoryProperties$memoryTypeCount.get(this.segment(), 0L, 0L); }
    public MemorySegment memoryProperties$memoryTypes(long index0) { return (MemorySegment) VH_memoryProperties$memoryTypes.get(this.segment(), 0L, 0L, index0); }
    public int memoryProperties$memoryHeapCount() { return (int) VH_memoryProperties$memoryHeapCount.get(this.segment(), 0L, 0L); }
    public MemorySegment memoryProperties$memoryHeaps(long index0) { return (MemorySegment) VH_memoryProperties$memoryHeaps.get(this.segment(), 0L, 0L, index0); }
    public VkPhysicalDeviceMemoryProperties2KHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR memoryProperties$memoryTypeCountAt(long index, int value) { VH_memoryProperties$memoryTypeCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR memoryProperties$memoryTypesAt(long index, long index0, MemorySegment value) { VH_memoryProperties$memoryTypes.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR memoryProperties$memoryHeapCountAt(long index, int value) { VH_memoryProperties$memoryHeapCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR memoryProperties$memoryHeapsAt(long index, long index0, MemorySegment value) { VH_memoryProperties$memoryHeaps.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR memoryProperties$memoryTypeCount(int value) { VH_memoryProperties$memoryTypeCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR memoryProperties$memoryTypes(long index0, MemorySegment value) { VH_memoryProperties$memoryTypes.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR memoryProperties$memoryHeapCount(int value) { VH_memoryProperties$memoryHeapCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR memoryProperties$memoryHeaps(long index0, MemorySegment value) { VH_memoryProperties$memoryHeaps.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMemoryProperties2KHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMemoryProperties2KHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryPropertiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryProperties, index), LAYOUT_memoryProperties); }
    public MemorySegment _memoryProperties() { return _memoryPropertiesAt(0L); }
    public VkPhysicalDeviceMemoryProperties2KHR _memoryPropertiesAt(long index, MemorySegment src) { _memoryPropertiesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryProperties2KHR _memoryProperties(MemorySegment src) { return _memoryPropertiesAt(0L, src); }
}

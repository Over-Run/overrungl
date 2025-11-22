// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMemoryProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMemoryProperties {
///     uint32_t memoryTypeCount;
///     VkMemoryType memoryTypes[VK_MAX_MEMORY_TYPES];
///     uint32_t memoryHeapCount;
///     VkMemoryHeap memoryHeaps[VK_MAX_MEMORY_HEAPS];
/// }
/// ```
public final class VkPhysicalDeviceMemoryProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("memoryTypeCount"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_MEMORY_TYPES, overrungl.vulkan.struct.VkMemoryType.LAYOUT).withName("memoryTypes"),
        ValueLayout.JAVA_INT.withName("memoryHeapCount"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_MEMORY_HEAPS, overrungl.vulkan.struct.VkMemoryHeap.LAYOUT).withName("memoryHeaps")
    );
    public static final long OFFSET_memoryTypeCount = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeCount"));
    public static final long OFFSET_memoryTypes = LAYOUT.byteOffset(PathElement.groupElement("memoryTypes"));
    public static final long OFFSET_memoryHeapCount = LAYOUT.byteOffset(PathElement.groupElement("memoryHeapCount"));
    public static final long OFFSET_memoryHeaps = LAYOUT.byteOffset(PathElement.groupElement("memoryHeaps"));
    public static final MemoryLayout LAYOUT_memoryTypeCount = LAYOUT.select(PathElement.groupElement("memoryTypeCount"));
    public static final MemoryLayout LAYOUT_memoryTypes = LAYOUT.select(PathElement.groupElement("memoryTypes"));
    public static final MemoryLayout LAYOUT_memoryHeapCount = LAYOUT.select(PathElement.groupElement("memoryHeapCount"));
    public static final MemoryLayout LAYOUT_memoryHeaps = LAYOUT.select(PathElement.groupElement("memoryHeaps"));
    public static final VarHandle VH_memoryTypeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeCount"));
    public static final VarHandle VH_memoryTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypes"), PathElement.sequenceElement());
    public static final VarHandle VH_memoryHeapCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryHeapCount"));
    public static final VarHandle VH_memoryHeaps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryHeaps"), PathElement.sequenceElement());

    public VkPhysicalDeviceMemoryProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMemoryProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMemoryProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMemoryProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMemoryProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryProperties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMemoryProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMemoryProperties(allocator.allocate(LAYOUT, count), count); }
    public VkPhysicalDeviceMemoryProperties copyFrom(VkPhysicalDeviceMemoryProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMemoryProperties reinterpret(long count) { return new VkPhysicalDeviceMemoryProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMemoryProperties asSlice(long index) { return new VkPhysicalDeviceMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMemoryProperties asSlice(long index, long count) { return new VkPhysicalDeviceMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMemoryProperties at(long index, Consumer<VkPhysicalDeviceMemoryProperties> func) { func.accept(asSlice(index)); return this; }
    public int memoryTypeCountAt(long index) { return (int) VH_memoryTypeCount.get(this.segment(), 0L, index); }
    public MemorySegment memoryTypesAt(long index, long index0) { return (MemorySegment) VH_memoryTypes.get(this.segment(), 0L, index, index0); }
    public int memoryHeapCountAt(long index) { return (int) VH_memoryHeapCount.get(this.segment(), 0L, index); }
    public MemorySegment memoryHeapsAt(long index, long index0) { return (MemorySegment) VH_memoryHeaps.get(this.segment(), 0L, index, index0); }
    public int memoryTypeCount() { return (int) VH_memoryTypeCount.get(this.segment(), 0L, 0L); }
    public MemorySegment memoryTypes(long index0) { return (MemorySegment) VH_memoryTypes.get(this.segment(), 0L, 0L, index0); }
    public int memoryHeapCount() { return (int) VH_memoryHeapCount.get(this.segment(), 0L, 0L); }
    public MemorySegment memoryHeaps(long index0) { return (MemorySegment) VH_memoryHeaps.get(this.segment(), 0L, 0L, index0); }
    public VkPhysicalDeviceMemoryProperties memoryTypeCountAt(long index, int value) { VH_memoryTypeCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryProperties memoryTypesAt(long index, long index0, MemorySegment value) { VH_memoryTypes.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceMemoryProperties memoryHeapCountAt(long index, int value) { VH_memoryHeapCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMemoryProperties memoryHeapsAt(long index, long index0, MemorySegment value) { VH_memoryHeaps.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceMemoryProperties memoryTypeCount(int value) { VH_memoryTypeCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryProperties memoryTypes(long index0, MemorySegment value) { VH_memoryTypes.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceMemoryProperties memoryHeapCount(int value) { VH_memoryHeapCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMemoryProperties memoryHeaps(long index0, MemorySegment value) { VH_memoryHeaps.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _memoryTypeCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryTypeCount, index), LAYOUT_memoryTypeCount); }
    public MemorySegment _memoryTypeCount() { return _memoryTypeCountAt(0L); }
    public VkPhysicalDeviceMemoryProperties _memoryTypeCountAt(long index, MemorySegment src) { _memoryTypeCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryProperties _memoryTypeCount(MemorySegment src) { return _memoryTypeCountAt(0L, src); }
    public MemorySegment _memoryTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryTypes, index), LAYOUT_memoryTypes); }
    public MemorySegment _memoryTypes() { return _memoryTypesAt(0L); }
    public VkPhysicalDeviceMemoryProperties _memoryTypesAt(long index, MemorySegment src) { _memoryTypesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryProperties _memoryTypes(MemorySegment src) { return _memoryTypesAt(0L, src); }
    public MemorySegment _memoryHeapCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryHeapCount, index), LAYOUT_memoryHeapCount); }
    public MemorySegment _memoryHeapCount() { return _memoryHeapCountAt(0L); }
    public VkPhysicalDeviceMemoryProperties _memoryHeapCountAt(long index, MemorySegment src) { _memoryHeapCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryProperties _memoryHeapCount(MemorySegment src) { return _memoryHeapCountAt(0L, src); }
    public MemorySegment _memoryHeapsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memoryHeaps, index), LAYOUT_memoryHeaps); }
    public MemorySegment _memoryHeaps() { return _memoryHeapsAt(0L); }
    public VkPhysicalDeviceMemoryProperties _memoryHeapsAt(long index, MemorySegment src) { _memoryHeapsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMemoryProperties _memoryHeaps(MemorySegment src) { return _memoryHeapsAt(0L, src); }
}

// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t queueFamilyIndex;
///     VkPhysicalDeviceDataGraphProcessingEngineTypeARM engineType;
/// }
/// ```
public final class VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("engineType")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_queueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndex"));
    public static final long OFFSET_engineType = LAYOUT.byteOffset(PathElement.groupElement("engineType"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_queueFamilyIndex = LAYOUT.select(PathElement.groupElement("queueFamilyIndex"));
    public static final MemoryLayout LAYOUT_engineType = LAYOUT.select(PathElement.groupElement("engineType"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_queueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndex"));
    public static final VarHandle VH_engineType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("engineType"));

    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM); }
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM);
        return s;
    }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM copyFrom(VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM reinterpret(long count) { return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM asSlice(long index) { return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM asSlice(long index, long count) { return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM at(long index, Consumer<VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int queueFamilyIndexAt(long index) { return (int) VH_queueFamilyIndex.get(this.segment(), 0L, index); }
    public int engineTypeAt(long index) { return (int) VH_engineType.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int queueFamilyIndex() { return (int) VH_queueFamilyIndex.get(this.segment(), 0L, 0L); }
    public int engineType() { return (int) VH_engineType.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM queueFamilyIndexAt(long index, int value) { VH_queueFamilyIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM engineTypeAt(long index, int value) { VH_engineType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM queueFamilyIndex(int value) { VH_queueFamilyIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM engineType(int value) { VH_engineType.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _queueFamilyIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueFamilyIndex, index), LAYOUT_queueFamilyIndex); }
    public MemorySegment _queueFamilyIndex() { return _queueFamilyIndexAt(0L); }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM _queueFamilyIndexAt(long index, MemorySegment src) { _queueFamilyIndexAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM _queueFamilyIndex(MemorySegment src) { return _queueFamilyIndexAt(0L, src); }
    public MemorySegment _engineTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_engineType, index), LAYOUT_engineType); }
    public MemorySegment _engineType() { return _engineTypeAt(0L); }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM _engineTypeAt(long index, MemorySegment src) { _engineTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM _engineType(MemorySegment src) { return _engineTypeAt(0L, src); }
}

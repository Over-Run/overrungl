// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphProcessingEngineCreateInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphProcessingEngineCreateInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t processingEngineCount;
///     VkPhysicalDeviceDataGraphProcessingEngineARM* pProcessingEngines;
/// }
/// ```
public final class VkDataGraphProcessingEngineCreateInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("processingEngineCount"),
        ValueLayout.ADDRESS.withName("pProcessingEngines")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_processingEngineCount = LAYOUT.byteOffset(PathElement.groupElement("processingEngineCount"));
    public static final long OFFSET_pProcessingEngines = LAYOUT.byteOffset(PathElement.groupElement("pProcessingEngines"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_processingEngineCount = LAYOUT.select(PathElement.groupElement("processingEngineCount"));
    public static final MemoryLayout LAYOUT_pProcessingEngines = LAYOUT.select(PathElement.groupElement("pProcessingEngines"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_processingEngineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("processingEngineCount"));
    public static final VarHandle VH_pProcessingEngines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pProcessingEngines"));

    public VkDataGraphProcessingEngineCreateInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDataGraphProcessingEngineCreateInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphProcessingEngineCreateInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDataGraphProcessingEngineCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphProcessingEngineCreateInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDataGraphProcessingEngineCreateInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphProcessingEngineCreateInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDataGraphProcessingEngineCreateInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphProcessingEngineCreateInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkDataGraphProcessingEngineCreateInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphProcessingEngineCreateInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkDataGraphProcessingEngineCreateInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM); }
    public static VkDataGraphProcessingEngineCreateInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM);
        return s;
    }
    public VkDataGraphProcessingEngineCreateInfoARM copyFrom(VkDataGraphProcessingEngineCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDataGraphProcessingEngineCreateInfoARM reinterpret(long count) { return new VkDataGraphProcessingEngineCreateInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDataGraphProcessingEngineCreateInfoARM asSlice(long index) { return new VkDataGraphProcessingEngineCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDataGraphProcessingEngineCreateInfoARM asSlice(long index, long count) { return new VkDataGraphProcessingEngineCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDataGraphProcessingEngineCreateInfoARM at(long index, Consumer<VkDataGraphProcessingEngineCreateInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int processingEngineCountAt(long index) { return (int) VH_processingEngineCount.get(this.segment(), 0L, index); }
    public MemorySegment pProcessingEnginesAt(long index) { return (MemorySegment) VH_pProcessingEngines.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int processingEngineCount() { return (int) VH_processingEngineCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pProcessingEngines() { return (MemorySegment) VH_pProcessingEngines.get(this.segment(), 0L, 0L); }
    public VkDataGraphProcessingEngineCreateInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphProcessingEngineCreateInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphProcessingEngineCreateInfoARM processingEngineCountAt(long index, int value) { VH_processingEngineCount.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphProcessingEngineCreateInfoARM pProcessingEnginesAt(long index, MemorySegment value) { VH_pProcessingEngines.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphProcessingEngineCreateInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphProcessingEngineCreateInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphProcessingEngineCreateInfoARM processingEngineCount(int value) { VH_processingEngineCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphProcessingEngineCreateInfoARM pProcessingEngines(MemorySegment value) { VH_pProcessingEngines.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDataGraphProcessingEngineCreateInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphProcessingEngineCreateInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDataGraphProcessingEngineCreateInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDataGraphProcessingEngineCreateInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _processingEngineCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_processingEngineCount, index), LAYOUT_processingEngineCount); }
    public MemorySegment _processingEngineCount() { return _processingEngineCountAt(0L); }
    public VkDataGraphProcessingEngineCreateInfoARM _processingEngineCountAt(long index, MemorySegment src) { _processingEngineCountAt(index).copyFrom(src); return this; }
    public VkDataGraphProcessingEngineCreateInfoARM _processingEngineCount(MemorySegment src) { return _processingEngineCountAt(0L, src); }
    public MemorySegment _pProcessingEnginesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pProcessingEngines, index), LAYOUT_pProcessingEngines); }
    public MemorySegment _pProcessingEngines() { return _pProcessingEnginesAt(0L); }
    public VkDataGraphProcessingEngineCreateInfoARM _pProcessingEnginesAt(long index, MemorySegment src) { _pProcessingEnginesAt(index).copyFrom(src); return this; }
    public VkDataGraphProcessingEngineCreateInfoARM _pProcessingEngines(MemorySegment src) { return _pProcessingEnginesAt(0L, src); }
}

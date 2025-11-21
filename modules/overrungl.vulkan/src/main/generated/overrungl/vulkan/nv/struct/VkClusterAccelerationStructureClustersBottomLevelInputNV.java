// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClusterAccelerationStructureClustersBottomLevelInputNV`.
/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureClustersBottomLevelInputNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxTotalClusterCount;
///     uint32_t maxClusterCountPerAccelerationStructure;
/// }
/// ```
public final class VkClusterAccelerationStructureClustersBottomLevelInputNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTotalClusterCount"),
        ValueLayout.JAVA_INT.withName("maxClusterCountPerAccelerationStructure")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxTotalClusterCount = LAYOUT.byteOffset(PathElement.groupElement("maxTotalClusterCount"));
    public static final long OFFSET_maxClusterCountPerAccelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("maxClusterCountPerAccelerationStructure"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxTotalClusterCount = LAYOUT.select(PathElement.groupElement("maxTotalClusterCount"));
    public static final MemoryLayout LAYOUT_maxClusterCountPerAccelerationStructure = LAYOUT.select(PathElement.groupElement("maxClusterCountPerAccelerationStructure"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxTotalClusterCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTotalClusterCount"));
    public static final VarHandle VH_maxClusterCountPerAccelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxClusterCountPerAccelerationStructure"));

    public VkClusterAccelerationStructureClustersBottomLevelInputNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureClustersBottomLevelInputNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureClustersBottomLevelInputNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureClustersBottomLevelInputNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureClustersBottomLevelInputNV(allocator.allocate(LAYOUT), 1); }
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureClustersBottomLevelInputNV(allocator.allocate(LAYOUT, count), count); }
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_CLUSTERS_BOTTOM_LEVEL_INPUT_NV); }
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_CLUSTERS_BOTTOM_LEVEL_INPUT_NV);
        return s;
    }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV copyFrom(VkClusterAccelerationStructureClustersBottomLevelInputNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV reinterpret(long count) { return new VkClusterAccelerationStructureClustersBottomLevelInputNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV asSlice(long index) { return new VkClusterAccelerationStructureClustersBottomLevelInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV asSlice(long index, long count) { return new VkClusterAccelerationStructureClustersBottomLevelInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV at(long index, Consumer<VkClusterAccelerationStructureClustersBottomLevelInputNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxTotalClusterCountAt(long index) { return (int) VH_maxTotalClusterCount.get(this.segment(), 0L, index); }
    public int maxClusterCountPerAccelerationStructureAt(long index) { return (int) VH_maxClusterCountPerAccelerationStructure.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxTotalClusterCount() { return (int) VH_maxTotalClusterCount.get(this.segment(), 0L, 0L); }
    public int maxClusterCountPerAccelerationStructure() { return (int) VH_maxClusterCountPerAccelerationStructure.get(this.segment(), 0L, 0L); }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxTotalClusterCountAt(long index, int value) { VH_maxTotalClusterCount.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxClusterCountPerAccelerationStructureAt(long index, int value) { VH_maxClusterCountPerAccelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxTotalClusterCount(int value) { VH_maxTotalClusterCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxClusterCountPerAccelerationStructure(int value) { VH_maxClusterCountPerAccelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxTotalClusterCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTotalClusterCount, index), LAYOUT_maxTotalClusterCount); }
    public MemorySegment _maxTotalClusterCount() { return _maxTotalClusterCountAt(0L); }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV _maxTotalClusterCountAt(long index, MemorySegment src) { _maxTotalClusterCountAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV _maxTotalClusterCount(MemorySegment src) { return _maxTotalClusterCountAt(0L, src); }
    public MemorySegment _maxClusterCountPerAccelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxClusterCountPerAccelerationStructure, index), LAYOUT_maxClusterCountPerAccelerationStructure); }
    public MemorySegment _maxClusterCountPerAccelerationStructure() { return _maxClusterCountPerAccelerationStructureAt(0L); }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV _maxClusterCountPerAccelerationStructureAt(long index, MemorySegment src) { _maxClusterCountPerAccelerationStructureAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureClustersBottomLevelInputNV _maxClusterCountPerAccelerationStructure(MemorySegment src) { return _maxClusterCountPerAccelerationStructureAt(0L, src); }
}

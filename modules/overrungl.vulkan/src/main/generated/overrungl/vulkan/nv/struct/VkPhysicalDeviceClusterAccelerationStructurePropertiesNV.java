// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceClusterAccelerationStructurePropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceClusterAccelerationStructurePropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxVerticesPerCluster;
///     uint32_t maxTrianglesPerCluster;
///     uint32_t clusterScratchByteAlignment;
///     uint32_t clusterByteAlignment;
///     uint32_t clusterTemplateByteAlignment;
///     uint32_t clusterBottomLevelByteAlignment;
///     uint32_t clusterTemplateBoundsByteAlignment;
///     uint32_t maxClusterGeometryIndex;
/// }
/// ```
public final class VkPhysicalDeviceClusterAccelerationStructurePropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxVerticesPerCluster"),
        ValueLayout.JAVA_INT.withName("maxTrianglesPerCluster"),
        ValueLayout.JAVA_INT.withName("clusterScratchByteAlignment"),
        ValueLayout.JAVA_INT.withName("clusterByteAlignment"),
        ValueLayout.JAVA_INT.withName("clusterTemplateByteAlignment"),
        ValueLayout.JAVA_INT.withName("clusterBottomLevelByteAlignment"),
        ValueLayout.JAVA_INT.withName("clusterTemplateBoundsByteAlignment"),
        ValueLayout.JAVA_INT.withName("maxClusterGeometryIndex")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxVerticesPerCluster = LAYOUT.byteOffset(PathElement.groupElement("maxVerticesPerCluster"));
    public static final long OFFSET_maxTrianglesPerCluster = LAYOUT.byteOffset(PathElement.groupElement("maxTrianglesPerCluster"));
    public static final long OFFSET_clusterScratchByteAlignment = LAYOUT.byteOffset(PathElement.groupElement("clusterScratchByteAlignment"));
    public static final long OFFSET_clusterByteAlignment = LAYOUT.byteOffset(PathElement.groupElement("clusterByteAlignment"));
    public static final long OFFSET_clusterTemplateByteAlignment = LAYOUT.byteOffset(PathElement.groupElement("clusterTemplateByteAlignment"));
    public static final long OFFSET_clusterBottomLevelByteAlignment = LAYOUT.byteOffset(PathElement.groupElement("clusterBottomLevelByteAlignment"));
    public static final long OFFSET_clusterTemplateBoundsByteAlignment = LAYOUT.byteOffset(PathElement.groupElement("clusterTemplateBoundsByteAlignment"));
    public static final long OFFSET_maxClusterGeometryIndex = LAYOUT.byteOffset(PathElement.groupElement("maxClusterGeometryIndex"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxVerticesPerCluster = LAYOUT.select(PathElement.groupElement("maxVerticesPerCluster"));
    public static final MemoryLayout LAYOUT_maxTrianglesPerCluster = LAYOUT.select(PathElement.groupElement("maxTrianglesPerCluster"));
    public static final MemoryLayout LAYOUT_clusterScratchByteAlignment = LAYOUT.select(PathElement.groupElement("clusterScratchByteAlignment"));
    public static final MemoryLayout LAYOUT_clusterByteAlignment = LAYOUT.select(PathElement.groupElement("clusterByteAlignment"));
    public static final MemoryLayout LAYOUT_clusterTemplateByteAlignment = LAYOUT.select(PathElement.groupElement("clusterTemplateByteAlignment"));
    public static final MemoryLayout LAYOUT_clusterBottomLevelByteAlignment = LAYOUT.select(PathElement.groupElement("clusterBottomLevelByteAlignment"));
    public static final MemoryLayout LAYOUT_clusterTemplateBoundsByteAlignment = LAYOUT.select(PathElement.groupElement("clusterTemplateBoundsByteAlignment"));
    public static final MemoryLayout LAYOUT_maxClusterGeometryIndex = LAYOUT.select(PathElement.groupElement("maxClusterGeometryIndex"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxVerticesPerCluster = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVerticesPerCluster"));
    public static final VarHandle VH_maxTrianglesPerCluster = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTrianglesPerCluster"));
    public static final VarHandle VH_clusterScratchByteAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterScratchByteAlignment"));
    public static final VarHandle VH_clusterByteAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterByteAlignment"));
    public static final VarHandle VH_clusterTemplateByteAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterTemplateByteAlignment"));
    public static final VarHandle VH_clusterBottomLevelByteAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterBottomLevelByteAlignment"));
    public static final VarHandle VH_clusterTemplateBoundsByteAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterTemplateBoundsByteAlignment"));
    public static final VarHandle VH_maxClusterGeometryIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxClusterGeometryIndex"));

    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV); }
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV copyFrom(VkPhysicalDeviceClusterAccelerationStructurePropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV reinterpret(long count) { return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV asSlice(long index) { return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV at(long index, Consumer<VkPhysicalDeviceClusterAccelerationStructurePropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxVerticesPerClusterAt(long index) { return (int) VH_maxVerticesPerCluster.get(this.segment(), 0L, index); }
    public int maxTrianglesPerClusterAt(long index) { return (int) VH_maxTrianglesPerCluster.get(this.segment(), 0L, index); }
    public int clusterScratchByteAlignmentAt(long index) { return (int) VH_clusterScratchByteAlignment.get(this.segment(), 0L, index); }
    public int clusterByteAlignmentAt(long index) { return (int) VH_clusterByteAlignment.get(this.segment(), 0L, index); }
    public int clusterTemplateByteAlignmentAt(long index) { return (int) VH_clusterTemplateByteAlignment.get(this.segment(), 0L, index); }
    public int clusterBottomLevelByteAlignmentAt(long index) { return (int) VH_clusterBottomLevelByteAlignment.get(this.segment(), 0L, index); }
    public int clusterTemplateBoundsByteAlignmentAt(long index) { return (int) VH_clusterTemplateBoundsByteAlignment.get(this.segment(), 0L, index); }
    public int maxClusterGeometryIndexAt(long index) { return (int) VH_maxClusterGeometryIndex.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxVerticesPerCluster() { return (int) VH_maxVerticesPerCluster.get(this.segment(), 0L, 0L); }
    public int maxTrianglesPerCluster() { return (int) VH_maxTrianglesPerCluster.get(this.segment(), 0L, 0L); }
    public int clusterScratchByteAlignment() { return (int) VH_clusterScratchByteAlignment.get(this.segment(), 0L, 0L); }
    public int clusterByteAlignment() { return (int) VH_clusterByteAlignment.get(this.segment(), 0L, 0L); }
    public int clusterTemplateByteAlignment() { return (int) VH_clusterTemplateByteAlignment.get(this.segment(), 0L, 0L); }
    public int clusterBottomLevelByteAlignment() { return (int) VH_clusterBottomLevelByteAlignment.get(this.segment(), 0L, 0L); }
    public int clusterTemplateBoundsByteAlignment() { return (int) VH_clusterTemplateBoundsByteAlignment.get(this.segment(), 0L, 0L); }
    public int maxClusterGeometryIndex() { return (int) VH_maxClusterGeometryIndex.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxVerticesPerClusterAt(long index, int value) { VH_maxVerticesPerCluster.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxTrianglesPerClusterAt(long index, int value) { VH_maxTrianglesPerCluster.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterScratchByteAlignmentAt(long index, int value) { VH_clusterScratchByteAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterByteAlignmentAt(long index, int value) { VH_clusterByteAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterTemplateByteAlignmentAt(long index, int value) { VH_clusterTemplateByteAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterBottomLevelByteAlignmentAt(long index, int value) { VH_clusterBottomLevelByteAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterTemplateBoundsByteAlignmentAt(long index, int value) { VH_clusterTemplateBoundsByteAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxClusterGeometryIndexAt(long index, int value) { VH_maxClusterGeometryIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxVerticesPerCluster(int value) { VH_maxVerticesPerCluster.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxTrianglesPerCluster(int value) { VH_maxTrianglesPerCluster.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterScratchByteAlignment(int value) { VH_clusterScratchByteAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterByteAlignment(int value) { VH_clusterByteAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterTemplateByteAlignment(int value) { VH_clusterTemplateByteAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterBottomLevelByteAlignment(int value) { VH_clusterBottomLevelByteAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterTemplateBoundsByteAlignment(int value) { VH_clusterTemplateBoundsByteAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxClusterGeometryIndex(int value) { VH_maxClusterGeometryIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxVerticesPerClusterAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxVerticesPerCluster, index), LAYOUT_maxVerticesPerCluster); }
    public MemorySegment _maxVerticesPerCluster() { return _maxVerticesPerClusterAt(0L); }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _maxVerticesPerClusterAt(long index, MemorySegment src) { _maxVerticesPerClusterAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _maxVerticesPerCluster(MemorySegment src) { return _maxVerticesPerClusterAt(0L, src); }
    public MemorySegment _maxTrianglesPerClusterAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTrianglesPerCluster, index), LAYOUT_maxTrianglesPerCluster); }
    public MemorySegment _maxTrianglesPerCluster() { return _maxTrianglesPerClusterAt(0L); }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _maxTrianglesPerClusterAt(long index, MemorySegment src) { _maxTrianglesPerClusterAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _maxTrianglesPerCluster(MemorySegment src) { return _maxTrianglesPerClusterAt(0L, src); }
    public MemorySegment _clusterScratchByteAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clusterScratchByteAlignment, index), LAYOUT_clusterScratchByteAlignment); }
    public MemorySegment _clusterScratchByteAlignment() { return _clusterScratchByteAlignmentAt(0L); }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _clusterScratchByteAlignmentAt(long index, MemorySegment src) { _clusterScratchByteAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _clusterScratchByteAlignment(MemorySegment src) { return _clusterScratchByteAlignmentAt(0L, src); }
    public MemorySegment _clusterByteAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clusterByteAlignment, index), LAYOUT_clusterByteAlignment); }
    public MemorySegment _clusterByteAlignment() { return _clusterByteAlignmentAt(0L); }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _clusterByteAlignmentAt(long index, MemorySegment src) { _clusterByteAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _clusterByteAlignment(MemorySegment src) { return _clusterByteAlignmentAt(0L, src); }
    public MemorySegment _clusterTemplateByteAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clusterTemplateByteAlignment, index), LAYOUT_clusterTemplateByteAlignment); }
    public MemorySegment _clusterTemplateByteAlignment() { return _clusterTemplateByteAlignmentAt(0L); }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _clusterTemplateByteAlignmentAt(long index, MemorySegment src) { _clusterTemplateByteAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _clusterTemplateByteAlignment(MemorySegment src) { return _clusterTemplateByteAlignmentAt(0L, src); }
    public MemorySegment _clusterBottomLevelByteAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clusterBottomLevelByteAlignment, index), LAYOUT_clusterBottomLevelByteAlignment); }
    public MemorySegment _clusterBottomLevelByteAlignment() { return _clusterBottomLevelByteAlignmentAt(0L); }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _clusterBottomLevelByteAlignmentAt(long index, MemorySegment src) { _clusterBottomLevelByteAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _clusterBottomLevelByteAlignment(MemorySegment src) { return _clusterBottomLevelByteAlignmentAt(0L, src); }
    public MemorySegment _clusterTemplateBoundsByteAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clusterTemplateBoundsByteAlignment, index), LAYOUT_clusterTemplateBoundsByteAlignment); }
    public MemorySegment _clusterTemplateBoundsByteAlignment() { return _clusterTemplateBoundsByteAlignmentAt(0L); }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _clusterTemplateBoundsByteAlignmentAt(long index, MemorySegment src) { _clusterTemplateBoundsByteAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _clusterTemplateBoundsByteAlignment(MemorySegment src) { return _clusterTemplateBoundsByteAlignmentAt(0L, src); }
    public MemorySegment _maxClusterGeometryIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxClusterGeometryIndex, index), LAYOUT_maxClusterGeometryIndex); }
    public MemorySegment _maxClusterGeometryIndex() { return _maxClusterGeometryIndexAt(0L); }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _maxClusterGeometryIndexAt(long index, MemorySegment src) { _maxClusterGeometryIndexAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV _maxClusterGeometryIndex(MemorySegment src) { return _maxClusterGeometryIndexAt(0L, src); }
}

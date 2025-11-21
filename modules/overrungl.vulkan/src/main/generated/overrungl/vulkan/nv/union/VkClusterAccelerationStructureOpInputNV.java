// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.union;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClusterAccelerationStructureOpInputNV`.
/// ## Layout
/// ```
/// union VkClusterAccelerationStructureOpInputNV {
///     VkClusterAccelerationStructureClustersBottomLevelInputNV* pClustersBottomLevel;
///     VkClusterAccelerationStructureTriangleClusterInputNV* pTriangleClusters;
///     VkClusterAccelerationStructureMoveObjectsInputNV* pMoveObjects;
/// }
/// ```
public final class VkClusterAccelerationStructureOpInputNV extends GroupType {
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.ADDRESS.withName("pClustersBottomLevel"),
        ValueLayout.ADDRESS.withName("pTriangleClusters"),
        ValueLayout.ADDRESS.withName("pMoveObjects")
    );
    public static final long OFFSET_pClustersBottomLevel = LAYOUT.byteOffset(PathElement.groupElement("pClustersBottomLevel"));
    public static final long OFFSET_pTriangleClusters = LAYOUT.byteOffset(PathElement.groupElement("pTriangleClusters"));
    public static final long OFFSET_pMoveObjects = LAYOUT.byteOffset(PathElement.groupElement("pMoveObjects"));
    public static final MemoryLayout LAYOUT_pClustersBottomLevel = LAYOUT.select(PathElement.groupElement("pClustersBottomLevel"));
    public static final MemoryLayout LAYOUT_pTriangleClusters = LAYOUT.select(PathElement.groupElement("pTriangleClusters"));
    public static final MemoryLayout LAYOUT_pMoveObjects = LAYOUT.select(PathElement.groupElement("pMoveObjects"));
    public static final VarHandle VH_pClustersBottomLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pClustersBottomLevel"));
    public static final VarHandle VH_pTriangleClusters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTriangleClusters"));
    public static final VarHandle VH_pMoveObjects = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMoveObjects"));

    public VkClusterAccelerationStructureOpInputNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkClusterAccelerationStructureOpInputNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureOpInputNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkClusterAccelerationStructureOpInputNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureOpInputNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkClusterAccelerationStructureOpInputNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureOpInputNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkClusterAccelerationStructureOpInputNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureOpInputNV(allocator.allocate(LAYOUT), 1); }
    public static VkClusterAccelerationStructureOpInputNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureOpInputNV(allocator.allocate(LAYOUT, count), count); }
    public VkClusterAccelerationStructureOpInputNV copyFrom(VkClusterAccelerationStructureOpInputNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkClusterAccelerationStructureOpInputNV reinterpret(long count) { return new VkClusterAccelerationStructureOpInputNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkClusterAccelerationStructureOpInputNV asSlice(long index) { return new VkClusterAccelerationStructureOpInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkClusterAccelerationStructureOpInputNV asSlice(long index, long count) { return new VkClusterAccelerationStructureOpInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkClusterAccelerationStructureOpInputNV at(long index, Consumer<VkClusterAccelerationStructureOpInputNV> func) { func.accept(asSlice(index)); return this; }
    public MemorySegment pClustersBottomLevelAt(long index) { return (MemorySegment) VH_pClustersBottomLevel.get(this.segment(), 0L, index); }
    public MemorySegment pTriangleClustersAt(long index) { return (MemorySegment) VH_pTriangleClusters.get(this.segment(), 0L, index); }
    public MemorySegment pMoveObjectsAt(long index) { return (MemorySegment) VH_pMoveObjects.get(this.segment(), 0L, index); }
    public MemorySegment pClustersBottomLevel() { return (MemorySegment) VH_pClustersBottomLevel.get(this.segment(), 0L, 0L); }
    public MemorySegment pTriangleClusters() { return (MemorySegment) VH_pTriangleClusters.get(this.segment(), 0L, 0L); }
    public MemorySegment pMoveObjects() { return (MemorySegment) VH_pMoveObjects.get(this.segment(), 0L, 0L); }
    public VkClusterAccelerationStructureOpInputNV pClustersBottomLevelAt(long index, MemorySegment value) { VH_pClustersBottomLevel.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureOpInputNV pTriangleClustersAt(long index, MemorySegment value) { VH_pTriangleClusters.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureOpInputNV pMoveObjectsAt(long index, MemorySegment value) { VH_pMoveObjects.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureOpInputNV pClustersBottomLevel(MemorySegment value) { VH_pClustersBottomLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureOpInputNV pTriangleClusters(MemorySegment value) { VH_pTriangleClusters.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureOpInputNV pMoveObjects(MemorySegment value) { VH_pMoveObjects.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _pClustersBottomLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pClustersBottomLevel, index), LAYOUT_pClustersBottomLevel); }
    public MemorySegment _pClustersBottomLevel() { return _pClustersBottomLevelAt(0L); }
    public VkClusterAccelerationStructureOpInputNV _pClustersBottomLevelAt(long index, MemorySegment src) { _pClustersBottomLevelAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureOpInputNV _pClustersBottomLevel(MemorySegment src) { return _pClustersBottomLevelAt(0L, src); }
    public MemorySegment _pTriangleClustersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTriangleClusters, index), LAYOUT_pTriangleClusters); }
    public MemorySegment _pTriangleClusters() { return _pTriangleClustersAt(0L); }
    public VkClusterAccelerationStructureOpInputNV _pTriangleClustersAt(long index, MemorySegment src) { _pTriangleClustersAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureOpInputNV _pTriangleClusters(MemorySegment src) { return _pTriangleClustersAt(0L, src); }
    public MemorySegment _pMoveObjectsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pMoveObjects, index), LAYOUT_pMoveObjects); }
    public MemorySegment _pMoveObjects() { return _pMoveObjectsAt(0L); }
    public VkClusterAccelerationStructureOpInputNV _pMoveObjectsAt(long index, MemorySegment src) { _pMoveObjectsAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureOpInputNV _pMoveObjects(MemorySegment src) { return _pMoveObjectsAt(0L, src); }
}

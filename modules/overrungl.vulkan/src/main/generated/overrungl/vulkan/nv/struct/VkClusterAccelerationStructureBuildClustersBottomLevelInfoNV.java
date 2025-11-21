// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV`.
/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV {
///     uint32_t clusterReferencesCount;
///     uint32_t clusterReferencesStride;
///     VkDeviceAddress clusterReferences;
/// }
/// ```
public final class VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("clusterReferencesCount"),
        ValueLayout.JAVA_INT.withName("clusterReferencesStride"),
        ValueLayout.JAVA_LONG.withName("clusterReferences")
    );
    public static final long OFFSET_clusterReferencesCount = LAYOUT.byteOffset(PathElement.groupElement("clusterReferencesCount"));
    public static final long OFFSET_clusterReferencesStride = LAYOUT.byteOffset(PathElement.groupElement("clusterReferencesStride"));
    public static final long OFFSET_clusterReferences = LAYOUT.byteOffset(PathElement.groupElement("clusterReferences"));
    public static final MemoryLayout LAYOUT_clusterReferencesCount = LAYOUT.select(PathElement.groupElement("clusterReferencesCount"));
    public static final MemoryLayout LAYOUT_clusterReferencesStride = LAYOUT.select(PathElement.groupElement("clusterReferencesStride"));
    public static final MemoryLayout LAYOUT_clusterReferences = LAYOUT.select(PathElement.groupElement("clusterReferences"));
    public static final VarHandle VH_clusterReferencesCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterReferencesCount"));
    public static final VarHandle VH_clusterReferencesStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterReferencesStride"));
    public static final VarHandle VH_clusterReferences = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterReferences"));

    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(allocator.allocate(LAYOUT, count), count); }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV copyFrom(VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV reinterpret(long count) { return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV asSlice(long index) { return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV asSlice(long index, long count) { return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV at(long index, Consumer<VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int clusterReferencesCountAt(long index) { return (int) VH_clusterReferencesCount.get(this.segment(), 0L, index); }
    public int clusterReferencesStrideAt(long index) { return (int) VH_clusterReferencesStride.get(this.segment(), 0L, index); }
    public long clusterReferencesAt(long index) { return (long) VH_clusterReferences.get(this.segment(), 0L, index); }
    public int clusterReferencesCount() { return (int) VH_clusterReferencesCount.get(this.segment(), 0L, 0L); }
    public int clusterReferencesStride() { return (int) VH_clusterReferencesStride.get(this.segment(), 0L, 0L); }
    public long clusterReferences() { return (long) VH_clusterReferences.get(this.segment(), 0L, 0L); }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesCountAt(long index, int value) { VH_clusterReferencesCount.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesStrideAt(long index, int value) { VH_clusterReferencesStride.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesAt(long index, long value) { VH_clusterReferences.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesCount(int value) { VH_clusterReferencesCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesStride(int value) { VH_clusterReferencesStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferences(long value) { VH_clusterReferences.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _clusterReferencesCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clusterReferencesCount, index), LAYOUT_clusterReferencesCount); }
    public MemorySegment _clusterReferencesCount() { return _clusterReferencesCountAt(0L); }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV _clusterReferencesCountAt(long index, MemorySegment src) { _clusterReferencesCountAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV _clusterReferencesCount(MemorySegment src) { return _clusterReferencesCountAt(0L, src); }
    public MemorySegment _clusterReferencesStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clusterReferencesStride, index), LAYOUT_clusterReferencesStride); }
    public MemorySegment _clusterReferencesStride() { return _clusterReferencesStrideAt(0L); }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV _clusterReferencesStrideAt(long index, MemorySegment src) { _clusterReferencesStrideAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV _clusterReferencesStride(MemorySegment src) { return _clusterReferencesStrideAt(0L, src); }
    public MemorySegment _clusterReferencesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_clusterReferences, index), LAYOUT_clusterReferences); }
    public MemorySegment _clusterReferences() { return _clusterReferencesAt(0L); }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV _clusterReferencesAt(long index, MemorySegment src) { _clusterReferencesAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV _clusterReferences(MemorySegment src) { return _clusterReferencesAt(0L, src); }
}

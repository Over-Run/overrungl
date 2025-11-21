// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClusterAccelerationStructureInputInfoNV`.
/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureInputInfoNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxAccelerationStructureCount;
///     VkBuildAccelerationStructureFlagsKHR flags;
///     VkClusterAccelerationStructureOpTypeNV opType;
///     VkClusterAccelerationStructureOpModeNV opMode;
///     VkClusterAccelerationStructureOpInputNV opInput;
/// }
/// ```
public final class VkClusterAccelerationStructureInputInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxAccelerationStructureCount"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("opType"),
        ValueLayout.JAVA_INT.withName("opMode"),
        overrungl.vulkan.nv.union.VkClusterAccelerationStructureOpInputNV.LAYOUT.withName("opInput")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxAccelerationStructureCount = LAYOUT.byteOffset(PathElement.groupElement("maxAccelerationStructureCount"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_opType = LAYOUT.byteOffset(PathElement.groupElement("opType"));
    public static final long OFFSET_opMode = LAYOUT.byteOffset(PathElement.groupElement("opMode"));
    public static final long OFFSET_opInput = LAYOUT.byteOffset(PathElement.groupElement("opInput"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxAccelerationStructureCount = LAYOUT.select(PathElement.groupElement("maxAccelerationStructureCount"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_opType = LAYOUT.select(PathElement.groupElement("opType"));
    public static final MemoryLayout LAYOUT_opMode = LAYOUT.select(PathElement.groupElement("opMode"));
    public static final MemoryLayout LAYOUT_opInput = LAYOUT.select(PathElement.groupElement("opInput"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxAccelerationStructureCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxAccelerationStructureCount"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_opType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opType"));
    public static final VarHandle VH_opMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opMode"));
    public static final VarHandle VH_opInput$pClustersBottomLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opInput"), PathElement.groupElement("pClustersBottomLevel"));
    public static final VarHandle VH_opInput$pTriangleClusters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opInput"), PathElement.groupElement("pTriangleClusters"));
    public static final VarHandle VH_opInput$pMoveObjects = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opInput"), PathElement.groupElement("pMoveObjects"));

    public VkClusterAccelerationStructureInputInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkClusterAccelerationStructureInputInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureInputInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkClusterAccelerationStructureInputInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureInputInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkClusterAccelerationStructureInputInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureInputInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkClusterAccelerationStructureInputInfoNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureInputInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkClusterAccelerationStructureInputInfoNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureInputInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkClusterAccelerationStructureInputInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV); }
    public static VkClusterAccelerationStructureInputInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_INPUT_INFO_NV);
        return s;
    }
    public VkClusterAccelerationStructureInputInfoNV copyFrom(VkClusterAccelerationStructureInputInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkClusterAccelerationStructureInputInfoNV reinterpret(long count) { return new VkClusterAccelerationStructureInputInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkClusterAccelerationStructureInputInfoNV asSlice(long index) { return new VkClusterAccelerationStructureInputInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkClusterAccelerationStructureInputInfoNV asSlice(long index, long count) { return new VkClusterAccelerationStructureInputInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkClusterAccelerationStructureInputInfoNV at(long index, Consumer<VkClusterAccelerationStructureInputInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxAccelerationStructureCountAt(long index) { return (int) VH_maxAccelerationStructureCount.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int opTypeAt(long index) { return (int) VH_opType.get(this.segment(), 0L, index); }
    public int opModeAt(long index) { return (int) VH_opMode.get(this.segment(), 0L, index); }
    public MemorySegment opInput$pClustersBottomLevelAt(long index) { return (MemorySegment) VH_opInput$pClustersBottomLevel.get(this.segment(), 0L, index); }
    public MemorySegment opInput$pTriangleClustersAt(long index) { return (MemorySegment) VH_opInput$pTriangleClusters.get(this.segment(), 0L, index); }
    public MemorySegment opInput$pMoveObjectsAt(long index) { return (MemorySegment) VH_opInput$pMoveObjects.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxAccelerationStructureCount() { return (int) VH_maxAccelerationStructureCount.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int opType() { return (int) VH_opType.get(this.segment(), 0L, 0L); }
    public int opMode() { return (int) VH_opMode.get(this.segment(), 0L, 0L); }
    public MemorySegment opInput$pClustersBottomLevel() { return (MemorySegment) VH_opInput$pClustersBottomLevel.get(this.segment(), 0L, 0L); }
    public MemorySegment opInput$pTriangleClusters() { return (MemorySegment) VH_opInput$pTriangleClusters.get(this.segment(), 0L, 0L); }
    public MemorySegment opInput$pMoveObjects() { return (MemorySegment) VH_opInput$pMoveObjects.get(this.segment(), 0L, 0L); }
    public VkClusterAccelerationStructureInputInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV maxAccelerationStructureCountAt(long index, int value) { VH_maxAccelerationStructureCount.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV opTypeAt(long index, int value) { VH_opType.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV opModeAt(long index, int value) { VH_opMode.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV opInput$pClustersBottomLevelAt(long index, MemorySegment value) { VH_opInput$pClustersBottomLevel.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV opInput$pTriangleClustersAt(long index, MemorySegment value) { VH_opInput$pTriangleClusters.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV opInput$pMoveObjectsAt(long index, MemorySegment value) { VH_opInput$pMoveObjects.set(this.segment(), 0L, index, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV maxAccelerationStructureCount(int value) { VH_maxAccelerationStructureCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV opType(int value) { VH_opType.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV opMode(int value) { VH_opMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV opInput$pClustersBottomLevel(MemorySegment value) { VH_opInput$pClustersBottomLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV opInput$pTriangleClusters(MemorySegment value) { VH_opInput$pTriangleClusters.set(this.segment(), 0L, 0L, value); return this; }
    public VkClusterAccelerationStructureInputInfoNV opInput$pMoveObjects(MemorySegment value) { VH_opInput$pMoveObjects.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkClusterAccelerationStructureInputInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureInputInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkClusterAccelerationStructureInputInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureInputInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxAccelerationStructureCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxAccelerationStructureCount, index), LAYOUT_maxAccelerationStructureCount); }
    public MemorySegment _maxAccelerationStructureCount() { return _maxAccelerationStructureCountAt(0L); }
    public VkClusterAccelerationStructureInputInfoNV _maxAccelerationStructureCountAt(long index, MemorySegment src) { _maxAccelerationStructureCountAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureInputInfoNV _maxAccelerationStructureCount(MemorySegment src) { return _maxAccelerationStructureCountAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkClusterAccelerationStructureInputInfoNV _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureInputInfoNV _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _opTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_opType, index), LAYOUT_opType); }
    public MemorySegment _opType() { return _opTypeAt(0L); }
    public VkClusterAccelerationStructureInputInfoNV _opTypeAt(long index, MemorySegment src) { _opTypeAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureInputInfoNV _opType(MemorySegment src) { return _opTypeAt(0L, src); }
    public MemorySegment _opModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_opMode, index), LAYOUT_opMode); }
    public MemorySegment _opMode() { return _opModeAt(0L); }
    public VkClusterAccelerationStructureInputInfoNV _opModeAt(long index, MemorySegment src) { _opModeAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureInputInfoNV _opMode(MemorySegment src) { return _opModeAt(0L, src); }
    public MemorySegment _opInputAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_opInput, index), LAYOUT_opInput); }
    public MemorySegment _opInput() { return _opInputAt(0L); }
    public VkClusterAccelerationStructureInputInfoNV _opInputAt(long index, MemorySegment src) { _opInputAt(index).copyFrom(src); return this; }
    public VkClusterAccelerationStructureInputInfoNV _opInput(MemorySegment src) { return _opInputAt(0L, src); }
}

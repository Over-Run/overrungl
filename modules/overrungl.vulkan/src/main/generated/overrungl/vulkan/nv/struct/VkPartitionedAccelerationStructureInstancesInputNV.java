// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPartitionedAccelerationStructureInstancesInputNV`.
/// ## Layout
/// ```
/// struct VkPartitionedAccelerationStructureInstancesInputNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBuildAccelerationStructureFlagsKHR flags;
///     uint32_t instanceCount;
///     uint32_t maxInstancePerPartitionCount;
///     uint32_t partitionCount;
///     uint32_t maxInstanceInGlobalPartitionCount;
/// }
/// ```
public final class VkPartitionedAccelerationStructureInstancesInputNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("maxInstancePerPartitionCount"),
        ValueLayout.JAVA_INT.withName("partitionCount"),
        ValueLayout.JAVA_INT.withName("maxInstanceInGlobalPartitionCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_instanceCount = LAYOUT.byteOffset(PathElement.groupElement("instanceCount"));
    public static final long OFFSET_maxInstancePerPartitionCount = LAYOUT.byteOffset(PathElement.groupElement("maxInstancePerPartitionCount"));
    public static final long OFFSET_partitionCount = LAYOUT.byteOffset(PathElement.groupElement("partitionCount"));
    public static final long OFFSET_maxInstanceInGlobalPartitionCount = LAYOUT.byteOffset(PathElement.groupElement("maxInstanceInGlobalPartitionCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_instanceCount = LAYOUT.select(PathElement.groupElement("instanceCount"));
    public static final MemoryLayout LAYOUT_maxInstancePerPartitionCount = LAYOUT.select(PathElement.groupElement("maxInstancePerPartitionCount"));
    public static final MemoryLayout LAYOUT_partitionCount = LAYOUT.select(PathElement.groupElement("partitionCount"));
    public static final MemoryLayout LAYOUT_maxInstanceInGlobalPartitionCount = LAYOUT.select(PathElement.groupElement("maxInstanceInGlobalPartitionCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_instanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceCount"));
    public static final VarHandle VH_maxInstancePerPartitionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInstancePerPartitionCount"));
    public static final VarHandle VH_partitionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("partitionCount"));
    public static final VarHandle VH_maxInstanceInGlobalPartitionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInstanceInGlobalPartitionCount"));

    public VkPartitionedAccelerationStructureInstancesInputNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPartitionedAccelerationStructureInstancesInputNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureInstancesInputNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPartitionedAccelerationStructureInstancesInputNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureInstancesInputNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPartitionedAccelerationStructureInstancesInputNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureInstancesInputNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPartitionedAccelerationStructureInstancesInputNV alloc(SegmentAllocator allocator) { return new VkPartitionedAccelerationStructureInstancesInputNV(allocator.allocate(LAYOUT), 1); }
    public static VkPartitionedAccelerationStructureInstancesInputNV alloc(SegmentAllocator allocator, long count) { return new VkPartitionedAccelerationStructureInstancesInputNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPartitionedAccelerationStructureInstancesInputNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV); }
    public static VkPartitionedAccelerationStructureInstancesInputNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV);
        return s;
    }
    public VkPartitionedAccelerationStructureInstancesInputNV copyFrom(VkPartitionedAccelerationStructureInstancesInputNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV reinterpret(long count) { return new VkPartitionedAccelerationStructureInstancesInputNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPartitionedAccelerationStructureInstancesInputNV asSlice(long index) { return new VkPartitionedAccelerationStructureInstancesInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPartitionedAccelerationStructureInstancesInputNV asSlice(long index, long count) { return new VkPartitionedAccelerationStructureInstancesInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPartitionedAccelerationStructureInstancesInputNV at(long index, Consumer<VkPartitionedAccelerationStructureInstancesInputNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int instanceCountAt(long index) { return (int) VH_instanceCount.get(this.segment(), 0L, index); }
    public int maxInstancePerPartitionCountAt(long index) { return (int) VH_maxInstancePerPartitionCount.get(this.segment(), 0L, index); }
    public int partitionCountAt(long index) { return (int) VH_partitionCount.get(this.segment(), 0L, index); }
    public int maxInstanceInGlobalPartitionCountAt(long index) { return (int) VH_maxInstanceInGlobalPartitionCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int instanceCount() { return (int) VH_instanceCount.get(this.segment(), 0L, 0L); }
    public int maxInstancePerPartitionCount() { return (int) VH_maxInstancePerPartitionCount.get(this.segment(), 0L, 0L); }
    public int partitionCount() { return (int) VH_partitionCount.get(this.segment(), 0L, 0L); }
    public int maxInstanceInGlobalPartitionCount() { return (int) VH_maxInstanceInGlobalPartitionCount.get(this.segment(), 0L, 0L); }
    public VkPartitionedAccelerationStructureInstancesInputNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV instanceCountAt(long index, int value) { VH_instanceCount.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV maxInstancePerPartitionCountAt(long index, int value) { VH_maxInstancePerPartitionCount.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV partitionCountAt(long index, int value) { VH_partitionCount.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV maxInstanceInGlobalPartitionCountAt(long index, int value) { VH_maxInstanceInGlobalPartitionCount.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV instanceCount(int value) { VH_instanceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV maxInstancePerPartitionCount(int value) { VH_maxInstancePerPartitionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV partitionCount(int value) { VH_partitionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV maxInstanceInGlobalPartitionCount(int value) { VH_maxInstanceInGlobalPartitionCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPartitionedAccelerationStructureInstancesInputNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPartitionedAccelerationStructureInstancesInputNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPartitionedAccelerationStructureInstancesInputNV _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _instanceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_instanceCount, index), LAYOUT_instanceCount); }
    public MemorySegment _instanceCount() { return _instanceCountAt(0L); }
    public VkPartitionedAccelerationStructureInstancesInputNV _instanceCountAt(long index, MemorySegment src) { _instanceCountAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV _instanceCount(MemorySegment src) { return _instanceCountAt(0L, src); }
    public MemorySegment _maxInstancePerPartitionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxInstancePerPartitionCount, index), LAYOUT_maxInstancePerPartitionCount); }
    public MemorySegment _maxInstancePerPartitionCount() { return _maxInstancePerPartitionCountAt(0L); }
    public VkPartitionedAccelerationStructureInstancesInputNV _maxInstancePerPartitionCountAt(long index, MemorySegment src) { _maxInstancePerPartitionCountAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV _maxInstancePerPartitionCount(MemorySegment src) { return _maxInstancePerPartitionCountAt(0L, src); }
    public MemorySegment _partitionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_partitionCount, index), LAYOUT_partitionCount); }
    public MemorySegment _partitionCount() { return _partitionCountAt(0L); }
    public VkPartitionedAccelerationStructureInstancesInputNV _partitionCountAt(long index, MemorySegment src) { _partitionCountAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV _partitionCount(MemorySegment src) { return _partitionCountAt(0L, src); }
    public MemorySegment _maxInstanceInGlobalPartitionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxInstanceInGlobalPartitionCount, index), LAYOUT_maxInstanceInGlobalPartitionCount); }
    public MemorySegment _maxInstanceInGlobalPartitionCount() { return _maxInstanceInGlobalPartitionCountAt(0L); }
    public VkPartitionedAccelerationStructureInstancesInputNV _maxInstanceInGlobalPartitionCountAt(long index, MemorySegment src) { _maxInstanceInGlobalPartitionCountAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureInstancesInputNV _maxInstanceInGlobalPartitionCount(MemorySegment src) { return _maxInstanceInGlobalPartitionCountAt(0L, src); }
}

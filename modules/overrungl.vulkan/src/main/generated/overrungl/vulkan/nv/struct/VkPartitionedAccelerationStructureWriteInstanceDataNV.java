// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPartitionedAccelerationStructureWriteInstanceDataNV`.
/// ## Layout
/// ```
/// struct VkPartitionedAccelerationStructureWriteInstanceDataNV {
///     VkTransformMatrixKHR transform;
///     float explicitAABB[6];
///     uint32_t instanceID;
///     uint32_t instanceMask;
///     uint32_t instanceContributionToHitGroupIndex;
///     VkPartitionedAccelerationStructureInstanceFlagsNV instanceFlags;
///     uint32_t instanceIndex;
///     uint32_t partitionIndex;
///     VkDeviceAddress accelerationStructure;
/// }
/// ```
public final class VkPartitionedAccelerationStructureWriteInstanceDataNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.khr.struct.VkTransformMatrixKHR.LAYOUT.withName("transform"),
        MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_FLOAT).withName("explicitAABB"),
        ValueLayout.JAVA_INT.withName("instanceID"),
        ValueLayout.JAVA_INT.withName("instanceMask"),
        ValueLayout.JAVA_INT.withName("instanceContributionToHitGroupIndex"),
        ValueLayout.JAVA_INT.withName("instanceFlags"),
        ValueLayout.JAVA_INT.withName("instanceIndex"),
        ValueLayout.JAVA_INT.withName("partitionIndex"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure")
    );
    public static final long OFFSET_transform = LAYOUT.byteOffset(PathElement.groupElement("transform"));
    public static final long OFFSET_explicitAABB = LAYOUT.byteOffset(PathElement.groupElement("explicitAABB"));
    public static final long OFFSET_instanceID = LAYOUT.byteOffset(PathElement.groupElement("instanceID"));
    public static final long OFFSET_instanceMask = LAYOUT.byteOffset(PathElement.groupElement("instanceMask"));
    public static final long OFFSET_instanceContributionToHitGroupIndex = LAYOUT.byteOffset(PathElement.groupElement("instanceContributionToHitGroupIndex"));
    public static final long OFFSET_instanceFlags = LAYOUT.byteOffset(PathElement.groupElement("instanceFlags"));
    public static final long OFFSET_instanceIndex = LAYOUT.byteOffset(PathElement.groupElement("instanceIndex"));
    public static final long OFFSET_partitionIndex = LAYOUT.byteOffset(PathElement.groupElement("partitionIndex"));
    public static final long OFFSET_accelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
    public static final MemoryLayout LAYOUT_transform = LAYOUT.select(PathElement.groupElement("transform"));
    public static final MemoryLayout LAYOUT_explicitAABB = LAYOUT.select(PathElement.groupElement("explicitAABB"));
    public static final MemoryLayout LAYOUT_instanceID = LAYOUT.select(PathElement.groupElement("instanceID"));
    public static final MemoryLayout LAYOUT_instanceMask = LAYOUT.select(PathElement.groupElement("instanceMask"));
    public static final MemoryLayout LAYOUT_instanceContributionToHitGroupIndex = LAYOUT.select(PathElement.groupElement("instanceContributionToHitGroupIndex"));
    public static final MemoryLayout LAYOUT_instanceFlags = LAYOUT.select(PathElement.groupElement("instanceFlags"));
    public static final MemoryLayout LAYOUT_instanceIndex = LAYOUT.select(PathElement.groupElement("instanceIndex"));
    public static final MemoryLayout LAYOUT_partitionIndex = LAYOUT.select(PathElement.groupElement("partitionIndex"));
    public static final MemoryLayout LAYOUT_accelerationStructure = LAYOUT.select(PathElement.groupElement("accelerationStructure"));
    public static final VarHandle VH_transform$matrix = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transform"), PathElement.groupElement("matrix"), PathElement.sequenceElement(), PathElement.sequenceElement());
    public static final VarHandle VH_explicitAABB = LAYOUT.arrayElementVarHandle(PathElement.groupElement("explicitAABB"), PathElement.sequenceElement());
    public static final VarHandle VH_instanceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceID"));
    public static final VarHandle VH_instanceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceMask"));
    public static final VarHandle VH_instanceContributionToHitGroupIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceContributionToHitGroupIndex"));
    public static final VarHandle VH_instanceFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceFlags"));
    public static final VarHandle VH_instanceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceIndex"));
    public static final VarHandle VH_partitionIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("partitionIndex"));
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));

    public VkPartitionedAccelerationStructureWriteInstanceDataNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureWriteInstanceDataNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureWriteInstanceDataNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureWriteInstanceDataNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV alloc(SegmentAllocator allocator) { return new VkPartitionedAccelerationStructureWriteInstanceDataNV(allocator.allocate(LAYOUT), 1); }
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV alloc(SegmentAllocator allocator, long count) { return new VkPartitionedAccelerationStructureWriteInstanceDataNV(allocator.allocate(LAYOUT, count), count); }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV copyFrom(VkPartitionedAccelerationStructureWriteInstanceDataNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV reinterpret(long count) { return new VkPartitionedAccelerationStructureWriteInstanceDataNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV asSlice(long index) { return new VkPartitionedAccelerationStructureWriteInstanceDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV asSlice(long index, long count) { return new VkPartitionedAccelerationStructureWriteInstanceDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV at(long index, Consumer<VkPartitionedAccelerationStructureWriteInstanceDataNV> func) { func.accept(asSlice(index)); return this; }
    public float transform$matrixAt(long index, long index0, long index1) { return (float) VH_transform$matrix.get(this.segment(), 0L, index, index0, index1); }
    public float explicitAABBAt(long index, long index0) { return (float) VH_explicitAABB.get(this.segment(), 0L, index, index0); }
    public int instanceIDAt(long index) { return (int) VH_instanceID.get(this.segment(), 0L, index); }
    public int instanceMaskAt(long index) { return (int) VH_instanceMask.get(this.segment(), 0L, index); }
    public int instanceContributionToHitGroupIndexAt(long index) { return (int) VH_instanceContributionToHitGroupIndex.get(this.segment(), 0L, index); }
    public int instanceFlagsAt(long index) { return (int) VH_instanceFlags.get(this.segment(), 0L, index); }
    public int instanceIndexAt(long index) { return (int) VH_instanceIndex.get(this.segment(), 0L, index); }
    public int partitionIndexAt(long index) { return (int) VH_partitionIndex.get(this.segment(), 0L, index); }
    public long accelerationStructureAt(long index) { return (long) VH_accelerationStructure.get(this.segment(), 0L, index); }
    public float transform$matrix(long index0, long index1) { return (float) VH_transform$matrix.get(this.segment(), 0L, 0L, index0, index1); }
    public float explicitAABB(long index0) { return (float) VH_explicitAABB.get(this.segment(), 0L, 0L, index0); }
    public int instanceID() { return (int) VH_instanceID.get(this.segment(), 0L, 0L); }
    public int instanceMask() { return (int) VH_instanceMask.get(this.segment(), 0L, 0L); }
    public int instanceContributionToHitGroupIndex() { return (int) VH_instanceContributionToHitGroupIndex.get(this.segment(), 0L, 0L); }
    public int instanceFlags() { return (int) VH_instanceFlags.get(this.segment(), 0L, 0L); }
    public int instanceIndex() { return (int) VH_instanceIndex.get(this.segment(), 0L, 0L); }
    public int partitionIndex() { return (int) VH_partitionIndex.get(this.segment(), 0L, 0L); }
    public long accelerationStructure() { return (long) VH_accelerationStructure.get(this.segment(), 0L, 0L); }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV transform$matrixAt(long index, long index0, long index1, float value) { VH_transform$matrix.set(this.segment(), 0L, index, index0, index1, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV explicitAABBAt(long index, long index0, float value) { VH_explicitAABB.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceIDAt(long index, int value) { VH_instanceID.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceMaskAt(long index, int value) { VH_instanceMask.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceContributionToHitGroupIndexAt(long index, int value) { VH_instanceContributionToHitGroupIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceFlagsAt(long index, int value) { VH_instanceFlags.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceIndexAt(long index, int value) { VH_instanceIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV partitionIndexAt(long index, int value) { VH_partitionIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV accelerationStructureAt(long index, long value) { VH_accelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV transform$matrix(long index0, long index1, float value) { VH_transform$matrix.set(this.segment(), 0L, 0L, index0, index1, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV explicitAABB(long index0, float value) { VH_explicitAABB.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceID(int value) { VH_instanceID.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceMask(int value) { VH_instanceMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceContributionToHitGroupIndex(int value) { VH_instanceContributionToHitGroupIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceFlags(int value) { VH_instanceFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceIndex(int value) { VH_instanceIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV partitionIndex(int value) { VH_partitionIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV accelerationStructure(long value) { VH_accelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _transformAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transform, index), LAYOUT_transform); }
    public MemorySegment _transform() { return _transformAt(0L); }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _transformAt(long index, MemorySegment src) { _transformAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _transform(MemorySegment src) { return _transformAt(0L, src); }
    public MemorySegment _explicitAABBAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_explicitAABB, index), LAYOUT_explicitAABB); }
    public MemorySegment _explicitAABB() { return _explicitAABBAt(0L); }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _explicitAABBAt(long index, MemorySegment src) { _explicitAABBAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _explicitAABB(MemorySegment src) { return _explicitAABBAt(0L, src); }
    public MemorySegment _instanceIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_instanceID, index), LAYOUT_instanceID); }
    public MemorySegment _instanceID() { return _instanceIDAt(0L); }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _instanceIDAt(long index, MemorySegment src) { _instanceIDAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _instanceID(MemorySegment src) { return _instanceIDAt(0L, src); }
    public MemorySegment _instanceMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_instanceMask, index), LAYOUT_instanceMask); }
    public MemorySegment _instanceMask() { return _instanceMaskAt(0L); }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _instanceMaskAt(long index, MemorySegment src) { _instanceMaskAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _instanceMask(MemorySegment src) { return _instanceMaskAt(0L, src); }
    public MemorySegment _instanceContributionToHitGroupIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_instanceContributionToHitGroupIndex, index), LAYOUT_instanceContributionToHitGroupIndex); }
    public MemorySegment _instanceContributionToHitGroupIndex() { return _instanceContributionToHitGroupIndexAt(0L); }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _instanceContributionToHitGroupIndexAt(long index, MemorySegment src) { _instanceContributionToHitGroupIndexAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _instanceContributionToHitGroupIndex(MemorySegment src) { return _instanceContributionToHitGroupIndexAt(0L, src); }
    public MemorySegment _instanceFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_instanceFlags, index), LAYOUT_instanceFlags); }
    public MemorySegment _instanceFlags() { return _instanceFlagsAt(0L); }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _instanceFlagsAt(long index, MemorySegment src) { _instanceFlagsAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _instanceFlags(MemorySegment src) { return _instanceFlagsAt(0L, src); }
    public MemorySegment _instanceIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_instanceIndex, index), LAYOUT_instanceIndex); }
    public MemorySegment _instanceIndex() { return _instanceIndexAt(0L); }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _instanceIndexAt(long index, MemorySegment src) { _instanceIndexAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _instanceIndex(MemorySegment src) { return _instanceIndexAt(0L, src); }
    public MemorySegment _partitionIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_partitionIndex, index), LAYOUT_partitionIndex); }
    public MemorySegment _partitionIndex() { return _partitionIndexAt(0L); }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _partitionIndexAt(long index, MemorySegment src) { _partitionIndexAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _partitionIndex(MemorySegment src) { return _partitionIndexAt(0L, src); }
    public MemorySegment _accelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructure, index), LAYOUT_accelerationStructure); }
    public MemorySegment _accelerationStructure() { return _accelerationStructureAt(0L); }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _accelerationStructureAt(long index, MemorySegment src) { _accelerationStructureAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureWriteInstanceDataNV _accelerationStructure(MemorySegment src) { return _accelerationStructureAt(0L, src); }
}

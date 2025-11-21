// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPartitionedAccelerationStructureUpdateInstanceDataNV`.
/// ## Layout
/// ```
/// struct VkPartitionedAccelerationStructureUpdateInstanceDataNV {
///     uint32_t instanceIndex;
///     uint32_t instanceContributionToHitGroupIndex;
///     VkDeviceAddress accelerationStructure;
/// }
/// ```
public final class VkPartitionedAccelerationStructureUpdateInstanceDataNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("instanceIndex"),
        ValueLayout.JAVA_INT.withName("instanceContributionToHitGroupIndex"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure")
    );
    public static final long OFFSET_instanceIndex = LAYOUT.byteOffset(PathElement.groupElement("instanceIndex"));
    public static final long OFFSET_instanceContributionToHitGroupIndex = LAYOUT.byteOffset(PathElement.groupElement("instanceContributionToHitGroupIndex"));
    public static final long OFFSET_accelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
    public static final MemoryLayout LAYOUT_instanceIndex = LAYOUT.select(PathElement.groupElement("instanceIndex"));
    public static final MemoryLayout LAYOUT_instanceContributionToHitGroupIndex = LAYOUT.select(PathElement.groupElement("instanceContributionToHitGroupIndex"));
    public static final MemoryLayout LAYOUT_accelerationStructure = LAYOUT.select(PathElement.groupElement("accelerationStructure"));
    public static final VarHandle VH_instanceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceIndex"));
    public static final VarHandle VH_instanceContributionToHitGroupIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceContributionToHitGroupIndex"));
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));

    public VkPartitionedAccelerationStructureUpdateInstanceDataNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureUpdateInstanceDataNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureUpdateInstanceDataNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureUpdateInstanceDataNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV alloc(SegmentAllocator allocator) { return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(allocator.allocate(LAYOUT), 1); }
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV alloc(SegmentAllocator allocator, long count) { return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(allocator.allocate(LAYOUT, count), count); }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV copyFrom(VkPartitionedAccelerationStructureUpdateInstanceDataNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV reinterpret(long count) { return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV asSlice(long index) { return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV asSlice(long index, long count) { return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV at(long index, Consumer<VkPartitionedAccelerationStructureUpdateInstanceDataNV> func) { func.accept(asSlice(index)); return this; }
    public int instanceIndexAt(long index) { return (int) VH_instanceIndex.get(this.segment(), 0L, index); }
    public int instanceContributionToHitGroupIndexAt(long index) { return (int) VH_instanceContributionToHitGroupIndex.get(this.segment(), 0L, index); }
    public long accelerationStructureAt(long index) { return (long) VH_accelerationStructure.get(this.segment(), 0L, index); }
    public int instanceIndex() { return (int) VH_instanceIndex.get(this.segment(), 0L, 0L); }
    public int instanceContributionToHitGroupIndex() { return (int) VH_instanceContributionToHitGroupIndex.get(this.segment(), 0L, 0L); }
    public long accelerationStructure() { return (long) VH_accelerationStructure.get(this.segment(), 0L, 0L); }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV instanceIndexAt(long index, int value) { VH_instanceIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV instanceContributionToHitGroupIndexAt(long index, int value) { VH_instanceContributionToHitGroupIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV accelerationStructureAt(long index, long value) { VH_accelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV instanceIndex(int value) { VH_instanceIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV instanceContributionToHitGroupIndex(int value) { VH_instanceContributionToHitGroupIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV accelerationStructure(long value) { VH_accelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _instanceIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_instanceIndex, index), LAYOUT_instanceIndex); }
    public MemorySegment _instanceIndex() { return _instanceIndexAt(0L); }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV _instanceIndexAt(long index, MemorySegment src) { _instanceIndexAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV _instanceIndex(MemorySegment src) { return _instanceIndexAt(0L, src); }
    public MemorySegment _instanceContributionToHitGroupIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_instanceContributionToHitGroupIndex, index), LAYOUT_instanceContributionToHitGroupIndex); }
    public MemorySegment _instanceContributionToHitGroupIndex() { return _instanceContributionToHitGroupIndexAt(0L); }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV _instanceContributionToHitGroupIndexAt(long index, MemorySegment src) { _instanceContributionToHitGroupIndexAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV _instanceContributionToHitGroupIndex(MemorySegment src) { return _instanceContributionToHitGroupIndexAt(0L, src); }
    public MemorySegment _accelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructure, index), LAYOUT_accelerationStructure); }
    public MemorySegment _accelerationStructure() { return _accelerationStructureAt(0L); }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV _accelerationStructureAt(long index, MemorySegment src) { _accelerationStructureAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV _accelerationStructure(MemorySegment src) { return _accelerationStructureAt(0L, src); }
}

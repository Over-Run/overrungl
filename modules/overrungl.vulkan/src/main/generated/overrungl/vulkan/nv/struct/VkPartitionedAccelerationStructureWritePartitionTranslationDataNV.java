// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`.
/// ## Layout
/// ```
/// struct VkPartitionedAccelerationStructureWritePartitionTranslationDataNV {
///     uint32_t partitionIndex;
///     float partitionTranslation[3];
/// }
/// ```
public final class VkPartitionedAccelerationStructureWritePartitionTranslationDataNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("partitionIndex"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_FLOAT).withName("partitionTranslation")
    );
    public static final long OFFSET_partitionIndex = LAYOUT.byteOffset(PathElement.groupElement("partitionIndex"));
    public static final long OFFSET_partitionTranslation = LAYOUT.byteOffset(PathElement.groupElement("partitionTranslation"));
    public static final MemoryLayout LAYOUT_partitionIndex = LAYOUT.select(PathElement.groupElement("partitionIndex"));
    public static final MemoryLayout LAYOUT_partitionTranslation = LAYOUT.select(PathElement.groupElement("partitionTranslation"));
    public static final VarHandle VH_partitionIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("partitionIndex"));
    public static final VarHandle VH_partitionTranslation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("partitionTranslation"), PathElement.sequenceElement());

    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV alloc(SegmentAllocator allocator) { return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(allocator.allocate(LAYOUT), 1); }
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV alloc(SegmentAllocator allocator, long count) { return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(allocator.allocate(LAYOUT, count), count); }
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV copyFrom(VkPartitionedAccelerationStructureWritePartitionTranslationDataNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV reinterpret(long count) { return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV asSlice(long index) { return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV asSlice(long index, long count) { return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV at(long index, Consumer<VkPartitionedAccelerationStructureWritePartitionTranslationDataNV> func) { func.accept(asSlice(index)); return this; }
    public int partitionIndexAt(long index) { return (int) VH_partitionIndex.get(this.segment(), 0L, index); }
    public float partitionTranslationAt(long index, long index0) { return (float) VH_partitionTranslation.get(this.segment(), 0L, index, index0); }
    public int partitionIndex() { return (int) VH_partitionIndex.get(this.segment(), 0L, 0L); }
    public float partitionTranslation(long index0) { return (float) VH_partitionTranslation.get(this.segment(), 0L, 0L, index0); }
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionIndexAt(long index, int value) { VH_partitionIndex.set(this.segment(), 0L, index, value); return this; }
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionTranslationAt(long index, long index0, float value) { VH_partitionTranslation.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionIndex(int value) { VH_partitionIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionTranslation(long index0, float value) { VH_partitionTranslation.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _partitionIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_partitionIndex, index), LAYOUT_partitionIndex); }
    public MemorySegment _partitionIndex() { return _partitionIndexAt(0L); }
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV _partitionIndexAt(long index, MemorySegment src) { _partitionIndexAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV _partitionIndex(MemorySegment src) { return _partitionIndexAt(0L, src); }
    public MemorySegment _partitionTranslationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_partitionTranslation, index), LAYOUT_partitionTranslation); }
    public MemorySegment _partitionTranslation() { return _partitionTranslationAt(0L); }
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV _partitionTranslationAt(long index, MemorySegment src) { _partitionTranslationAt(index).copyFrom(src); return this; }
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV _partitionTranslation(MemorySegment src) { return _partitionTranslationAt(0L, src); }
}

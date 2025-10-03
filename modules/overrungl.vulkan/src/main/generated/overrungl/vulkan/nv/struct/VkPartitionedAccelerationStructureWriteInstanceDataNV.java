// This file is auto-generated. DO NOT EDIT!
//@formatter:off
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
///     (struct VkTransformMatrixKHR) VkTransformMatrixKHR transform;
///     float explicitAABB[6];
///     uint32_t instanceID;
///     uint32_t instanceMask;
///     uint32_t instanceContributionToHitGroupIndex;
///     ((uint32_t) VkFlags) VkPartitionedAccelerationStructureInstanceFlagsNV instanceFlags;
///     uint32_t instanceIndex;
///     uint32_t partitionIndex;
///     (uint64_t) VkDeviceAddress accelerationStructure;
/// };
/// ```
public final class VkPartitionedAccelerationStructureWriteInstanceDataNV extends GroupType {
    /// The struct layout of `VkPartitionedAccelerationStructureWriteInstanceDataNV`.
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
    /// The byte offset of `transform`.
    public static final long OFFSET_transform = LAYOUT.byteOffset(PathElement.groupElement("transform"));
    /// The memory layout of `transform`.
    public static final MemoryLayout LAYOUT_transform = LAYOUT.select(PathElement.groupElement("transform"));
    /// The byte offset of `explicitAABB`.
    public static final long OFFSET_explicitAABB = LAYOUT.byteOffset(PathElement.groupElement("explicitAABB"));
    /// The memory layout of `explicitAABB`.
    public static final MemoryLayout LAYOUT_explicitAABB = LAYOUT.select(PathElement.groupElement("explicitAABB"));
    /// The [VarHandle] of `explicitAABB` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_explicitAABB = LAYOUT.arrayElementVarHandle(PathElement.groupElement("explicitAABB"), PathElement.sequenceElement());
    /// The byte offset of `instanceID`.
    public static final long OFFSET_instanceID = LAYOUT.byteOffset(PathElement.groupElement("instanceID"));
    /// The memory layout of `instanceID`.
    public static final MemoryLayout LAYOUT_instanceID = LAYOUT.select(PathElement.groupElement("instanceID"));
    /// The [VarHandle] of `instanceID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_instanceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceID"));
    /// The byte offset of `instanceMask`.
    public static final long OFFSET_instanceMask = LAYOUT.byteOffset(PathElement.groupElement("instanceMask"));
    /// The memory layout of `instanceMask`.
    public static final MemoryLayout LAYOUT_instanceMask = LAYOUT.select(PathElement.groupElement("instanceMask"));
    /// The [VarHandle] of `instanceMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_instanceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceMask"));
    /// The byte offset of `instanceContributionToHitGroupIndex`.
    public static final long OFFSET_instanceContributionToHitGroupIndex = LAYOUT.byteOffset(PathElement.groupElement("instanceContributionToHitGroupIndex"));
    /// The memory layout of `instanceContributionToHitGroupIndex`.
    public static final MemoryLayout LAYOUT_instanceContributionToHitGroupIndex = LAYOUT.select(PathElement.groupElement("instanceContributionToHitGroupIndex"));
    /// The [VarHandle] of `instanceContributionToHitGroupIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_instanceContributionToHitGroupIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceContributionToHitGroupIndex"));
    /// The byte offset of `instanceFlags`.
    public static final long OFFSET_instanceFlags = LAYOUT.byteOffset(PathElement.groupElement("instanceFlags"));
    /// The memory layout of `instanceFlags`.
    public static final MemoryLayout LAYOUT_instanceFlags = LAYOUT.select(PathElement.groupElement("instanceFlags"));
    /// The [VarHandle] of `instanceFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_instanceFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceFlags"));
    /// The byte offset of `instanceIndex`.
    public static final long OFFSET_instanceIndex = LAYOUT.byteOffset(PathElement.groupElement("instanceIndex"));
    /// The memory layout of `instanceIndex`.
    public static final MemoryLayout LAYOUT_instanceIndex = LAYOUT.select(PathElement.groupElement("instanceIndex"));
    /// The [VarHandle] of `instanceIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_instanceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceIndex"));
    /// The byte offset of `partitionIndex`.
    public static final long OFFSET_partitionIndex = LAYOUT.byteOffset(PathElement.groupElement("partitionIndex"));
    /// The memory layout of `partitionIndex`.
    public static final MemoryLayout LAYOUT_partitionIndex = LAYOUT.select(PathElement.groupElement("partitionIndex"));
    /// The [VarHandle] of `partitionIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_partitionIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("partitionIndex"));
    /// The byte offset of `accelerationStructure`.
    public static final long OFFSET_accelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
    /// The memory layout of `accelerationStructure`.
    public static final MemoryLayout LAYOUT_accelerationStructure = LAYOUT.select(PathElement.groupElement("accelerationStructure"));
    /// The [VarHandle] of `accelerationStructure` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));

    /// Creates `VkPartitionedAccelerationStructureWriteInstanceDataNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPartitionedAccelerationStructureWriteInstanceDataNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPartitionedAccelerationStructureWriteInstanceDataNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureWriteInstanceDataNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPartitionedAccelerationStructureWriteInstanceDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureWriteInstanceDataNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPartitionedAccelerationStructureWriteInstanceDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureWriteInstanceDataNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPartitionedAccelerationStructureWriteInstanceDataNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPartitionedAccelerationStructureWriteInstanceDataNV`
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV alloc(SegmentAllocator allocator) { return new VkPartitionedAccelerationStructureWriteInstanceDataNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPartitionedAccelerationStructureWriteInstanceDataNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPartitionedAccelerationStructureWriteInstanceDataNV`
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV alloc(SegmentAllocator allocator, long count) { return new VkPartitionedAccelerationStructureWriteInstanceDataNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV copyFrom(VkPartitionedAccelerationStructureWriteInstanceDataNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPartitionedAccelerationStructureWriteInstanceDataNV reinterpret(long count) { return new VkPartitionedAccelerationStructureWriteInstanceDataNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `transform` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment transform(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_transform, index), LAYOUT_transform); }
    /// {@return `transform`}
    public MemorySegment transform() { return transform(this.segment(), 0L); }
    /// Sets `transform` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transform(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_transform, index), LAYOUT_transform.byteSize()); }
    /// Sets `transform` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV transform(MemorySegment value) { transform(this.segment(), 0L, value); return this; }
    /// Accepts `transform` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV transform(Consumer<overrungl.vulkan.khr.struct.VkTransformMatrixKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkTransformMatrixKHR.of(transform())); return this; }

    /// {@return `explicitAABB` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment explicitAABB(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_explicitAABB, index), LAYOUT_explicitAABB); }
    /// {@return `explicitAABB` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static float explicitAABB(MemorySegment segment, long index, long index0) { return (float) VH_explicitAABB.get(segment, 0L, index, index0); }
    /// {@return `explicitAABB`}
    public MemorySegment explicitAABB() { return explicitAABB(this.segment(), 0L); }
    /// {@return `explicitAABB`}
    /// @param index0 the Index 0 of the array
    public float explicitAABB(long index0) { return explicitAABB(this.segment(), 0L, index0); }
    /// Sets `explicitAABB` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void explicitAABB(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_explicitAABB, index), LAYOUT_explicitAABB.byteSize()); }
    /// Sets `explicitAABB` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void explicitAABB(MemorySegment segment, long index, long index0, float value) { VH_explicitAABB.set(segment, 0L, index, index0, value); }
    /// Sets `explicitAABB` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV explicitAABB(MemorySegment value) { explicitAABB(this.segment(), 0L, value); return this; }
    /// Sets `explicitAABB` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV explicitAABB(long index0, float value) { explicitAABB(this.segment(), 0L, index0, value); return this; }

    /// {@return `instanceID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int instanceID(MemorySegment segment, long index) { return (int) VH_instanceID.get(segment, 0L, index); }
    /// {@return `instanceID`}
    public int instanceID() { return instanceID(this.segment(), 0L); }
    /// Sets `instanceID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void instanceID(MemorySegment segment, long index, int value) { VH_instanceID.set(segment, 0L, index, value); }
    /// Sets `instanceID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceID(int value) { instanceID(this.segment(), 0L, value); return this; }

    /// {@return `instanceMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int instanceMask(MemorySegment segment, long index) { return (int) VH_instanceMask.get(segment, 0L, index); }
    /// {@return `instanceMask`}
    public int instanceMask() { return instanceMask(this.segment(), 0L); }
    /// Sets `instanceMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void instanceMask(MemorySegment segment, long index, int value) { VH_instanceMask.set(segment, 0L, index, value); }
    /// Sets `instanceMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceMask(int value) { instanceMask(this.segment(), 0L, value); return this; }

    /// {@return `instanceContributionToHitGroupIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int instanceContributionToHitGroupIndex(MemorySegment segment, long index) { return (int) VH_instanceContributionToHitGroupIndex.get(segment, 0L, index); }
    /// {@return `instanceContributionToHitGroupIndex`}
    public int instanceContributionToHitGroupIndex() { return instanceContributionToHitGroupIndex(this.segment(), 0L); }
    /// Sets `instanceContributionToHitGroupIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void instanceContributionToHitGroupIndex(MemorySegment segment, long index, int value) { VH_instanceContributionToHitGroupIndex.set(segment, 0L, index, value); }
    /// Sets `instanceContributionToHitGroupIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceContributionToHitGroupIndex(int value) { instanceContributionToHitGroupIndex(this.segment(), 0L, value); return this; }

    /// {@return `instanceFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int instanceFlags(MemorySegment segment, long index) { return (int) VH_instanceFlags.get(segment, 0L, index); }
    /// {@return `instanceFlags`}
    public int instanceFlags() { return instanceFlags(this.segment(), 0L); }
    /// Sets `instanceFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void instanceFlags(MemorySegment segment, long index, int value) { VH_instanceFlags.set(segment, 0L, index, value); }
    /// Sets `instanceFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceFlags(int value) { instanceFlags(this.segment(), 0L, value); return this; }

    /// {@return `instanceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int instanceIndex(MemorySegment segment, long index) { return (int) VH_instanceIndex.get(segment, 0L, index); }
    /// {@return `instanceIndex`}
    public int instanceIndex() { return instanceIndex(this.segment(), 0L); }
    /// Sets `instanceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void instanceIndex(MemorySegment segment, long index, int value) { VH_instanceIndex.set(segment, 0L, index, value); }
    /// Sets `instanceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceIndex(int value) { instanceIndex(this.segment(), 0L, value); return this; }

    /// {@return `partitionIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int partitionIndex(MemorySegment segment, long index) { return (int) VH_partitionIndex.get(segment, 0L, index); }
    /// {@return `partitionIndex`}
    public int partitionIndex() { return partitionIndex(this.segment(), 0L); }
    /// Sets `partitionIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void partitionIndex(MemorySegment segment, long index, int value) { VH_partitionIndex.set(segment, 0L, index, value); }
    /// Sets `partitionIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV partitionIndex(int value) { partitionIndex(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long accelerationStructure(MemorySegment segment, long index) { return (long) VH_accelerationStructure.get(segment, 0L, index); }
    /// {@return `accelerationStructure`}
    public long accelerationStructure() { return accelerationStructure(this.segment(), 0L); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructure(MemorySegment segment, long index, long value) { VH_accelerationStructure.set(segment, 0L, index, value); }
    /// Sets `accelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV accelerationStructure(long value) { accelerationStructure(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPartitionedAccelerationStructureWriteInstanceDataNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPartitionedAccelerationStructureWriteInstanceDataNV`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV asSlice(long index) { return new VkPartitionedAccelerationStructureWriteInstanceDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPartitionedAccelerationStructureWriteInstanceDataNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPartitionedAccelerationStructureWriteInstanceDataNV`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV asSlice(long index, long count) { return new VkPartitionedAccelerationStructureWriteInstanceDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPartitionedAccelerationStructureWriteInstanceDataNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV at(long index, Consumer<VkPartitionedAccelerationStructureWriteInstanceDataNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `transform` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment transformAt(long index) { return transform(this.segment(), index); }
    /// Sets `transform` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV transformAt(long index, MemorySegment value) { transform(this.segment(), index, value); return this; }
    /// Accepts `transform` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV transformAt(long index, Consumer<overrungl.vulkan.khr.struct.VkTransformMatrixKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkTransformMatrixKHR.of(transformAt(index))); return this; }

    /// {@return `explicitAABB` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment explicitAABBAt(long index) { return explicitAABB(this.segment(), index); }
    /// {@return `explicitAABB` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public float explicitAABBAt(long index, long index0) { return explicitAABB(this.segment(), index, index0); }
    /// Sets `explicitAABB` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV explicitAABBAt(long index, MemorySegment value) { explicitAABB(this.segment(), index, value); return this; }
    /// Sets `explicitAABB` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV explicitAABBAt(long index, long index0, float value) { explicitAABB(this.segment(), index, index0, value); return this; }

    /// {@return `instanceID` at the given index}
    /// @param index the index of the struct buffer
    public int instanceIDAt(long index) { return instanceID(this.segment(), index); }
    /// Sets `instanceID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceIDAt(long index, int value) { instanceID(this.segment(), index, value); return this; }

    /// {@return `instanceMask` at the given index}
    /// @param index the index of the struct buffer
    public int instanceMaskAt(long index) { return instanceMask(this.segment(), index); }
    /// Sets `instanceMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceMaskAt(long index, int value) { instanceMask(this.segment(), index, value); return this; }

    /// {@return `instanceContributionToHitGroupIndex` at the given index}
    /// @param index the index of the struct buffer
    public int instanceContributionToHitGroupIndexAt(long index) { return instanceContributionToHitGroupIndex(this.segment(), index); }
    /// Sets `instanceContributionToHitGroupIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceContributionToHitGroupIndexAt(long index, int value) { instanceContributionToHitGroupIndex(this.segment(), index, value); return this; }

    /// {@return `instanceFlags` at the given index}
    /// @param index the index of the struct buffer
    public int instanceFlagsAt(long index) { return instanceFlags(this.segment(), index); }
    /// Sets `instanceFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceFlagsAt(long index, int value) { instanceFlags(this.segment(), index, value); return this; }

    /// {@return `instanceIndex` at the given index}
    /// @param index the index of the struct buffer
    public int instanceIndexAt(long index) { return instanceIndex(this.segment(), index); }
    /// Sets `instanceIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceIndexAt(long index, int value) { instanceIndex(this.segment(), index, value); return this; }

    /// {@return `partitionIndex` at the given index}
    /// @param index the index of the struct buffer
    public int partitionIndexAt(long index) { return partitionIndex(this.segment(), index); }
    /// Sets `partitionIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV partitionIndexAt(long index, int value) { partitionIndex(this.segment(), index, value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param index the index of the struct buffer
    public long accelerationStructureAt(long index) { return accelerationStructure(this.segment(), index); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWriteInstanceDataNV accelerationStructureAt(long index, long value) { accelerationStructure(this.segment(), index, value); return this; }

}

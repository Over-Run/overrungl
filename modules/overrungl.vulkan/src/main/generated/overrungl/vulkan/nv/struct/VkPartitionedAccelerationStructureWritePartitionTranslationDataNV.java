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

/// Represents `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`.
/// ## Layout
/// ```
/// struct VkPartitionedAccelerationStructureWritePartitionTranslationDataNV {
///     uint32_t partitionIndex;
///     float partitionTranslation[3];
/// };
/// ```
public final class VkPartitionedAccelerationStructureWritePartitionTranslationDataNV extends GroupType {
    /// The struct layout of `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("partitionIndex"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_FLOAT).withName("partitionTranslation")
    );
    /// The byte offset of `partitionIndex`.
    public static final long OFFSET_partitionIndex = LAYOUT.byteOffset(PathElement.groupElement("partitionIndex"));
    /// The memory layout of `partitionIndex`.
    public static final MemoryLayout LAYOUT_partitionIndex = LAYOUT.select(PathElement.groupElement("partitionIndex"));
    /// The [VarHandle] of `partitionIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_partitionIndex = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("partitionIndex")));
    /// The byte offset of `partitionTranslation`.
    public static final long OFFSET_partitionTranslation = LAYOUT.byteOffset(PathElement.groupElement("partitionTranslation"));
    /// The memory layout of `partitionTranslation`.
    public static final MemoryLayout LAYOUT_partitionTranslation = LAYOUT.select(PathElement.groupElement("partitionTranslation"));
    /// The [VarHandle] of `partitionTranslation` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_partitionTranslation = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("partitionTranslation"), PathElement.sequenceElement()));

    /// Creates `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV alloc(SegmentAllocator allocator) { return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`
    public static VkPartitionedAccelerationStructureWritePartitionTranslationDataNV alloc(SegmentAllocator allocator, long count) { return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV copyFrom(VkPartitionedAccelerationStructureWritePartitionTranslationDataNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV reinterpret(long count) { return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `partitionIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int partitionIndex(MemorySegment segment, long index) { return (int) VH_partitionIndex.get().get(segment, 0L, index); }
    /// {@return `partitionIndex`}
    public int partitionIndex() { return partitionIndex(this.segment(), 0L); }
    /// Sets `partitionIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void partitionIndex(MemorySegment segment, long index, int value) { VH_partitionIndex.get().set(segment, 0L, index, value); }
    /// Sets `partitionIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionIndex(int value) { partitionIndex(this.segment(), 0L, value); return this; }

    /// {@return `partitionTranslation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment partitionTranslation(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_partitionTranslation, index), LAYOUT_partitionTranslation); }
    /// {@return `partitionTranslation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static float partitionTranslation(MemorySegment segment, long index, long index0) { return (float) VH_partitionTranslation.get().get(segment, 0L, index, index0); }
    /// {@return `partitionTranslation`}
    public MemorySegment partitionTranslation() { return partitionTranslation(this.segment(), 0L); }
    /// {@return `partitionTranslation`}
    /// @param index0 the Index 0 of the array
    public float partitionTranslation(long index0) { return partitionTranslation(this.segment(), 0L, index0); }
    /// Sets `partitionTranslation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void partitionTranslation(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_partitionTranslation, index), LAYOUT_partitionTranslation.byteSize()); }
    /// Sets `partitionTranslation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void partitionTranslation(MemorySegment segment, long index, long index0, float value) { VH_partitionTranslation.get().set(segment, 0L, index, index0, value); }
    /// Sets `partitionTranslation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionTranslation(MemorySegment value) { partitionTranslation(this.segment(), 0L, value); return this; }
    /// Sets `partitionTranslation` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionTranslation(long index0, float value) { partitionTranslation(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV asSlice(long index) { return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV`
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV asSlice(long index, long count) { return new VkPartitionedAccelerationStructureWritePartitionTranslationDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPartitionedAccelerationStructureWritePartitionTranslationDataNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV at(long index, Consumer<VkPartitionedAccelerationStructureWritePartitionTranslationDataNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `partitionIndex` at the given index}
    /// @param index the index of the struct buffer
    public int partitionIndexAt(long index) { return partitionIndex(this.segment(), index); }
    /// Sets `partitionIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionIndexAt(long index, int value) { partitionIndex(this.segment(), index, value); return this; }

    /// {@return `partitionTranslation` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment partitionTranslationAt(long index) { return partitionTranslation(this.segment(), index); }
    /// {@return `partitionTranslation` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public float partitionTranslationAt(long index, long index0) { return partitionTranslation(this.segment(), index, index0); }
    /// Sets `partitionTranslation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionTranslationAt(long index, MemorySegment value) { partitionTranslation(this.segment(), index, value); return this; }
    /// Sets `partitionTranslation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPartitionedAccelerationStructureWritePartitionTranslationDataNV partitionTranslationAt(long index, long index0, float value) { partitionTranslation(this.segment(), index, index0, value); return this; }

}

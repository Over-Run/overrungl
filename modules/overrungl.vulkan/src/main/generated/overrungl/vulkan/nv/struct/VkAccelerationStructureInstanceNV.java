// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureInstanceNV`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureInstanceNV {
///     (struct VkTransformMatrixKHR) VkTransformMatrixKHR transform;
///     uint32_t instanceCustomIndex : 24;
///     uint32_t mask : 8;
///     uint32_t instanceShaderBindingTableRecordOffset : 24;
///     ((uint32_t) VkFlags) VkGeometryInstanceFlagsKHR flags : 8;
///     uint64_t accelerationStructureReference;
/// };
/// ```
public final class VkAccelerationStructureInstanceNV extends GroupType {
    /// The struct layout of `VkAccelerationStructureInstanceNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        overrungl.vulkan.khr.struct.VkTransformMatrixKHR.LAYOUT.withName("transform"), -1,
        ValueLayout.JAVA_INT.withName("instanceCustomIndex"), 24,
        ValueLayout.JAVA_INT.withName("mask"), 8,
        ValueLayout.JAVA_INT.withName("instanceShaderBindingTableRecordOffset"), 24,
        ValueLayout.JAVA_INT.withName("flags"), 8,
        ValueLayout.JAVA_LONG.withName("accelerationStructureReference"), -1
    );
    /// The byte offset of `transform`.
    public static final long OFFSET_transform = LAYOUT.byteOffset(PathElement.groupElement("transform"));
    /// The memory layout of `transform`.
    public static final MemoryLayout LAYOUT_transform = LAYOUT.select(PathElement.groupElement("transform"));
    /// The byte offset of `accelerationStructureReference`.
    public static final long OFFSET_accelerationStructureReference = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureReference"));
    /// The memory layout of `accelerationStructureReference`.
    public static final MemoryLayout LAYOUT_accelerationStructureReference = LAYOUT.select(PathElement.groupElement("accelerationStructureReference"));
    /// The [VarHandle] of `accelerationStructureReference` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructureReference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureReference"));

    /// Creates `VkAccelerationStructureInstanceNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAccelerationStructureInstanceNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAccelerationStructureInstanceNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureInstanceNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureInstanceNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureInstanceNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureInstanceNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureInstanceNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAccelerationStructureInstanceNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureInstanceNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureInstanceNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureInstanceNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureInstanceNV`
    public static VkAccelerationStructureInstanceNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureInstanceNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAccelerationStructureInstanceNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureInstanceNV`
    public static VkAccelerationStructureInstanceNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureInstanceNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureInstanceNV copyFrom(VkAccelerationStructureInstanceNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAccelerationStructureInstanceNV reinterpret(long count) { return new VkAccelerationStructureInstanceNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAccelerationStructureInstanceNV transform(MemorySegment value) { transform(this.segment(), 0L, value); return this; }
    /// Accepts `transform` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureInstanceNV transform(Consumer<overrungl.vulkan.khr.struct.VkTransformMatrixKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkTransformMatrixKHR.of(transform())); return this; }

    /// {@return `accelerationStructureReference` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long accelerationStructureReference(MemorySegment segment, long index) { return (long) VH_accelerationStructureReference.get(segment, 0L, index); }
    /// {@return `accelerationStructureReference`}
    public long accelerationStructureReference() { return accelerationStructureReference(this.segment(), 0L); }
    /// Sets `accelerationStructureReference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructureReference(MemorySegment segment, long index, long value) { VH_accelerationStructureReference.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureReference` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceNV accelerationStructureReference(long value) { accelerationStructureReference(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAccelerationStructureInstanceNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureInstanceNV`
    public VkAccelerationStructureInstanceNV asSlice(long index) { return new VkAccelerationStructureInstanceNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAccelerationStructureInstanceNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureInstanceNV`
    public VkAccelerationStructureInstanceNV asSlice(long index, long count) { return new VkAccelerationStructureInstanceNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAccelerationStructureInstanceNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAccelerationStructureInstanceNV at(long index, Consumer<VkAccelerationStructureInstanceNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `transform` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment transformAt(long index) { return transform(this.segment(), index); }
    /// Sets `transform` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceNV transformAt(long index, MemorySegment value) { transform(this.segment(), index, value); return this; }
    /// Accepts `transform` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureInstanceNV transformAt(long index, Consumer<overrungl.vulkan.khr.struct.VkTransformMatrixKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkTransformMatrixKHR.of(transformAt(index))); return this; }

    /// {@return `accelerationStructureReference` at the given index}
    /// @param index the index of the struct buffer
    public long accelerationStructureReferenceAt(long index) { return accelerationStructureReference(this.segment(), index); }
    /// Sets `accelerationStructureReference` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceNV accelerationStructureReferenceAt(long index, long value) { accelerationStructureReference(this.segment(), index, value); return this; }

}

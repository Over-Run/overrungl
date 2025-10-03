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

/// Represents `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`.
/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV {
///     uint32_t geometryIndex : 24;
///     uint32_t reserved : 5;
///     uint32_t geometryFlags : 3;
/// };
/// ```
public final class VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV extends GroupType {
    /// The struct layout of `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("geometryIndex"), 24,
        ValueLayout.JAVA_INT.withName("reserved"), 5,
        ValueLayout.JAVA_INT.withName("geometryFlags"), 3
    );

    /// Creates `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV copyFrom(VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV reinterpret(long count) { return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// Creates a slice of `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV asSlice(long index) { return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV`
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV asSlice(long index, long count) { return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV at(long index, Consumer<VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> func) { func.accept(asSlice(index)); return this; }

}

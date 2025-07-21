/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureBuildTriangleClusterInfoNV {
///     uint32_t clusterID;
///     ((uint32_t) VkFlags) VkClusterAccelerationStructureClusterFlagsNV clusterFlags;
///     uint32_t triangleCount : 9;
///     uint32_t vertexCount : 9;
///     uint32_t positionTruncateBitCount : 6;
///     uint32_t indexType : 4;
///     uint32_t opacityMicromapIndexType : 4;
///     (struct VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV) VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV baseGeometryIndexAndGeometryFlags;
///     uint16_t indexBufferStride;
///     uint16_t vertexBufferStride;
///     uint16_t geometryIndexAndFlagsBufferStride;
///     uint16_t opacityMicromapIndexBufferStride;
///     (uint64_t) VkDeviceAddress indexBuffer;
///     (uint64_t) VkDeviceAddress vertexBuffer;
///     (uint64_t) VkDeviceAddress geometryIndexAndFlagsBuffer;
///     (uint64_t) VkDeviceAddress opacityMicromapArray;
///     (uint64_t) VkDeviceAddress opacityMicromapIndexBuffer;
/// };
/// ```
public final class VkClusterAccelerationStructureBuildTriangleClusterInfoNV extends GroupType {
    /// The struct layout of `VkClusterAccelerationStructureBuildTriangleClusterInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        ValueLayout.JAVA_INT.withName("clusterID"), -1,
        ValueLayout.JAVA_INT.withName("clusterFlags"), -1,
        ValueLayout.JAVA_INT.withName("triangleCount"), 9,
        ValueLayout.JAVA_INT.withName("vertexCount"), 9,
        ValueLayout.JAVA_INT.withName("positionTruncateBitCount"), 6,
        ValueLayout.JAVA_INT.withName("indexType"), 4,
        ValueLayout.JAVA_INT.withName("opacityMicromapIndexType"), 4,
        overrungl.vulkan.nv.struct.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.LAYOUT.withName("baseGeometryIndexAndGeometryFlags"), -1,
        ValueLayout.JAVA_SHORT.withName("indexBufferStride"), -1,
        ValueLayout.JAVA_SHORT.withName("vertexBufferStride"), -1,
        ValueLayout.JAVA_SHORT.withName("geometryIndexAndFlagsBufferStride"), -1,
        ValueLayout.JAVA_SHORT.withName("opacityMicromapIndexBufferStride"), -1,
        ValueLayout.JAVA_LONG.withName("indexBuffer"), -1,
        ValueLayout.JAVA_LONG.withName("vertexBuffer"), -1,
        ValueLayout.JAVA_LONG.withName("geometryIndexAndFlagsBuffer"), -1,
        ValueLayout.JAVA_LONG.withName("opacityMicromapArray"), -1,
        ValueLayout.JAVA_LONG.withName("opacityMicromapIndexBuffer"), -1
    );
    /// The byte offset of `clusterID`.
    public static final long OFFSET_clusterID = LAYOUT.byteOffset(PathElement.groupElement("clusterID"));
    /// The memory layout of `clusterID`.
    public static final MemoryLayout LAYOUT_clusterID = LAYOUT.select(PathElement.groupElement("clusterID"));
    /// The [VarHandle] of `clusterID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clusterID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterID"));
    /// The byte offset of `clusterFlags`.
    public static final long OFFSET_clusterFlags = LAYOUT.byteOffset(PathElement.groupElement("clusterFlags"));
    /// The memory layout of `clusterFlags`.
    public static final MemoryLayout LAYOUT_clusterFlags = LAYOUT.select(PathElement.groupElement("clusterFlags"));
    /// The [VarHandle] of `clusterFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clusterFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clusterFlags"));
    /// The byte offset of `baseGeometryIndexAndGeometryFlags`.
    public static final long OFFSET_baseGeometryIndexAndGeometryFlags = LAYOUT.byteOffset(PathElement.groupElement("baseGeometryIndexAndGeometryFlags"));
    /// The memory layout of `baseGeometryIndexAndGeometryFlags`.
    public static final MemoryLayout LAYOUT_baseGeometryIndexAndGeometryFlags = LAYOUT.select(PathElement.groupElement("baseGeometryIndexAndGeometryFlags"));
    /// The byte offset of `indexBufferStride`.
    public static final long OFFSET_indexBufferStride = LAYOUT.byteOffset(PathElement.groupElement("indexBufferStride"));
    /// The memory layout of `indexBufferStride`.
    public static final MemoryLayout LAYOUT_indexBufferStride = LAYOUT.select(PathElement.groupElement("indexBufferStride"));
    /// The [VarHandle] of `indexBufferStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexBufferStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexBufferStride"));
    /// The byte offset of `vertexBufferStride`.
    public static final long OFFSET_vertexBufferStride = LAYOUT.byteOffset(PathElement.groupElement("vertexBufferStride"));
    /// The memory layout of `vertexBufferStride`.
    public static final MemoryLayout LAYOUT_vertexBufferStride = LAYOUT.select(PathElement.groupElement("vertexBufferStride"));
    /// The [VarHandle] of `vertexBufferStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexBufferStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBufferStride"));
    /// The byte offset of `geometryIndexAndFlagsBufferStride`.
    public static final long OFFSET_geometryIndexAndFlagsBufferStride = LAYOUT.byteOffset(PathElement.groupElement("geometryIndexAndFlagsBufferStride"));
    /// The memory layout of `geometryIndexAndFlagsBufferStride`.
    public static final MemoryLayout LAYOUT_geometryIndexAndFlagsBufferStride = LAYOUT.select(PathElement.groupElement("geometryIndexAndFlagsBufferStride"));
    /// The [VarHandle] of `geometryIndexAndFlagsBufferStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_geometryIndexAndFlagsBufferStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryIndexAndFlagsBufferStride"));
    /// The byte offset of `opacityMicromapIndexBufferStride`.
    public static final long OFFSET_opacityMicromapIndexBufferStride = LAYOUT.byteOffset(PathElement.groupElement("opacityMicromapIndexBufferStride"));
    /// The memory layout of `opacityMicromapIndexBufferStride`.
    public static final MemoryLayout LAYOUT_opacityMicromapIndexBufferStride = LAYOUT.select(PathElement.groupElement("opacityMicromapIndexBufferStride"));
    /// The [VarHandle] of `opacityMicromapIndexBufferStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_opacityMicromapIndexBufferStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opacityMicromapIndexBufferStride"));
    /// The byte offset of `indexBuffer`.
    public static final long OFFSET_indexBuffer = LAYOUT.byteOffset(PathElement.groupElement("indexBuffer"));
    /// The memory layout of `indexBuffer`.
    public static final MemoryLayout LAYOUT_indexBuffer = LAYOUT.select(PathElement.groupElement("indexBuffer"));
    /// The [VarHandle] of `indexBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexBuffer"));
    /// The byte offset of `vertexBuffer`.
    public static final long OFFSET_vertexBuffer = LAYOUT.byteOffset(PathElement.groupElement("vertexBuffer"));
    /// The memory layout of `vertexBuffer`.
    public static final MemoryLayout LAYOUT_vertexBuffer = LAYOUT.select(PathElement.groupElement("vertexBuffer"));
    /// The [VarHandle] of `vertexBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBuffer"));
    /// The byte offset of `geometryIndexAndFlagsBuffer`.
    public static final long OFFSET_geometryIndexAndFlagsBuffer = LAYOUT.byteOffset(PathElement.groupElement("geometryIndexAndFlagsBuffer"));
    /// The memory layout of `geometryIndexAndFlagsBuffer`.
    public static final MemoryLayout LAYOUT_geometryIndexAndFlagsBuffer = LAYOUT.select(PathElement.groupElement("geometryIndexAndFlagsBuffer"));
    /// The [VarHandle] of `geometryIndexAndFlagsBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_geometryIndexAndFlagsBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryIndexAndFlagsBuffer"));
    /// The byte offset of `opacityMicromapArray`.
    public static final long OFFSET_opacityMicromapArray = LAYOUT.byteOffset(PathElement.groupElement("opacityMicromapArray"));
    /// The memory layout of `opacityMicromapArray`.
    public static final MemoryLayout LAYOUT_opacityMicromapArray = LAYOUT.select(PathElement.groupElement("opacityMicromapArray"));
    /// The [VarHandle] of `opacityMicromapArray` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_opacityMicromapArray = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opacityMicromapArray"));
    /// The byte offset of `opacityMicromapIndexBuffer`.
    public static final long OFFSET_opacityMicromapIndexBuffer = LAYOUT.byteOffset(PathElement.groupElement("opacityMicromapIndexBuffer"));
    /// The memory layout of `opacityMicromapIndexBuffer`.
    public static final MemoryLayout LAYOUT_opacityMicromapIndexBuffer = LAYOUT.select(PathElement.groupElement("opacityMicromapIndexBuffer"));
    /// The [VarHandle] of `opacityMicromapIndexBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_opacityMicromapIndexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opacityMicromapIndexBuffer"));

    /// Creates `VkClusterAccelerationStructureBuildTriangleClusterInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkClusterAccelerationStructureBuildTriangleClusterInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClusterAccelerationStructureBuildTriangleClusterInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkClusterAccelerationStructureBuildTriangleClusterInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClusterAccelerationStructureBuildTriangleClusterInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClusterAccelerationStructureBuildTriangleClusterInfoNV`
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkClusterAccelerationStructureBuildTriangleClusterInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClusterAccelerationStructureBuildTriangleClusterInfoNV`
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV copyFrom(VkClusterAccelerationStructureBuildTriangleClusterInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV reinterpret(long count) { return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `clusterID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clusterID(MemorySegment segment, long index) { return (int) VH_clusterID.get(segment, 0L, index); }
    /// {@return `clusterID`}
    public int clusterID() { return clusterID(this.segment(), 0L); }
    /// Sets `clusterID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clusterID(MemorySegment segment, long index, int value) { VH_clusterID.set(segment, 0L, index, value); }
    /// Sets `clusterID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV clusterID(int value) { clusterID(this.segment(), 0L, value); return this; }

    /// {@return `clusterFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clusterFlags(MemorySegment segment, long index) { return (int) VH_clusterFlags.get(segment, 0L, index); }
    /// {@return `clusterFlags`}
    public int clusterFlags() { return clusterFlags(this.segment(), 0L); }
    /// Sets `clusterFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clusterFlags(MemorySegment segment, long index, int value) { VH_clusterFlags.set(segment, 0L, index, value); }
    /// Sets `clusterFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV clusterFlags(int value) { clusterFlags(this.segment(), 0L, value); return this; }

    /// {@return `baseGeometryIndexAndGeometryFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment baseGeometryIndexAndGeometryFlags(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_baseGeometryIndexAndGeometryFlags, index), LAYOUT_baseGeometryIndexAndGeometryFlags); }
    /// {@return `baseGeometryIndexAndGeometryFlags`}
    public MemorySegment baseGeometryIndexAndGeometryFlags() { return baseGeometryIndexAndGeometryFlags(this.segment(), 0L); }
    /// Sets `baseGeometryIndexAndGeometryFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void baseGeometryIndexAndGeometryFlags(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_baseGeometryIndexAndGeometryFlags, index), LAYOUT_baseGeometryIndexAndGeometryFlags.byteSize()); }
    /// Sets `baseGeometryIndexAndGeometryFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV baseGeometryIndexAndGeometryFlags(MemorySegment value) { baseGeometryIndexAndGeometryFlags(this.segment(), 0L, value); return this; }
    /// Accepts `baseGeometryIndexAndGeometryFlags` with the given function.
    /// @param func the function
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV baseGeometryIndexAndGeometryFlags(Consumer<overrungl.vulkan.nv.struct.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> func) { func.accept(overrungl.vulkan.nv.struct.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.of(baseGeometryIndexAndGeometryFlags())); return this; }

    /// {@return `indexBufferStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short indexBufferStride(MemorySegment segment, long index) { return (short) VH_indexBufferStride.get(segment, 0L, index); }
    /// {@return `indexBufferStride`}
    public short indexBufferStride() { return indexBufferStride(this.segment(), 0L); }
    /// Sets `indexBufferStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexBufferStride(MemorySegment segment, long index, short value) { VH_indexBufferStride.set(segment, 0L, index, value); }
    /// Sets `indexBufferStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexBufferStride(short value) { indexBufferStride(this.segment(), 0L, value); return this; }

    /// {@return `vertexBufferStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short vertexBufferStride(MemorySegment segment, long index) { return (short) VH_vertexBufferStride.get(segment, 0L, index); }
    /// {@return `vertexBufferStride`}
    public short vertexBufferStride() { return vertexBufferStride(this.segment(), 0L); }
    /// Sets `vertexBufferStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexBufferStride(MemorySegment segment, long index, short value) { VH_vertexBufferStride.set(segment, 0L, index, value); }
    /// Sets `vertexBufferStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexBufferStride(short value) { vertexBufferStride(this.segment(), 0L, value); return this; }

    /// {@return `geometryIndexAndFlagsBufferStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short geometryIndexAndFlagsBufferStride(MemorySegment segment, long index) { return (short) VH_geometryIndexAndFlagsBufferStride.get(segment, 0L, index); }
    /// {@return `geometryIndexAndFlagsBufferStride`}
    public short geometryIndexAndFlagsBufferStride() { return geometryIndexAndFlagsBufferStride(this.segment(), 0L); }
    /// Sets `geometryIndexAndFlagsBufferStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void geometryIndexAndFlagsBufferStride(MemorySegment segment, long index, short value) { VH_geometryIndexAndFlagsBufferStride.set(segment, 0L, index, value); }
    /// Sets `geometryIndexAndFlagsBufferStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV geometryIndexAndFlagsBufferStride(short value) { geometryIndexAndFlagsBufferStride(this.segment(), 0L, value); return this; }

    /// {@return `opacityMicromapIndexBufferStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short opacityMicromapIndexBufferStride(MemorySegment segment, long index) { return (short) VH_opacityMicromapIndexBufferStride.get(segment, 0L, index); }
    /// {@return `opacityMicromapIndexBufferStride`}
    public short opacityMicromapIndexBufferStride() { return opacityMicromapIndexBufferStride(this.segment(), 0L); }
    /// Sets `opacityMicromapIndexBufferStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void opacityMicromapIndexBufferStride(MemorySegment segment, long index, short value) { VH_opacityMicromapIndexBufferStride.set(segment, 0L, index, value); }
    /// Sets `opacityMicromapIndexBufferStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexBufferStride(short value) { opacityMicromapIndexBufferStride(this.segment(), 0L, value); return this; }

    /// {@return `indexBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long indexBuffer(MemorySegment segment, long index) { return (long) VH_indexBuffer.get(segment, 0L, index); }
    /// {@return `indexBuffer`}
    public long indexBuffer() { return indexBuffer(this.segment(), 0L); }
    /// Sets `indexBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexBuffer(MemorySegment segment, long index, long value) { VH_indexBuffer.set(segment, 0L, index, value); }
    /// Sets `indexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexBuffer(long value) { indexBuffer(this.segment(), 0L, value); return this; }

    /// {@return `vertexBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long vertexBuffer(MemorySegment segment, long index) { return (long) VH_vertexBuffer.get(segment, 0L, index); }
    /// {@return `vertexBuffer`}
    public long vertexBuffer() { return vertexBuffer(this.segment(), 0L); }
    /// Sets `vertexBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexBuffer(MemorySegment segment, long index, long value) { VH_vertexBuffer.set(segment, 0L, index, value); }
    /// Sets `vertexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexBuffer(long value) { vertexBuffer(this.segment(), 0L, value); return this; }

    /// {@return `geometryIndexAndFlagsBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long geometryIndexAndFlagsBuffer(MemorySegment segment, long index) { return (long) VH_geometryIndexAndFlagsBuffer.get(segment, 0L, index); }
    /// {@return `geometryIndexAndFlagsBuffer`}
    public long geometryIndexAndFlagsBuffer() { return geometryIndexAndFlagsBuffer(this.segment(), 0L); }
    /// Sets `geometryIndexAndFlagsBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void geometryIndexAndFlagsBuffer(MemorySegment segment, long index, long value) { VH_geometryIndexAndFlagsBuffer.set(segment, 0L, index, value); }
    /// Sets `geometryIndexAndFlagsBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV geometryIndexAndFlagsBuffer(long value) { geometryIndexAndFlagsBuffer(this.segment(), 0L, value); return this; }

    /// {@return `opacityMicromapArray` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long opacityMicromapArray(MemorySegment segment, long index) { return (long) VH_opacityMicromapArray.get(segment, 0L, index); }
    /// {@return `opacityMicromapArray`}
    public long opacityMicromapArray() { return opacityMicromapArray(this.segment(), 0L); }
    /// Sets `opacityMicromapArray` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void opacityMicromapArray(MemorySegment segment, long index, long value) { VH_opacityMicromapArray.set(segment, 0L, index, value); }
    /// Sets `opacityMicromapArray` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapArray(long value) { opacityMicromapArray(this.segment(), 0L, value); return this; }

    /// {@return `opacityMicromapIndexBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long opacityMicromapIndexBuffer(MemorySegment segment, long index) { return (long) VH_opacityMicromapIndexBuffer.get(segment, 0L, index); }
    /// {@return `opacityMicromapIndexBuffer`}
    public long opacityMicromapIndexBuffer() { return opacityMicromapIndexBuffer(this.segment(), 0L); }
    /// Sets `opacityMicromapIndexBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void opacityMicromapIndexBuffer(MemorySegment segment, long index, long value) { VH_opacityMicromapIndexBuffer.set(segment, 0L, index, value); }
    /// Sets `opacityMicromapIndexBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexBuffer(long value) { opacityMicromapIndexBuffer(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkClusterAccelerationStructureBuildTriangleClusterInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkClusterAccelerationStructureBuildTriangleClusterInfoNV`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV asSlice(long index) { return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkClusterAccelerationStructureBuildTriangleClusterInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkClusterAccelerationStructureBuildTriangleClusterInfoNV`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV asSlice(long index, long count) { return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkClusterAccelerationStructureBuildTriangleClusterInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV at(long index, Consumer<VkClusterAccelerationStructureBuildTriangleClusterInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `clusterID` at the given index}
    /// @param index the index of the struct buffer
    public int clusterIDAt(long index) { return clusterID(this.segment(), index); }
    /// Sets `clusterID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV clusterIDAt(long index, int value) { clusterID(this.segment(), index, value); return this; }

    /// {@return `clusterFlags` at the given index}
    /// @param index the index of the struct buffer
    public int clusterFlagsAt(long index) { return clusterFlags(this.segment(), index); }
    /// Sets `clusterFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV clusterFlagsAt(long index, int value) { clusterFlags(this.segment(), index, value); return this; }

    /// {@return `baseGeometryIndexAndGeometryFlags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment baseGeometryIndexAndGeometryFlagsAt(long index) { return baseGeometryIndexAndGeometryFlags(this.segment(), index); }
    /// Sets `baseGeometryIndexAndGeometryFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV baseGeometryIndexAndGeometryFlagsAt(long index, MemorySegment value) { baseGeometryIndexAndGeometryFlags(this.segment(), index, value); return this; }
    /// Accepts `baseGeometryIndexAndGeometryFlags` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV baseGeometryIndexAndGeometryFlagsAt(long index, Consumer<overrungl.vulkan.nv.struct.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> func) { func.accept(overrungl.vulkan.nv.struct.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.of(baseGeometryIndexAndGeometryFlagsAt(index))); return this; }

    /// {@return `indexBufferStride` at the given index}
    /// @param index the index of the struct buffer
    public short indexBufferStrideAt(long index) { return indexBufferStride(this.segment(), index); }
    /// Sets `indexBufferStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexBufferStrideAt(long index, short value) { indexBufferStride(this.segment(), index, value); return this; }

    /// {@return `vertexBufferStride` at the given index}
    /// @param index the index of the struct buffer
    public short vertexBufferStrideAt(long index) { return vertexBufferStride(this.segment(), index); }
    /// Sets `vertexBufferStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexBufferStrideAt(long index, short value) { vertexBufferStride(this.segment(), index, value); return this; }

    /// {@return `geometryIndexAndFlagsBufferStride` at the given index}
    /// @param index the index of the struct buffer
    public short geometryIndexAndFlagsBufferStrideAt(long index) { return geometryIndexAndFlagsBufferStride(this.segment(), index); }
    /// Sets `geometryIndexAndFlagsBufferStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV geometryIndexAndFlagsBufferStrideAt(long index, short value) { geometryIndexAndFlagsBufferStride(this.segment(), index, value); return this; }

    /// {@return `opacityMicromapIndexBufferStride` at the given index}
    /// @param index the index of the struct buffer
    public short opacityMicromapIndexBufferStrideAt(long index) { return opacityMicromapIndexBufferStride(this.segment(), index); }
    /// Sets `opacityMicromapIndexBufferStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexBufferStrideAt(long index, short value) { opacityMicromapIndexBufferStride(this.segment(), index, value); return this; }

    /// {@return `indexBuffer` at the given index}
    /// @param index the index of the struct buffer
    public long indexBufferAt(long index) { return indexBuffer(this.segment(), index); }
    /// Sets `indexBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexBufferAt(long index, long value) { indexBuffer(this.segment(), index, value); return this; }

    /// {@return `vertexBuffer` at the given index}
    /// @param index the index of the struct buffer
    public long vertexBufferAt(long index) { return vertexBuffer(this.segment(), index); }
    /// Sets `vertexBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexBufferAt(long index, long value) { vertexBuffer(this.segment(), index, value); return this; }

    /// {@return `geometryIndexAndFlagsBuffer` at the given index}
    /// @param index the index of the struct buffer
    public long geometryIndexAndFlagsBufferAt(long index) { return geometryIndexAndFlagsBuffer(this.segment(), index); }
    /// Sets `geometryIndexAndFlagsBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV geometryIndexAndFlagsBufferAt(long index, long value) { geometryIndexAndFlagsBuffer(this.segment(), index, value); return this; }

    /// {@return `opacityMicromapArray` at the given index}
    /// @param index the index of the struct buffer
    public long opacityMicromapArrayAt(long index) { return opacityMicromapArray(this.segment(), index); }
    /// Sets `opacityMicromapArray` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapArrayAt(long index, long value) { opacityMicromapArray(this.segment(), index, value); return this; }

    /// {@return `opacityMicromapIndexBuffer` at the given index}
    /// @param index the index of the struct buffer
    public long opacityMicromapIndexBufferAt(long index) { return opacityMicromapIndexBuffer(this.segment(), index); }
    /// Sets `opacityMicromapIndexBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexBufferAt(long index, long value) { opacityMicromapIndexBuffer(this.segment(), index, value); return this; }

}

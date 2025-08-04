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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkAccelerationStructureGeometryKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkGeometryTypeKHR geometryType;
///     (union VkAccelerationStructureGeometryDataKHR) VkAccelerationStructureGeometryDataKHR geometry;
///     ((uint32_t) VkFlags) VkGeometryFlagsKHR flags;
/// };
/// ```
public final class VkAccelerationStructureGeometryKHR extends GroupType {
    /// The struct layout of `VkAccelerationStructureGeometryKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("geometryType"),
        overrungl.vulkan.khr.union.VkAccelerationStructureGeometryDataKHR.LAYOUT.withName("geometry"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `geometryType`.
    public static final long OFFSET_geometryType = LAYOUT.byteOffset(PathElement.groupElement("geometryType"));
    /// The memory layout of `geometryType`.
    public static final MemoryLayout LAYOUT_geometryType = LAYOUT.select(PathElement.groupElement("geometryType"));
    /// The [VarHandle] of `geometryType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_geometryType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryType"));
    /// The byte offset of `geometry`.
    public static final long OFFSET_geometry = LAYOUT.byteOffset(PathElement.groupElement("geometry"));
    /// The memory layout of `geometry`.
    public static final MemoryLayout LAYOUT_geometry = LAYOUT.select(PathElement.groupElement("geometry"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkAccelerationStructureGeometryKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAccelerationStructureGeometryKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAccelerationStructureGeometryKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureGeometryKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAccelerationStructureGeometryKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureGeometryKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureGeometryKHR`
    public static VkAccelerationStructureGeometryKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAccelerationStructureGeometryKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureGeometryKHR`
    public static VkAccelerationStructureGeometryKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureGeometryKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureGeometryKHR copyFrom(VkAccelerationStructureGeometryKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAccelerationStructureGeometryKHR reinterpret(long count) { return new VkAccelerationStructureGeometryKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `geometryType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int geometryType(MemorySegment segment, long index) { return (int) VH_geometryType.get(segment, 0L, index); }
    /// {@return `geometryType`}
    public int geometryType() { return geometryType(this.segment(), 0L); }
    /// Sets `geometryType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void geometryType(MemorySegment segment, long index, int value) { VH_geometryType.set(segment, 0L, index, value); }
    /// Sets `geometryType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryKHR geometryType(int value) { geometryType(this.segment(), 0L, value); return this; }

    /// {@return `geometry` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment geometry(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_geometry, index), LAYOUT_geometry); }
    /// {@return `geometry`}
    public MemorySegment geometry() { return geometry(this.segment(), 0L); }
    /// Sets `geometry` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void geometry(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_geometry, index), LAYOUT_geometry.byteSize()); }
    /// Sets `geometry` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryKHR geometry(MemorySegment value) { geometry(this.segment(), 0L, value); return this; }
    /// Accepts `geometry` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometryKHR geometry(Consumer<overrungl.vulkan.khr.union.VkAccelerationStructureGeometryDataKHR> func) { func.accept(overrungl.vulkan.khr.union.VkAccelerationStructureGeometryDataKHR.of(geometry())); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAccelerationStructureGeometryKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureGeometryKHR`
    public VkAccelerationStructureGeometryKHR asSlice(long index) { return new VkAccelerationStructureGeometryKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAccelerationStructureGeometryKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureGeometryKHR`
    public VkAccelerationStructureGeometryKHR asSlice(long index, long count) { return new VkAccelerationStructureGeometryKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAccelerationStructureGeometryKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAccelerationStructureGeometryKHR at(long index, Consumer<VkAccelerationStructureGeometryKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `geometryType` at the given index}
    /// @param index the index of the struct buffer
    public int geometryTypeAt(long index) { return geometryType(this.segment(), index); }
    /// Sets `geometryType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryKHR geometryTypeAt(long index, int value) { geometryType(this.segment(), index, value); return this; }

    /// {@return `geometry` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment geometryAt(long index) { return geometry(this.segment(), index); }
    /// Sets `geometry` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryKHR geometryAt(long index, MemorySegment value) { geometry(this.segment(), index, value); return this; }
    /// Accepts `geometry` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometryKHR geometryAt(long index, Consumer<overrungl.vulkan.khr.union.VkAccelerationStructureGeometryDataKHR> func) { func.accept(overrungl.vulkan.khr.union.VkAccelerationStructureGeometryDataKHR.of(geometryAt(index))); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryKHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

}

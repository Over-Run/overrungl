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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureCaptureDescriptorDataInfoEXT`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureCaptureDescriptorDataInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkAccelerationStructureKHR accelerationStructure;
///     (uint64_t) VkAccelerationStructureNV accelerationStructureNV;
/// };
/// ```
public final class VkAccelerationStructureCaptureDescriptorDataInfoEXT extends GroupType {
    /// The struct layout of `VkAccelerationStructureCaptureDescriptorDataInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureNV")
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
    /// The byte offset of `accelerationStructure`.
    public static final long OFFSET_accelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
    /// The memory layout of `accelerationStructure`.
    public static final MemoryLayout LAYOUT_accelerationStructure = LAYOUT.select(PathElement.groupElement("accelerationStructure"));
    /// The [VarHandle] of `accelerationStructure` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));
    /// The byte offset of `accelerationStructureNV`.
    public static final long OFFSET_accelerationStructureNV = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureNV"));
    /// The memory layout of `accelerationStructureNV`.
    public static final MemoryLayout LAYOUT_accelerationStructureNV = LAYOUT.select(PathElement.groupElement("accelerationStructureNV"));
    /// The [VarHandle] of `accelerationStructureNV` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructureNV = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureNV"));

    /// Creates `VkAccelerationStructureCaptureDescriptorDataInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAccelerationStructureCaptureDescriptorDataInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureCaptureDescriptorDataInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureCaptureDescriptorDataInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureCaptureDescriptorDataInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAccelerationStructureCaptureDescriptorDataInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureCaptureDescriptorDataInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureCaptureDescriptorDataInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureCaptureDescriptorDataInfoEXT`
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator) { return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAccelerationStructureCaptureDescriptorDataInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureCaptureDescriptorDataInfoEXT`
    public static VkAccelerationStructureCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT copyFrom(VkAccelerationStructureCaptureDescriptorDataInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT reinterpret(long count) { return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructure(long value) { accelerationStructure(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructureNV` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long accelerationStructureNV(MemorySegment segment, long index) { return (long) VH_accelerationStructureNV.get(segment, 0L, index); }
    /// {@return `accelerationStructureNV`}
    public long accelerationStructureNV() { return accelerationStructureNV(this.segment(), 0L); }
    /// Sets `accelerationStructureNV` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructureNV(MemorySegment segment, long index, long value) { VH_accelerationStructureNV.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureNV` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructureNV(long value) { accelerationStructureNV(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAccelerationStructureCaptureDescriptorDataInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureCaptureDescriptorDataInfoEXT`
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT asSlice(long index) { return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAccelerationStructureCaptureDescriptorDataInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureCaptureDescriptorDataInfoEXT`
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT asSlice(long index, long count) { return new VkAccelerationStructureCaptureDescriptorDataInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAccelerationStructureCaptureDescriptorDataInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT at(long index, Consumer<VkAccelerationStructureCaptureDescriptorDataInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param index the index of the struct buffer
    public long accelerationStructureAt(long index) { return accelerationStructure(this.segment(), index); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructureAt(long index, long value) { accelerationStructure(this.segment(), index, value); return this; }

    /// {@return `accelerationStructureNV` at the given index}
    /// @param index the index of the struct buffer
    public long accelerationStructureNVAt(long index) { return accelerationStructureNV(this.segment(), index); }
    /// Sets `accelerationStructureNV` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCaptureDescriptorDataInfoEXT accelerationStructureNVAt(long index, long value) { accelerationStructureNV(this.segment(), index, value); return this; }

}

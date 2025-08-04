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
/// struct VkPhysicalDeviceComputeShaderDerivativesFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 computeDerivativeGroupQuads;
///     (uint32_t) VkBool32 computeDerivativeGroupLinear;
/// };
/// ```
public final class VkPhysicalDeviceComputeShaderDerivativesFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceComputeShaderDerivativesFeaturesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("computeDerivativeGroupQuads"),
        ValueLayout.JAVA_INT.withName("computeDerivativeGroupLinear")
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
    /// The byte offset of `computeDerivativeGroupQuads`.
    public static final long OFFSET_computeDerivativeGroupQuads = LAYOUT.byteOffset(PathElement.groupElement("computeDerivativeGroupQuads"));
    /// The memory layout of `computeDerivativeGroupQuads`.
    public static final MemoryLayout LAYOUT_computeDerivativeGroupQuads = LAYOUT.select(PathElement.groupElement("computeDerivativeGroupQuads"));
    /// The [VarHandle] of `computeDerivativeGroupQuads` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_computeDerivativeGroupQuads = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeDerivativeGroupQuads"));
    /// The byte offset of `computeDerivativeGroupLinear`.
    public static final long OFFSET_computeDerivativeGroupLinear = LAYOUT.byteOffset(PathElement.groupElement("computeDerivativeGroupLinear"));
    /// The memory layout of `computeDerivativeGroupLinear`.
    public static final MemoryLayout LAYOUT_computeDerivativeGroupLinear = LAYOUT.select(PathElement.groupElement("computeDerivativeGroupLinear"));
    /// The [VarHandle] of `computeDerivativeGroupLinear` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_computeDerivativeGroupLinear = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeDerivativeGroupLinear"));

    /// Creates `VkPhysicalDeviceComputeShaderDerivativesFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceComputeShaderDerivativesFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceComputeShaderDerivativesFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceComputeShaderDerivativesFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceComputeShaderDerivativesFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceComputeShaderDerivativesFeaturesNV`
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceComputeShaderDerivativesFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceComputeShaderDerivativesFeaturesNV`
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV copyFrom(VkPhysicalDeviceComputeShaderDerivativesFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `computeDerivativeGroupQuads` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int computeDerivativeGroupQuads(MemorySegment segment, long index) { return (int) VH_computeDerivativeGroupQuads.get(segment, 0L, index); }
    /// {@return `computeDerivativeGroupQuads`}
    public int computeDerivativeGroupQuads() { return computeDerivativeGroupQuads(this.segment(), 0L); }
    /// Sets `computeDerivativeGroupQuads` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void computeDerivativeGroupQuads(MemorySegment segment, long index, int value) { VH_computeDerivativeGroupQuads.set(segment, 0L, index, value); }
    /// Sets `computeDerivativeGroupQuads` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV computeDerivativeGroupQuads(int value) { computeDerivativeGroupQuads(this.segment(), 0L, value); return this; }

    /// {@return `computeDerivativeGroupLinear` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int computeDerivativeGroupLinear(MemorySegment segment, long index) { return (int) VH_computeDerivativeGroupLinear.get(segment, 0L, index); }
    /// {@return `computeDerivativeGroupLinear`}
    public int computeDerivativeGroupLinear() { return computeDerivativeGroupLinear(this.segment(), 0L); }
    /// Sets `computeDerivativeGroupLinear` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void computeDerivativeGroupLinear(MemorySegment segment, long index, int value) { VH_computeDerivativeGroupLinear.set(segment, 0L, index, value); }
    /// Sets `computeDerivativeGroupLinear` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV computeDerivativeGroupLinear(int value) { computeDerivativeGroupLinear(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceComputeShaderDerivativesFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceComputeShaderDerivativesFeaturesNV`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV asSlice(long index) { return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceComputeShaderDerivativesFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceComputeShaderDerivativesFeaturesNV`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceComputeShaderDerivativesFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceComputeShaderDerivativesFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV at(long index, Consumer<VkPhysicalDeviceComputeShaderDerivativesFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `computeDerivativeGroupQuads` at the given index}
    /// @param index the index of the struct buffer
    public int computeDerivativeGroupQuadsAt(long index) { return computeDerivativeGroupQuads(this.segment(), index); }
    /// Sets `computeDerivativeGroupQuads` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV computeDerivativeGroupQuadsAt(long index, int value) { computeDerivativeGroupQuads(this.segment(), index, value); return this; }

    /// {@return `computeDerivativeGroupLinear` at the given index}
    /// @param index the index of the struct buffer
    public int computeDerivativeGroupLinearAt(long index) { return computeDerivativeGroupLinear(this.segment(), index); }
    /// Sets `computeDerivativeGroupLinear` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV computeDerivativeGroupLinearAt(long index, int value) { computeDerivativeGroupLinear(this.segment(), index, value); return this; }

}

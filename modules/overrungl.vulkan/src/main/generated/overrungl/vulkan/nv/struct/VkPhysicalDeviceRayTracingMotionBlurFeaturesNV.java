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
/// struct VkPhysicalDeviceRayTracingMotionBlurFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 rayTracingMotionBlur;
///     (uint32_t) VkBool32 rayTracingMotionBlurPipelineTraceRaysIndirect;
/// };
/// ```
public final class VkPhysicalDeviceRayTracingMotionBlurFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingMotionBlur"),
        ValueLayout.JAVA_INT.withName("rayTracingMotionBlurPipelineTraceRaysIndirect")
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
    /// The byte offset of `rayTracingMotionBlur`.
    public static final long OFFSET_rayTracingMotionBlur = LAYOUT.byteOffset(PathElement.groupElement("rayTracingMotionBlur"));
    /// The memory layout of `rayTracingMotionBlur`.
    public static final MemoryLayout LAYOUT_rayTracingMotionBlur = LAYOUT.select(PathElement.groupElement("rayTracingMotionBlur"));
    /// The [VarHandle] of `rayTracingMotionBlur` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rayTracingMotionBlur = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingMotionBlur"));
    /// The byte offset of `rayTracingMotionBlurPipelineTraceRaysIndirect`.
    public static final long OFFSET_rayTracingMotionBlurPipelineTraceRaysIndirect = LAYOUT.byteOffset(PathElement.groupElement("rayTracingMotionBlurPipelineTraceRaysIndirect"));
    /// The memory layout of `rayTracingMotionBlurPipelineTraceRaysIndirect`.
    public static final MemoryLayout LAYOUT_rayTracingMotionBlurPipelineTraceRaysIndirect = LAYOUT.select(PathElement.groupElement("rayTracingMotionBlurPipelineTraceRaysIndirect"));
    /// The [VarHandle] of `rayTracingMotionBlurPipelineTraceRaysIndirect` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rayTracingMotionBlurPipelineTraceRaysIndirect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingMotionBlurPipelineTraceRaysIndirect"));

    /// Creates `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV`
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV`
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV copyFrom(VkPhysicalDeviceRayTracingMotionBlurFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `rayTracingMotionBlur` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rayTracingMotionBlur(MemorySegment segment, long index) { return (int) VH_rayTracingMotionBlur.get(segment, 0L, index); }
    /// {@return `rayTracingMotionBlur`}
    public int rayTracingMotionBlur() { return rayTracingMotionBlur(this.segment(), 0L); }
    /// Sets `rayTracingMotionBlur` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rayTracingMotionBlur(MemorySegment segment, long index, int value) { VH_rayTracingMotionBlur.set(segment, 0L, index, value); }
    /// Sets `rayTracingMotionBlur` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV rayTracingMotionBlur(int value) { rayTracingMotionBlur(this.segment(), 0L, value); return this; }

    /// {@return `rayTracingMotionBlurPipelineTraceRaysIndirect` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rayTracingMotionBlurPipelineTraceRaysIndirect(MemorySegment segment, long index) { return (int) VH_rayTracingMotionBlurPipelineTraceRaysIndirect.get(segment, 0L, index); }
    /// {@return `rayTracingMotionBlurPipelineTraceRaysIndirect`}
    public int rayTracingMotionBlurPipelineTraceRaysIndirect() { return rayTracingMotionBlurPipelineTraceRaysIndirect(this.segment(), 0L); }
    /// Sets `rayTracingMotionBlurPipelineTraceRaysIndirect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rayTracingMotionBlurPipelineTraceRaysIndirect(MemorySegment segment, long index, int value) { VH_rayTracingMotionBlurPipelineTraceRaysIndirect.set(segment, 0L, index, value); }
    /// Sets `rayTracingMotionBlurPipelineTraceRaysIndirect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV rayTracingMotionBlurPipelineTraceRaysIndirect(int value) { rayTracingMotionBlurPipelineTraceRaysIndirect(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV`
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV asSlice(long index) { return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV`
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceRayTracingMotionBlurFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV at(long index, Consumer<VkPhysicalDeviceRayTracingMotionBlurFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `rayTracingMotionBlur` at the given index}
    /// @param index the index of the struct buffer
    public int rayTracingMotionBlurAt(long index) { return rayTracingMotionBlur(this.segment(), index); }
    /// Sets `rayTracingMotionBlur` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV rayTracingMotionBlurAt(long index, int value) { rayTracingMotionBlur(this.segment(), index, value); return this; }

    /// {@return `rayTracingMotionBlurPipelineTraceRaysIndirect` at the given index}
    /// @param index the index of the struct buffer
    public int rayTracingMotionBlurPipelineTraceRaysIndirectAt(long index) { return rayTracingMotionBlurPipelineTraceRaysIndirect(this.segment(), index); }
    /// Sets `rayTracingMotionBlurPipelineTraceRaysIndirect` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV rayTracingMotionBlurPipelineTraceRaysIndirectAt(long index, int value) { rayTracingMotionBlurPipelineTraceRaysIndirect(this.segment(), index, value); return this; }

}

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

/// Represents `VkPipelineRasterizationConservativeStateCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineRasterizationConservativeStateCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineRasterizationConservativeStateCreateFlagsEXT flags;
///     (int) VkConservativeRasterizationModeEXT conservativeRasterizationMode;
///     float extraPrimitiveOverestimationSize;
/// };
/// ```
public final class VkPipelineRasterizationConservativeStateCreateInfoEXT extends GroupType {
    /// The struct layout of `VkPipelineRasterizationConservativeStateCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("conservativeRasterizationMode"),
        ValueLayout.JAVA_FLOAT.withName("extraPrimitiveOverestimationSize")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `conservativeRasterizationMode`.
    public static final long OFFSET_conservativeRasterizationMode = LAYOUT.byteOffset(PathElement.groupElement("conservativeRasterizationMode"));
    /// The memory layout of `conservativeRasterizationMode`.
    public static final MemoryLayout LAYOUT_conservativeRasterizationMode = LAYOUT.select(PathElement.groupElement("conservativeRasterizationMode"));
    /// The [VarHandle] of `conservativeRasterizationMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_conservativeRasterizationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conservativeRasterizationMode"));
    /// The byte offset of `extraPrimitiveOverestimationSize`.
    public static final long OFFSET_extraPrimitiveOverestimationSize = LAYOUT.byteOffset(PathElement.groupElement("extraPrimitiveOverestimationSize"));
    /// The memory layout of `extraPrimitiveOverestimationSize`.
    public static final MemoryLayout LAYOUT_extraPrimitiveOverestimationSize = LAYOUT.select(PathElement.groupElement("extraPrimitiveOverestimationSize"));
    /// The [VarHandle] of `extraPrimitiveOverestimationSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extraPrimitiveOverestimationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extraPrimitiveOverestimationSize"));

    /// Creates `VkPipelineRasterizationConservativeStateCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineRasterizationConservativeStateCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineRasterizationConservativeStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationConservativeStateCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineRasterizationConservativeStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationConservativeStateCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineRasterizationConservativeStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationConservativeStateCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineRasterizationConservativeStateCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineRasterizationConservativeStateCreateInfoEXT`
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationConservativeStateCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineRasterizationConservativeStateCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineRasterizationConservativeStateCreateInfoEXT`
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationConservativeStateCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT copyFrom(VkPipelineRasterizationConservativeStateCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineRasterizationConservativeStateCreateInfoEXT reinterpret(long count) { return new VkPipelineRasterizationConservativeStateCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineRasterizationConservativeStateCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineRasterizationConservativeStateCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPipelineRasterizationConservativeStateCreateInfoEXT flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `conservativeRasterizationMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int conservativeRasterizationMode(MemorySegment segment, long index) { return (int) VH_conservativeRasterizationMode.get(segment, 0L, index); }
    /// {@return `conservativeRasterizationMode`}
    public int conservativeRasterizationMode() { return conservativeRasterizationMode(this.segment(), 0L); }
    /// Sets `conservativeRasterizationMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void conservativeRasterizationMode(MemorySegment segment, long index, int value) { VH_conservativeRasterizationMode.set(segment, 0L, index, value); }
    /// Sets `conservativeRasterizationMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT conservativeRasterizationMode(int value) { conservativeRasterizationMode(this.segment(), 0L, value); return this; }

    /// {@return `extraPrimitiveOverestimationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float extraPrimitiveOverestimationSize(MemorySegment segment, long index) { return (float) VH_extraPrimitiveOverestimationSize.get(segment, 0L, index); }
    /// {@return `extraPrimitiveOverestimationSize`}
    public float extraPrimitiveOverestimationSize() { return extraPrimitiveOverestimationSize(this.segment(), 0L); }
    /// Sets `extraPrimitiveOverestimationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extraPrimitiveOverestimationSize(MemorySegment segment, long index, float value) { VH_extraPrimitiveOverestimationSize.set(segment, 0L, index, value); }
    /// Sets `extraPrimitiveOverestimationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT extraPrimitiveOverestimationSize(float value) { extraPrimitiveOverestimationSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineRasterizationConservativeStateCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineRasterizationConservativeStateCreateInfoEXT`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT asSlice(long index) { return new VkPipelineRasterizationConservativeStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineRasterizationConservativeStateCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineRasterizationConservativeStateCreateInfoEXT`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT asSlice(long index, long count) { return new VkPipelineRasterizationConservativeStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineRasterizationConservativeStateCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT at(long index, Consumer<VkPipelineRasterizationConservativeStateCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `conservativeRasterizationMode` at the given index}
    /// @param index the index of the struct buffer
    public int conservativeRasterizationModeAt(long index) { return conservativeRasterizationMode(this.segment(), index); }
    /// Sets `conservativeRasterizationMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT conservativeRasterizationModeAt(long index, int value) { conservativeRasterizationMode(this.segment(), index, value); return this; }

    /// {@return `extraPrimitiveOverestimationSize` at the given index}
    /// @param index the index of the struct buffer
    public float extraPrimitiveOverestimationSizeAt(long index) { return extraPrimitiveOverestimationSize(this.segment(), index); }
    /// Sets `extraPrimitiveOverestimationSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT extraPrimitiveOverestimationSizeAt(long index, float value) { extraPrimitiveOverestimationSize(this.segment(), index, value); return this; }

}

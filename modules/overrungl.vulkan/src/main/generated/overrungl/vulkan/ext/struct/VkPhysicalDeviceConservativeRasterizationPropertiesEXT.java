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

/// Represents `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceConservativeRasterizationPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     float primitiveOverestimationSize;
///     float maxExtraPrimitiveOverestimationSize;
///     float extraPrimitiveOverestimationSizeGranularity;
///     (uint32_t) VkBool32 primitiveUnderestimation;
///     (uint32_t) VkBool32 conservativePointAndLineRasterization;
///     (uint32_t) VkBool32 degenerateTrianglesRasterized;
///     (uint32_t) VkBool32 degenerateLinesRasterized;
///     (uint32_t) VkBool32 fullyCoveredFragmentShaderInputVariable;
///     (uint32_t) VkBool32 conservativeRasterizationPostDepthCoverage;
/// };
/// ```
public final class VkPhysicalDeviceConservativeRasterizationPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_FLOAT.withName("primitiveOverestimationSize"),
        ValueLayout.JAVA_FLOAT.withName("maxExtraPrimitiveOverestimationSize"),
        ValueLayout.JAVA_FLOAT.withName("extraPrimitiveOverestimationSizeGranularity"),
        ValueLayout.JAVA_INT.withName("primitiveUnderestimation"),
        ValueLayout.JAVA_INT.withName("conservativePointAndLineRasterization"),
        ValueLayout.JAVA_INT.withName("degenerateTrianglesRasterized"),
        ValueLayout.JAVA_INT.withName("degenerateLinesRasterized"),
        ValueLayout.JAVA_INT.withName("fullyCoveredFragmentShaderInputVariable"),
        ValueLayout.JAVA_INT.withName("conservativeRasterizationPostDepthCoverage")
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
    /// The byte offset of `primitiveOverestimationSize`.
    public static final long OFFSET_primitiveOverestimationSize = LAYOUT.byteOffset(PathElement.groupElement("primitiveOverestimationSize"));
    /// The memory layout of `primitiveOverestimationSize`.
    public static final MemoryLayout LAYOUT_primitiveOverestimationSize = LAYOUT.select(PathElement.groupElement("primitiveOverestimationSize"));
    /// The [VarHandle] of `primitiveOverestimationSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primitiveOverestimationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveOverestimationSize"));
    /// The byte offset of `maxExtraPrimitiveOverestimationSize`.
    public static final long OFFSET_maxExtraPrimitiveOverestimationSize = LAYOUT.byteOffset(PathElement.groupElement("maxExtraPrimitiveOverestimationSize"));
    /// The memory layout of `maxExtraPrimitiveOverestimationSize`.
    public static final MemoryLayout LAYOUT_maxExtraPrimitiveOverestimationSize = LAYOUT.select(PathElement.groupElement("maxExtraPrimitiveOverestimationSize"));
    /// The [VarHandle] of `maxExtraPrimitiveOverestimationSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxExtraPrimitiveOverestimationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExtraPrimitiveOverestimationSize"));
    /// The byte offset of `extraPrimitiveOverestimationSizeGranularity`.
    public static final long OFFSET_extraPrimitiveOverestimationSizeGranularity = LAYOUT.byteOffset(PathElement.groupElement("extraPrimitiveOverestimationSizeGranularity"));
    /// The memory layout of `extraPrimitiveOverestimationSizeGranularity`.
    public static final MemoryLayout LAYOUT_extraPrimitiveOverestimationSizeGranularity = LAYOUT.select(PathElement.groupElement("extraPrimitiveOverestimationSizeGranularity"));
    /// The [VarHandle] of `extraPrimitiveOverestimationSizeGranularity` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extraPrimitiveOverestimationSizeGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extraPrimitiveOverestimationSizeGranularity"));
    /// The byte offset of `primitiveUnderestimation`.
    public static final long OFFSET_primitiveUnderestimation = LAYOUT.byteOffset(PathElement.groupElement("primitiveUnderestimation"));
    /// The memory layout of `primitiveUnderestimation`.
    public static final MemoryLayout LAYOUT_primitiveUnderestimation = LAYOUT.select(PathElement.groupElement("primitiveUnderestimation"));
    /// The [VarHandle] of `primitiveUnderestimation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primitiveUnderestimation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveUnderestimation"));
    /// The byte offset of `conservativePointAndLineRasterization`.
    public static final long OFFSET_conservativePointAndLineRasterization = LAYOUT.byteOffset(PathElement.groupElement("conservativePointAndLineRasterization"));
    /// The memory layout of `conservativePointAndLineRasterization`.
    public static final MemoryLayout LAYOUT_conservativePointAndLineRasterization = LAYOUT.select(PathElement.groupElement("conservativePointAndLineRasterization"));
    /// The [VarHandle] of `conservativePointAndLineRasterization` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_conservativePointAndLineRasterization = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conservativePointAndLineRasterization"));
    /// The byte offset of `degenerateTrianglesRasterized`.
    public static final long OFFSET_degenerateTrianglesRasterized = LAYOUT.byteOffset(PathElement.groupElement("degenerateTrianglesRasterized"));
    /// The memory layout of `degenerateTrianglesRasterized`.
    public static final MemoryLayout LAYOUT_degenerateTrianglesRasterized = LAYOUT.select(PathElement.groupElement("degenerateTrianglesRasterized"));
    /// The [VarHandle] of `degenerateTrianglesRasterized` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_degenerateTrianglesRasterized = LAYOUT.arrayElementVarHandle(PathElement.groupElement("degenerateTrianglesRasterized"));
    /// The byte offset of `degenerateLinesRasterized`.
    public static final long OFFSET_degenerateLinesRasterized = LAYOUT.byteOffset(PathElement.groupElement("degenerateLinesRasterized"));
    /// The memory layout of `degenerateLinesRasterized`.
    public static final MemoryLayout LAYOUT_degenerateLinesRasterized = LAYOUT.select(PathElement.groupElement("degenerateLinesRasterized"));
    /// The [VarHandle] of `degenerateLinesRasterized` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_degenerateLinesRasterized = LAYOUT.arrayElementVarHandle(PathElement.groupElement("degenerateLinesRasterized"));
    /// The byte offset of `fullyCoveredFragmentShaderInputVariable`.
    public static final long OFFSET_fullyCoveredFragmentShaderInputVariable = LAYOUT.byteOffset(PathElement.groupElement("fullyCoveredFragmentShaderInputVariable"));
    /// The memory layout of `fullyCoveredFragmentShaderInputVariable`.
    public static final MemoryLayout LAYOUT_fullyCoveredFragmentShaderInputVariable = LAYOUT.select(PathElement.groupElement("fullyCoveredFragmentShaderInputVariable"));
    /// The [VarHandle] of `fullyCoveredFragmentShaderInputVariable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fullyCoveredFragmentShaderInputVariable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fullyCoveredFragmentShaderInputVariable"));
    /// The byte offset of `conservativeRasterizationPostDepthCoverage`.
    public static final long OFFSET_conservativeRasterizationPostDepthCoverage = LAYOUT.byteOffset(PathElement.groupElement("conservativeRasterizationPostDepthCoverage"));
    /// The memory layout of `conservativeRasterizationPostDepthCoverage`.
    public static final MemoryLayout LAYOUT_conservativeRasterizationPostDepthCoverage = LAYOUT.select(PathElement.groupElement("conservativeRasterizationPostDepthCoverage"));
    /// The [VarHandle] of `conservativeRasterizationPostDepthCoverage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_conservativeRasterizationPostDepthCoverage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conservativeRasterizationPostDepthCoverage"));

    /// Creates `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT copyFrom(VkPhysicalDeviceConservativeRasterizationPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `primitiveOverestimationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float primitiveOverestimationSize(MemorySegment segment, long index) { return (float) VH_primitiveOverestimationSize.get(segment, 0L, index); }
    /// {@return `primitiveOverestimationSize`}
    public float primitiveOverestimationSize() { return primitiveOverestimationSize(this.segment(), 0L); }
    /// Sets `primitiveOverestimationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primitiveOverestimationSize(MemorySegment segment, long index, float value) { VH_primitiveOverestimationSize.set(segment, 0L, index, value); }
    /// Sets `primitiveOverestimationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT primitiveOverestimationSize(float value) { primitiveOverestimationSize(this.segment(), 0L, value); return this; }

    /// {@return `maxExtraPrimitiveOverestimationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxExtraPrimitiveOverestimationSize(MemorySegment segment, long index) { return (float) VH_maxExtraPrimitiveOverestimationSize.get(segment, 0L, index); }
    /// {@return `maxExtraPrimitiveOverestimationSize`}
    public float maxExtraPrimitiveOverestimationSize() { return maxExtraPrimitiveOverestimationSize(this.segment(), 0L); }
    /// Sets `maxExtraPrimitiveOverestimationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxExtraPrimitiveOverestimationSize(MemorySegment segment, long index, float value) { VH_maxExtraPrimitiveOverestimationSize.set(segment, 0L, index, value); }
    /// Sets `maxExtraPrimitiveOverestimationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT maxExtraPrimitiveOverestimationSize(float value) { maxExtraPrimitiveOverestimationSize(this.segment(), 0L, value); return this; }

    /// {@return `extraPrimitiveOverestimationSizeGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float extraPrimitiveOverestimationSizeGranularity(MemorySegment segment, long index) { return (float) VH_extraPrimitiveOverestimationSizeGranularity.get(segment, 0L, index); }
    /// {@return `extraPrimitiveOverestimationSizeGranularity`}
    public float extraPrimitiveOverestimationSizeGranularity() { return extraPrimitiveOverestimationSizeGranularity(this.segment(), 0L); }
    /// Sets `extraPrimitiveOverestimationSizeGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extraPrimitiveOverestimationSizeGranularity(MemorySegment segment, long index, float value) { VH_extraPrimitiveOverestimationSizeGranularity.set(segment, 0L, index, value); }
    /// Sets `extraPrimitiveOverestimationSizeGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT extraPrimitiveOverestimationSizeGranularity(float value) { extraPrimitiveOverestimationSizeGranularity(this.segment(), 0L, value); return this; }

    /// {@return `primitiveUnderestimation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int primitiveUnderestimation(MemorySegment segment, long index) { return (int) VH_primitiveUnderestimation.get(segment, 0L, index); }
    /// {@return `primitiveUnderestimation`}
    public int primitiveUnderestimation() { return primitiveUnderestimation(this.segment(), 0L); }
    /// Sets `primitiveUnderestimation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primitiveUnderestimation(MemorySegment segment, long index, int value) { VH_primitiveUnderestimation.set(segment, 0L, index, value); }
    /// Sets `primitiveUnderestimation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT primitiveUnderestimation(int value) { primitiveUnderestimation(this.segment(), 0L, value); return this; }

    /// {@return `conservativePointAndLineRasterization` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int conservativePointAndLineRasterization(MemorySegment segment, long index) { return (int) VH_conservativePointAndLineRasterization.get(segment, 0L, index); }
    /// {@return `conservativePointAndLineRasterization`}
    public int conservativePointAndLineRasterization() { return conservativePointAndLineRasterization(this.segment(), 0L); }
    /// Sets `conservativePointAndLineRasterization` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void conservativePointAndLineRasterization(MemorySegment segment, long index, int value) { VH_conservativePointAndLineRasterization.set(segment, 0L, index, value); }
    /// Sets `conservativePointAndLineRasterization` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT conservativePointAndLineRasterization(int value) { conservativePointAndLineRasterization(this.segment(), 0L, value); return this; }

    /// {@return `degenerateTrianglesRasterized` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int degenerateTrianglesRasterized(MemorySegment segment, long index) { return (int) VH_degenerateTrianglesRasterized.get(segment, 0L, index); }
    /// {@return `degenerateTrianglesRasterized`}
    public int degenerateTrianglesRasterized() { return degenerateTrianglesRasterized(this.segment(), 0L); }
    /// Sets `degenerateTrianglesRasterized` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void degenerateTrianglesRasterized(MemorySegment segment, long index, int value) { VH_degenerateTrianglesRasterized.set(segment, 0L, index, value); }
    /// Sets `degenerateTrianglesRasterized` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT degenerateTrianglesRasterized(int value) { degenerateTrianglesRasterized(this.segment(), 0L, value); return this; }

    /// {@return `degenerateLinesRasterized` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int degenerateLinesRasterized(MemorySegment segment, long index) { return (int) VH_degenerateLinesRasterized.get(segment, 0L, index); }
    /// {@return `degenerateLinesRasterized`}
    public int degenerateLinesRasterized() { return degenerateLinesRasterized(this.segment(), 0L); }
    /// Sets `degenerateLinesRasterized` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void degenerateLinesRasterized(MemorySegment segment, long index, int value) { VH_degenerateLinesRasterized.set(segment, 0L, index, value); }
    /// Sets `degenerateLinesRasterized` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT degenerateLinesRasterized(int value) { degenerateLinesRasterized(this.segment(), 0L, value); return this; }

    /// {@return `fullyCoveredFragmentShaderInputVariable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fullyCoveredFragmentShaderInputVariable(MemorySegment segment, long index) { return (int) VH_fullyCoveredFragmentShaderInputVariable.get(segment, 0L, index); }
    /// {@return `fullyCoveredFragmentShaderInputVariable`}
    public int fullyCoveredFragmentShaderInputVariable() { return fullyCoveredFragmentShaderInputVariable(this.segment(), 0L); }
    /// Sets `fullyCoveredFragmentShaderInputVariable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fullyCoveredFragmentShaderInputVariable(MemorySegment segment, long index, int value) { VH_fullyCoveredFragmentShaderInputVariable.set(segment, 0L, index, value); }
    /// Sets `fullyCoveredFragmentShaderInputVariable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT fullyCoveredFragmentShaderInputVariable(int value) { fullyCoveredFragmentShaderInputVariable(this.segment(), 0L, value); return this; }

    /// {@return `conservativeRasterizationPostDepthCoverage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int conservativeRasterizationPostDepthCoverage(MemorySegment segment, long index) { return (int) VH_conservativeRasterizationPostDepthCoverage.get(segment, 0L, index); }
    /// {@return `conservativeRasterizationPostDepthCoverage`}
    public int conservativeRasterizationPostDepthCoverage() { return conservativeRasterizationPostDepthCoverage(this.segment(), 0L); }
    /// Sets `conservativeRasterizationPostDepthCoverage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void conservativeRasterizationPostDepthCoverage(MemorySegment segment, long index, int value) { VH_conservativeRasterizationPostDepthCoverage.set(segment, 0L, index, value); }
    /// Sets `conservativeRasterizationPostDepthCoverage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT conservativeRasterizationPostDepthCoverage(int value) { conservativeRasterizationPostDepthCoverage(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT at(long index, Consumer<VkPhysicalDeviceConservativeRasterizationPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `primitiveOverestimationSize` at the given index}
    /// @param index the index of the struct buffer
    public float primitiveOverestimationSizeAt(long index) { return primitiveOverestimationSize(this.segment(), index); }
    /// Sets `primitiveOverestimationSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT primitiveOverestimationSizeAt(long index, float value) { primitiveOverestimationSize(this.segment(), index, value); return this; }

    /// {@return `maxExtraPrimitiveOverestimationSize` at the given index}
    /// @param index the index of the struct buffer
    public float maxExtraPrimitiveOverestimationSizeAt(long index) { return maxExtraPrimitiveOverestimationSize(this.segment(), index); }
    /// Sets `maxExtraPrimitiveOverestimationSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT maxExtraPrimitiveOverestimationSizeAt(long index, float value) { maxExtraPrimitiveOverestimationSize(this.segment(), index, value); return this; }

    /// {@return `extraPrimitiveOverestimationSizeGranularity` at the given index}
    /// @param index the index of the struct buffer
    public float extraPrimitiveOverestimationSizeGranularityAt(long index) { return extraPrimitiveOverestimationSizeGranularity(this.segment(), index); }
    /// Sets `extraPrimitiveOverestimationSizeGranularity` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT extraPrimitiveOverestimationSizeGranularityAt(long index, float value) { extraPrimitiveOverestimationSizeGranularity(this.segment(), index, value); return this; }

    /// {@return `primitiveUnderestimation` at the given index}
    /// @param index the index of the struct buffer
    public int primitiveUnderestimationAt(long index) { return primitiveUnderestimation(this.segment(), index); }
    /// Sets `primitiveUnderestimation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT primitiveUnderestimationAt(long index, int value) { primitiveUnderestimation(this.segment(), index, value); return this; }

    /// {@return `conservativePointAndLineRasterization` at the given index}
    /// @param index the index of the struct buffer
    public int conservativePointAndLineRasterizationAt(long index) { return conservativePointAndLineRasterization(this.segment(), index); }
    /// Sets `conservativePointAndLineRasterization` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT conservativePointAndLineRasterizationAt(long index, int value) { conservativePointAndLineRasterization(this.segment(), index, value); return this; }

    /// {@return `degenerateTrianglesRasterized` at the given index}
    /// @param index the index of the struct buffer
    public int degenerateTrianglesRasterizedAt(long index) { return degenerateTrianglesRasterized(this.segment(), index); }
    /// Sets `degenerateTrianglesRasterized` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT degenerateTrianglesRasterizedAt(long index, int value) { degenerateTrianglesRasterized(this.segment(), index, value); return this; }

    /// {@return `degenerateLinesRasterized` at the given index}
    /// @param index the index of the struct buffer
    public int degenerateLinesRasterizedAt(long index) { return degenerateLinesRasterized(this.segment(), index); }
    /// Sets `degenerateLinesRasterized` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT degenerateLinesRasterizedAt(long index, int value) { degenerateLinesRasterized(this.segment(), index, value); return this; }

    /// {@return `fullyCoveredFragmentShaderInputVariable` at the given index}
    /// @param index the index of the struct buffer
    public int fullyCoveredFragmentShaderInputVariableAt(long index) { return fullyCoveredFragmentShaderInputVariable(this.segment(), index); }
    /// Sets `fullyCoveredFragmentShaderInputVariable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT fullyCoveredFragmentShaderInputVariableAt(long index, int value) { fullyCoveredFragmentShaderInputVariable(this.segment(), index, value); return this; }

    /// {@return `conservativeRasterizationPostDepthCoverage` at the given index}
    /// @param index the index of the struct buffer
    public int conservativeRasterizationPostDepthCoverageAt(long index) { return conservativeRasterizationPostDepthCoverage(this.segment(), index); }
    /// Sets `conservativeRasterizationPostDepthCoverage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT conservativeRasterizationPostDepthCoverageAt(long index, int value) { conservativeRasterizationPostDepthCoverage(this.segment(), index, value); return this; }

}

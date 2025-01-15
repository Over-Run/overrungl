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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### primitiveOverestimationSize
/// [VarHandle][#VH_primitiveOverestimationSize] - [Getter][#primitiveOverestimationSize()] - [Setter][#primitiveOverestimationSize(float)]
/// ### maxExtraPrimitiveOverestimationSize
/// [VarHandle][#VH_maxExtraPrimitiveOverestimationSize] - [Getter][#maxExtraPrimitiveOverestimationSize()] - [Setter][#maxExtraPrimitiveOverestimationSize(float)]
/// ### extraPrimitiveOverestimationSizeGranularity
/// [VarHandle][#VH_extraPrimitiveOverestimationSizeGranularity] - [Getter][#extraPrimitiveOverestimationSizeGranularity()] - [Setter][#extraPrimitiveOverestimationSizeGranularity(float)]
/// ### primitiveUnderestimation
/// [VarHandle][#VH_primitiveUnderestimation] - [Getter][#primitiveUnderestimation()] - [Setter][#primitiveUnderestimation(int)]
/// ### conservativePointAndLineRasterization
/// [VarHandle][#VH_conservativePointAndLineRasterization] - [Getter][#conservativePointAndLineRasterization()] - [Setter][#conservativePointAndLineRasterization(int)]
/// ### degenerateTrianglesRasterized
/// [VarHandle][#VH_degenerateTrianglesRasterized] - [Getter][#degenerateTrianglesRasterized()] - [Setter][#degenerateTrianglesRasterized(int)]
/// ### degenerateLinesRasterized
/// [VarHandle][#VH_degenerateLinesRasterized] - [Getter][#degenerateLinesRasterized()] - [Setter][#degenerateLinesRasterized(int)]
/// ### fullyCoveredFragmentShaderInputVariable
/// [VarHandle][#VH_fullyCoveredFragmentShaderInputVariable] - [Getter][#fullyCoveredFragmentShaderInputVariable()] - [Setter][#fullyCoveredFragmentShaderInputVariable(int)]
/// ### conservativeRasterizationPostDepthCoverage
/// [VarHandle][#VH_conservativeRasterizationPostDepthCoverage] - [Getter][#conservativeRasterizationPostDepthCoverage()] - [Setter][#conservativeRasterizationPostDepthCoverage(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceConservativeRasterizationPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     float primitiveOverestimationSize;
///     float maxExtraPrimitiveOverestimationSize;
///     float extraPrimitiveOverestimationSizeGranularity;
///     VkBool32 primitiveUnderestimation;
///     VkBool32 conservativePointAndLineRasterization;
///     VkBool32 degenerateTrianglesRasterized;
///     VkBool32 degenerateLinesRasterized;
///     VkBool32 fullyCoveredFragmentShaderInputVariable;
///     VkBool32 conservativeRasterizationPostDepthCoverage;
/// } VkPhysicalDeviceConservativeRasterizationPropertiesEXT;
/// ```
public sealed class VkPhysicalDeviceConservativeRasterizationPropertiesEXT extends Struct {
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
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `primitiveOverestimationSize` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_primitiveOverestimationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveOverestimationSize"));
    /// The [VarHandle] of `maxExtraPrimitiveOverestimationSize` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxExtraPrimitiveOverestimationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExtraPrimitiveOverestimationSize"));
    /// The [VarHandle] of `extraPrimitiveOverestimationSizeGranularity` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_extraPrimitiveOverestimationSizeGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extraPrimitiveOverestimationSizeGranularity"));
    /// The [VarHandle] of `primitiveUnderestimation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primitiveUnderestimation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveUnderestimation"));
    /// The [VarHandle] of `conservativePointAndLineRasterization` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_conservativePointAndLineRasterization = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conservativePointAndLineRasterization"));
    /// The [VarHandle] of `degenerateTrianglesRasterized` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_degenerateTrianglesRasterized = LAYOUT.arrayElementVarHandle(PathElement.groupElement("degenerateTrianglesRasterized"));
    /// The [VarHandle] of `degenerateLinesRasterized` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_degenerateLinesRasterized = LAYOUT.arrayElementVarHandle(PathElement.groupElement("degenerateLinesRasterized"));
    /// The [VarHandle] of `fullyCoveredFragmentShaderInputVariable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fullyCoveredFragmentShaderInputVariable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fullyCoveredFragmentShaderInputVariable"));
    /// The [VarHandle] of `conservativeRasterizationPostDepthCoverage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_conservativeRasterizationPostDepthCoverage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conservativeRasterizationPostDepthCoverage"));

    /// Creates `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceConservativeRasterizationPropertiesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("float") float primitiveOverestimationSize, @CType("float") float maxExtraPrimitiveOverestimationSize, @CType("float") float extraPrimitiveOverestimationSizeGranularity, @CType("VkBool32") int primitiveUnderestimation, @CType("VkBool32") int conservativePointAndLineRasterization, @CType("VkBool32") int degenerateTrianglesRasterized, @CType("VkBool32") int degenerateLinesRasterized, @CType("VkBool32") int fullyCoveredFragmentShaderInputVariable, @CType("VkBool32") int conservativeRasterizationPostDepthCoverage) { return alloc(allocator).sType(sType).pNext(pNext).primitiveOverestimationSize(primitiveOverestimationSize).maxExtraPrimitiveOverestimationSize(maxExtraPrimitiveOverestimationSize).extraPrimitiveOverestimationSizeGranularity(extraPrimitiveOverestimationSizeGranularity).primitiveUnderestimation(primitiveUnderestimation).conservativePointAndLineRasterization(conservativePointAndLineRasterization).degenerateTrianglesRasterized(degenerateTrianglesRasterized).degenerateLinesRasterized(degenerateLinesRasterized).fullyCoveredFragmentShaderInputVariable(fullyCoveredFragmentShaderInputVariable).conservativeRasterizationPostDepthCoverage(conservativeRasterizationPostDepthCoverage); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT copyFrom(VkPhysicalDeviceConservativeRasterizationPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `primitiveOverestimationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_primitiveOverestimationSize(MemorySegment segment, long index) { return (float) VH_primitiveOverestimationSize.get(segment, 0L, index); }
    /// {@return `primitiveOverestimationSize`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_primitiveOverestimationSize(MemorySegment segment) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_primitiveOverestimationSize(segment, 0L); }
    /// {@return `primitiveOverestimationSize`}
    public @CType("float") float primitiveOverestimationSize() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_primitiveOverestimationSize(this.segment()); }
    /// Sets `primitiveOverestimationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primitiveOverestimationSize(MemorySegment segment, long index, @CType("float") float value) { VH_primitiveOverestimationSize.set(segment, 0L, index, value); }
    /// Sets `primitiveOverestimationSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primitiveOverestimationSize(MemorySegment segment, @CType("float") float value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_primitiveOverestimationSize(segment, 0L, value); }
    /// Sets `primitiveOverestimationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT primitiveOverestimationSize(@CType("float") float value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_primitiveOverestimationSize(this.segment(), value); return this; }

    /// {@return `maxExtraPrimitiveOverestimationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxExtraPrimitiveOverestimationSize(MemorySegment segment, long index) { return (float) VH_maxExtraPrimitiveOverestimationSize.get(segment, 0L, index); }
    /// {@return `maxExtraPrimitiveOverestimationSize`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxExtraPrimitiveOverestimationSize(MemorySegment segment) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_maxExtraPrimitiveOverestimationSize(segment, 0L); }
    /// {@return `maxExtraPrimitiveOverestimationSize`}
    public @CType("float") float maxExtraPrimitiveOverestimationSize() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_maxExtraPrimitiveOverestimationSize(this.segment()); }
    /// Sets `maxExtraPrimitiveOverestimationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxExtraPrimitiveOverestimationSize(MemorySegment segment, long index, @CType("float") float value) { VH_maxExtraPrimitiveOverestimationSize.set(segment, 0L, index, value); }
    /// Sets `maxExtraPrimitiveOverestimationSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxExtraPrimitiveOverestimationSize(MemorySegment segment, @CType("float") float value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_maxExtraPrimitiveOverestimationSize(segment, 0L, value); }
    /// Sets `maxExtraPrimitiveOverestimationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT maxExtraPrimitiveOverestimationSize(@CType("float") float value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_maxExtraPrimitiveOverestimationSize(this.segment(), value); return this; }

    /// {@return `extraPrimitiveOverestimationSizeGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_extraPrimitiveOverestimationSizeGranularity(MemorySegment segment, long index) { return (float) VH_extraPrimitiveOverestimationSizeGranularity.get(segment, 0L, index); }
    /// {@return `extraPrimitiveOverestimationSizeGranularity`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_extraPrimitiveOverestimationSizeGranularity(MemorySegment segment) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_extraPrimitiveOverestimationSizeGranularity(segment, 0L); }
    /// {@return `extraPrimitiveOverestimationSizeGranularity`}
    public @CType("float") float extraPrimitiveOverestimationSizeGranularity() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_extraPrimitiveOverestimationSizeGranularity(this.segment()); }
    /// Sets `extraPrimitiveOverestimationSizeGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extraPrimitiveOverestimationSizeGranularity(MemorySegment segment, long index, @CType("float") float value) { VH_extraPrimitiveOverestimationSizeGranularity.set(segment, 0L, index, value); }
    /// Sets `extraPrimitiveOverestimationSizeGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extraPrimitiveOverestimationSizeGranularity(MemorySegment segment, @CType("float") float value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_extraPrimitiveOverestimationSizeGranularity(segment, 0L, value); }
    /// Sets `extraPrimitiveOverestimationSizeGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT extraPrimitiveOverestimationSizeGranularity(@CType("float") float value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_extraPrimitiveOverestimationSizeGranularity(this.segment(), value); return this; }

    /// {@return `primitiveUnderestimation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_primitiveUnderestimation(MemorySegment segment, long index) { return (int) VH_primitiveUnderestimation.get(segment, 0L, index); }
    /// {@return `primitiveUnderestimation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_primitiveUnderestimation(MemorySegment segment) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_primitiveUnderestimation(segment, 0L); }
    /// {@return `primitiveUnderestimation`}
    public @CType("VkBool32") int primitiveUnderestimation() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_primitiveUnderestimation(this.segment()); }
    /// Sets `primitiveUnderestimation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primitiveUnderestimation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_primitiveUnderestimation.set(segment, 0L, index, value); }
    /// Sets `primitiveUnderestimation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primitiveUnderestimation(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_primitiveUnderestimation(segment, 0L, value); }
    /// Sets `primitiveUnderestimation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT primitiveUnderestimation(@CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_primitiveUnderestimation(this.segment(), value); return this; }

    /// {@return `conservativePointAndLineRasterization` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_conservativePointAndLineRasterization(MemorySegment segment, long index) { return (int) VH_conservativePointAndLineRasterization.get(segment, 0L, index); }
    /// {@return `conservativePointAndLineRasterization`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_conservativePointAndLineRasterization(MemorySegment segment) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_conservativePointAndLineRasterization(segment, 0L); }
    /// {@return `conservativePointAndLineRasterization`}
    public @CType("VkBool32") int conservativePointAndLineRasterization() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_conservativePointAndLineRasterization(this.segment()); }
    /// Sets `conservativePointAndLineRasterization` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_conservativePointAndLineRasterization(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_conservativePointAndLineRasterization.set(segment, 0L, index, value); }
    /// Sets `conservativePointAndLineRasterization` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_conservativePointAndLineRasterization(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_conservativePointAndLineRasterization(segment, 0L, value); }
    /// Sets `conservativePointAndLineRasterization` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT conservativePointAndLineRasterization(@CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_conservativePointAndLineRasterization(this.segment(), value); return this; }

    /// {@return `degenerateTrianglesRasterized` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_degenerateTrianglesRasterized(MemorySegment segment, long index) { return (int) VH_degenerateTrianglesRasterized.get(segment, 0L, index); }
    /// {@return `degenerateTrianglesRasterized`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_degenerateTrianglesRasterized(MemorySegment segment) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_degenerateTrianglesRasterized(segment, 0L); }
    /// {@return `degenerateTrianglesRasterized`}
    public @CType("VkBool32") int degenerateTrianglesRasterized() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_degenerateTrianglesRasterized(this.segment()); }
    /// Sets `degenerateTrianglesRasterized` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_degenerateTrianglesRasterized(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_degenerateTrianglesRasterized.set(segment, 0L, index, value); }
    /// Sets `degenerateTrianglesRasterized` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_degenerateTrianglesRasterized(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_degenerateTrianglesRasterized(segment, 0L, value); }
    /// Sets `degenerateTrianglesRasterized` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT degenerateTrianglesRasterized(@CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_degenerateTrianglesRasterized(this.segment(), value); return this; }

    /// {@return `degenerateLinesRasterized` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_degenerateLinesRasterized(MemorySegment segment, long index) { return (int) VH_degenerateLinesRasterized.get(segment, 0L, index); }
    /// {@return `degenerateLinesRasterized`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_degenerateLinesRasterized(MemorySegment segment) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_degenerateLinesRasterized(segment, 0L); }
    /// {@return `degenerateLinesRasterized`}
    public @CType("VkBool32") int degenerateLinesRasterized() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_degenerateLinesRasterized(this.segment()); }
    /// Sets `degenerateLinesRasterized` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_degenerateLinesRasterized(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_degenerateLinesRasterized.set(segment, 0L, index, value); }
    /// Sets `degenerateLinesRasterized` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_degenerateLinesRasterized(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_degenerateLinesRasterized(segment, 0L, value); }
    /// Sets `degenerateLinesRasterized` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT degenerateLinesRasterized(@CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_degenerateLinesRasterized(this.segment(), value); return this; }

    /// {@return `fullyCoveredFragmentShaderInputVariable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fullyCoveredFragmentShaderInputVariable(MemorySegment segment, long index) { return (int) VH_fullyCoveredFragmentShaderInputVariable.get(segment, 0L, index); }
    /// {@return `fullyCoveredFragmentShaderInputVariable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fullyCoveredFragmentShaderInputVariable(MemorySegment segment) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_fullyCoveredFragmentShaderInputVariable(segment, 0L); }
    /// {@return `fullyCoveredFragmentShaderInputVariable`}
    public @CType("VkBool32") int fullyCoveredFragmentShaderInputVariable() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_fullyCoveredFragmentShaderInputVariable(this.segment()); }
    /// Sets `fullyCoveredFragmentShaderInputVariable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fullyCoveredFragmentShaderInputVariable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fullyCoveredFragmentShaderInputVariable.set(segment, 0L, index, value); }
    /// Sets `fullyCoveredFragmentShaderInputVariable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fullyCoveredFragmentShaderInputVariable(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_fullyCoveredFragmentShaderInputVariable(segment, 0L, value); }
    /// Sets `fullyCoveredFragmentShaderInputVariable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT fullyCoveredFragmentShaderInputVariable(@CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_fullyCoveredFragmentShaderInputVariable(this.segment(), value); return this; }

    /// {@return `conservativeRasterizationPostDepthCoverage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_conservativeRasterizationPostDepthCoverage(MemorySegment segment, long index) { return (int) VH_conservativeRasterizationPostDepthCoverage.get(segment, 0L, index); }
    /// {@return `conservativeRasterizationPostDepthCoverage`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_conservativeRasterizationPostDepthCoverage(MemorySegment segment) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_conservativeRasterizationPostDepthCoverage(segment, 0L); }
    /// {@return `conservativeRasterizationPostDepthCoverage`}
    public @CType("VkBool32") int conservativeRasterizationPostDepthCoverage() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_conservativeRasterizationPostDepthCoverage(this.segment()); }
    /// Sets `conservativeRasterizationPostDepthCoverage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_conservativeRasterizationPostDepthCoverage(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_conservativeRasterizationPostDepthCoverage.set(segment, 0L, index, value); }
    /// Sets `conservativeRasterizationPostDepthCoverage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_conservativeRasterizationPostDepthCoverage(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_conservativeRasterizationPostDepthCoverage(segment, 0L, value); }
    /// Sets `conservativeRasterizationPostDepthCoverage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT conservativeRasterizationPostDepthCoverage(@CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_conservativeRasterizationPostDepthCoverage(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceConservativeRasterizationPropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceConservativeRasterizationPropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceConservativeRasterizationPropertiesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `primitiveOverestimationSize` at the given index}
        /// @param index the index
        public @CType("float") float primitiveOverestimationSizeAt(long index) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_primitiveOverestimationSize(this.segment(), index); }
        /// Sets `primitiveOverestimationSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer primitiveOverestimationSizeAt(long index, @CType("float") float value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_primitiveOverestimationSize(this.segment(), index, value); return this; }

        /// {@return `maxExtraPrimitiveOverestimationSize` at the given index}
        /// @param index the index
        public @CType("float") float maxExtraPrimitiveOverestimationSizeAt(long index) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_maxExtraPrimitiveOverestimationSize(this.segment(), index); }
        /// Sets `maxExtraPrimitiveOverestimationSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxExtraPrimitiveOverestimationSizeAt(long index, @CType("float") float value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_maxExtraPrimitiveOverestimationSize(this.segment(), index, value); return this; }

        /// {@return `extraPrimitiveOverestimationSizeGranularity` at the given index}
        /// @param index the index
        public @CType("float") float extraPrimitiveOverestimationSizeGranularityAt(long index) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_extraPrimitiveOverestimationSizeGranularity(this.segment(), index); }
        /// Sets `extraPrimitiveOverestimationSizeGranularity` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer extraPrimitiveOverestimationSizeGranularityAt(long index, @CType("float") float value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_extraPrimitiveOverestimationSizeGranularity(this.segment(), index, value); return this; }

        /// {@return `primitiveUnderestimation` at the given index}
        /// @param index the index
        public @CType("VkBool32") int primitiveUnderestimationAt(long index) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_primitiveUnderestimation(this.segment(), index); }
        /// Sets `primitiveUnderestimation` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer primitiveUnderestimationAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_primitiveUnderestimation(this.segment(), index, value); return this; }

        /// {@return `conservativePointAndLineRasterization` at the given index}
        /// @param index the index
        public @CType("VkBool32") int conservativePointAndLineRasterizationAt(long index) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_conservativePointAndLineRasterization(this.segment(), index); }
        /// Sets `conservativePointAndLineRasterization` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer conservativePointAndLineRasterizationAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_conservativePointAndLineRasterization(this.segment(), index, value); return this; }

        /// {@return `degenerateTrianglesRasterized` at the given index}
        /// @param index the index
        public @CType("VkBool32") int degenerateTrianglesRasterizedAt(long index) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_degenerateTrianglesRasterized(this.segment(), index); }
        /// Sets `degenerateTrianglesRasterized` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer degenerateTrianglesRasterizedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_degenerateTrianglesRasterized(this.segment(), index, value); return this; }

        /// {@return `degenerateLinesRasterized` at the given index}
        /// @param index the index
        public @CType("VkBool32") int degenerateLinesRasterizedAt(long index) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_degenerateLinesRasterized(this.segment(), index); }
        /// Sets `degenerateLinesRasterized` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer degenerateLinesRasterizedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_degenerateLinesRasterized(this.segment(), index, value); return this; }

        /// {@return `fullyCoveredFragmentShaderInputVariable` at the given index}
        /// @param index the index
        public @CType("VkBool32") int fullyCoveredFragmentShaderInputVariableAt(long index) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_fullyCoveredFragmentShaderInputVariable(this.segment(), index); }
        /// Sets `fullyCoveredFragmentShaderInputVariable` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fullyCoveredFragmentShaderInputVariableAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_fullyCoveredFragmentShaderInputVariable(this.segment(), index, value); return this; }

        /// {@return `conservativeRasterizationPostDepthCoverage` at the given index}
        /// @param index the index
        public @CType("VkBool32") int conservativeRasterizationPostDepthCoverageAt(long index) { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.get_conservativeRasterizationPostDepthCoverage(this.segment(), index); }
        /// Sets `conservativeRasterizationPostDepthCoverage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer conservativeRasterizationPostDepthCoverageAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.set_conservativeRasterizationPostDepthCoverage(this.segment(), index, value); return this; }

    }
}

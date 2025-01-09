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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### conservativeRasterizationMode
/// [VarHandle][#VH_conservativeRasterizationMode] - [Getter][#conservativeRasterizationMode()] - [Setter][#conservativeRasterizationMode(int)]
/// ### extraPrimitiveOverestimationSize
/// [VarHandle][#VH_extraPrimitiveOverestimationSize] - [Getter][#extraPrimitiveOverestimationSize()] - [Setter][#extraPrimitiveOverestimationSize(float)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineRasterizationConservativeStateCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineRasterizationConservativeStateCreateFlagsEXT flags;
///     VkConservativeRasterizationModeEXT conservativeRasterizationMode;
///     float extraPrimitiveOverestimationSize;
/// } VkPipelineRasterizationConservativeStateCreateInfoEXT;
/// ```
public final class VkPipelineRasterizationConservativeStateCreateInfoEXT extends Struct {
    /// The struct layout of `VkPipelineRasterizationConservativeStateCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("conservativeRasterizationMode"),
        ValueLayout.JAVA_FLOAT.withName("extraPrimitiveOverestimationSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `conservativeRasterizationMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_conservativeRasterizationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conservativeRasterizationMode"));
    /// The [VarHandle] of `extraPrimitiveOverestimationSize` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_extraPrimitiveOverestimationSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extraPrimitiveOverestimationSize"));

    /// Creates `VkPipelineRasterizationConservativeStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkPipelineRasterizationConservativeStateCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineRasterizationConservativeStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationConservativeStateCreateInfoEXT(segment); }

    /// Creates `VkPipelineRasterizationConservativeStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationConservativeStateCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineRasterizationConservativeStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationConservativeStateCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineRasterizationConservativeStateCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineRasterizationConservativeStateCreateInfoEXT`
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationConservativeStateCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineRasterizationConservativeStateCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineRasterizationConservativeStateCreateInfoEXT`
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationConservativeStateCreateInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT sType(@CType("VkStructureType") int value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRasterizationConservativeStateCreateFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRasterizationConservativeStateCreateFlagsEXT") int get_flags(MemorySegment segment) { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineRasterizationConservativeStateCreateFlagsEXT") int flagsAt(long index) { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineRasterizationConservativeStateCreateFlagsEXT") int flags() { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineRasterizationConservativeStateCreateFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineRasterizationConservativeStateCreateFlagsEXT") int value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT flagsAt(long index, @CType("VkPipelineRasterizationConservativeStateCreateFlagsEXT") int value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT flags(@CType("VkPipelineRasterizationConservativeStateCreateFlagsEXT") int value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_flags(this.segment(), value); return this; }

    /// {@return `conservativeRasterizationMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkConservativeRasterizationModeEXT") int get_conservativeRasterizationMode(MemorySegment segment, long index) { return (int) VH_conservativeRasterizationMode.get(segment, 0L, index); }
    /// {@return `conservativeRasterizationMode`}
    /// @param segment the segment of the struct
    public static @CType("VkConservativeRasterizationModeEXT") int get_conservativeRasterizationMode(MemorySegment segment) { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_conservativeRasterizationMode(segment, 0L); }
    /// {@return `conservativeRasterizationMode` at the given index}
    /// @param index the index
    public @CType("VkConservativeRasterizationModeEXT") int conservativeRasterizationModeAt(long index) { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_conservativeRasterizationMode(this.segment(), index); }
    /// {@return `conservativeRasterizationMode`}
    public @CType("VkConservativeRasterizationModeEXT") int conservativeRasterizationMode() { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_conservativeRasterizationMode(this.segment()); }
    /// Sets `conservativeRasterizationMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_conservativeRasterizationMode(MemorySegment segment, long index, @CType("VkConservativeRasterizationModeEXT") int value) { VH_conservativeRasterizationMode.set(segment, 0L, index, value); }
    /// Sets `conservativeRasterizationMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_conservativeRasterizationMode(MemorySegment segment, @CType("VkConservativeRasterizationModeEXT") int value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_conservativeRasterizationMode(segment, 0L, value); }
    /// Sets `conservativeRasterizationMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT conservativeRasterizationModeAt(long index, @CType("VkConservativeRasterizationModeEXT") int value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_conservativeRasterizationMode(this.segment(), index, value); return this; }
    /// Sets `conservativeRasterizationMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT conservativeRasterizationMode(@CType("VkConservativeRasterizationModeEXT") int value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_conservativeRasterizationMode(this.segment(), value); return this; }

    /// {@return `extraPrimitiveOverestimationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_extraPrimitiveOverestimationSize(MemorySegment segment, long index) { return (float) VH_extraPrimitiveOverestimationSize.get(segment, 0L, index); }
    /// {@return `extraPrimitiveOverestimationSize`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_extraPrimitiveOverestimationSize(MemorySegment segment) { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_extraPrimitiveOverestimationSize(segment, 0L); }
    /// {@return `extraPrimitiveOverestimationSize` at the given index}
    /// @param index the index
    public @CType("float") float extraPrimitiveOverestimationSizeAt(long index) { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_extraPrimitiveOverestimationSize(this.segment(), index); }
    /// {@return `extraPrimitiveOverestimationSize`}
    public @CType("float") float extraPrimitiveOverestimationSize() { return VkPipelineRasterizationConservativeStateCreateInfoEXT.get_extraPrimitiveOverestimationSize(this.segment()); }
    /// Sets `extraPrimitiveOverestimationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extraPrimitiveOverestimationSize(MemorySegment segment, long index, @CType("float") float value) { VH_extraPrimitiveOverestimationSize.set(segment, 0L, index, value); }
    /// Sets `extraPrimitiveOverestimationSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extraPrimitiveOverestimationSize(MemorySegment segment, @CType("float") float value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_extraPrimitiveOverestimationSize(segment, 0L, value); }
    /// Sets `extraPrimitiveOverestimationSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT extraPrimitiveOverestimationSizeAt(long index, @CType("float") float value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_extraPrimitiveOverestimationSize(this.segment(), index, value); return this; }
    /// Sets `extraPrimitiveOverestimationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationConservativeStateCreateInfoEXT extraPrimitiveOverestimationSize(@CType("float") float value) { VkPipelineRasterizationConservativeStateCreateInfoEXT.set_extraPrimitiveOverestimationSize(this.segment(), value); return this; }

}

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
package overrungl.vulkan.nv.struct;

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
/// ### coverageReductionMode
/// [VarHandle][#VH_coverageReductionMode] - [Getter][#coverageReductionMode()] - [Setter][#coverageReductionMode(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineCoverageReductionStateCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineCoverageReductionStateCreateFlagsNV flags;
///     VkCoverageReductionModeNV coverageReductionMode;
/// } VkPipelineCoverageReductionStateCreateInfoNV;
/// ```
public final class VkPipelineCoverageReductionStateCreateInfoNV extends Struct {
    /// The struct layout of `VkPipelineCoverageReductionStateCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("coverageReductionMode")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `coverageReductionMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_coverageReductionMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageReductionMode"));

    /// Creates `VkPipelineCoverageReductionStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkPipelineCoverageReductionStateCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineCoverageReductionStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCoverageReductionStateCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCoverageReductionStateCreateInfoNV(segment); }

    /// Creates `VkPipelineCoverageReductionStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCoverageReductionStateCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCoverageReductionStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineCoverageReductionStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCoverageReductionStateCreateInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCoverageReductionStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineCoverageReductionStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCoverageReductionStateCreateInfoNV`
    public static VkPipelineCoverageReductionStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineCoverageReductionStateCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineCoverageReductionStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCoverageReductionStateCreateInfoNV`
    public static VkPipelineCoverageReductionStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineCoverageReductionStateCreateInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineCoverageReductionStateCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineCoverageReductionStateCreateInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineCoverageReductionStateCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineCoverageReductionStateCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageReductionStateCreateInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineCoverageReductionStateCreateInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageReductionStateCreateInfoNV sType(@CType("VkStructureType") int value) { VkPipelineCoverageReductionStateCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineCoverageReductionStateCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineCoverageReductionStateCreateInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineCoverageReductionStateCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineCoverageReductionStateCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageReductionStateCreateInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineCoverageReductionStateCreateInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageReductionStateCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineCoverageReductionStateCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineCoverageReductionStateCreateFlagsNV") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineCoverageReductionStateCreateFlagsNV") int get_flags(MemorySegment segment) { return VkPipelineCoverageReductionStateCreateInfoNV.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineCoverageReductionStateCreateFlagsNV") int flagsAt(long index) { return VkPipelineCoverageReductionStateCreateInfoNV.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineCoverageReductionStateCreateFlagsNV") int flags() { return VkPipelineCoverageReductionStateCreateInfoNV.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineCoverageReductionStateCreateFlagsNV") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineCoverageReductionStateCreateFlagsNV") int value) { VkPipelineCoverageReductionStateCreateInfoNV.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageReductionStateCreateInfoNV flagsAt(long index, @CType("VkPipelineCoverageReductionStateCreateFlagsNV") int value) { VkPipelineCoverageReductionStateCreateInfoNV.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageReductionStateCreateInfoNV flags(@CType("VkPipelineCoverageReductionStateCreateFlagsNV") int value) { VkPipelineCoverageReductionStateCreateInfoNV.set_flags(this.segment(), value); return this; }

    /// {@return `coverageReductionMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCoverageReductionModeNV") int get_coverageReductionMode(MemorySegment segment, long index) { return (int) VH_coverageReductionMode.get(segment, 0L, index); }
    /// {@return `coverageReductionMode`}
    /// @param segment the segment of the struct
    public static @CType("VkCoverageReductionModeNV") int get_coverageReductionMode(MemorySegment segment) { return VkPipelineCoverageReductionStateCreateInfoNV.get_coverageReductionMode(segment, 0L); }
    /// {@return `coverageReductionMode` at the given index}
    /// @param index the index
    public @CType("VkCoverageReductionModeNV") int coverageReductionModeAt(long index) { return VkPipelineCoverageReductionStateCreateInfoNV.get_coverageReductionMode(this.segment(), index); }
    /// {@return `coverageReductionMode`}
    public @CType("VkCoverageReductionModeNV") int coverageReductionMode() { return VkPipelineCoverageReductionStateCreateInfoNV.get_coverageReductionMode(this.segment()); }
    /// Sets `coverageReductionMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_coverageReductionMode(MemorySegment segment, long index, @CType("VkCoverageReductionModeNV") int value) { VH_coverageReductionMode.set(segment, 0L, index, value); }
    /// Sets `coverageReductionMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_coverageReductionMode(MemorySegment segment, @CType("VkCoverageReductionModeNV") int value) { VkPipelineCoverageReductionStateCreateInfoNV.set_coverageReductionMode(segment, 0L, value); }
    /// Sets `coverageReductionMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageReductionStateCreateInfoNV coverageReductionModeAt(long index, @CType("VkCoverageReductionModeNV") int value) { VkPipelineCoverageReductionStateCreateInfoNV.set_coverageReductionMode(this.segment(), index, value); return this; }
    /// Sets `coverageReductionMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageReductionStateCreateInfoNV coverageReductionMode(@CType("VkCoverageReductionModeNV") int value) { VkPipelineCoverageReductionStateCreateInfoNV.set_coverageReductionMode(this.segment(), value); return this; }

}

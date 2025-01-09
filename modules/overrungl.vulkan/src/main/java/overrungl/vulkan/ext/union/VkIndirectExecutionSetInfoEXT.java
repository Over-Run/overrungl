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
package overrungl.vulkan.ext.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### pPipelineInfo
/// [VarHandle][#VH_pPipelineInfo] - [Getter][#pPipelineInfo()] - [Setter][#pPipelineInfo(java.lang.foreign.MemorySegment)]
/// ### pShaderInfo
/// [VarHandle][#VH_pShaderInfo] - [Getter][#pShaderInfo()] - [Setter][#pShaderInfo(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef union VkIndirectExecutionSetInfoEXT {
///     const VkIndirectExecutionSetPipelineInfoEXT * pPipelineInfo;
///     const VkIndirectExecutionSetShaderInfoEXT * pShaderInfo;
/// } VkIndirectExecutionSetInfoEXT;
/// ```
public final class VkIndirectExecutionSetInfoEXT extends Union {
    /// The union layout of `VkIndirectExecutionSetInfoEXT`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.ADDRESS.withName("pPipelineInfo"),
        ValueLayout.ADDRESS.withName("pShaderInfo")
    );
    /// The [VarHandle] of `pPipelineInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPipelineInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineInfo"));
    /// The [VarHandle] of `pShaderInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pShaderInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShaderInfo"));

    /// Creates `VkIndirectExecutionSetInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectExecutionSetInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectExecutionSetInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetInfoEXT(segment); }

    /// Creates `VkIndirectExecutionSetInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectExecutionSetInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkIndirectExecutionSetInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectExecutionSetInfoEXT`
    public static VkIndirectExecutionSetInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectExecutionSetInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectExecutionSetInfoEXT`
    public static VkIndirectExecutionSetInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectExecutionSetInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkIndirectExecutionSetInfoEXT`.
    /// @param index the index of the union buffer
    /// @return the slice of `VkIndirectExecutionSetInfoEXT`
    public VkIndirectExecutionSetInfoEXT asSlice(long index) { return new VkIndirectExecutionSetInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkIndirectExecutionSetInfoEXT`.
    /// @param index the index of the union buffer
    /// @param count the count
    /// @return the slice of `VkIndirectExecutionSetInfoEXT`
    public VkIndirectExecutionSetInfoEXT asSlice(long index, long count) { return new VkIndirectExecutionSetInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `pPipelineInfo` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkIndirectExecutionSetPipelineInfoEXT *") java.lang.foreign.MemorySegment get_pPipelineInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPipelineInfo.get(segment, 0L, index); }
    /// {@return `pPipelineInfo`}
    /// @param segment the segment of the union
    public static @CType("const VkIndirectExecutionSetPipelineInfoEXT *") java.lang.foreign.MemorySegment get_pPipelineInfo(MemorySegment segment) { return VkIndirectExecutionSetInfoEXT.get_pPipelineInfo(segment, 0L); }
    /// {@return `pPipelineInfo` at the given index}
    /// @param index the index
    public @CType("const VkIndirectExecutionSetPipelineInfoEXT *") java.lang.foreign.MemorySegment pPipelineInfoAt(long index) { return VkIndirectExecutionSetInfoEXT.get_pPipelineInfo(this.segment(), index); }
    /// {@return `pPipelineInfo`}
    public @CType("const VkIndirectExecutionSetPipelineInfoEXT *") java.lang.foreign.MemorySegment pPipelineInfo() { return VkIndirectExecutionSetInfoEXT.get_pPipelineInfo(this.segment()); }
    /// Sets `pPipelineInfo` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pPipelineInfo(MemorySegment segment, long index, @CType("const VkIndirectExecutionSetPipelineInfoEXT *") java.lang.foreign.MemorySegment value) { VH_pPipelineInfo.set(segment, 0L, index, value); }
    /// Sets `pPipelineInfo` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pPipelineInfo(MemorySegment segment, @CType("const VkIndirectExecutionSetPipelineInfoEXT *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetInfoEXT.set_pPipelineInfo(segment, 0L, value); }
    /// Sets `pPipelineInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetInfoEXT pPipelineInfoAt(long index, @CType("const VkIndirectExecutionSetPipelineInfoEXT *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetInfoEXT.set_pPipelineInfo(this.segment(), index, value); return this; }
    /// Sets `pPipelineInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetInfoEXT pPipelineInfo(@CType("const VkIndirectExecutionSetPipelineInfoEXT *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetInfoEXT.set_pPipelineInfo(this.segment(), value); return this; }

    /// {@return `pShaderInfo` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkIndirectExecutionSetShaderInfoEXT *") java.lang.foreign.MemorySegment get_pShaderInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pShaderInfo.get(segment, 0L, index); }
    /// {@return `pShaderInfo`}
    /// @param segment the segment of the union
    public static @CType("const VkIndirectExecutionSetShaderInfoEXT *") java.lang.foreign.MemorySegment get_pShaderInfo(MemorySegment segment) { return VkIndirectExecutionSetInfoEXT.get_pShaderInfo(segment, 0L); }
    /// {@return `pShaderInfo` at the given index}
    /// @param index the index
    public @CType("const VkIndirectExecutionSetShaderInfoEXT *") java.lang.foreign.MemorySegment pShaderInfoAt(long index) { return VkIndirectExecutionSetInfoEXT.get_pShaderInfo(this.segment(), index); }
    /// {@return `pShaderInfo`}
    public @CType("const VkIndirectExecutionSetShaderInfoEXT *") java.lang.foreign.MemorySegment pShaderInfo() { return VkIndirectExecutionSetInfoEXT.get_pShaderInfo(this.segment()); }
    /// Sets `pShaderInfo` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pShaderInfo(MemorySegment segment, long index, @CType("const VkIndirectExecutionSetShaderInfoEXT *") java.lang.foreign.MemorySegment value) { VH_pShaderInfo.set(segment, 0L, index, value); }
    /// Sets `pShaderInfo` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pShaderInfo(MemorySegment segment, @CType("const VkIndirectExecutionSetShaderInfoEXT *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetInfoEXT.set_pShaderInfo(segment, 0L, value); }
    /// Sets `pShaderInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetInfoEXT pShaderInfoAt(long index, @CType("const VkIndirectExecutionSetShaderInfoEXT *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetInfoEXT.set_pShaderInfo(this.segment(), index, value); return this; }
    /// Sets `pShaderInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetInfoEXT pShaderInfo(@CType("const VkIndirectExecutionSetShaderInfoEXT *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetInfoEXT.set_pShaderInfo(this.segment(), value); return this; }

}

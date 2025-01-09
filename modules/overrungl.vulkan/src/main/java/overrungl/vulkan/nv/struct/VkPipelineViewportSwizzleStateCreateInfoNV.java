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
/// ### viewportCount
/// [VarHandle][#VH_viewportCount] - [Getter][#viewportCount()] - [Setter][#viewportCount(int)]
/// ### pViewportSwizzles
/// [VarHandle][#VH_pViewportSwizzles] - [Getter][#pViewportSwizzles()] - [Setter][#pViewportSwizzles(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineViewportSwizzleStateCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineViewportSwizzleStateCreateFlagsNV flags;
///     uint32_t viewportCount;
///     const VkViewportSwizzleNV * pViewportSwizzles;
/// } VkPipelineViewportSwizzleStateCreateInfoNV;
/// ```
public final class VkPipelineViewportSwizzleStateCreateInfoNV extends Struct {
    /// The struct layout of `VkPipelineViewportSwizzleStateCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withName("pViewportSwizzles")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `viewportCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewportCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportCount"));
    /// The [VarHandle] of `pViewportSwizzles` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pViewportSwizzles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewportSwizzles"));

    /// Creates `VkPipelineViewportSwizzleStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkPipelineViewportSwizzleStateCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineViewportSwizzleStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportSwizzleStateCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportSwizzleStateCreateInfoNV(segment); }

    /// Creates `VkPipelineViewportSwizzleStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportSwizzleStateCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportSwizzleStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineViewportSwizzleStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportSwizzleStateCreateInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportSwizzleStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineViewportSwizzleStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportSwizzleStateCreateInfoNV`
    public static VkPipelineViewportSwizzleStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineViewportSwizzleStateCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineViewportSwizzleStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineViewportSwizzleStateCreateInfoNV`
    public static VkPipelineViewportSwizzleStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportSwizzleStateCreateInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineViewportSwizzleStateCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineViewportSwizzleStateCreateInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineViewportSwizzleStateCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV sType(@CType("VkStructureType") int value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineViewportSwizzleStateCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineViewportSwizzleStateCreateInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineViewportSwizzleStateCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineViewportSwizzleStateCreateFlagsNV") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineViewportSwizzleStateCreateFlagsNV") int get_flags(MemorySegment segment) { return VkPipelineViewportSwizzleStateCreateInfoNV.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineViewportSwizzleStateCreateFlagsNV") int flagsAt(long index) { return VkPipelineViewportSwizzleStateCreateInfoNV.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineViewportSwizzleStateCreateFlagsNV") int flags() { return VkPipelineViewportSwizzleStateCreateInfoNV.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineViewportSwizzleStateCreateFlagsNV") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineViewportSwizzleStateCreateFlagsNV") int value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV flagsAt(long index, @CType("VkPipelineViewportSwizzleStateCreateFlagsNV") int value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV flags(@CType("VkPipelineViewportSwizzleStateCreateFlagsNV") int value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_flags(this.segment(), value); return this; }

    /// {@return `viewportCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_viewportCount(MemorySegment segment, long index) { return (int) VH_viewportCount.get(segment, 0L, index); }
    /// {@return `viewportCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_viewportCount(MemorySegment segment) { return VkPipelineViewportSwizzleStateCreateInfoNV.get_viewportCount(segment, 0L); }
    /// {@return `viewportCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int viewportCountAt(long index) { return VkPipelineViewportSwizzleStateCreateInfoNV.get_viewportCount(this.segment(), index); }
    /// {@return `viewportCount`}
    public @CType("uint32_t") int viewportCount() { return VkPipelineViewportSwizzleStateCreateInfoNV.get_viewportCount(this.segment()); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewportCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_viewportCount.set(segment, 0L, index, value); }
    /// Sets `viewportCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewportCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_viewportCount(segment, 0L, value); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV viewportCountAt(long index, @CType("uint32_t") int value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_viewportCount(this.segment(), index, value); return this; }
    /// Sets `viewportCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV viewportCount(@CType("uint32_t") int value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_viewportCount(this.segment(), value); return this; }

    /// {@return `pViewportSwizzles` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkViewportSwizzleNV *") java.lang.foreign.MemorySegment get_pViewportSwizzles(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pViewportSwizzles.get(segment, 0L, index); }
    /// {@return `pViewportSwizzles`}
    /// @param segment the segment of the struct
    public static @CType("const VkViewportSwizzleNV *") java.lang.foreign.MemorySegment get_pViewportSwizzles(MemorySegment segment) { return VkPipelineViewportSwizzleStateCreateInfoNV.get_pViewportSwizzles(segment, 0L); }
    /// {@return `pViewportSwizzles` at the given index}
    /// @param index the index
    public @CType("const VkViewportSwizzleNV *") java.lang.foreign.MemorySegment pViewportSwizzlesAt(long index) { return VkPipelineViewportSwizzleStateCreateInfoNV.get_pViewportSwizzles(this.segment(), index); }
    /// {@return `pViewportSwizzles`}
    public @CType("const VkViewportSwizzleNV *") java.lang.foreign.MemorySegment pViewportSwizzles() { return VkPipelineViewportSwizzleStateCreateInfoNV.get_pViewportSwizzles(this.segment()); }
    /// Sets `pViewportSwizzles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pViewportSwizzles(MemorySegment segment, long index, @CType("const VkViewportSwizzleNV *") java.lang.foreign.MemorySegment value) { VH_pViewportSwizzles.set(segment, 0L, index, value); }
    /// Sets `pViewportSwizzles` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pViewportSwizzles(MemorySegment segment, @CType("const VkViewportSwizzleNV *") java.lang.foreign.MemorySegment value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_pViewportSwizzles(segment, 0L, value); }
    /// Sets `pViewportSwizzles` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV pViewportSwizzlesAt(long index, @CType("const VkViewportSwizzleNV *") java.lang.foreign.MemorySegment value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_pViewportSwizzles(this.segment(), index, value); return this; }
    /// Sets `pViewportSwizzles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV pViewportSwizzles(@CType("const VkViewportSwizzleNV *") java.lang.foreign.MemorySegment value) { VkPipelineViewportSwizzleStateCreateInfoNV.set_pViewportSwizzles(this.segment(), value); return this; }

}

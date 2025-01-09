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
package overrungl.vulkan.struct;

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
/// ### patchControlPoints
/// [VarHandle][#VH_patchControlPoints] - [Getter][#patchControlPoints()] - [Setter][#patchControlPoints(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineTessellationStateCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineTessellationStateCreateFlags flags;
///     uint32_t patchControlPoints;
/// } VkPipelineTessellationStateCreateInfo;
/// ```
public final class VkPipelineTessellationStateCreateInfo extends Struct {
    /// The struct layout of `VkPipelineTessellationStateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("patchControlPoints")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `patchControlPoints` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_patchControlPoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("patchControlPoints"));

    /// Creates `VkPipelineTessellationStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineTessellationStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineTessellationStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineTessellationStateCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineTessellationStateCreateInfo(segment); }

    /// Creates `VkPipelineTessellationStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineTessellationStateCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineTessellationStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineTessellationStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineTessellationStateCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineTessellationStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineTessellationStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineTessellationStateCreateInfo`
    public static VkPipelineTessellationStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineTessellationStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineTessellationStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineTessellationStateCreateInfo`
    public static VkPipelineTessellationStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineTessellationStateCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPipelineTessellationStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineTessellationStateCreateInfo`
    public VkPipelineTessellationStateCreateInfo asSlice(long index) { return new VkPipelineTessellationStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPipelineTessellationStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineTessellationStateCreateInfo`
    public VkPipelineTessellationStateCreateInfo asSlice(long index, long count) { return new VkPipelineTessellationStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineTessellationStateCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineTessellationStateCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineTessellationStateCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineTessellationStateCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineTessellationStateCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineTessellationStateCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineTessellationStateCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineTessellationStateCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineTessellationStateCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineTessellationStateCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineTessellationStateCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineTessellationStateCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineTessellationStateCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineTessellationStateCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineTessellationStateCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineTessellationStateCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineTessellationStateCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineTessellationStateCreateFlags") int get_flags(MemorySegment segment) { return VkPipelineTessellationStateCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineTessellationStateCreateFlags") int flagsAt(long index) { return VkPipelineTessellationStateCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineTessellationStateCreateFlags") int flags() { return VkPipelineTessellationStateCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineTessellationStateCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineTessellationStateCreateFlags") int value) { VkPipelineTessellationStateCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineTessellationStateCreateInfo flagsAt(long index, @CType("VkPipelineTessellationStateCreateFlags") int value) { VkPipelineTessellationStateCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineTessellationStateCreateInfo flags(@CType("VkPipelineTessellationStateCreateFlags") int value) { VkPipelineTessellationStateCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `patchControlPoints` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_patchControlPoints(MemorySegment segment, long index) { return (int) VH_patchControlPoints.get(segment, 0L, index); }
    /// {@return `patchControlPoints`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_patchControlPoints(MemorySegment segment) { return VkPipelineTessellationStateCreateInfo.get_patchControlPoints(segment, 0L); }
    /// {@return `patchControlPoints` at the given index}
    /// @param index the index
    public @CType("uint32_t") int patchControlPointsAt(long index) { return VkPipelineTessellationStateCreateInfo.get_patchControlPoints(this.segment(), index); }
    /// {@return `patchControlPoints`}
    public @CType("uint32_t") int patchControlPoints() { return VkPipelineTessellationStateCreateInfo.get_patchControlPoints(this.segment()); }
    /// Sets `patchControlPoints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_patchControlPoints(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_patchControlPoints.set(segment, 0L, index, value); }
    /// Sets `patchControlPoints` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_patchControlPoints(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineTessellationStateCreateInfo.set_patchControlPoints(segment, 0L, value); }
    /// Sets `patchControlPoints` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineTessellationStateCreateInfo patchControlPointsAt(long index, @CType("uint32_t") int value) { VkPipelineTessellationStateCreateInfo.set_patchControlPoints(this.segment(), index, value); return this; }
    /// Sets `patchControlPoints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineTessellationStateCreateInfo patchControlPoints(@CType("uint32_t") int value) { VkPipelineTessellationStateCreateInfo.set_patchControlPoints(this.segment(), value); return this; }

}

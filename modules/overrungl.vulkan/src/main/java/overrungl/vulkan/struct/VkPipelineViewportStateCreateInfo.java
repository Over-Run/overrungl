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
/// ### viewportCount
/// [VarHandle][#VH_viewportCount] - [Getter][#viewportCount()] - [Setter][#viewportCount(int)]
/// ### pViewports
/// [VarHandle][#VH_pViewports] - [Getter][#pViewports()] - [Setter][#pViewports(java.lang.foreign.MemorySegment)]
/// ### scissorCount
/// [VarHandle][#VH_scissorCount] - [Getter][#scissorCount()] - [Setter][#scissorCount(int)]
/// ### pScissors
/// [VarHandle][#VH_pScissors] - [Getter][#pScissors()] - [Setter][#pScissors(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineViewportStateCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineViewportStateCreateFlags flags;
///     uint32_t viewportCount;
///     const VkViewport * pViewports;
///     uint32_t scissorCount;
///     const VkRect2D * pScissors;
/// } VkPipelineViewportStateCreateInfo;
/// ```
public final class VkPipelineViewportStateCreateInfo extends Struct {
    /// The struct layout of `VkPipelineViewportStateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withName("pViewports"),
        ValueLayout.JAVA_INT.withName("scissorCount"),
        ValueLayout.ADDRESS.withName("pScissors")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `viewportCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewportCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportCount"));
    /// The [VarHandle] of `pViewports` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pViewports = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewports"));
    /// The [VarHandle] of `scissorCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_scissorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scissorCount"));
    /// The [VarHandle] of `pScissors` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pScissors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pScissors"));

    /// Creates `VkPipelineViewportStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineViewportStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineViewportStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportStateCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportStateCreateInfo(segment); }

    /// Creates `VkPipelineViewportStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportStateCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineViewportStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportStateCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineViewportStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportStateCreateInfo`
    public static VkPipelineViewportStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineViewportStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineViewportStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineViewportStateCreateInfo`
    public static VkPipelineViewportStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportStateCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineViewportStateCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineViewportStateCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineViewportStateCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineViewportStateCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineViewportStateCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineViewportStateCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineViewportStateCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineViewportStateCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineViewportStateCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportStateCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportStateCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportStateCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineViewportStateCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineViewportStateCreateFlags") int get_flags(MemorySegment segment) { return VkPipelineViewportStateCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineViewportStateCreateFlags") int flagsAt(long index) { return VkPipelineViewportStateCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineViewportStateCreateFlags") int flags() { return VkPipelineViewportStateCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineViewportStateCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineViewportStateCreateFlags") int value) { VkPipelineViewportStateCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo flagsAt(long index, @CType("VkPipelineViewportStateCreateFlags") int value) { VkPipelineViewportStateCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo flags(@CType("VkPipelineViewportStateCreateFlags") int value) { VkPipelineViewportStateCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `viewportCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_viewportCount(MemorySegment segment, long index) { return (int) VH_viewportCount.get(segment, 0L, index); }
    /// {@return `viewportCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_viewportCount(MemorySegment segment) { return VkPipelineViewportStateCreateInfo.get_viewportCount(segment, 0L); }
    /// {@return `viewportCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int viewportCountAt(long index) { return VkPipelineViewportStateCreateInfo.get_viewportCount(this.segment(), index); }
    /// {@return `viewportCount`}
    public @CType("uint32_t") int viewportCount() { return VkPipelineViewportStateCreateInfo.get_viewportCount(this.segment()); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewportCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_viewportCount.set(segment, 0L, index, value); }
    /// Sets `viewportCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewportCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineViewportStateCreateInfo.set_viewportCount(segment, 0L, value); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo viewportCountAt(long index, @CType("uint32_t") int value) { VkPipelineViewportStateCreateInfo.set_viewportCount(this.segment(), index, value); return this; }
    /// Sets `viewportCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo viewportCount(@CType("uint32_t") int value) { VkPipelineViewportStateCreateInfo.set_viewportCount(this.segment(), value); return this; }

    /// {@return `pViewports` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkViewport *") java.lang.foreign.MemorySegment get_pViewports(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pViewports.get(segment, 0L, index); }
    /// {@return `pViewports`}
    /// @param segment the segment of the struct
    public static @CType("const VkViewport *") java.lang.foreign.MemorySegment get_pViewports(MemorySegment segment) { return VkPipelineViewportStateCreateInfo.get_pViewports(segment, 0L); }
    /// {@return `pViewports` at the given index}
    /// @param index the index
    public @CType("const VkViewport *") java.lang.foreign.MemorySegment pViewportsAt(long index) { return VkPipelineViewportStateCreateInfo.get_pViewports(this.segment(), index); }
    /// {@return `pViewports`}
    public @CType("const VkViewport *") java.lang.foreign.MemorySegment pViewports() { return VkPipelineViewportStateCreateInfo.get_pViewports(this.segment()); }
    /// Sets `pViewports` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pViewports(MemorySegment segment, long index, @CType("const VkViewport *") java.lang.foreign.MemorySegment value) { VH_pViewports.set(segment, 0L, index, value); }
    /// Sets `pViewports` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pViewports(MemorySegment segment, @CType("const VkViewport *") java.lang.foreign.MemorySegment value) { VkPipelineViewportStateCreateInfo.set_pViewports(segment, 0L, value); }
    /// Sets `pViewports` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo pViewportsAt(long index, @CType("const VkViewport *") java.lang.foreign.MemorySegment value) { VkPipelineViewportStateCreateInfo.set_pViewports(this.segment(), index, value); return this; }
    /// Sets `pViewports` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo pViewports(@CType("const VkViewport *") java.lang.foreign.MemorySegment value) { VkPipelineViewportStateCreateInfo.set_pViewports(this.segment(), value); return this; }

    /// {@return `scissorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_scissorCount(MemorySegment segment, long index) { return (int) VH_scissorCount.get(segment, 0L, index); }
    /// {@return `scissorCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_scissorCount(MemorySegment segment) { return VkPipelineViewportStateCreateInfo.get_scissorCount(segment, 0L); }
    /// {@return `scissorCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int scissorCountAt(long index) { return VkPipelineViewportStateCreateInfo.get_scissorCount(this.segment(), index); }
    /// {@return `scissorCount`}
    public @CType("uint32_t") int scissorCount() { return VkPipelineViewportStateCreateInfo.get_scissorCount(this.segment()); }
    /// Sets `scissorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_scissorCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_scissorCount.set(segment, 0L, index, value); }
    /// Sets `scissorCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_scissorCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineViewportStateCreateInfo.set_scissorCount(segment, 0L, value); }
    /// Sets `scissorCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo scissorCountAt(long index, @CType("uint32_t") int value) { VkPipelineViewportStateCreateInfo.set_scissorCount(this.segment(), index, value); return this; }
    /// Sets `scissorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo scissorCount(@CType("uint32_t") int value) { VkPipelineViewportStateCreateInfo.set_scissorCount(this.segment(), value); return this; }

    /// {@return `pScissors` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRect2D *") java.lang.foreign.MemorySegment get_pScissors(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pScissors.get(segment, 0L, index); }
    /// {@return `pScissors`}
    /// @param segment the segment of the struct
    public static @CType("const VkRect2D *") java.lang.foreign.MemorySegment get_pScissors(MemorySegment segment) { return VkPipelineViewportStateCreateInfo.get_pScissors(segment, 0L); }
    /// {@return `pScissors` at the given index}
    /// @param index the index
    public @CType("const VkRect2D *") java.lang.foreign.MemorySegment pScissorsAt(long index) { return VkPipelineViewportStateCreateInfo.get_pScissors(this.segment(), index); }
    /// {@return `pScissors`}
    public @CType("const VkRect2D *") java.lang.foreign.MemorySegment pScissors() { return VkPipelineViewportStateCreateInfo.get_pScissors(this.segment()); }
    /// Sets `pScissors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pScissors(MemorySegment segment, long index, @CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VH_pScissors.set(segment, 0L, index, value); }
    /// Sets `pScissors` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pScissors(MemorySegment segment, @CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VkPipelineViewportStateCreateInfo.set_pScissors(segment, 0L, value); }
    /// Sets `pScissors` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo pScissorsAt(long index, @CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VkPipelineViewportStateCreateInfo.set_pScissors(this.segment(), index, value); return this; }
    /// Sets `pScissors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo pScissors(@CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VkPipelineViewportStateCreateInfo.set_pScissors(this.segment(), value); return this; }

}

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
/// ### depthClipEnable
/// [VarHandle][#VH_depthClipEnable] - [Getter][#depthClipEnable()] - [Setter][#depthClipEnable(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineRasterizationDepthClipStateCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineRasterizationDepthClipStateCreateFlagsEXT flags;
///     VkBool32 depthClipEnable;
/// } VkPipelineRasterizationDepthClipStateCreateInfoEXT;
/// ```
public final class VkPipelineRasterizationDepthClipStateCreateInfoEXT extends Struct {
    /// The struct layout of `VkPipelineRasterizationDepthClipStateCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("depthClipEnable")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `depthClipEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthClipEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthClipEnable"));

    /// Creates `VkPipelineRasterizationDepthClipStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineRasterizationDepthClipStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationDepthClipStateCreateInfoEXT(segment); }

    /// Creates `VkPipelineRasterizationDepthClipStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationDepthClipStateCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineRasterizationDepthClipStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationDepthClipStateCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineRasterizationDepthClipStateCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineRasterizationDepthClipStateCreateInfoEXT`
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineRasterizationDepthClipStateCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineRasterizationDepthClipStateCreateInfoEXT`
    public static VkPipelineRasterizationDepthClipStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationDepthClipStateCreateInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT sType(@CType("VkStructureType") int value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT") int get_flags(MemorySegment segment) { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT") int flagsAt(long index) { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT") int flags() { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT") int value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT flagsAt(long index, @CType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT") int value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT flags(@CType("VkPipelineRasterizationDepthClipStateCreateFlagsEXT") int value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.set_flags(this.segment(), value); return this; }

    /// {@return `depthClipEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_depthClipEnable(MemorySegment segment, long index) { return (int) VH_depthClipEnable.get(segment, 0L, index); }
    /// {@return `depthClipEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_depthClipEnable(MemorySegment segment) { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.get_depthClipEnable(segment, 0L); }
    /// {@return `depthClipEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int depthClipEnableAt(long index) { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.get_depthClipEnable(this.segment(), index); }
    /// {@return `depthClipEnable`}
    public @CType("VkBool32") int depthClipEnable() { return VkPipelineRasterizationDepthClipStateCreateInfoEXT.get_depthClipEnable(this.segment()); }
    /// Sets `depthClipEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthClipEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_depthClipEnable.set(segment, 0L, index, value); }
    /// Sets `depthClipEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthClipEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.set_depthClipEnable(segment, 0L, value); }
    /// Sets `depthClipEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT depthClipEnableAt(long index, @CType("VkBool32") int value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.set_depthClipEnable(this.segment(), index, value); return this; }
    /// Sets `depthClipEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationDepthClipStateCreateInfoEXT depthClipEnable(@CType("VkBool32") int value) { VkPipelineRasterizationDepthClipStateCreateInfoEXT.set_depthClipEnable(this.segment(), value); return this; }

}

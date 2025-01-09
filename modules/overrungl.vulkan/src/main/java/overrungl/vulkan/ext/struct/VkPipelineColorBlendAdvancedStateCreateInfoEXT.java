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
/// ### srcPremultiplied
/// [VarHandle][#VH_srcPremultiplied] - [Getter][#srcPremultiplied()] - [Setter][#srcPremultiplied(int)]
/// ### dstPremultiplied
/// [VarHandle][#VH_dstPremultiplied] - [Getter][#dstPremultiplied()] - [Setter][#dstPremultiplied(int)]
/// ### blendOverlap
/// [VarHandle][#VH_blendOverlap] - [Getter][#blendOverlap()] - [Setter][#blendOverlap(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineColorBlendAdvancedStateCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 srcPremultiplied;
///     VkBool32 dstPremultiplied;
///     VkBlendOverlapEXT blendOverlap;
/// } VkPipelineColorBlendAdvancedStateCreateInfoEXT;
/// ```
public final class VkPipelineColorBlendAdvancedStateCreateInfoEXT extends Struct {
    /// The struct layout of `VkPipelineColorBlendAdvancedStateCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcPremultiplied"),
        ValueLayout.JAVA_INT.withName("dstPremultiplied"),
        ValueLayout.JAVA_INT.withName("blendOverlap")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `srcPremultiplied` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcPremultiplied = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcPremultiplied"));
    /// The [VarHandle] of `dstPremultiplied` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstPremultiplied = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstPremultiplied"));
    /// The [VarHandle] of `blendOverlap` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_blendOverlap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blendOverlap"));

    /// Creates `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineColorBlendAdvancedStateCreateInfoEXT(segment); }

    /// Creates `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineColorBlendAdvancedStateCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineColorBlendAdvancedStateCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineColorBlendAdvancedStateCreateInfoEXT`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineColorBlendAdvancedStateCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineColorBlendAdvancedStateCreateInfoEXT`
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT sType(@CType("VkStructureType") int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `srcPremultiplied` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_srcPremultiplied(MemorySegment segment, long index) { return (int) VH_srcPremultiplied.get(segment, 0L, index); }
    /// {@return `srcPremultiplied`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_srcPremultiplied(MemorySegment segment) { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_srcPremultiplied(segment, 0L); }
    /// {@return `srcPremultiplied` at the given index}
    /// @param index the index
    public @CType("VkBool32") int srcPremultipliedAt(long index) { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_srcPremultiplied(this.segment(), index); }
    /// {@return `srcPremultiplied`}
    public @CType("VkBool32") int srcPremultiplied() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_srcPremultiplied(this.segment()); }
    /// Sets `srcPremultiplied` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcPremultiplied(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_srcPremultiplied.set(segment, 0L, index, value); }
    /// Sets `srcPremultiplied` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcPremultiplied(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_srcPremultiplied(segment, 0L, value); }
    /// Sets `srcPremultiplied` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT srcPremultipliedAt(long index, @CType("VkBool32") int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_srcPremultiplied(this.segment(), index, value); return this; }
    /// Sets `srcPremultiplied` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT srcPremultiplied(@CType("VkBool32") int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_srcPremultiplied(this.segment(), value); return this; }

    /// {@return `dstPremultiplied` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_dstPremultiplied(MemorySegment segment, long index) { return (int) VH_dstPremultiplied.get(segment, 0L, index); }
    /// {@return `dstPremultiplied`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_dstPremultiplied(MemorySegment segment) { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_dstPremultiplied(segment, 0L); }
    /// {@return `dstPremultiplied` at the given index}
    /// @param index the index
    public @CType("VkBool32") int dstPremultipliedAt(long index) { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_dstPremultiplied(this.segment(), index); }
    /// {@return `dstPremultiplied`}
    public @CType("VkBool32") int dstPremultiplied() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_dstPremultiplied(this.segment()); }
    /// Sets `dstPremultiplied` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstPremultiplied(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_dstPremultiplied.set(segment, 0L, index, value); }
    /// Sets `dstPremultiplied` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstPremultiplied(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_dstPremultiplied(segment, 0L, value); }
    /// Sets `dstPremultiplied` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT dstPremultipliedAt(long index, @CType("VkBool32") int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_dstPremultiplied(this.segment(), index, value); return this; }
    /// Sets `dstPremultiplied` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT dstPremultiplied(@CType("VkBool32") int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_dstPremultiplied(this.segment(), value); return this; }

    /// {@return `blendOverlap` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlendOverlapEXT") int get_blendOverlap(MemorySegment segment, long index) { return (int) VH_blendOverlap.get(segment, 0L, index); }
    /// {@return `blendOverlap`}
    /// @param segment the segment of the struct
    public static @CType("VkBlendOverlapEXT") int get_blendOverlap(MemorySegment segment) { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_blendOverlap(segment, 0L); }
    /// {@return `blendOverlap` at the given index}
    /// @param index the index
    public @CType("VkBlendOverlapEXT") int blendOverlapAt(long index) { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_blendOverlap(this.segment(), index); }
    /// {@return `blendOverlap`}
    public @CType("VkBlendOverlapEXT") int blendOverlap() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.get_blendOverlap(this.segment()); }
    /// Sets `blendOverlap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_blendOverlap(MemorySegment segment, long index, @CType("VkBlendOverlapEXT") int value) { VH_blendOverlap.set(segment, 0L, index, value); }
    /// Sets `blendOverlap` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_blendOverlap(MemorySegment segment, @CType("VkBlendOverlapEXT") int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_blendOverlap(segment, 0L, value); }
    /// Sets `blendOverlap` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT blendOverlapAt(long index, @CType("VkBlendOverlapEXT") int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_blendOverlap(this.segment(), index, value); return this; }
    /// Sets `blendOverlap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT blendOverlap(@CType("VkBlendOverlapEXT") int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.set_blendOverlap(this.segment(), value); return this; }

}

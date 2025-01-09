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
/// ### viewportWScalingEnable
/// [VarHandle][#VH_viewportWScalingEnable] - [Getter][#viewportWScalingEnable()] - [Setter][#viewportWScalingEnable(int)]
/// ### viewportCount
/// [VarHandle][#VH_viewportCount] - [Getter][#viewportCount()] - [Setter][#viewportCount(int)]
/// ### pViewportWScalings
/// [VarHandle][#VH_pViewportWScalings] - [Getter][#pViewportWScalings()] - [Setter][#pViewportWScalings(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineViewportWScalingStateCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 viewportWScalingEnable;
///     uint32_t viewportCount;
///     const VkViewportWScalingNV * pViewportWScalings;
/// } VkPipelineViewportWScalingStateCreateInfoNV;
/// ```
public final class VkPipelineViewportWScalingStateCreateInfoNV extends Struct {
    /// The struct layout of `VkPipelineViewportWScalingStateCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewportWScalingEnable"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withName("pViewportWScalings")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `viewportWScalingEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewportWScalingEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportWScalingEnable"));
    /// The [VarHandle] of `viewportCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewportCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportCount"));
    /// The [VarHandle] of `pViewportWScalings` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pViewportWScalings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewportWScalings"));

    /// Creates `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkPipelineViewportWScalingStateCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportWScalingStateCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportWScalingStateCreateInfoNV(segment); }

    /// Creates `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportWScalingStateCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportWScalingStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportWScalingStateCreateInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportWScalingStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportWScalingStateCreateInfoNV`
    public static VkPipelineViewportWScalingStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineViewportWScalingStateCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineViewportWScalingStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineViewportWScalingStateCreateInfoNV`
    public static VkPipelineViewportWScalingStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportWScalingStateCreateInfoNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPipelineViewportWScalingStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineViewportWScalingStateCreateInfoNV`
    public VkPipelineViewportWScalingStateCreateInfoNV asSlice(long index) { return new VkPipelineViewportWScalingStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPipelineViewportWScalingStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineViewportWScalingStateCreateInfoNV`
    public VkPipelineViewportWScalingStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineViewportWScalingStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineViewportWScalingStateCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineViewportWScalingStateCreateInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineViewportWScalingStateCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineViewportWScalingStateCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineViewportWScalingStateCreateInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV sType(@CType("VkStructureType") int value) { VkPipelineViewportWScalingStateCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineViewportWScalingStateCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineViewportWScalingStateCreateInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineViewportWScalingStateCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportWScalingStateCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportWScalingStateCreateInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportWScalingStateCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `viewportWScalingEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_viewportWScalingEnable(MemorySegment segment, long index) { return (int) VH_viewportWScalingEnable.get(segment, 0L, index); }
    /// {@return `viewportWScalingEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_viewportWScalingEnable(MemorySegment segment) { return VkPipelineViewportWScalingStateCreateInfoNV.get_viewportWScalingEnable(segment, 0L); }
    /// {@return `viewportWScalingEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int viewportWScalingEnableAt(long index) { return VkPipelineViewportWScalingStateCreateInfoNV.get_viewportWScalingEnable(this.segment(), index); }
    /// {@return `viewportWScalingEnable`}
    public @CType("VkBool32") int viewportWScalingEnable() { return VkPipelineViewportWScalingStateCreateInfoNV.get_viewportWScalingEnable(this.segment()); }
    /// Sets `viewportWScalingEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewportWScalingEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_viewportWScalingEnable.set(segment, 0L, index, value); }
    /// Sets `viewportWScalingEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewportWScalingEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineViewportWScalingStateCreateInfoNV.set_viewportWScalingEnable(segment, 0L, value); }
    /// Sets `viewportWScalingEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV viewportWScalingEnableAt(long index, @CType("VkBool32") int value) { VkPipelineViewportWScalingStateCreateInfoNV.set_viewportWScalingEnable(this.segment(), index, value); return this; }
    /// Sets `viewportWScalingEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV viewportWScalingEnable(@CType("VkBool32") int value) { VkPipelineViewportWScalingStateCreateInfoNV.set_viewportWScalingEnable(this.segment(), value); return this; }

    /// {@return `viewportCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_viewportCount(MemorySegment segment, long index) { return (int) VH_viewportCount.get(segment, 0L, index); }
    /// {@return `viewportCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_viewportCount(MemorySegment segment) { return VkPipelineViewportWScalingStateCreateInfoNV.get_viewportCount(segment, 0L); }
    /// {@return `viewportCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int viewportCountAt(long index) { return VkPipelineViewportWScalingStateCreateInfoNV.get_viewportCount(this.segment(), index); }
    /// {@return `viewportCount`}
    public @CType("uint32_t") int viewportCount() { return VkPipelineViewportWScalingStateCreateInfoNV.get_viewportCount(this.segment()); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewportCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_viewportCount.set(segment, 0L, index, value); }
    /// Sets `viewportCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewportCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineViewportWScalingStateCreateInfoNV.set_viewportCount(segment, 0L, value); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV viewportCountAt(long index, @CType("uint32_t") int value) { VkPipelineViewportWScalingStateCreateInfoNV.set_viewportCount(this.segment(), index, value); return this; }
    /// Sets `viewportCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV viewportCount(@CType("uint32_t") int value) { VkPipelineViewportWScalingStateCreateInfoNV.set_viewportCount(this.segment(), value); return this; }

    /// {@return `pViewportWScalings` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkViewportWScalingNV *") java.lang.foreign.MemorySegment get_pViewportWScalings(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pViewportWScalings.get(segment, 0L, index); }
    /// {@return `pViewportWScalings`}
    /// @param segment the segment of the struct
    public static @CType("const VkViewportWScalingNV *") java.lang.foreign.MemorySegment get_pViewportWScalings(MemorySegment segment) { return VkPipelineViewportWScalingStateCreateInfoNV.get_pViewportWScalings(segment, 0L); }
    /// {@return `pViewportWScalings` at the given index}
    /// @param index the index
    public @CType("const VkViewportWScalingNV *") java.lang.foreign.MemorySegment pViewportWScalingsAt(long index) { return VkPipelineViewportWScalingStateCreateInfoNV.get_pViewportWScalings(this.segment(), index); }
    /// {@return `pViewportWScalings`}
    public @CType("const VkViewportWScalingNV *") java.lang.foreign.MemorySegment pViewportWScalings() { return VkPipelineViewportWScalingStateCreateInfoNV.get_pViewportWScalings(this.segment()); }
    /// Sets `pViewportWScalings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pViewportWScalings(MemorySegment segment, long index, @CType("const VkViewportWScalingNV *") java.lang.foreign.MemorySegment value) { VH_pViewportWScalings.set(segment, 0L, index, value); }
    /// Sets `pViewportWScalings` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pViewportWScalings(MemorySegment segment, @CType("const VkViewportWScalingNV *") java.lang.foreign.MemorySegment value) { VkPipelineViewportWScalingStateCreateInfoNV.set_pViewportWScalings(segment, 0L, value); }
    /// Sets `pViewportWScalings` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV pViewportWScalingsAt(long index, @CType("const VkViewportWScalingNV *") java.lang.foreign.MemorySegment value) { VkPipelineViewportWScalingStateCreateInfoNV.set_pViewportWScalings(this.segment(), index, value); return this; }
    /// Sets `pViewportWScalings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportWScalingStateCreateInfoNV pViewportWScalings(@CType("const VkViewportWScalingNV *") java.lang.foreign.MemorySegment value) { VkPipelineViewportWScalingStateCreateInfoNV.set_pViewportWScalings(this.segment(), value); return this; }

}

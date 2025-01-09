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
/// ### swapchainCount
/// [VarHandle][#VH_swapchainCount] - [Getter][#swapchainCount()] - [Setter][#swapchainCount(int)]
/// ### pFences
/// [VarHandle][#VH_pFences] - [Getter][#pFences()] - [Setter][#pFences(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSwapchainPresentFenceInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t swapchainCount;
///     const VkFence * pFences;
/// } VkSwapchainPresentFenceInfoEXT;
/// ```
public final class VkSwapchainPresentFenceInfoEXT extends Struct {
    /// The struct layout of `VkSwapchainPresentFenceInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pFences")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `swapchainCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    /// The [VarHandle] of `pFences` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pFences = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFences"));

    /// Creates `VkSwapchainPresentFenceInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkSwapchainPresentFenceInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSwapchainPresentFenceInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentFenceInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSwapchainPresentFenceInfoEXT(segment); }

    /// Creates `VkSwapchainPresentFenceInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentFenceInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSwapchainPresentFenceInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSwapchainPresentFenceInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentFenceInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSwapchainPresentFenceInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSwapchainPresentFenceInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSwapchainPresentFenceInfoEXT`
    public static VkSwapchainPresentFenceInfoEXT alloc(SegmentAllocator allocator) { return new VkSwapchainPresentFenceInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSwapchainPresentFenceInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSwapchainPresentFenceInfoEXT`
    public static VkSwapchainPresentFenceInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSwapchainPresentFenceInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSwapchainPresentFenceInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSwapchainPresentFenceInfoEXT`
    public VkSwapchainPresentFenceInfoEXT asSlice(long index) { return new VkSwapchainPresentFenceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSwapchainPresentFenceInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSwapchainPresentFenceInfoEXT`
    public VkSwapchainPresentFenceInfoEXT asSlice(long index, long count) { return new VkSwapchainPresentFenceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSwapchainPresentFenceInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSwapchainPresentFenceInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSwapchainPresentFenceInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSwapchainPresentFenceInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkSwapchainPresentFenceInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT sType(@CType("VkStructureType") int value) { VkSwapchainPresentFenceInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSwapchainPresentFenceInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSwapchainPresentFenceInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSwapchainPresentFenceInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSwapchainPresentFenceInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSwapchainPresentFenceInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSwapchainPresentFenceInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `swapchainCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_swapchainCount(MemorySegment segment, long index) { return (int) VH_swapchainCount.get(segment, 0L, index); }
    /// {@return `swapchainCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_swapchainCount(MemorySegment segment) { return VkSwapchainPresentFenceInfoEXT.get_swapchainCount(segment, 0L); }
    /// {@return `swapchainCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int swapchainCountAt(long index) { return VkSwapchainPresentFenceInfoEXT.get_swapchainCount(this.segment(), index); }
    /// {@return `swapchainCount`}
    public @CType("uint32_t") int swapchainCount() { return VkSwapchainPresentFenceInfoEXT.get_swapchainCount(this.segment()); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_swapchainCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_swapchainCount.set(segment, 0L, index, value); }
    /// Sets `swapchainCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_swapchainCount(MemorySegment segment, @CType("uint32_t") int value) { VkSwapchainPresentFenceInfoEXT.set_swapchainCount(segment, 0L, value); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT swapchainCountAt(long index, @CType("uint32_t") int value) { VkSwapchainPresentFenceInfoEXT.set_swapchainCount(this.segment(), index, value); return this; }
    /// Sets `swapchainCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT swapchainCount(@CType("uint32_t") int value) { VkSwapchainPresentFenceInfoEXT.set_swapchainCount(this.segment(), value); return this; }

    /// {@return `pFences` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkFence *") java.lang.foreign.MemorySegment get_pFences(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pFences.get(segment, 0L, index); }
    /// {@return `pFences`}
    /// @param segment the segment of the struct
    public static @CType("const VkFence *") java.lang.foreign.MemorySegment get_pFences(MemorySegment segment) { return VkSwapchainPresentFenceInfoEXT.get_pFences(segment, 0L); }
    /// {@return `pFences` at the given index}
    /// @param index the index
    public @CType("const VkFence *") java.lang.foreign.MemorySegment pFencesAt(long index) { return VkSwapchainPresentFenceInfoEXT.get_pFences(this.segment(), index); }
    /// {@return `pFences`}
    public @CType("const VkFence *") java.lang.foreign.MemorySegment pFences() { return VkSwapchainPresentFenceInfoEXT.get_pFences(this.segment()); }
    /// Sets `pFences` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pFences(MemorySegment segment, long index, @CType("const VkFence *") java.lang.foreign.MemorySegment value) { VH_pFences.set(segment, 0L, index, value); }
    /// Sets `pFences` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pFences(MemorySegment segment, @CType("const VkFence *") java.lang.foreign.MemorySegment value) { VkSwapchainPresentFenceInfoEXT.set_pFences(segment, 0L, value); }
    /// Sets `pFences` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT pFencesAt(long index, @CType("const VkFence *") java.lang.foreign.MemorySegment value) { VkSwapchainPresentFenceInfoEXT.set_pFences(this.segment(), index, value); return this; }
    /// Sets `pFences` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT pFences(@CType("const VkFence *") java.lang.foreign.MemorySegment value) { VkSwapchainPresentFenceInfoEXT.set_pFences(this.segment(), value); return this; }

}

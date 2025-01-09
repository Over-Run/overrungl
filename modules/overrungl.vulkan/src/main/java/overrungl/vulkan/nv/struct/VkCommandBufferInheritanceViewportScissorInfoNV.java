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
/// ### viewportScissor2D
/// [VarHandle][#VH_viewportScissor2D] - [Getter][#viewportScissor2D()] - [Setter][#viewportScissor2D(int)]
/// ### viewportDepthCount
/// [VarHandle][#VH_viewportDepthCount] - [Getter][#viewportDepthCount()] - [Setter][#viewportDepthCount(int)]
/// ### pViewportDepths
/// [VarHandle][#VH_pViewportDepths] - [Getter][#pViewportDepths()] - [Setter][#pViewportDepths(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCommandBufferInheritanceViewportScissorInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 viewportScissor2D;
///     uint32_t viewportDepthCount;
///     const VkViewport * pViewportDepths;
/// } VkCommandBufferInheritanceViewportScissorInfoNV;
/// ```
public final class VkCommandBufferInheritanceViewportScissorInfoNV extends Struct {
    /// The struct layout of `VkCommandBufferInheritanceViewportScissorInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewportScissor2D"),
        ValueLayout.JAVA_INT.withName("viewportDepthCount"),
        ValueLayout.ADDRESS.withName("pViewportDepths")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `viewportScissor2D` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewportScissor2D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportScissor2D"));
    /// The [VarHandle] of `viewportDepthCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewportDepthCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportDepthCount"));
    /// The [VarHandle] of `pViewportDepths` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pViewportDepths = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewportDepths"));

    /// Creates `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkCommandBufferInheritanceViewportScissorInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceViewportScissorInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferInheritanceViewportScissorInfoNV(segment); }

    /// Creates `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceViewportScissorInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferInheritanceViewportScissorInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceViewportScissorInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferInheritanceViewportScissorInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferInheritanceViewportScissorInfoNV`
    public static VkCommandBufferInheritanceViewportScissorInfoNV alloc(SegmentAllocator allocator) { return new VkCommandBufferInheritanceViewportScissorInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCommandBufferInheritanceViewportScissorInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandBufferInheritanceViewportScissorInfoNV`
    public static VkCommandBufferInheritanceViewportScissorInfoNV alloc(SegmentAllocator allocator, long count) { return new VkCommandBufferInheritanceViewportScissorInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCommandBufferInheritanceViewportScissorInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkCommandBufferInheritanceViewportScissorInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCommandBufferInheritanceViewportScissorInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceViewportScissorInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceViewportScissorInfoNV sType(@CType("VkStructureType") int value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCommandBufferInheritanceViewportScissorInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCommandBufferInheritanceViewportScissorInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkCommandBufferInheritanceViewportScissorInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceViewportScissorInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceViewportScissorInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `viewportScissor2D` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_viewportScissor2D(MemorySegment segment, long index) { return (int) VH_viewportScissor2D.get(segment, 0L, index); }
    /// {@return `viewportScissor2D`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_viewportScissor2D(MemorySegment segment) { return VkCommandBufferInheritanceViewportScissorInfoNV.get_viewportScissor2D(segment, 0L); }
    /// {@return `viewportScissor2D` at the given index}
    /// @param index the index
    public @CType("VkBool32") int viewportScissor2DAt(long index) { return VkCommandBufferInheritanceViewportScissorInfoNV.get_viewportScissor2D(this.segment(), index); }
    /// {@return `viewportScissor2D`}
    public @CType("VkBool32") int viewportScissor2D() { return VkCommandBufferInheritanceViewportScissorInfoNV.get_viewportScissor2D(this.segment()); }
    /// Sets `viewportScissor2D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewportScissor2D(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_viewportScissor2D.set(segment, 0L, index, value); }
    /// Sets `viewportScissor2D` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewportScissor2D(MemorySegment segment, @CType("VkBool32") int value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_viewportScissor2D(segment, 0L, value); }
    /// Sets `viewportScissor2D` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportScissor2DAt(long index, @CType("VkBool32") int value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_viewportScissor2D(this.segment(), index, value); return this; }
    /// Sets `viewportScissor2D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportScissor2D(@CType("VkBool32") int value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_viewportScissor2D(this.segment(), value); return this; }

    /// {@return `viewportDepthCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_viewportDepthCount(MemorySegment segment, long index) { return (int) VH_viewportDepthCount.get(segment, 0L, index); }
    /// {@return `viewportDepthCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_viewportDepthCount(MemorySegment segment) { return VkCommandBufferInheritanceViewportScissorInfoNV.get_viewportDepthCount(segment, 0L); }
    /// {@return `viewportDepthCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int viewportDepthCountAt(long index) { return VkCommandBufferInheritanceViewportScissorInfoNV.get_viewportDepthCount(this.segment(), index); }
    /// {@return `viewportDepthCount`}
    public @CType("uint32_t") int viewportDepthCount() { return VkCommandBufferInheritanceViewportScissorInfoNV.get_viewportDepthCount(this.segment()); }
    /// Sets `viewportDepthCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewportDepthCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_viewportDepthCount.set(segment, 0L, index, value); }
    /// Sets `viewportDepthCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewportDepthCount(MemorySegment segment, @CType("uint32_t") int value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_viewportDepthCount(segment, 0L, value); }
    /// Sets `viewportDepthCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportDepthCountAt(long index, @CType("uint32_t") int value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_viewportDepthCount(this.segment(), index, value); return this; }
    /// Sets `viewportDepthCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportDepthCount(@CType("uint32_t") int value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_viewportDepthCount(this.segment(), value); return this; }

    /// {@return `pViewportDepths` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkViewport *") java.lang.foreign.MemorySegment get_pViewportDepths(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pViewportDepths.get(segment, 0L, index); }
    /// {@return `pViewportDepths`}
    /// @param segment the segment of the struct
    public static @CType("const VkViewport *") java.lang.foreign.MemorySegment get_pViewportDepths(MemorySegment segment) { return VkCommandBufferInheritanceViewportScissorInfoNV.get_pViewportDepths(segment, 0L); }
    /// {@return `pViewportDepths` at the given index}
    /// @param index the index
    public @CType("const VkViewport *") java.lang.foreign.MemorySegment pViewportDepthsAt(long index) { return VkCommandBufferInheritanceViewportScissorInfoNV.get_pViewportDepths(this.segment(), index); }
    /// {@return `pViewportDepths`}
    public @CType("const VkViewport *") java.lang.foreign.MemorySegment pViewportDepths() { return VkCommandBufferInheritanceViewportScissorInfoNV.get_pViewportDepths(this.segment()); }
    /// Sets `pViewportDepths` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pViewportDepths(MemorySegment segment, long index, @CType("const VkViewport *") java.lang.foreign.MemorySegment value) { VH_pViewportDepths.set(segment, 0L, index, value); }
    /// Sets `pViewportDepths` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pViewportDepths(MemorySegment segment, @CType("const VkViewport *") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_pViewportDepths(segment, 0L, value); }
    /// Sets `pViewportDepths` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceViewportScissorInfoNV pViewportDepthsAt(long index, @CType("const VkViewport *") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_pViewportDepths(this.segment(), index, value); return this; }
    /// Sets `pViewportDepths` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceViewportScissorInfoNV pViewportDepths(@CType("const VkViewport *") java.lang.foreign.MemorySegment value) { VkCommandBufferInheritanceViewportScissorInfoNV.set_pViewportDepths(this.segment(), value); return this; }

}

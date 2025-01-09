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
/// ### srcSubpass
/// [VarHandle][#VH_srcSubpass] - [Getter][#srcSubpass()] - [Setter][#srcSubpass(int)]
/// ### dstSubpass
/// [VarHandle][#VH_dstSubpass] - [Getter][#dstSubpass()] - [Setter][#dstSubpass(int)]
/// ### srcStageMask
/// [VarHandle][#VH_srcStageMask] - [Getter][#srcStageMask()] - [Setter][#srcStageMask(int)]
/// ### dstStageMask
/// [VarHandle][#VH_dstStageMask] - [Getter][#dstStageMask()] - [Setter][#dstStageMask(int)]
/// ### srcAccessMask
/// [VarHandle][#VH_srcAccessMask] - [Getter][#srcAccessMask()] - [Setter][#srcAccessMask(int)]
/// ### dstAccessMask
/// [VarHandle][#VH_dstAccessMask] - [Getter][#dstAccessMask()] - [Setter][#dstAccessMask(int)]
/// ### dependencyFlags
/// [VarHandle][#VH_dependencyFlags] - [Getter][#dependencyFlags()] - [Setter][#dependencyFlags(int)]
/// ### viewOffset
/// [VarHandle][#VH_viewOffset] - [Getter][#viewOffset()] - [Setter][#viewOffset(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSubpassDependency2 {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t srcSubpass;
///     uint32_t dstSubpass;
///     VkPipelineStageFlags srcStageMask;
///     VkPipelineStageFlags dstStageMask;
///     VkAccessFlags srcAccessMask;
///     VkAccessFlags dstAccessMask;
///     VkDependencyFlags dependencyFlags;
///     int32_t viewOffset;
/// } VkSubpassDependency2;
/// ```
public final class VkSubpassDependency2 extends Struct {
    /// The struct layout of `VkSubpassDependency2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcSubpass"),
        ValueLayout.JAVA_INT.withName("dstSubpass"),
        ValueLayout.JAVA_INT.withName("srcStageMask"),
        ValueLayout.JAVA_INT.withName("dstStageMask"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("dependencyFlags"),
        ValueLayout.JAVA_INT.withName("viewOffset")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `srcSubpass` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcSubpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSubpass"));
    /// The [VarHandle] of `dstSubpass` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstSubpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSubpass"));
    /// The [VarHandle] of `srcStageMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcStageMask"));
    /// The [VarHandle] of `dstStageMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstStageMask"));
    /// The [VarHandle] of `srcAccessMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    /// The [VarHandle] of `dstAccessMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));
    /// The [VarHandle] of `dependencyFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dependencyFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyFlags"));
    /// The [VarHandle] of `viewOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewOffset"));

    /// Creates `VkSubpassDependency2` with the given segment.
    /// @param segment the memory segment
    public VkSubpassDependency2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubpassDependency2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDependency2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassDependency2(segment); }

    /// Creates `VkSubpassDependency2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDependency2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassDependency2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubpassDependency2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDependency2 ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassDependency2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSubpassDependency2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassDependency2`
    public static VkSubpassDependency2 alloc(SegmentAllocator allocator) { return new VkSubpassDependency2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubpassDependency2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassDependency2`
    public static VkSubpassDependency2 alloc(SegmentAllocator allocator, long count) { return new VkSubpassDependency2(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSubpassDependency2`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSubpassDependency2`
    public VkSubpassDependency2 asSlice(long index) { return new VkSubpassDependency2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSubpassDependency2`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSubpassDependency2`
    public VkSubpassDependency2 asSlice(long index, long count) { return new VkSubpassDependency2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSubpassDependency2.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSubpassDependency2.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSubpassDependency2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSubpassDependency2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 sTypeAt(long index, @CType("VkStructureType") int value) { VkSubpassDependency2.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 sType(@CType("VkStructureType") int value) { VkSubpassDependency2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSubpassDependency2.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSubpassDependency2.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSubpassDependency2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSubpassDependency2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSubpassDependency2.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSubpassDependency2.set_pNext(this.segment(), value); return this; }

    /// {@return `srcSubpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_srcSubpass(MemorySegment segment, long index) { return (int) VH_srcSubpass.get(segment, 0L, index); }
    /// {@return `srcSubpass`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_srcSubpass(MemorySegment segment) { return VkSubpassDependency2.get_srcSubpass(segment, 0L); }
    /// {@return `srcSubpass` at the given index}
    /// @param index the index
    public @CType("uint32_t") int srcSubpassAt(long index) { return VkSubpassDependency2.get_srcSubpass(this.segment(), index); }
    /// {@return `srcSubpass`}
    public @CType("uint32_t") int srcSubpass() { return VkSubpassDependency2.get_srcSubpass(this.segment()); }
    /// Sets `srcSubpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcSubpass(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_srcSubpass.set(segment, 0L, index, value); }
    /// Sets `srcSubpass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcSubpass(MemorySegment segment, @CType("uint32_t") int value) { VkSubpassDependency2.set_srcSubpass(segment, 0L, value); }
    /// Sets `srcSubpass` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 srcSubpassAt(long index, @CType("uint32_t") int value) { VkSubpassDependency2.set_srcSubpass(this.segment(), index, value); return this; }
    /// Sets `srcSubpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 srcSubpass(@CType("uint32_t") int value) { VkSubpassDependency2.set_srcSubpass(this.segment(), value); return this; }

    /// {@return `dstSubpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dstSubpass(MemorySegment segment, long index) { return (int) VH_dstSubpass.get(segment, 0L, index); }
    /// {@return `dstSubpass`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dstSubpass(MemorySegment segment) { return VkSubpassDependency2.get_dstSubpass(segment, 0L); }
    /// {@return `dstSubpass` at the given index}
    /// @param index the index
    public @CType("uint32_t") int dstSubpassAt(long index) { return VkSubpassDependency2.get_dstSubpass(this.segment(), index); }
    /// {@return `dstSubpass`}
    public @CType("uint32_t") int dstSubpass() { return VkSubpassDependency2.get_dstSubpass(this.segment()); }
    /// Sets `dstSubpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstSubpass(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dstSubpass.set(segment, 0L, index, value); }
    /// Sets `dstSubpass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstSubpass(MemorySegment segment, @CType("uint32_t") int value) { VkSubpassDependency2.set_dstSubpass(segment, 0L, value); }
    /// Sets `dstSubpass` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 dstSubpassAt(long index, @CType("uint32_t") int value) { VkSubpassDependency2.set_dstSubpass(this.segment(), index, value); return this; }
    /// Sets `dstSubpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 dstSubpass(@CType("uint32_t") int value) { VkSubpassDependency2.set_dstSubpass(this.segment(), value); return this; }

    /// {@return `srcStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlags") int get_srcStageMask(MemorySegment segment, long index) { return (int) VH_srcStageMask.get(segment, 0L, index); }
    /// {@return `srcStageMask`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlags") int get_srcStageMask(MemorySegment segment) { return VkSubpassDependency2.get_srcStageMask(segment, 0L); }
    /// {@return `srcStageMask` at the given index}
    /// @param index the index
    public @CType("VkPipelineStageFlags") int srcStageMaskAt(long index) { return VkSubpassDependency2.get_srcStageMask(this.segment(), index); }
    /// {@return `srcStageMask`}
    public @CType("VkPipelineStageFlags") int srcStageMask() { return VkSubpassDependency2.get_srcStageMask(this.segment()); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcStageMask(MemorySegment segment, long index, @CType("VkPipelineStageFlags") int value) { VH_srcStageMask.set(segment, 0L, index, value); }
    /// Sets `srcStageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcStageMask(MemorySegment segment, @CType("VkPipelineStageFlags") int value) { VkSubpassDependency2.set_srcStageMask(segment, 0L, value); }
    /// Sets `srcStageMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 srcStageMaskAt(long index, @CType("VkPipelineStageFlags") int value) { VkSubpassDependency2.set_srcStageMask(this.segment(), index, value); return this; }
    /// Sets `srcStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 srcStageMask(@CType("VkPipelineStageFlags") int value) { VkSubpassDependency2.set_srcStageMask(this.segment(), value); return this; }

    /// {@return `dstStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlags") int get_dstStageMask(MemorySegment segment, long index) { return (int) VH_dstStageMask.get(segment, 0L, index); }
    /// {@return `dstStageMask`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlags") int get_dstStageMask(MemorySegment segment) { return VkSubpassDependency2.get_dstStageMask(segment, 0L); }
    /// {@return `dstStageMask` at the given index}
    /// @param index the index
    public @CType("VkPipelineStageFlags") int dstStageMaskAt(long index) { return VkSubpassDependency2.get_dstStageMask(this.segment(), index); }
    /// {@return `dstStageMask`}
    public @CType("VkPipelineStageFlags") int dstStageMask() { return VkSubpassDependency2.get_dstStageMask(this.segment()); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstStageMask(MemorySegment segment, long index, @CType("VkPipelineStageFlags") int value) { VH_dstStageMask.set(segment, 0L, index, value); }
    /// Sets `dstStageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstStageMask(MemorySegment segment, @CType("VkPipelineStageFlags") int value) { VkSubpassDependency2.set_dstStageMask(segment, 0L, value); }
    /// Sets `dstStageMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 dstStageMaskAt(long index, @CType("VkPipelineStageFlags") int value) { VkSubpassDependency2.set_dstStageMask(this.segment(), index, value); return this; }
    /// Sets `dstStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 dstStageMask(@CType("VkPipelineStageFlags") int value) { VkSubpassDependency2.set_dstStageMask(this.segment(), value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccessFlags") int get_srcAccessMask(MemorySegment segment, long index) { return (int) VH_srcAccessMask.get(segment, 0L, index); }
    /// {@return `srcAccessMask`}
    /// @param segment the segment of the struct
    public static @CType("VkAccessFlags") int get_srcAccessMask(MemorySegment segment) { return VkSubpassDependency2.get_srcAccessMask(segment, 0L); }
    /// {@return `srcAccessMask` at the given index}
    /// @param index the index
    public @CType("VkAccessFlags") int srcAccessMaskAt(long index) { return VkSubpassDependency2.get_srcAccessMask(this.segment(), index); }
    /// {@return `srcAccessMask`}
    public @CType("VkAccessFlags") int srcAccessMask() { return VkSubpassDependency2.get_srcAccessMask(this.segment()); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcAccessMask(MemorySegment segment, long index, @CType("VkAccessFlags") int value) { VH_srcAccessMask.set(segment, 0L, index, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcAccessMask(MemorySegment segment, @CType("VkAccessFlags") int value) { VkSubpassDependency2.set_srcAccessMask(segment, 0L, value); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 srcAccessMaskAt(long index, @CType("VkAccessFlags") int value) { VkSubpassDependency2.set_srcAccessMask(this.segment(), index, value); return this; }
    /// Sets `srcAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 srcAccessMask(@CType("VkAccessFlags") int value) { VkSubpassDependency2.set_srcAccessMask(this.segment(), value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccessFlags") int get_dstAccessMask(MemorySegment segment, long index) { return (int) VH_dstAccessMask.get(segment, 0L, index); }
    /// {@return `dstAccessMask`}
    /// @param segment the segment of the struct
    public static @CType("VkAccessFlags") int get_dstAccessMask(MemorySegment segment) { return VkSubpassDependency2.get_dstAccessMask(segment, 0L); }
    /// {@return `dstAccessMask` at the given index}
    /// @param index the index
    public @CType("VkAccessFlags") int dstAccessMaskAt(long index) { return VkSubpassDependency2.get_dstAccessMask(this.segment(), index); }
    /// {@return `dstAccessMask`}
    public @CType("VkAccessFlags") int dstAccessMask() { return VkSubpassDependency2.get_dstAccessMask(this.segment()); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstAccessMask(MemorySegment segment, long index, @CType("VkAccessFlags") int value) { VH_dstAccessMask.set(segment, 0L, index, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstAccessMask(MemorySegment segment, @CType("VkAccessFlags") int value) { VkSubpassDependency2.set_dstAccessMask(segment, 0L, value); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 dstAccessMaskAt(long index, @CType("VkAccessFlags") int value) { VkSubpassDependency2.set_dstAccessMask(this.segment(), index, value); return this; }
    /// Sets `dstAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 dstAccessMask(@CType("VkAccessFlags") int value) { VkSubpassDependency2.set_dstAccessMask(this.segment(), value); return this; }

    /// {@return `dependencyFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDependencyFlags") int get_dependencyFlags(MemorySegment segment, long index) { return (int) VH_dependencyFlags.get(segment, 0L, index); }
    /// {@return `dependencyFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkDependencyFlags") int get_dependencyFlags(MemorySegment segment) { return VkSubpassDependency2.get_dependencyFlags(segment, 0L); }
    /// {@return `dependencyFlags` at the given index}
    /// @param index the index
    public @CType("VkDependencyFlags") int dependencyFlagsAt(long index) { return VkSubpassDependency2.get_dependencyFlags(this.segment(), index); }
    /// {@return `dependencyFlags`}
    public @CType("VkDependencyFlags") int dependencyFlags() { return VkSubpassDependency2.get_dependencyFlags(this.segment()); }
    /// Sets `dependencyFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dependencyFlags(MemorySegment segment, long index, @CType("VkDependencyFlags") int value) { VH_dependencyFlags.set(segment, 0L, index, value); }
    /// Sets `dependencyFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dependencyFlags(MemorySegment segment, @CType("VkDependencyFlags") int value) { VkSubpassDependency2.set_dependencyFlags(segment, 0L, value); }
    /// Sets `dependencyFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 dependencyFlagsAt(long index, @CType("VkDependencyFlags") int value) { VkSubpassDependency2.set_dependencyFlags(this.segment(), index, value); return this; }
    /// Sets `dependencyFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 dependencyFlags(@CType("VkDependencyFlags") int value) { VkSubpassDependency2.set_dependencyFlags(this.segment(), value); return this; }

    /// {@return `viewOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_viewOffset(MemorySegment segment, long index) { return (int) VH_viewOffset.get(segment, 0L, index); }
    /// {@return `viewOffset`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_viewOffset(MemorySegment segment) { return VkSubpassDependency2.get_viewOffset(segment, 0L); }
    /// {@return `viewOffset` at the given index}
    /// @param index the index
    public @CType("int32_t") int viewOffsetAt(long index) { return VkSubpassDependency2.get_viewOffset(this.segment(), index); }
    /// {@return `viewOffset`}
    public @CType("int32_t") int viewOffset() { return VkSubpassDependency2.get_viewOffset(this.segment()); }
    /// Sets `viewOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewOffset(MemorySegment segment, long index, @CType("int32_t") int value) { VH_viewOffset.set(segment, 0L, index, value); }
    /// Sets `viewOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewOffset(MemorySegment segment, @CType("int32_t") int value) { VkSubpassDependency2.set_viewOffset(segment, 0L, value); }
    /// Sets `viewOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 viewOffsetAt(long index, @CType("int32_t") int value) { VkSubpassDependency2.set_viewOffset(this.segment(), index, value); return this; }
    /// Sets `viewOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDependency2 viewOffset(@CType("int32_t") int value) { VkSubpassDependency2.set_viewOffset(this.segment(), value); return this; }

}

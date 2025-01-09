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
/// ### pInheritanceInfo
/// [VarHandle][#VH_pInheritanceInfo] - [Getter][#pInheritanceInfo()] - [Setter][#pInheritanceInfo(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCommandBufferBeginInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkCommandBufferUsageFlags flags;
///     const VkCommandBufferInheritanceInfo * pInheritanceInfo;
/// } VkCommandBufferBeginInfo;
/// ```
public final class VkCommandBufferBeginInfo extends Struct {
    /// The struct layout of `VkCommandBufferBeginInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pInheritanceInfo")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pInheritanceInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pInheritanceInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInheritanceInfo"));

    /// Creates `VkCommandBufferBeginInfo` with the given segment.
    /// @param segment the memory segment
    public VkCommandBufferBeginInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCommandBufferBeginInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferBeginInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferBeginInfo(segment); }

    /// Creates `VkCommandBufferBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferBeginInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferBeginInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCommandBufferBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferBeginInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferBeginInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCommandBufferBeginInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferBeginInfo`
    public static VkCommandBufferBeginInfo alloc(SegmentAllocator allocator) { return new VkCommandBufferBeginInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCommandBufferBeginInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandBufferBeginInfo`
    public static VkCommandBufferBeginInfo alloc(SegmentAllocator allocator, long count) { return new VkCommandBufferBeginInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkCommandBufferBeginInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCommandBufferBeginInfo`
    public VkCommandBufferBeginInfo asSlice(long index) { return new VkCommandBufferBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkCommandBufferBeginInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCommandBufferBeginInfo`
    public VkCommandBufferBeginInfo asSlice(long index, long count) { return new VkCommandBufferBeginInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCommandBufferBeginInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkCommandBufferBeginInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCommandBufferBeginInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCommandBufferBeginInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferBeginInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkCommandBufferBeginInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferBeginInfo sType(@CType("VkStructureType") int value) { VkCommandBufferBeginInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCommandBufferBeginInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCommandBufferBeginInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkCommandBufferBeginInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferBeginInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferBeginInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferBeginInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferBeginInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkCommandBufferBeginInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCommandBufferUsageFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkCommandBufferUsageFlags") int get_flags(MemorySegment segment) { return VkCommandBufferBeginInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkCommandBufferUsageFlags") int flagsAt(long index) { return VkCommandBufferBeginInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkCommandBufferUsageFlags") int flags() { return VkCommandBufferBeginInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkCommandBufferUsageFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkCommandBufferUsageFlags") int value) { VkCommandBufferBeginInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferBeginInfo flagsAt(long index, @CType("VkCommandBufferUsageFlags") int value) { VkCommandBufferBeginInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferBeginInfo flags(@CType("VkCommandBufferUsageFlags") int value) { VkCommandBufferBeginInfo.set_flags(this.segment(), value); return this; }

    /// {@return `pInheritanceInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkCommandBufferInheritanceInfo *") java.lang.foreign.MemorySegment get_pInheritanceInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pInheritanceInfo.get(segment, 0L, index); }
    /// {@return `pInheritanceInfo`}
    /// @param segment the segment of the struct
    public static @CType("const VkCommandBufferInheritanceInfo *") java.lang.foreign.MemorySegment get_pInheritanceInfo(MemorySegment segment) { return VkCommandBufferBeginInfo.get_pInheritanceInfo(segment, 0L); }
    /// {@return `pInheritanceInfo` at the given index}
    /// @param index the index
    public @CType("const VkCommandBufferInheritanceInfo *") java.lang.foreign.MemorySegment pInheritanceInfoAt(long index) { return VkCommandBufferBeginInfo.get_pInheritanceInfo(this.segment(), index); }
    /// {@return `pInheritanceInfo`}
    public @CType("const VkCommandBufferInheritanceInfo *") java.lang.foreign.MemorySegment pInheritanceInfo() { return VkCommandBufferBeginInfo.get_pInheritanceInfo(this.segment()); }
    /// Sets `pInheritanceInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pInheritanceInfo(MemorySegment segment, long index, @CType("const VkCommandBufferInheritanceInfo *") java.lang.foreign.MemorySegment value) { VH_pInheritanceInfo.set(segment, 0L, index, value); }
    /// Sets `pInheritanceInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pInheritanceInfo(MemorySegment segment, @CType("const VkCommandBufferInheritanceInfo *") java.lang.foreign.MemorySegment value) { VkCommandBufferBeginInfo.set_pInheritanceInfo(segment, 0L, value); }
    /// Sets `pInheritanceInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCommandBufferBeginInfo pInheritanceInfoAt(long index, @CType("const VkCommandBufferInheritanceInfo *") java.lang.foreign.MemorySegment value) { VkCommandBufferBeginInfo.set_pInheritanceInfo(this.segment(), index, value); return this; }
    /// Sets `pInheritanceInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferBeginInfo pInheritanceInfo(@CType("const VkCommandBufferInheritanceInfo *") java.lang.foreign.MemorySegment value) { VkCommandBufferBeginInfo.set_pInheritanceInfo(this.segment(), value); return this; }

}

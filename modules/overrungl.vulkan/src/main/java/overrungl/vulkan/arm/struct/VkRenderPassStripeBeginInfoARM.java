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
package overrungl.vulkan.arm.struct;

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
/// ### stripeInfoCount
/// [VarHandle][#VH_stripeInfoCount] - [Getter][#stripeInfoCount()] - [Setter][#stripeInfoCount(int)]
/// ### pStripeInfos
/// [VarHandle][#VH_pStripeInfos] - [Getter][#pStripeInfos()] - [Setter][#pStripeInfos(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderPassStripeBeginInfoARM {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t stripeInfoCount;
///     const VkRenderPassStripeInfoARM * pStripeInfos;
/// } VkRenderPassStripeBeginInfoARM;
/// ```
public final class VkRenderPassStripeBeginInfoARM extends Struct {
    /// The struct layout of `VkRenderPassStripeBeginInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stripeInfoCount"),
        ValueLayout.ADDRESS.withName("pStripeInfos")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stripeInfoCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stripeInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stripeInfoCount"));
    /// The [VarHandle] of `pStripeInfos` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStripeInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStripeInfos"));

    /// Creates `VkRenderPassStripeBeginInfoARM` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassStripeBeginInfoARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassStripeBeginInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeBeginInfoARM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassStripeBeginInfoARM(segment); }

    /// Creates `VkRenderPassStripeBeginInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeBeginInfoARM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassStripeBeginInfoARM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassStripeBeginInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeBeginInfoARM ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassStripeBeginInfoARM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRenderPassStripeBeginInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassStripeBeginInfoARM`
    public static VkRenderPassStripeBeginInfoARM alloc(SegmentAllocator allocator) { return new VkRenderPassStripeBeginInfoARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassStripeBeginInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassStripeBeginInfoARM`
    public static VkRenderPassStripeBeginInfoARM alloc(SegmentAllocator allocator, long count) { return new VkRenderPassStripeBeginInfoARM(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkRenderPassStripeBeginInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderPassStripeBeginInfoARM`
    public VkRenderPassStripeBeginInfoARM asSlice(long index) { return new VkRenderPassStripeBeginInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkRenderPassStripeBeginInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderPassStripeBeginInfoARM`
    public VkRenderPassStripeBeginInfoARM asSlice(long index, long count) { return new VkRenderPassStripeBeginInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderPassStripeBeginInfoARM.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderPassStripeBeginInfoARM.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderPassStripeBeginInfoARM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderPassStripeBeginInfoARM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderPassStripeBeginInfoARM.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM sType(@CType("VkStructureType") int value) { VkRenderPassStripeBeginInfoARM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderPassStripeBeginInfoARM.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderPassStripeBeginInfoARM.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderPassStripeBeginInfoARM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeBeginInfoARM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeBeginInfoARM.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeBeginInfoARM.set_pNext(this.segment(), value); return this; }

    /// {@return `stripeInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stripeInfoCount(MemorySegment segment, long index) { return (int) VH_stripeInfoCount.get(segment, 0L, index); }
    /// {@return `stripeInfoCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stripeInfoCount(MemorySegment segment) { return VkRenderPassStripeBeginInfoARM.get_stripeInfoCount(segment, 0L); }
    /// {@return `stripeInfoCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int stripeInfoCountAt(long index) { return VkRenderPassStripeBeginInfoARM.get_stripeInfoCount(this.segment(), index); }
    /// {@return `stripeInfoCount`}
    public @CType("uint32_t") int stripeInfoCount() { return VkRenderPassStripeBeginInfoARM.get_stripeInfoCount(this.segment()); }
    /// Sets `stripeInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stripeInfoCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stripeInfoCount.set(segment, 0L, index, value); }
    /// Sets `stripeInfoCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stripeInfoCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassStripeBeginInfoARM.set_stripeInfoCount(segment, 0L, value); }
    /// Sets `stripeInfoCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM stripeInfoCountAt(long index, @CType("uint32_t") int value) { VkRenderPassStripeBeginInfoARM.set_stripeInfoCount(this.segment(), index, value); return this; }
    /// Sets `stripeInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM stripeInfoCount(@CType("uint32_t") int value) { VkRenderPassStripeBeginInfoARM.set_stripeInfoCount(this.segment(), value); return this; }

    /// {@return `pStripeInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRenderPassStripeInfoARM *") java.lang.foreign.MemorySegment get_pStripeInfos(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStripeInfos.get(segment, 0L, index); }
    /// {@return `pStripeInfos`}
    /// @param segment the segment of the struct
    public static @CType("const VkRenderPassStripeInfoARM *") java.lang.foreign.MemorySegment get_pStripeInfos(MemorySegment segment) { return VkRenderPassStripeBeginInfoARM.get_pStripeInfos(segment, 0L); }
    /// {@return `pStripeInfos` at the given index}
    /// @param index the index
    public @CType("const VkRenderPassStripeInfoARM *") java.lang.foreign.MemorySegment pStripeInfosAt(long index) { return VkRenderPassStripeBeginInfoARM.get_pStripeInfos(this.segment(), index); }
    /// {@return `pStripeInfos`}
    public @CType("const VkRenderPassStripeInfoARM *") java.lang.foreign.MemorySegment pStripeInfos() { return VkRenderPassStripeBeginInfoARM.get_pStripeInfos(this.segment()); }
    /// Sets `pStripeInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStripeInfos(MemorySegment segment, long index, @CType("const VkRenderPassStripeInfoARM *") java.lang.foreign.MemorySegment value) { VH_pStripeInfos.set(segment, 0L, index, value); }
    /// Sets `pStripeInfos` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStripeInfos(MemorySegment segment, @CType("const VkRenderPassStripeInfoARM *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeBeginInfoARM.set_pStripeInfos(segment, 0L, value); }
    /// Sets `pStripeInfos` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM pStripeInfosAt(long index, @CType("const VkRenderPassStripeInfoARM *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeBeginInfoARM.set_pStripeInfos(this.segment(), index, value); return this; }
    /// Sets `pStripeInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM pStripeInfos(@CType("const VkRenderPassStripeInfoARM *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeBeginInfoARM.set_pStripeInfos(this.segment(), value); return this; }

}

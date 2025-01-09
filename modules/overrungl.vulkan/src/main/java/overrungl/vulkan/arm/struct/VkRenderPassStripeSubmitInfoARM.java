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
/// ### stripeSemaphoreInfoCount
/// [VarHandle][#VH_stripeSemaphoreInfoCount] - [Getter][#stripeSemaphoreInfoCount()] - [Setter][#stripeSemaphoreInfoCount(int)]
/// ### pStripeSemaphoreInfos
/// [VarHandle][#VH_pStripeSemaphoreInfos] - [Getter][#pStripeSemaphoreInfos()] - [Setter][#pStripeSemaphoreInfos(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderPassStripeSubmitInfoARM {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t stripeSemaphoreInfoCount;
///     const VkSemaphoreSubmitInfo * pStripeSemaphoreInfos;
/// } VkRenderPassStripeSubmitInfoARM;
/// ```
public final class VkRenderPassStripeSubmitInfoARM extends Struct {
    /// The struct layout of `VkRenderPassStripeSubmitInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stripeSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withName("pStripeSemaphoreInfos")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stripeSemaphoreInfoCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stripeSemaphoreInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stripeSemaphoreInfoCount"));
    /// The [VarHandle] of `pStripeSemaphoreInfos` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStripeSemaphoreInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStripeSemaphoreInfos"));

    /// Creates `VkRenderPassStripeSubmitInfoARM` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassStripeSubmitInfoARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassStripeSubmitInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeSubmitInfoARM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassStripeSubmitInfoARM(segment); }

    /// Creates `VkRenderPassStripeSubmitInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeSubmitInfoARM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassStripeSubmitInfoARM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassStripeSubmitInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeSubmitInfoARM ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassStripeSubmitInfoARM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRenderPassStripeSubmitInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassStripeSubmitInfoARM`
    public static VkRenderPassStripeSubmitInfoARM alloc(SegmentAllocator allocator) { return new VkRenderPassStripeSubmitInfoARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassStripeSubmitInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassStripeSubmitInfoARM`
    public static VkRenderPassStripeSubmitInfoARM alloc(SegmentAllocator allocator, long count) { return new VkRenderPassStripeSubmitInfoARM(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderPassStripeSubmitInfoARM.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderPassStripeSubmitInfoARM.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderPassStripeSubmitInfoARM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderPassStripeSubmitInfoARM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeSubmitInfoARM sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderPassStripeSubmitInfoARM.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeSubmitInfoARM sType(@CType("VkStructureType") int value) { VkRenderPassStripeSubmitInfoARM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderPassStripeSubmitInfoARM.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderPassStripeSubmitInfoARM.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderPassStripeSubmitInfoARM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeSubmitInfoARM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeSubmitInfoARM pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeSubmitInfoARM.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeSubmitInfoARM pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeSubmitInfoARM.set_pNext(this.segment(), value); return this; }

    /// {@return `stripeSemaphoreInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stripeSemaphoreInfoCount(MemorySegment segment, long index) { return (int) VH_stripeSemaphoreInfoCount.get(segment, 0L, index); }
    /// {@return `stripeSemaphoreInfoCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stripeSemaphoreInfoCount(MemorySegment segment) { return VkRenderPassStripeSubmitInfoARM.get_stripeSemaphoreInfoCount(segment, 0L); }
    /// {@return `stripeSemaphoreInfoCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int stripeSemaphoreInfoCountAt(long index) { return VkRenderPassStripeSubmitInfoARM.get_stripeSemaphoreInfoCount(this.segment(), index); }
    /// {@return `stripeSemaphoreInfoCount`}
    public @CType("uint32_t") int stripeSemaphoreInfoCount() { return VkRenderPassStripeSubmitInfoARM.get_stripeSemaphoreInfoCount(this.segment()); }
    /// Sets `stripeSemaphoreInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stripeSemaphoreInfoCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stripeSemaphoreInfoCount.set(segment, 0L, index, value); }
    /// Sets `stripeSemaphoreInfoCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stripeSemaphoreInfoCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassStripeSubmitInfoARM.set_stripeSemaphoreInfoCount(segment, 0L, value); }
    /// Sets `stripeSemaphoreInfoCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeSubmitInfoARM stripeSemaphoreInfoCountAt(long index, @CType("uint32_t") int value) { VkRenderPassStripeSubmitInfoARM.set_stripeSemaphoreInfoCount(this.segment(), index, value); return this; }
    /// Sets `stripeSemaphoreInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeSubmitInfoARM stripeSemaphoreInfoCount(@CType("uint32_t") int value) { VkRenderPassStripeSubmitInfoARM.set_stripeSemaphoreInfoCount(this.segment(), value); return this; }

    /// {@return `pStripeSemaphoreInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSemaphoreSubmitInfo *") java.lang.foreign.MemorySegment get_pStripeSemaphoreInfos(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStripeSemaphoreInfos.get(segment, 0L, index); }
    /// {@return `pStripeSemaphoreInfos`}
    /// @param segment the segment of the struct
    public static @CType("const VkSemaphoreSubmitInfo *") java.lang.foreign.MemorySegment get_pStripeSemaphoreInfos(MemorySegment segment) { return VkRenderPassStripeSubmitInfoARM.get_pStripeSemaphoreInfos(segment, 0L); }
    /// {@return `pStripeSemaphoreInfos` at the given index}
    /// @param index the index
    public @CType("const VkSemaphoreSubmitInfo *") java.lang.foreign.MemorySegment pStripeSemaphoreInfosAt(long index) { return VkRenderPassStripeSubmitInfoARM.get_pStripeSemaphoreInfos(this.segment(), index); }
    /// {@return `pStripeSemaphoreInfos`}
    public @CType("const VkSemaphoreSubmitInfo *") java.lang.foreign.MemorySegment pStripeSemaphoreInfos() { return VkRenderPassStripeSubmitInfoARM.get_pStripeSemaphoreInfos(this.segment()); }
    /// Sets `pStripeSemaphoreInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStripeSemaphoreInfos(MemorySegment segment, long index, @CType("const VkSemaphoreSubmitInfo *") java.lang.foreign.MemorySegment value) { VH_pStripeSemaphoreInfos.set(segment, 0L, index, value); }
    /// Sets `pStripeSemaphoreInfos` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStripeSemaphoreInfos(MemorySegment segment, @CType("const VkSemaphoreSubmitInfo *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeSubmitInfoARM.set_pStripeSemaphoreInfos(segment, 0L, value); }
    /// Sets `pStripeSemaphoreInfos` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeSubmitInfoARM pStripeSemaphoreInfosAt(long index, @CType("const VkSemaphoreSubmitInfo *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeSubmitInfoARM.set_pStripeSemaphoreInfos(this.segment(), index, value); return this; }
    /// Sets `pStripeSemaphoreInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeSubmitInfoARM pStripeSemaphoreInfos(@CType("const VkSemaphoreSubmitInfo *") java.lang.foreign.MemorySegment value) { VkRenderPassStripeSubmitInfoARM.set_pStripeSemaphoreInfos(this.segment(), value); return this; }

}

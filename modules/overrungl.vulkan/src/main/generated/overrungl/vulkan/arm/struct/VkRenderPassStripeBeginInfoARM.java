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
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassStripeBeginInfoARM`.
/// ## Layout
/// ```
/// struct VkRenderPassStripeBeginInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t stripeInfoCount;
///     const VkRenderPassStripeInfoARM* pStripeInfos;
/// };
/// ```
public final class VkRenderPassStripeBeginInfoARM extends GroupType {
    /// The struct layout of `VkRenderPassStripeBeginInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stripeInfoCount"),
        ValueLayout.ADDRESS.withName("pStripeInfos")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `stripeInfoCount`.
    public static final long OFFSET_stripeInfoCount = LAYOUT.byteOffset(PathElement.groupElement("stripeInfoCount"));
    /// The memory layout of `stripeInfoCount`.
    public static final MemoryLayout LAYOUT_stripeInfoCount = LAYOUT.select(PathElement.groupElement("stripeInfoCount"));
    /// The [VarHandle] of `stripeInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stripeInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stripeInfoCount"));
    /// The byte offset of `pStripeInfos`.
    public static final long OFFSET_pStripeInfos = LAYOUT.byteOffset(PathElement.groupElement("pStripeInfos"));
    /// The memory layout of `pStripeInfos`.
    public static final MemoryLayout LAYOUT_pStripeInfos = LAYOUT.select(PathElement.groupElement("pStripeInfos"));
    /// The [VarHandle] of `pStripeInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStripeInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStripeInfos"));

    /// Creates `VkRenderPassStripeBeginInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderPassStripeBeginInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderPassStripeBeginInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeBeginInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeBeginInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassStripeBeginInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeBeginInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeBeginInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderPassStripeBeginInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeBeginInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeBeginInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderPassStripeBeginInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassStripeBeginInfoARM`
    public static VkRenderPassStripeBeginInfoARM alloc(SegmentAllocator allocator) { return new VkRenderPassStripeBeginInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderPassStripeBeginInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassStripeBeginInfoARM`
    public static VkRenderPassStripeBeginInfoARM alloc(SegmentAllocator allocator, long count) { return new VkRenderPassStripeBeginInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM copyFrom(VkRenderPassStripeBeginInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderPassStripeBeginInfoARM reinterpret(long count) { return new VkRenderPassStripeBeginInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stripeInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stripeInfoCount(MemorySegment segment, long index) { return (int) VH_stripeInfoCount.get(segment, 0L, index); }
    /// {@return `stripeInfoCount`}
    public int stripeInfoCount() { return stripeInfoCount(this.segment(), 0L); }
    /// Sets `stripeInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stripeInfoCount(MemorySegment segment, long index, int value) { VH_stripeInfoCount.set(segment, 0L, index, value); }
    /// Sets `stripeInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM stripeInfoCount(int value) { stripeInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `pStripeInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStripeInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pStripeInfos.get(segment, 0L, index); }
    /// {@return `pStripeInfos`}
    public MemorySegment pStripeInfos() { return pStripeInfos(this.segment(), 0L); }
    /// Sets `pStripeInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStripeInfos(MemorySegment segment, long index, MemorySegment value) { VH_pStripeInfos.set(segment, 0L, index, value); }
    /// Sets `pStripeInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM pStripeInfos(MemorySegment value) { pStripeInfos(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRenderPassStripeBeginInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderPassStripeBeginInfoARM`
    public VkRenderPassStripeBeginInfoARM asSlice(long index) { return new VkRenderPassStripeBeginInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderPassStripeBeginInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderPassStripeBeginInfoARM`
    public VkRenderPassStripeBeginInfoARM asSlice(long index, long count) { return new VkRenderPassStripeBeginInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderPassStripeBeginInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM at(long index, Consumer<VkRenderPassStripeBeginInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `stripeInfoCount` at the given index}
    /// @param index the index of the struct buffer
    public int stripeInfoCountAt(long index) { return stripeInfoCount(this.segment(), index); }
    /// Sets `stripeInfoCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM stripeInfoCountAt(long index, int value) { stripeInfoCount(this.segment(), index, value); return this; }

    /// {@return `pStripeInfos` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStripeInfosAt(long index) { return pStripeInfos(this.segment(), index); }
    /// Sets `pStripeInfos` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeBeginInfoARM pStripeInfosAt(long index, MemorySegment value) { pStripeInfos(this.segment(), index, value); return this; }

}

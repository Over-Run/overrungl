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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageDrmFormatModifierExplicitCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkImageDrmFormatModifierExplicitCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint64_t drmFormatModifier;
///     uint32_t drmFormatModifierPlaneCount;
///     const VkSubresourceLayout* pPlaneLayouts;
/// };
/// ```
public final class VkImageDrmFormatModifierExplicitCreateInfoEXT extends GroupType {
    /// The struct layout of `VkImageDrmFormatModifierExplicitCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("drmFormatModifier"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount"),
        ValueLayout.ADDRESS.withName("pPlaneLayouts")
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
    /// The byte offset of `drmFormatModifier`.
    public static final long OFFSET_drmFormatModifier = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifier"));
    /// The memory layout of `drmFormatModifier`.
    public static final MemoryLayout LAYOUT_drmFormatModifier = LAYOUT.select(PathElement.groupElement("drmFormatModifier"));
    /// The [VarHandle] of `drmFormatModifier` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_drmFormatModifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifier"));
    /// The byte offset of `drmFormatModifierPlaneCount`.
    public static final long OFFSET_drmFormatModifierPlaneCount = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierPlaneCount"));
    /// The memory layout of `drmFormatModifierPlaneCount`.
    public static final MemoryLayout LAYOUT_drmFormatModifierPlaneCount = LAYOUT.select(PathElement.groupElement("drmFormatModifierPlaneCount"));
    /// The [VarHandle] of `drmFormatModifierPlaneCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_drmFormatModifierPlaneCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierPlaneCount"));
    /// The byte offset of `pPlaneLayouts`.
    public static final long OFFSET_pPlaneLayouts = LAYOUT.byteOffset(PathElement.groupElement("pPlaneLayouts"));
    /// The memory layout of `pPlaneLayouts`.
    public static final MemoryLayout LAYOUT_pPlaneLayouts = LAYOUT.select(PathElement.groupElement("pPlaneLayouts"));
    /// The [VarHandle] of `pPlaneLayouts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPlaneLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPlaneLayouts"));

    /// Creates `VkImageDrmFormatModifierExplicitCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageDrmFormatModifierExplicitCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageDrmFormatModifierExplicitCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageDrmFormatModifierExplicitCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageDrmFormatModifierExplicitCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageDrmFormatModifierExplicitCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageDrmFormatModifierExplicitCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageDrmFormatModifierExplicitCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageDrmFormatModifierExplicitCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageDrmFormatModifierExplicitCreateInfoEXT`
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkImageDrmFormatModifierExplicitCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageDrmFormatModifierExplicitCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageDrmFormatModifierExplicitCreateInfoEXT`
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImageDrmFormatModifierExplicitCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT copyFrom(VkImageDrmFormatModifierExplicitCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageDrmFormatModifierExplicitCreateInfoEXT reinterpret(long count) { return new VkImageDrmFormatModifierExplicitCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImageDrmFormatModifierExplicitCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `drmFormatModifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long drmFormatModifier(MemorySegment segment, long index) { return (long) VH_drmFormatModifier.get(segment, 0L, index); }
    /// {@return `drmFormatModifier`}
    public long drmFormatModifier() { return drmFormatModifier(this.segment(), 0L); }
    /// Sets `drmFormatModifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void drmFormatModifier(MemorySegment segment, long index, long value) { VH_drmFormatModifier.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifier(long value) { drmFormatModifier(this.segment(), 0L, value); return this; }

    /// {@return `drmFormatModifierPlaneCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int drmFormatModifierPlaneCount(MemorySegment segment, long index) { return (int) VH_drmFormatModifierPlaneCount.get(segment, 0L, index); }
    /// {@return `drmFormatModifierPlaneCount`}
    public int drmFormatModifierPlaneCount() { return drmFormatModifierPlaneCount(this.segment(), 0L); }
    /// Sets `drmFormatModifierPlaneCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void drmFormatModifierPlaneCount(MemorySegment segment, long index, int value) { VH_drmFormatModifierPlaneCount.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifierPlaneCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifierPlaneCount(int value) { drmFormatModifierPlaneCount(this.segment(), 0L, value); return this; }

    /// {@return `pPlaneLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPlaneLayouts(MemorySegment segment, long index) { return (MemorySegment) VH_pPlaneLayouts.get(segment, 0L, index); }
    /// {@return `pPlaneLayouts`}
    public MemorySegment pPlaneLayouts() { return pPlaneLayouts(this.segment(), 0L); }
    /// Sets `pPlaneLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPlaneLayouts(MemorySegment segment, long index, MemorySegment value) { VH_pPlaneLayouts.set(segment, 0L, index, value); }
    /// Sets `pPlaneLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pPlaneLayouts(MemorySegment value) { pPlaneLayouts(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImageDrmFormatModifierExplicitCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageDrmFormatModifierExplicitCreateInfoEXT`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT asSlice(long index) { return new VkImageDrmFormatModifierExplicitCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageDrmFormatModifierExplicitCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageDrmFormatModifierExplicitCreateInfoEXT`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT asSlice(long index, long count) { return new VkImageDrmFormatModifierExplicitCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageDrmFormatModifierExplicitCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT at(long index, Consumer<VkImageDrmFormatModifierExplicitCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `drmFormatModifier` at the given index}
    /// @param index the index of the struct buffer
    public long drmFormatModifierAt(long index) { return drmFormatModifier(this.segment(), index); }
    /// Sets `drmFormatModifier` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifierAt(long index, long value) { drmFormatModifier(this.segment(), index, value); return this; }

    /// {@return `drmFormatModifierPlaneCount` at the given index}
    /// @param index the index of the struct buffer
    public int drmFormatModifierPlaneCountAt(long index) { return drmFormatModifierPlaneCount(this.segment(), index); }
    /// Sets `drmFormatModifierPlaneCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifierPlaneCountAt(long index, int value) { drmFormatModifierPlaneCount(this.segment(), index, value); return this; }

    /// {@return `pPlaneLayouts` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPlaneLayoutsAt(long index) { return pPlaneLayouts(this.segment(), index); }
    /// Sets `pPlaneLayouts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pPlaneLayoutsAt(long index, MemorySegment value) { pPlaneLayouts(this.segment(), index, value); return this; }

}

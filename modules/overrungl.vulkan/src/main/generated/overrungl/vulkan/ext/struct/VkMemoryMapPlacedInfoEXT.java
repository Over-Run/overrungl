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

/// Represents `VkMemoryMapPlacedInfoEXT`.
/// ## Layout
/// ```
/// struct VkMemoryMapPlacedInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     void* pPlacedAddress;
/// };
/// ```
public final class VkMemoryMapPlacedInfoEXT extends GroupType {
    /// The struct layout of `VkMemoryMapPlacedInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pPlacedAddress")
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
    /// The byte offset of `pPlacedAddress`.
    public static final long OFFSET_pPlacedAddress = LAYOUT.byteOffset(PathElement.groupElement("pPlacedAddress"));
    /// The memory layout of `pPlacedAddress`.
    public static final MemoryLayout LAYOUT_pPlacedAddress = LAYOUT.select(PathElement.groupElement("pPlacedAddress"));
    /// The [VarHandle] of `pPlacedAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPlacedAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPlacedAddress"));

    /// Creates `VkMemoryMapPlacedInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMemoryMapPlacedInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMemoryMapPlacedInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryMapPlacedInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryMapPlacedInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryMapPlacedInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryMapPlacedInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryMapPlacedInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMemoryMapPlacedInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryMapPlacedInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryMapPlacedInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMemoryMapPlacedInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryMapPlacedInfoEXT`
    public static VkMemoryMapPlacedInfoEXT alloc(SegmentAllocator allocator) { return new VkMemoryMapPlacedInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMemoryMapPlacedInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryMapPlacedInfoEXT`
    public static VkMemoryMapPlacedInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMemoryMapPlacedInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryMapPlacedInfoEXT copyFrom(VkMemoryMapPlacedInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMemoryMapPlacedInfoEXT reinterpret(long count) { return new VkMemoryMapPlacedInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkMemoryMapPlacedInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMemoryMapPlacedInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pPlacedAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPlacedAddress(MemorySegment segment, long index) { return (MemorySegment) VH_pPlacedAddress.get(segment, 0L, index); }
    /// {@return `pPlacedAddress`}
    public MemorySegment pPlacedAddress() { return pPlacedAddress(this.segment(), 0L); }
    /// Sets `pPlacedAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPlacedAddress(MemorySegment segment, long index, MemorySegment value) { VH_pPlacedAddress.set(segment, 0L, index, value); }
    /// Sets `pPlacedAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryMapPlacedInfoEXT pPlacedAddress(MemorySegment value) { pPlacedAddress(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMemoryMapPlacedInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryMapPlacedInfoEXT`
    public VkMemoryMapPlacedInfoEXT asSlice(long index) { return new VkMemoryMapPlacedInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMemoryMapPlacedInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryMapPlacedInfoEXT`
    public VkMemoryMapPlacedInfoEXT asSlice(long index, long count) { return new VkMemoryMapPlacedInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMemoryMapPlacedInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMemoryMapPlacedInfoEXT at(long index, Consumer<VkMemoryMapPlacedInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryMapPlacedInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryMapPlacedInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pPlacedAddress` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPlacedAddressAt(long index) { return pPlacedAddress(this.segment(), index); }
    /// Sets `pPlacedAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryMapPlacedInfoEXT pPlacedAddressAt(long index, MemorySegment value) { pPlacedAddress(this.segment(), index, value); return this; }

}

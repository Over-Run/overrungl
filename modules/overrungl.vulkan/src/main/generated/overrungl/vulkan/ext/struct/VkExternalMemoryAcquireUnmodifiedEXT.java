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

/// Represents `VkExternalMemoryAcquireUnmodifiedEXT`.
/// ## Layout
/// ```
/// struct VkExternalMemoryAcquireUnmodifiedEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 acquireUnmodifiedMemory;
/// };
/// ```
public final class VkExternalMemoryAcquireUnmodifiedEXT extends GroupType {
    /// The struct layout of `VkExternalMemoryAcquireUnmodifiedEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("acquireUnmodifiedMemory")
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
    /// The byte offset of `acquireUnmodifiedMemory`.
    public static final long OFFSET_acquireUnmodifiedMemory = LAYOUT.byteOffset(PathElement.groupElement("acquireUnmodifiedMemory"));
    /// The memory layout of `acquireUnmodifiedMemory`.
    public static final MemoryLayout LAYOUT_acquireUnmodifiedMemory = LAYOUT.select(PathElement.groupElement("acquireUnmodifiedMemory"));
    /// The [VarHandle] of `acquireUnmodifiedMemory` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_acquireUnmodifiedMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("acquireUnmodifiedMemory"));

    /// Creates `VkExternalMemoryAcquireUnmodifiedEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExternalMemoryAcquireUnmodifiedEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExternalMemoryAcquireUnmodifiedEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryAcquireUnmodifiedEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryAcquireUnmodifiedEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExternalMemoryAcquireUnmodifiedEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryAcquireUnmodifiedEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryAcquireUnmodifiedEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExternalMemoryAcquireUnmodifiedEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryAcquireUnmodifiedEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryAcquireUnmodifiedEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExternalMemoryAcquireUnmodifiedEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalMemoryAcquireUnmodifiedEXT`
    public static VkExternalMemoryAcquireUnmodifiedEXT alloc(SegmentAllocator allocator) { return new VkExternalMemoryAcquireUnmodifiedEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExternalMemoryAcquireUnmodifiedEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalMemoryAcquireUnmodifiedEXT`
    public static VkExternalMemoryAcquireUnmodifiedEXT alloc(SegmentAllocator allocator, long count) { return new VkExternalMemoryAcquireUnmodifiedEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExternalMemoryAcquireUnmodifiedEXT copyFrom(VkExternalMemoryAcquireUnmodifiedEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExternalMemoryAcquireUnmodifiedEXT reinterpret(long count) { return new VkExternalMemoryAcquireUnmodifiedEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkExternalMemoryAcquireUnmodifiedEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExternalMemoryAcquireUnmodifiedEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `acquireUnmodifiedMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int acquireUnmodifiedMemory(MemorySegment segment, long index) { return (int) VH_acquireUnmodifiedMemory.get(segment, 0L, index); }
    /// {@return `acquireUnmodifiedMemory`}
    public int acquireUnmodifiedMemory() { return acquireUnmodifiedMemory(this.segment(), 0L); }
    /// Sets `acquireUnmodifiedMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void acquireUnmodifiedMemory(MemorySegment segment, long index, int value) { VH_acquireUnmodifiedMemory.set(segment, 0L, index, value); }
    /// Sets `acquireUnmodifiedMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryAcquireUnmodifiedEXT acquireUnmodifiedMemory(int value) { acquireUnmodifiedMemory(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExternalMemoryAcquireUnmodifiedEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExternalMemoryAcquireUnmodifiedEXT`
    public VkExternalMemoryAcquireUnmodifiedEXT asSlice(long index) { return new VkExternalMemoryAcquireUnmodifiedEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExternalMemoryAcquireUnmodifiedEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExternalMemoryAcquireUnmodifiedEXT`
    public VkExternalMemoryAcquireUnmodifiedEXT asSlice(long index, long count) { return new VkExternalMemoryAcquireUnmodifiedEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExternalMemoryAcquireUnmodifiedEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExternalMemoryAcquireUnmodifiedEXT at(long index, Consumer<VkExternalMemoryAcquireUnmodifiedEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryAcquireUnmodifiedEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryAcquireUnmodifiedEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `acquireUnmodifiedMemory` at the given index}
    /// @param index the index of the struct buffer
    public int acquireUnmodifiedMemoryAt(long index) { return acquireUnmodifiedMemory(this.segment(), index); }
    /// Sets `acquireUnmodifiedMemory` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryAcquireUnmodifiedEXT acquireUnmodifiedMemoryAt(long index, int value) { acquireUnmodifiedMemory(this.segment(), index, value); return this; }

}
